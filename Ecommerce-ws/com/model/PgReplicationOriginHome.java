package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgReplicationOrigin.
 * @see com.model.PgReplicationOrigin
 * @author Hibernate Tools
 */
@Stateless
public class PgReplicationOriginHome {

	private static final Log log = LogFactory.getLog(PgReplicationOriginHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgReplicationOrigin transientInstance) {
		log.debug("persisting PgReplicationOrigin instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgReplicationOrigin persistentInstance) {
		log.debug("removing PgReplicationOrigin instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgReplicationOrigin merge(PgReplicationOrigin detachedInstance) {
		log.debug("merging PgReplicationOrigin instance");
		try {
			PgReplicationOrigin result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgReplicationOrigin findById(PgReplicationOriginId id) {
		log.debug("getting PgReplicationOrigin instance with id: " + id);
		try {
			PgReplicationOrigin instance = entityManager.find(PgReplicationOrigin.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
