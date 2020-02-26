package com.exercise.infosystem.domain;

public class Building {
	
	private int buildingCode;
	private String location;
	private Person owner;
	private int constructionYear;
	private String ownershipStatus;
	private int size;
	private String purposeOfUse;
	private RealEstate realEstate;
	
	public Building() {
	}

	public Building(int buildingCode, String location, Person owner, int constructionYear, String ownershipStatus,
			int size, String purposeOfUse, RealEstate realEstate) {
		super();
		this.buildingCode = buildingCode;
		this.location = location;
		this.owner = owner;
		this.constructionYear = constructionYear;
		this.ownershipStatus = ownershipStatus;
		this.size = size;
		this.purposeOfUse = purposeOfUse;
		this.realEstate = realEstate;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public String getOwnershipStatus() {
		return ownershipStatus;
	}

	public void setOwnershipStatus(String ownershipStatus) {
		this.ownershipStatus = ownershipStatus;
	}

	public String getPurposeOfUse() {
		return purposeOfUse;
	}

	public void setPurposeOfUse(String purposeOfUse) {
		this.purposeOfUse = purposeOfUse;
	}

	public int getBuildingCode() {
		return buildingCode;
	}

	public String getLocation() {
		return location;
	}

	public int getConstructionYear() {
		return constructionYear;
	}

	public int getSize() {
		return size;
	}

	public RealEstate getRealEstate() {
		return realEstate;
	}

	@Override
	public String toString() {
		return "Building [buildingCode=" + buildingCode + ", location=" + location + ", owner=" + owner
				+ ", constructionYear=" + constructionYear + ", ownershipStatus=" + ownershipStatus + ", size=" + size
				+ ", purposeOfUse=" + purposeOfUse + ", realEstate=" + realEstate + "]";
	}

}
