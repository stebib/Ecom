package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgInitPrivs.
 * @see com.model.PgInitPrivs
 * @author Hibernate Tools
 */
@Stateless
public class PgInitPrivsHome {

	private static final Log log = LogFactory.getLog(PgInitPrivsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgInitPrivs transientInstance) {
		log.debug("persisting PgInitPrivs instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgInitPrivs persistentInstance) {
		log.debug("removing PgInitPrivs instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgInitPrivs merge(PgInitPrivs detachedInstance) {
		log.debug("merging PgInitPrivs instance");
		try {
			PgInitPrivs result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgInitPrivs findById(PgInitPrivsId id) {
		log.debug("getting PgInitPrivs instance with id: " + id);
		try {
			PgInitPrivs instance = entityManager.find(PgInitPrivs.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
