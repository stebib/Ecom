package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgTsConfigMap.
 * @see com.model.PgTsConfigMap
 * @author Hibernate Tools
 */
@Stateless
public class PgTsConfigMapHome {

	private static final Log log = LogFactory.getLog(PgTsConfigMapHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgTsConfigMap transientInstance) {
		log.debug("persisting PgTsConfigMap instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgTsConfigMap persistentInstance) {
		log.debug("removing PgTsConfigMap instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgTsConfigMap merge(PgTsConfigMap detachedInstance) {
		log.debug("merging PgTsConfigMap instance");
		try {
			PgTsConfigMap result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgTsConfigMap findById(PgTsConfigMapId id) {
		log.debug("getting PgTsConfigMap instance with id: " + id);
		try {
			PgTsConfigMap instance = entityManager.find(PgTsConfigMap.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
