package com.forex.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Customer")
@Table(name = "customer")
public class Customer extends BaseEntity {

	@Column(name = "name", length = 25)
	private String name;

	@Column(name = "customer_description", length = 1000)
	private String customerDescription;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomerDescription() {
		return customerDescription;
	}

	public void setCustomerDescription(String customerDescription) {
		this.customerDescription = customerDescription;
	}

}
