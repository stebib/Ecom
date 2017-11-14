package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgAttribute.
 * @see com.model.PgAttribute
 * @author Hibernate Tools
 */
@Stateless
public class PgAttributeHome {

	private static final Log log = LogFactory.getLog(PgAttributeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgAttribute transientInstance) {
		log.debug("persisting PgAttribute instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgAttribute persistentInstance) {
		log.debug("removing PgAttribute instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgAttribute merge(PgAttribute detachedInstance) {
		log.debug("merging PgAttribute instance");
		try {
			PgAttribute result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgAttribute findById(PgAttributeId id) {
		log.debug("getting PgAttribute instance with id: " + id);
		try {
			PgAttribute instance = entityManager.find(PgAttribute.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
