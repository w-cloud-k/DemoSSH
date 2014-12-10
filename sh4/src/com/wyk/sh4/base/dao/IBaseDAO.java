package com.wyk.sh4.base.dao;

import java.util.List;

public interface IBaseDAO<T> {
	/**
	 * 向数据库中增加数据
	 * @param entity
	 */
	void add(T entity);
	/**
	 * 更新数据库中某个数据
	 * @param entity
	 */
	void update(T entity);
	/**
	 * 批量删除
	 * @param ids
	 */
	void delete(Long[] ids);
	/**
	 * 根据单个id查找数据
	 * @param id
	 * @return
	 */
	T getById(Long id);
	/**
	 * 根据ids查询数据
	 * @param ids
	 * @return
	 */
	List<T> getByIds(List ids);
}
