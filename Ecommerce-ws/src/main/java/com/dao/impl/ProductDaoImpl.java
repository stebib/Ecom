package com.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductIDao;
@Repository
@Transactional
public class ProductDaoImpl extends GenericDaoImpl implements ProductIDao {

}
