package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgPltemplate.
 * @see com.model.PgPltemplate
 * @author Hibernate Tools
 */
@Stateless
public class PgPltemplateHome {

	private static final Log log = LogFactory.getLog(PgPltemplateHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgPltemplate transientInstance) {
		log.debug("persisting PgPltemplate instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgPltemplate persistentInstance) {
		log.debug("removing PgPltemplate instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgPltemplate merge(PgPltemplate detachedInstance) {
		log.debug("merging PgPltemplate instance");
		try {
			PgPltemplate result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgPltemplate findById(PgPltemplateId id) {
		log.debug("getting PgPltemplate instance with id: " + id);
		try {
			PgPltemplate instance = entityManager.find(PgPltemplate.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
