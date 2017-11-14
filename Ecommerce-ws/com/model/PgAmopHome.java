package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgAmop.
 * @see com.model.PgAmop
 * @author Hibernate Tools
 */
@Stateless
public class PgAmopHome {

	private static final Log log = LogFactory.getLog(PgAmopHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgAmop transientInstance) {
		log.debug("persisting PgAmop instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgAmop persistentInstance) {
		log.debug("removing PgAmop instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgAmop merge(PgAmop detachedInstance) {
		log.debug("merging PgAmop instance");
		try {
			PgAmop result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgAmop findById(PgAmopId id) {
		log.debug("getting PgAmop instance with id: " + id);
		try {
			PgAmop instance = entityManager.find(PgAmop.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
