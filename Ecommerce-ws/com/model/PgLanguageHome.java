package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgLanguage.
 * @see com.model.PgLanguage
 * @author Hibernate Tools
 */
@Stateless
public class PgLanguageHome {

	private static final Log log = LogFactory.getLog(PgLanguageHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgLanguage transientInstance) {
		log.debug("persisting PgLanguage instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgLanguage persistentInstance) {
		log.debug("removing PgLanguage instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgLanguage merge(PgLanguage detachedInstance) {
		log.debug("merging PgLanguage instance");
		try {
			PgLanguage result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgLanguage findById(PgLanguageId id) {
		log.debug("getting PgLanguage instance with id: " + id);
		try {
			PgLanguage instance = entityManager.find(PgLanguage.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
