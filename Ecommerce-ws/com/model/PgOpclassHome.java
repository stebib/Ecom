package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgOpclass.
 * @see com.model.PgOpclass
 * @author Hibernate Tools
 */
@Stateless
public class PgOpclassHome {

	private static final Log log = LogFactory.getLog(PgOpclassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgOpclass transientInstance) {
		log.debug("persisting PgOpclass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgOpclass persistentInstance) {
		log.debug("removing PgOpclass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgOpclass merge(PgOpclass detachedInstance) {
		log.debug("merging PgOpclass instance");
		try {
			PgOpclass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgOpclass findById(PgOpclassId id) {
		log.debug("getting PgOpclass instance with id: " + id);
		try {
			PgOpclass instance = entityManager.find(PgOpclass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
