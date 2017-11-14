package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgAuthid.
 * @see com.model.PgAuthid
 * @author Hibernate Tools
 */
@Stateless
public class PgAuthidHome {

	private static final Log log = LogFactory.getLog(PgAuthidHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgAuthid transientInstance) {
		log.debug("persisting PgAuthid instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgAuthid persistentInstance) {
		log.debug("removing PgAuthid instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgAuthid merge(PgAuthid detachedInstance) {
		log.debug("merging PgAuthid instance");
		try {
			PgAuthid result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgAuthid findById(PgAuthidId id) {
		log.debug("getting PgAuthid instance with id: " + id);
		try {
			PgAuthid instance = entityManager.find(PgAuthid.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
