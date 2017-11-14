package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgClass.
 * @see com.model.PgClass
 * @author Hibernate Tools
 */
@Stateless
public class PgClassHome {

	private static final Log log = LogFactory.getLog(PgClassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgClass transientInstance) {
		log.debug("persisting PgClass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgClass persistentInstance) {
		log.debug("removing PgClass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgClass merge(PgClass detachedInstance) {
		log.debug("merging PgClass instance");
		try {
			PgClass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgClass findById(PgClassId id) {
		log.debug("getting PgClass instance with id: " + id);
		try {
			PgClass instance = entityManager.find(PgClass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
