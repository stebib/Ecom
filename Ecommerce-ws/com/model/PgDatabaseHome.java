package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgDatabase.
 * @see com.model.PgDatabase
 * @author Hibernate Tools
 */
@Stateless
public class PgDatabaseHome {

	private static final Log log = LogFactory.getLog(PgDatabaseHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgDatabase transientInstance) {
		log.debug("persisting PgDatabase instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgDatabase persistentInstance) {
		log.debug("removing PgDatabase instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgDatabase merge(PgDatabase detachedInstance) {
		log.debug("merging PgDatabase instance");
		try {
			PgDatabase result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgDatabase findById(PgDatabaseId id) {
		log.debug("getting PgDatabase instance with id: " + id);
		try {
			PgDatabase instance = entityManager.find(PgDatabase.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
