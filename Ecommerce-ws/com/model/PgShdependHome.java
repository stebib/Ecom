package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgShdepend.
 * @see com.model.PgShdepend
 * @author Hibernate Tools
 */
@Stateless
public class PgShdependHome {

	private static final Log log = LogFactory.getLog(PgShdependHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgShdepend transientInstance) {
		log.debug("persisting PgShdepend instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgShdepend persistentInstance) {
		log.debug("removing PgShdepend instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgShdepend merge(PgShdepend detachedInstance) {
		log.debug("merging PgShdepend instance");
		try {
			PgShdepend result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgShdepend findById(PgShdependId id) {
		log.debug("getting PgShdepend instance with id: " + id);
		try {
			PgShdepend instance = entityManager.find(PgShdepend.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
