package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgTsParser.
 * @see com.model.PgTsParser
 * @author Hibernate Tools
 */
@Stateless
public class PgTsParserHome {

	private static final Log log = LogFactory.getLog(PgTsParserHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgTsParser transientInstance) {
		log.debug("persisting PgTsParser instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgTsParser persistentInstance) {
		log.debug("removing PgTsParser instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgTsParser merge(PgTsParser detachedInstance) {
		log.debug("merging PgTsParser instance");
		try {
			PgTsParser result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgTsParser findById(PgTsParserId id) {
		log.debug("getting PgTsParser instance with id: " + id);
		try {
			PgTsParser instance = entityManager.find(PgTsParser.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
