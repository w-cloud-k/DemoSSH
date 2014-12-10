package com.wyk.sh4.base.service;

import java.util.List;
public interface IBaseService<T> {
	/**
	 * 保存实体
	 * @param entity
	 */
	void add(T entity);
	/**
	 * 更新
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
