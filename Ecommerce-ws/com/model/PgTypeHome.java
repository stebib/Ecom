package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgType.
 * @see com.model.PgType
 * @author Hibernate Tools
 */
@Stateless
public class PgTypeHome {

	private static final Log log = LogFactory.getLog(PgTypeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgType transientInstance) {
		log.debug("persisting PgType instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgType persistentInstance) {
		log.debug("removing PgType instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgType merge(PgType detachedInstance) {
		log.debug("merging PgType instance");
		try {
			PgType result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgType findById(PgTypeId id) {
		log.debug("getting PgType instance with id: " + id);
		try {
			PgType instance = entityManager.find(PgType.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
