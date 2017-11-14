package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgTablespace.
 * @see com.model.PgTablespace
 * @author Hibernate Tools
 */
@Stateless
public class PgTablespaceHome {

	private static final Log log = LogFactory.getLog(PgTablespaceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgTablespace transientInstance) {
		log.debug("persisting PgTablespace instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgTablespace persistentInstance) {
		log.debug("removing PgTablespace instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgTablespace merge(PgTablespace detachedInstance) {
		log.debug("merging PgTablespace instance");
		try {
			PgTablespace result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgTablespace findById(PgTablespaceId id) {
		log.debug("getting PgTablespace instance with id: " + id);
		try {
			PgTablespace instance = entityManager.find(PgTablespace.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
