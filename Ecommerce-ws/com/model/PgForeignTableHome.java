package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgForeignTable.
 * @see com.model.PgForeignTable
 * @author Hibernate Tools
 */
@Stateless
public class PgForeignTableHome {

	private static final Log log = LogFactory.getLog(PgForeignTableHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgForeignTable transientInstance) {
		log.debug("persisting PgForeignTable instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgForeignTable persistentInstance) {
		log.debug("removing PgForeignTable instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgForeignTable merge(PgForeignTable detachedInstance) {
		log.debug("merging PgForeignTable instance");
		try {
			PgForeignTable result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgForeignTable findById(PgForeignTableId id) {
		log.debug("getting PgForeignTable instance with id: " + id);
		try {
			PgForeignTable instance = entityManager.find(PgForeignTable.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
