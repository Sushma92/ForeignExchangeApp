package com.forex.service;

import com.forex.common.entity.BaseEntity;

public abstract class BaseService<E extends BaseEntity, R> {

	public abstract R create(E entity);

	public abstract R update(E entity);

	public abstract E read(Long id);

	public abstract void delete(Long id);

	public abstract void generateMultiple(Integer noOfEntities);

}
