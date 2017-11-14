package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgAm.
 * @see com.model.PgAm
 * @author Hibernate Tools
 */
@Stateless
public class PgAmHome {

	private static final Log log = LogFactory.getLog(PgAmHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgAm transientInstance) {
		log.debug("persisting PgAm instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgAm persistentInstance) {
		log.debug("removing PgAm instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgAm merge(PgAm detachedInstance) {
		log.debug("merging PgAm instance");
		try {
			PgAm result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgAm findById(PgAmId id) {
		log.debug("getting PgAm instance with id: " + id);
		try {
			PgAm instance = entityManager.find(PgAm.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
