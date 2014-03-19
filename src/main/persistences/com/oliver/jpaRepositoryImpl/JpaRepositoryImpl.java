/**
 * 
 */
package com.oliver.jpaRepositoryImpl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.oliver.jpaRepository.JPARepository;

/**
 * @author Surendra
 * 
 */
public class JpaRepositoryImpl<T> implements JPARepository<T> {
    private Class<T> entityClass;
    private static EntityManagerFactory factory;
    private EntityManager entityManager;

    public JpaRepositoryImpl(T t) {
	ParameterizedType genericSuperclass = (ParameterizedType) getClass()
		.getGenericSuperclass();
	Type firstType = genericSuperclass.getActualTypeArguments()[0];
	this.entityClass = (Class<T>) firstType.getClass();
    }

    public T presist(T entity) {
	createConnection();
	entityManager.persist(entity);
	closeConnection();
	return entity;
    }

    public void remove(T entity) {
	createConnection();
	entityManager.remove(entity);
	closeConnection();

    }

    public T merge(T entity) {
	createConnection();
	entityManager.merge(entity);
	closeConnection();
	return entity;
    }

    public T find( Object primaryKey,
	    Map<String, Object> properties) {
	createConnection();
	T searchResult = entityManager
		.find(entityClass, primaryKey, properties);
	closeConnection();
	return searchResult;
    }

    public List<T> getAllEntities(String queryString) {
	createConnection();
	Query query = entityManager.createNamedQuery(queryString);
	List queryList = query.getResultList();
	closeConnection();
	return queryList;
    }

    private void createConnection() {
	factory = Persistence.createEntityManagerFactory("application");
	entityManager = factory.createEntityManager();
	entityManager.getTransaction().begin();
    }

    private void closeConnection() {
	entityManager.getTransaction().commit();
	entityManager.close();
    }

}
