package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgConversion.
 * @see com.model.PgConversion
 * @author Hibernate Tools
 */
@Stateless
public class PgConversionHome {

	private static final Log log = LogFactory.getLog(PgConversionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgConversion transientInstance) {
		log.debug("persisting PgConversion instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgConversion persistentInstance) {
		log.debug("removing PgConversion instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgConversion merge(PgConversion detachedInstance) {
		log.debug("merging PgConversion instance");
		try {
			PgConversion result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgConversion findById(PgConversionId id) {
		log.debug("getting PgConversion instance with id: " + id);
		try {
			PgConversion instance = entityManager.find(PgConversion.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
