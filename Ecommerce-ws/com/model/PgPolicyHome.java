package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgPolicy.
 * @see com.model.PgPolicy
 * @author Hibernate Tools
 */
@Stateless
public class PgPolicyHome {

	private static final Log log = LogFactory.getLog(PgPolicyHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgPolicy transientInstance) {
		log.debug("persisting PgPolicy instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgPolicy persistentInstance) {
		log.debug("removing PgPolicy instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgPolicy merge(PgPolicy detachedInstance) {
		log.debug("merging PgPolicy instance");
		try {
			PgPolicy result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgPolicy findById(PgPolicyId id) {
		log.debug("getting PgPolicy instance with id: " + id);
		try {
			PgPolicy instance = entityManager.find(PgPolicy.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
