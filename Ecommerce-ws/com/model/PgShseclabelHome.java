package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgShseclabel.
 * @see com.model.PgShseclabel
 * @author Hibernate Tools
 */
@Stateless
public class PgShseclabelHome {

	private static final Log log = LogFactory.getLog(PgShseclabelHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgShseclabel transientInstance) {
		log.debug("persisting PgShseclabel instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgShseclabel persistentInstance) {
		log.debug("removing PgShseclabel instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgShseclabel merge(PgShseclabel detachedInstance) {
		log.debug("merging PgShseclabel instance");
		try {
			PgShseclabel result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgShseclabel findById(PgShseclabelId id) {
		log.debug("getting PgShseclabel instance with id: " + id);
		try {
			PgShseclabel instance = entityManager.find(PgShseclabel.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
