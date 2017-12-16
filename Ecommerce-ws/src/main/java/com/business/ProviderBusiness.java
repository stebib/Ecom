package com.business;

import java.io.Serializable;
import java.util.List;

import com.model.Provider;

public interface ProviderBusiness {

	public void signUpProvider(Provider provider);

	public void modifyProvider(Provider provider);

	public void removeProvider(Provider provider);

	public List<Provider> getAllProvider(Class clazz);

	public Provider getProviderById(Class clazz, Serializable id);

}
