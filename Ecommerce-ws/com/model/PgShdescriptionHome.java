package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgShdescription.
 * @see com.model.PgShdescription
 * @author Hibernate Tools
 */
@Stateless
public class PgShdescriptionHome {

	private static final Log log = LogFactory.getLog(PgShdescriptionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgShdescription transientInstance) {
		log.debug("persisting PgShdescription instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgShdescription persistentInstance) {
		log.debug("removing PgShdescription instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgShdescription merge(PgShdescription detachedInstance) {
		log.debug("merging PgShdescription instance");
		try {
			PgShdescription result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgShdescription findById(PgShdescriptionId id) {
		log.debug("getting PgShdescription instance with id: " + id);
		try {
			PgShdescription instance = entityManager.find(PgShdescription.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
