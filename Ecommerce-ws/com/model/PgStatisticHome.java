package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgStatistic.
 * @see com.model.PgStatistic
 * @author Hibernate Tools
 */
@Stateless
public class PgStatisticHome {

	private static final Log log = LogFactory.getLog(PgStatisticHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgStatistic transientInstance) {
		log.debug("persisting PgStatistic instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgStatistic persistentInstance) {
		log.debug("removing PgStatistic instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgStatistic merge(PgStatistic detachedInstance) {
		log.debug("merging PgStatistic instance");
		try {
			PgStatistic result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgStatistic findById(PgStatisticId id) {
		log.debug("getting PgStatistic instance with id: " + id);
		try {
			PgStatistic instance = entityManager.find(PgStatistic.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
