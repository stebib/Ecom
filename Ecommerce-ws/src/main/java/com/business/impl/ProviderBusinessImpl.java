package com.business.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.business.ProviderBusiness;
import com.dao.ProviderIDao;
import com.model.Provider;

@Repository
@Transactional
public class ProviderBusinessImpl implements ProviderBusiness {
	@Autowired
	private ProviderIDao _providerDao;

	@Override
	public void signUpProvider(Provider person) {
		// TODO Auto-generated method stub
		_providerDao.save(person);

	}

	@Override
	public void modifyProvider(Provider person) {
		// TODO Auto-generated method stub
		_providerDao.update(person);
	}

	@Override
	public void removeProvider(Provider person) {
		// TODO Auto-generated method stub
		_providerDao.delete(person);
	}

	@Override
	public List<Provider> getAllProvider(Class clazz) {
		// TODO Auto-generated method stub
		return (List<Provider>) (Object) _providerDao.findAll(Provider.class);

	}

	@Override
	public Provider getProviderById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return (Provider) _providerDao.findById(Provider.class, id);
	}

}
