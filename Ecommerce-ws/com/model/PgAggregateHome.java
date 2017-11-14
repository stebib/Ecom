package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgAggregate.
 * @see com.model.PgAggregate
 * @author Hibernate Tools
 */
@Stateless
public class PgAggregateHome {

	private static final Log log = LogFactory.getLog(PgAggregateHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgAggregate transientInstance) {
		log.debug("persisting PgAggregate instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgAggregate persistentInstance) {
		log.debug("removing PgAggregate instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgAggregate merge(PgAggregate detachedInstance) {
		log.debug("merging PgAggregate instance");
		try {
			PgAggregate result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgAggregate findById(PgAggregateId id) {
		log.debug("getting PgAggregate instance with id: " + id);
		try {
			PgAggregate instance = entityManager.find(PgAggregate.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
