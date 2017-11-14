package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgNamespace.
 * @see com.model.PgNamespace
 * @author Hibernate Tools
 */
@Stateless
public class PgNamespaceHome {

	private static final Log log = LogFactory.getLog(PgNamespaceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgNamespace transientInstance) {
		log.debug("persisting PgNamespace instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgNamespace persistentInstance) {
		log.debug("removing PgNamespace instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgNamespace merge(PgNamespace detachedInstance) {
		log.debug("merging PgNamespace instance");
		try {
			PgNamespace result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgNamespace findById(PgNamespaceId id) {
		log.debug("getting PgNamespace instance with id: " + id);
		try {
			PgNamespace instance = entityManager.find(PgNamespace.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
