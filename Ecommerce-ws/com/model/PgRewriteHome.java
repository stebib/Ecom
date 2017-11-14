package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgRewrite.
 * @see com.model.PgRewrite
 * @author Hibernate Tools
 */
@Stateless
public class PgRewriteHome {

	private static final Log log = LogFactory.getLog(PgRewriteHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgRewrite transientInstance) {
		log.debug("persisting PgRewrite instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgRewrite persistentInstance) {
		log.debug("removing PgRewrite instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgRewrite merge(PgRewrite detachedInstance) {
		log.debug("merging PgRewrite instance");
		try {
			PgRewrite result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgRewrite findById(PgRewriteId id) {
		log.debug("getting PgRewrite instance with id: " + id);
		try {
			PgRewrite instance = entityManager.find(PgRewrite.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
