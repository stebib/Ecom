package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgCast.
 * @see com.model.PgCast
 * @author Hibernate Tools
 */
@Stateless
public class PgCastHome {

	private static final Log log = LogFactory.getLog(PgCastHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgCast transientInstance) {
		log.debug("persisting PgCast instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgCast persistentInstance) {
		log.debug("removing PgCast instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgCast merge(PgCast detachedInstance) {
		log.debug("merging PgCast instance");
		try {
			PgCast result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgCast findById(PgCastId id) {
		log.debug("getting PgCast instance with id: " + id);
		try {
			PgCast instance = entityManager.find(PgCast.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
