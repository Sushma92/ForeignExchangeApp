package com.forex.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EntityMultiGenerateThread {

	private Integer noOFEntitiesForThisThread;
	
	private BaseService baseService;
	
	public EntityMultiGenerateThread() {}
	
	public Integer noOFEntitiesForThisThread() {
		return noOFEntitiesForThisThread;
	}
	
	public void setNoOfEntitiesForThisThread(Integer noOfEntitiesForThisThread) {
		this.noOFEntitiesForThisThread = noOfEntitiesForThisThread;
	}


	public BaseService getBaseService() {
		return baseService;
	}


	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}


	public void run() {
		for(int entityCtr = 1; entityCtr <= noOFEntitiesForThisThread; entityCtr++) {
		}
	}
}
