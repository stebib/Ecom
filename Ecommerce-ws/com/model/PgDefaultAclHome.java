package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgDefaultAcl.
 * @see com.model.PgDefaultAcl
 * @author Hibernate Tools
 */
@Stateless
public class PgDefaultAclHome {

	private static final Log log = LogFactory.getLog(PgDefaultAclHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgDefaultAcl transientInstance) {
		log.debug("persisting PgDefaultAcl instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgDefaultAcl persistentInstance) {
		log.debug("removing PgDefaultAcl instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgDefaultAcl merge(PgDefaultAcl detachedInstance) {
		log.debug("merging PgDefaultAcl instance");
		try {
			PgDefaultAcl result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgDefaultAcl findById(PgDefaultAclId id) {
		log.debug("getting PgDefaultAcl instance with id: " + id);
		try {
			PgDefaultAcl instance = entityManager.find(PgDefaultAcl.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
