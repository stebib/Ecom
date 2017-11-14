package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgAttrdef.
 * @see com.model.PgAttrdef
 * @author Hibernate Tools
 */
@Stateless
public class PgAttrdefHome {

	private static final Log log = LogFactory.getLog(PgAttrdefHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgAttrdef transientInstance) {
		log.debug("persisting PgAttrdef instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgAttrdef persistentInstance) {
		log.debug("removing PgAttrdef instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgAttrdef merge(PgAttrdef detachedInstance) {
		log.debug("merging PgAttrdef instance");
		try {
			PgAttrdef result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgAttrdef findById(PgAttrdefId id) {
		log.debug("getting PgAttrdef instance with id: " + id);
		try {
			PgAttrdef instance = entityManager.find(PgAttrdef.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
