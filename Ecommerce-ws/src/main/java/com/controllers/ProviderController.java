package com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.business.ProviderBusiness;
import com.model.Provider;
import com.model.ProviderId;
import com.util.Message;
import com.util.MessageBean;

@Controller
@RequestMapping(value = "/provider", produces = "application/hal+json")
public class ProviderController {
	@Autowired
	private ProviderBusiness _providerBusiness;

	@RequestMapping(value = "/deletProvider", method = RequestMethod.POST)
	@ResponseBody
	public String delete(String idcard, String login) {
		try {
			Provider provider = new Provider();
			ProviderId providerid = new ProviderId();
			providerid.setIdCard(idcard);
			providerid.setLogin(login);
			provider.setId(providerid);
			_providerBusiness.removeProvider(provider);
		} catch (Exception ex) {
			return ex.getMessage();
		}
		return "provider succesfully deleted!";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/getAllProviders", method = RequestMethod.GET)
	@ResponseBody
	public com.util.ResponseBody getAllProviders() {

		List<Provider> provider = null;
		com.util.ResponseBody rspb = new com.util.ResponseBody();
		Message msg = new Message();

		try {

			provider = _providerBusiness.getAllProvider(Provider.class);

			// providerId = String.valueOf(provider.getId());
		} catch (Exception ex) {
			msg.setText("provider not found");
			MessageBean msgbean = new MessageBean(msg, false);
			rspb.setMsgbean(msgbean);
			return rspb;
		}
		rspb.setList(provider);
		MessageBean msgbean = new MessageBean();
		msgbean.setSuccess(true);
		rspb.setMsgbean(msgbean);
		return rspb;
	}

	@RequestMapping(value = "/getProviderById", method = RequestMethod.GET)
	@ResponseBody
	public com.util.ResponseBody getProviderById(String login, String idcard) {
		String providerId;
		com.util.ResponseBody rspb = new com.util.ResponseBody();
		Message msg = new Message();
		MessageBean msgbean = new MessageBean();
		List<Provider> listprovider = new ArrayList<Provider>();
		try {
			ProviderId clid = new ProviderId();
			clid.setIdCard(idcard);
			clid.setLogin(login);
			Provider provider = _providerBusiness.getProviderById(Provider.class, clid);
			providerId = String.valueOf(provider.getId());
			listprovider.add(provider);
		} catch (Exception ex) {
			msgbean.setSuccess(false);
			msg.setText("provider not found");
			msgbean.setMsg(msg);
			rspb.setMsgbean(msgbean);
			return rspb;
		}
		msgbean.setSuccess(true);
		rspb.setMsgbean(msgbean);
		rspb.setList(listprovider);
		return rspb;
	}

	@RequestMapping(value = "/registerProvider", method = RequestMethod.POST)
	@ResponseBody
	public com.util.ResponseBody create(String login, String idcard, String firstname, String lastname, String password,
			String profession, String socialstatus) {
		com.util.ResponseBody rspb = new com.util.ResponseBody();
		Message msg = new Message();
		MessageBean msgbean = new MessageBean();
		List<Provider> listprovider = new ArrayList<Provider>();
		try {
			ProviderId providerid = new ProviderId(idcard, login);
			Provider provider = new Provider();
			provider.setId(providerid);
			provider.setFirstname(firstname);
			provider.setLastname(lastname);
			provider.setPassword(password);
			provider.setProfession(profession);
			provider.setSocialstatus(socialstatus);
			_providerBusiness.signUpProvider(provider);
		} catch (Exception ex) {
			msg.setText(ex.getMessage());
			msgbean.setMsg(msg);
			msgbean.setSuccess(false);
			rspb.setMsgbean(msgbean);
			return rspb;
		}
		msg.setText("provider succesfully saved");
		msgbean.setMsg(msg);
		msgbean.setSuccess(true);
		rspb.setMsgbean(msgbean);
		return rspb;

	}

}