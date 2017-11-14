package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Example.
 * @see com.model.Example
 * @author Hibernate Tools
 */
@Stateless
public class ExampleHome {

	private static final Log log = LogFactory.getLog(ExampleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Example transientInstance) {
		log.debug("persisting Example instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Example persistentInstance) {
		log.debug("removing Example instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Example merge(Example detachedInstance) {
		log.debug("merging Example instance");
		try {
			Example result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Example findById(String id) {
		log.debug("getting Example instance with id: " + id);
		try {
			Example instance = entityManager.find(Example.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
