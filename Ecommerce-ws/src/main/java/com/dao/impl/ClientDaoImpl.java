package com.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ClientIDao;
@Repository
@Transactional
public class ClientDaoImpl extends GenericDaoImpl implements ClientIDao{

}
