/**
 * 
 */
package com.oliver.jpaRepository;

import java.util.List;

/**
 * @author Surendra
 *
 */
public interface JPARepository<T> {    
	public T presist(T entity);
	public void remove(T entity);
	public T merge(T entity);
	public T find(Object primaryKey, 
			java.util.Map<String,Object> properties);
	public List<T> getAllEntities(String queryString);

}