package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgAmproc.
 * @see com.model.PgAmproc
 * @author Hibernate Tools
 */
@Stateless
public class PgAmprocHome {

	private static final Log log = LogFactory.getLog(PgAmprocHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgAmproc transientInstance) {
		log.debug("persisting PgAmproc instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgAmproc persistentInstance) {
		log.debug("removing PgAmproc instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgAmproc merge(PgAmproc detachedInstance) {
		log.debug("merging PgAmproc instance");
		try {
			PgAmproc result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgAmproc findById(PgAmprocId id) {
		log.debug("getting PgAmproc instance with id: " + id);
		try {
			PgAmproc instance = entityManager.find(PgAmproc.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
