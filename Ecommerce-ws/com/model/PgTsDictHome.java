package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgTsDict.
 * @see com.model.PgTsDict
 * @author Hibernate Tools
 */
@Stateless
public class PgTsDictHome {

	private static final Log log = LogFactory.getLog(PgTsDictHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgTsDict transientInstance) {
		log.debug("persisting PgTsDict instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgTsDict persistentInstance) {
		log.debug("removing PgTsDict instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgTsDict merge(PgTsDict detachedInstance) {
		log.debug("merging PgTsDict instance");
		try {
			PgTsDict result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgTsDict findById(PgTsDictId id) {
		log.debug("getting PgTsDict instance with id: " + id);
		try {
			PgTsDict instance = entityManager.find(PgTsDict.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
