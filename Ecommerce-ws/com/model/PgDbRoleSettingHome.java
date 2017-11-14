package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgDbRoleSetting.
 * @see com.model.PgDbRoleSetting
 * @author Hibernate Tools
 */
@Stateless
public class PgDbRoleSettingHome {

	private static final Log log = LogFactory.getLog(PgDbRoleSettingHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgDbRoleSetting transientInstance) {
		log.debug("persisting PgDbRoleSetting instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgDbRoleSetting persistentInstance) {
		log.debug("removing PgDbRoleSetting instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgDbRoleSetting merge(PgDbRoleSetting detachedInstance) {
		log.debug("merging PgDbRoleSetting instance");
		try {
			PgDbRoleSetting result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgDbRoleSetting findById(PgDbRoleSettingId id) {
		log.debug("getting PgDbRoleSetting instance with id: " + id);
		try {
			PgDbRoleSetting instance = entityManager.find(PgDbRoleSetting.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
