package com.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.PersonIDao;
@Repository
@Transactional
public class PersonDaoImpl extends GenericDaoImpl implements PersonIDao {

}
