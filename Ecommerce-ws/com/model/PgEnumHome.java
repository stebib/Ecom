package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgEnum.
 * @see com.model.PgEnum
 * @author Hibernate Tools
 */
@Stateless
public class PgEnumHome {

	private static final Log log = LogFactory.getLog(PgEnumHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgEnum transientInstance) {
		log.debug("persisting PgEnum instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgEnum persistentInstance) {
		log.debug("removing PgEnum instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgEnum merge(PgEnum detachedInstance) {
		log.debug("merging PgEnum instance");
		try {
			PgEnum result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgEnum findById(PgEnumId id) {
		log.debug("getting PgEnum instance with id: " + id);
		try {
			PgEnum instance = entityManager.find(PgEnum.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
