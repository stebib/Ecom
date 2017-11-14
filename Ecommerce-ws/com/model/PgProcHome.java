package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgProc.
 * @see com.model.PgProc
 * @author Hibernate Tools
 */
@Stateless
public class PgProcHome {

	private static final Log log = LogFactory.getLog(PgProcHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgProc transientInstance) {
		log.debug("persisting PgProc instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgProc persistentInstance) {
		log.debug("removing PgProc instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgProc merge(PgProc detachedInstance) {
		log.debug("merging PgProc instance");
		try {
			PgProc result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgProc findById(PgProcId id) {
		log.debug("getting PgProc instance with id: " + id);
		try {
			PgProc instance = entityManager.find(PgProc.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
