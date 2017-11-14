package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgExtension.
 * @see com.model.PgExtension
 * @author Hibernate Tools
 */
@Stateless
public class PgExtensionHome {

	private static final Log log = LogFactory.getLog(PgExtensionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgExtension transientInstance) {
		log.debug("persisting PgExtension instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgExtension persistentInstance) {
		log.debug("removing PgExtension instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgExtension merge(PgExtension detachedInstance) {
		log.debug("merging PgExtension instance");
		try {
			PgExtension result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgExtension findById(PgExtensionId id) {
		log.debug("getting PgExtension instance with id: " + id);
		try {
			PgExtension instance = entityManager.find(PgExtension.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
