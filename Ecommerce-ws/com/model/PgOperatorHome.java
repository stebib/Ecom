package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgOperator.
 * @see com.model.PgOperator
 * @author Hibernate Tools
 */
@Stateless
public class PgOperatorHome {

	private static final Log log = LogFactory.getLog(PgOperatorHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgOperator transientInstance) {
		log.debug("persisting PgOperator instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgOperator persistentInstance) {
		log.debug("removing PgOperator instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgOperator merge(PgOperator detachedInstance) {
		log.debug("merging PgOperator instance");
		try {
			PgOperator result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgOperator findById(PgOperatorId id) {
		log.debug("getting PgOperator instance with id: " + id);
		try {
			PgOperator instance = entityManager.find(PgOperator.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
