package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgRange.
 * @see com.model.PgRange
 * @author Hibernate Tools
 */
@Stateless
public class PgRangeHome {

	private static final Log log = LogFactory.getLog(PgRangeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgRange transientInstance) {
		log.debug("persisting PgRange instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgRange persistentInstance) {
		log.debug("removing PgRange instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgRange merge(PgRange detachedInstance) {
		log.debug("merging PgRange instance");
		try {
			PgRange result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgRange findById(PgRangeId id) {
		log.debug("getting PgRange instance with id: " + id);
		try {
			PgRange instance = entityManager.find(PgRange.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
