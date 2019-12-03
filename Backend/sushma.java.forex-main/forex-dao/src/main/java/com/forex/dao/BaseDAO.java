package com.forex.dao;

import org.springframework.data.repository.CrudRepository;

import com.forex.common.entity.BaseEntity;

public interface BaseDAO<E extends BaseEntity, R> extends CrudRepository<E, Long> {

}
