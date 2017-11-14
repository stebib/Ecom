package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgConstraint.
 * @see com.model.PgConstraint
 * @author Hibernate Tools
 */
@Stateless
public class PgConstraintHome {

	private static final Log log = LogFactory.getLog(PgConstraintHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgConstraint transientInstance) {
		log.debug("persisting PgConstraint instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgConstraint persistentInstance) {
		log.debug("removing PgConstraint instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgConstraint merge(PgConstraint detachedInstance) {
		log.debug("merging PgConstraint instance");
		try {
			PgConstraint result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgConstraint findById(PgConstraintId id) {
		log.debug("getting PgConstraint instance with id: " + id);
		try {
			PgConstraint instance = entityManager.find(PgConstraint.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
