/**
 * 
 */
package com.oliver.jpaRepositoryImpl;

/**
 * @author Surendra
 * 
 */
public class DefaultJpaRepositoryImpl<T> extends JpaRepositoryImpl<T> {
    public DefaultJpaRepositoryImpl(T t) {
	super(t);
    }
}
