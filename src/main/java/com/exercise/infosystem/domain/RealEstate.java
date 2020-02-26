package com.exercise.infosystem.domain;

public class RealEstate {

	private int realEstateCode;
	private String ownerName;
	private String ownerAddress;
	private int buildingsNo;
	
	public RealEstate() {
	}

	public RealEstate(int realEstateCode, String ownerName, String ownerAddress, int buildingsNo) {
		super();
		this.realEstateCode = realEstateCode;
		this.buildingsNo = buildingsNo;
		this.ownerName = ownerName;
		this.ownerAddress = ownerAddress;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public int getRealEstateCode() {
		return realEstateCode;
	}

	public int getBuildingsNo() {
		return buildingsNo;
	}

	@Override
	public String toString() {
		return "RealEstate [realEstateCode=" + realEstateCode + ", ownerName=" + ownerName + ", ownerAddress="
				+ ownerAddress + ", buildingsNo=" + buildingsNo + "]";
	}
	
}
