package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgIndex.
 * @see com.model.PgIndex
 * @author Hibernate Tools
 */
@Stateless
public class PgIndexHome {

	private static final Log log = LogFactory.getLog(PgIndexHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgIndex transientInstance) {
		log.debug("persisting PgIndex instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgIndex persistentInstance) {
		log.debug("removing PgIndex instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgIndex merge(PgIndex detachedInstance) {
		log.debug("merging PgIndex instance");
		try {
			PgIndex result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgIndex findById(PgIndexId id) {
		log.debug("getting PgIndex instance with id: " + id);
		try {
			PgIndex instance = entityManager.find(PgIndex.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
