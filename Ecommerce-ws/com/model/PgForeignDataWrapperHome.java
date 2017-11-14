package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgForeignDataWrapper.
 * @see com.model.PgForeignDataWrapper
 * @author Hibernate Tools
 */
@Stateless
public class PgForeignDataWrapperHome {

	private static final Log log = LogFactory.getLog(PgForeignDataWrapperHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgForeignDataWrapper transientInstance) {
		log.debug("persisting PgForeignDataWrapper instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgForeignDataWrapper persistentInstance) {
		log.debug("removing PgForeignDataWrapper instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgForeignDataWrapper merge(PgForeignDataWrapper detachedInstance) {
		log.debug("merging PgForeignDataWrapper instance");
		try {
			PgForeignDataWrapper result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgForeignDataWrapper findById(PgForeignDataWrapperId id) {
		log.debug("getting PgForeignDataWrapper instance with id: " + id);
		try {
			PgForeignDataWrapper instance = entityManager.find(PgForeignDataWrapper.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
