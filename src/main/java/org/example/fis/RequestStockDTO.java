package org.example.fis;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RequestStockDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	private String skuParam;

	@NotNull
	@Size(min = 3, max = 3)
	private String organizationParam;

	@NotNull
	private String subinventoryParam;

	public String getSkuParam() {
		return skuParam;
	}

	public void setSkuParam(String skuParam) {
		this.skuParam = skuParam;
	}

	public String getOrganizationParam() {
		return organizationParam;
	}

	public void setOrganizationParam(String organizationParam) {
		this.organizationParam = organizationParam;
	}

	public String getSubinventoryParam() {
		return subinventoryParam;
	}

	public void setSubinventoryParam(String subinventoryParam) {
		this.subinventoryParam = subinventoryParam;
	}

}
