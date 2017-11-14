package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgAuthMembers.
 * @see com.model.PgAuthMembers
 * @author Hibernate Tools
 */
@Stateless
public class PgAuthMembersHome {

	private static final Log log = LogFactory.getLog(PgAuthMembersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgAuthMembers transientInstance) {
		log.debug("persisting PgAuthMembers instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgAuthMembers persistentInstance) {
		log.debug("removing PgAuthMembers instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgAuthMembers merge(PgAuthMembers detachedInstance) {
		log.debug("merging PgAuthMembers instance");
		try {
			PgAuthMembers result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgAuthMembers findById(PgAuthMembersId id) {
		log.debug("getting PgAuthMembers instance with id: " + id);
		try {
			PgAuthMembers instance = entityManager.find(PgAuthMembers.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
