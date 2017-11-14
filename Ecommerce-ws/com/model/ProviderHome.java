package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Provider.
 * @see com.model.Provider
 * @author Hibernate Tools
 */
@Stateless
public class ProviderHome {

	private static final Log log = LogFactory.getLog(ProviderHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Provider transientInstance) {
		log.debug("persisting Provider instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Provider persistentInstance) {
		log.debug("removing Provider instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Provider merge(Provider detachedInstance) {
		log.debug("merging Provider instance");
		try {
			Provider result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Provider findById(ProviderId id) {
		log.debug("getting Provider instance with id: " + id);
		try {
			Provider instance = entityManager.find(Provider.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
