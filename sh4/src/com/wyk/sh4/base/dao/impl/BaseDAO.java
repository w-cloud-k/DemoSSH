package com.wyk.sh4.base.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.orm.jpa.JpaCallback;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.wyk.sh4.base.dao.IBaseDAO;

@SuppressWarnings("unchecked")
public abstract class BaseDAO<T> implements IBaseDAO<T> {

	
	@Resource(name="jpaTemplate")
	private JpaTemplate jpaTemplate;
	
	public JpaTemplate getJpaTemplate(){
		return this.jpaTemplate;
	}
	
	//居图数据类型处理
	private Class<T> clazz = null;
	
	public BaseDAO(){
	     //--获得具体类的具体类型
		 ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		 clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}
	
	@Override
	public void add(T entity) {
		jpaTemplate.persist(entity);
	}

	@Override
	public void update(T entity) {
		jpaTemplate.merge(entity);
	}

	@Override
	public void delete(Long[] ids) {
		for(Long id : ids){
			jpaTemplate.remove(getById(id));
		}
	}

	@Override
	public T getById(Long id) {
		return jpaTemplate.find(clazz, id);
	}

	
	@Override
	public List<T> getByIds(final List ids) {
	    return (List<T>) jpaTemplate.execute(new JpaCallback<T>() {

			@Override
			public T doInJpa(EntityManager em) throws PersistenceException {
				
				return (T) em.createQuery("FROM " + clazz.getSimpleName() + " WHERE id IN(:ids)")
						.setParameter("ids", ids)
						.getResultList();
			}
			
		});
	}

}
