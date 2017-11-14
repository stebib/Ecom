package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgTransform.
 * @see com.model.PgTransform
 * @author Hibernate Tools
 */
@Stateless
public class PgTransformHome {

	private static final Log log = LogFactory.getLog(PgTransformHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgTransform transientInstance) {
		log.debug("persisting PgTransform instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgTransform persistentInstance) {
		log.debug("removing PgTransform instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgTransform merge(PgTransform detachedInstance) {
		log.debug("merging PgTransform instance");
		try {
			PgTransform result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgTransform findById(PgTransformId id) {
		log.debug("getting PgTransform instance with id: " + id);
		try {
			PgTransform instance = entityManager.find(PgTransform.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
