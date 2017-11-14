package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgUserMapping.
 * @see com.model.PgUserMapping
 * @author Hibernate Tools
 */
@Stateless
public class PgUserMappingHome {

	private static final Log log = LogFactory.getLog(PgUserMappingHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgUserMapping transientInstance) {
		log.debug("persisting PgUserMapping instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgUserMapping persistentInstance) {
		log.debug("removing PgUserMapping instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgUserMapping merge(PgUserMapping detachedInstance) {
		log.debug("merging PgUserMapping instance");
		try {
			PgUserMapping result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgUserMapping findById(PgUserMappingId id) {
		log.debug("getting PgUserMapping instance with id: " + id);
		try {
			PgUserMapping instance = entityManager.find(PgUserMapping.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
