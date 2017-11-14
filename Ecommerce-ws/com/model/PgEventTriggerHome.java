package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgEventTrigger.
 * @see com.model.PgEventTrigger
 * @author Hibernate Tools
 */
@Stateless
public class PgEventTriggerHome {

	private static final Log log = LogFactory.getLog(PgEventTriggerHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgEventTrigger transientInstance) {
		log.debug("persisting PgEventTrigger instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgEventTrigger persistentInstance) {
		log.debug("removing PgEventTrigger instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgEventTrigger merge(PgEventTrigger detachedInstance) {
		log.debug("merging PgEventTrigger instance");
		try {
			PgEventTrigger result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgEventTrigger findById(PgEventTriggerId id) {
		log.debug("getting PgEventTrigger instance with id: " + id);
		try {
			PgEventTrigger instance = entityManager.find(PgEventTrigger.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
