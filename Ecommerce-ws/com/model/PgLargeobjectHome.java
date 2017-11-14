package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgLargeobject.
 * @see com.model.PgLargeobject
 * @author Hibernate Tools
 */
@Stateless
public class PgLargeobjectHome {

	private static final Log log = LogFactory.getLog(PgLargeobjectHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgLargeobject transientInstance) {
		log.debug("persisting PgLargeobject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgLargeobject persistentInstance) {
		log.debug("removing PgLargeobject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgLargeobject merge(PgLargeobject detachedInstance) {
		log.debug("merging PgLargeobject instance");
		try {
			PgLargeobject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgLargeobject findById(PgLargeobjectId id) {
		log.debug("getting PgLargeobject instance with id: " + id);
		try {
			PgLargeobject instance = entityManager.find(PgLargeobject.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
