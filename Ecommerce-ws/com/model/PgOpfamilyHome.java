package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgOpfamily.
 * @see com.model.PgOpfamily
 * @author Hibernate Tools
 */
@Stateless
public class PgOpfamilyHome {

	private static final Log log = LogFactory.getLog(PgOpfamilyHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgOpfamily transientInstance) {
		log.debug("persisting PgOpfamily instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgOpfamily persistentInstance) {
		log.debug("removing PgOpfamily instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgOpfamily merge(PgOpfamily detachedInstance) {
		log.debug("merging PgOpfamily instance");
		try {
			PgOpfamily result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgOpfamily findById(PgOpfamilyId id) {
		log.debug("getting PgOpfamily instance with id: " + id);
		try {
			PgOpfamily instance = entityManager.find(PgOpfamily.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
