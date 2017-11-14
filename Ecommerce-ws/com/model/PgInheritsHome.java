package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgInherits.
 * @see com.model.PgInherits
 * @author Hibernate Tools
 */
@Stateless
public class PgInheritsHome {

	private static final Log log = LogFactory.getLog(PgInheritsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgInherits transientInstance) {
		log.debug("persisting PgInherits instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgInherits persistentInstance) {
		log.debug("removing PgInherits instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgInherits merge(PgInherits detachedInstance) {
		log.debug("merging PgInherits instance");
		try {
			PgInherits result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgInherits findById(PgInheritsId id) {
		log.debug("getting PgInherits instance with id: " + id);
		try {
			PgInherits instance = entityManager.find(PgInherits.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
