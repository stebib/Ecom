package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgTsConfig.
 * @see com.model.PgTsConfig
 * @author Hibernate Tools
 */
@Stateless
public class PgTsConfigHome {

	private static final Log log = LogFactory.getLog(PgTsConfigHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgTsConfig transientInstance) {
		log.debug("persisting PgTsConfig instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgTsConfig persistentInstance) {
		log.debug("removing PgTsConfig instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgTsConfig merge(PgTsConfig detachedInstance) {
		log.debug("merging PgTsConfig instance");
		try {
			PgTsConfig result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgTsConfig findById(PgTsConfigId id) {
		log.debug("getting PgTsConfig instance with id: " + id);
		try {
			PgTsConfig instance = entityManager.find(PgTsConfig.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
