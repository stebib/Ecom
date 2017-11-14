package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgCollation.
 * @see com.model.PgCollation
 * @author Hibernate Tools
 */
@Stateless
public class PgCollationHome {

	private static final Log log = LogFactory.getLog(PgCollationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgCollation transientInstance) {
		log.debug("persisting PgCollation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgCollation persistentInstance) {
		log.debug("removing PgCollation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgCollation merge(PgCollation detachedInstance) {
		log.debug("merging PgCollation instance");
		try {
			PgCollation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgCollation findById(PgCollationId id) {
		log.debug("getting PgCollation instance with id: " + id);
		try {
			PgCollation instance = entityManager.find(PgCollation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
