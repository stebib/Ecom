package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgDescription.
 * @see com.model.PgDescription
 * @author Hibernate Tools
 */
@Stateless
public class PgDescriptionHome {

	private static final Log log = LogFactory.getLog(PgDescriptionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgDescription transientInstance) {
		log.debug("persisting PgDescription instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgDescription persistentInstance) {
		log.debug("removing PgDescription instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgDescription merge(PgDescription detachedInstance) {
		log.debug("merging PgDescription instance");
		try {
			PgDescription result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgDescription findById(PgDescriptionId id) {
		log.debug("getting PgDescription instance with id: " + id);
		try {
			PgDescription instance = entityManager.find(PgDescription.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
