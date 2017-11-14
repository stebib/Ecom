package com.model;
// Generated Nov 11, 2017 10:38:01 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PgLargeobjectMetadata.
 * @see com.model.PgLargeobjectMetadata
 * @author Hibernate Tools
 */
@Stateless
public class PgLargeobjectMetadataHome {

	private static final Log log = LogFactory.getLog(PgLargeobjectMetadataHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PgLargeobjectMetadata transientInstance) {
		log.debug("persisting PgLargeobjectMetadata instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PgLargeobjectMetadata persistentInstance) {
		log.debug("removing PgLargeobjectMetadata instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PgLargeobjectMetadata merge(PgLargeobjectMetadata detachedInstance) {
		log.debug("merging PgLargeobjectMetadata instance");
		try {
			PgLargeobjectMetadata result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PgLargeobjectMetadata findById(PgLargeobjectMetadataId id) {
		log.debug("getting PgLargeobjectMetadata instance with id: " + id);
		try {
			PgLargeobjectMetadata instance = entityManager.find(PgLargeobjectMetadata.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
