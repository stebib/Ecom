package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgForeignServer.
 * @see com.model.PgForeignServer
 * @author Hibernate Tools
 */
@Stateless
public class PgForeignServerHome {

	private static final Log log = LogFactory.getLog(PgForeignServerHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgForeignServer transientInstance) {
		log.debug("persisting PgForeignServer instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgForeignServer persistentInstance) {
		log.debug("removing PgForeignServer instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgForeignServer merge(PgForeignServer detachedInstance) {
		log.debug("merging PgForeignServer instance");
		try {
			PgForeignServer result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgForeignServer findById(PgForeignServerId id) {
		log.debug("getting PgForeignServer instance with id: " + id);
		try {
			PgForeignServer instance = entityManager.find(PgForeignServer.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
