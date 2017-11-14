package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgTsTemplate.
 * @see com.model.PgTsTemplate
 * @author Hibernate Tools
 */
@Stateless
public class PgTsTemplateHome {

	private static final Log log = LogFactory.getLog(PgTsTemplateHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgTsTemplate transientInstance) {
		log.debug("persisting PgTsTemplate instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgTsTemplate persistentInstance) {
		log.debug("removing PgTsTemplate instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgTsTemplate merge(PgTsTemplate detachedInstance) {
		log.debug("merging PgTsTemplate instance");
		try {
			PgTsTemplate result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgTsTemplate findById(PgTsTemplateId id) {
		log.debug("getting PgTsTemplate instance with id: " + id);
		try {
			PgTsTemplate instance = entityManager.find(PgTsTemplate.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
