package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgTrigger.
 * @see com.model.PgTrigger
 * @author Hibernate Tools
 */
@Stateless
public class PgTriggerHome {

	private static final Log log = LogFactory.getLog(PgTriggerHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgTrigger transientInstance) {
		log.debug("persisting PgTrigger instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgTrigger persistentInstance) {
		log.debug("removing PgTrigger instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgTrigger merge(PgTrigger detachedInstance) {
		log.debug("merging PgTrigger instance");
		try {
			PgTrigger result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgTrigger findById(PgTriggerId id) {
		log.debug("getting PgTrigger instance with id: " + id);
		try {
			PgTrigger instance = entityManager.find(PgTrigger.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
