package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgDepend.
 * @see com.model.PgDepend
 * @author Hibernate Tools
 */
@Stateless
public class PgDependHome {

	private static final Log log = LogFactory.getLog(PgDependHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgDepend transientInstance) {
		log.debug("persisting PgDepend instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgDepend persistentInstance) {
		log.debug("removing PgDepend instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgDepend merge(PgDepend detachedInstance) {
		log.debug("merging PgDepend instance");
		try {
			PgDepend result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgDepend findById(PgDependId id) {
		log.debug("getting PgDepend instance with id: " + id);
		try {
			PgDepend instance = entityManager.find(PgDepend.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
