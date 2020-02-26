package com.exercise.infosystem.domain;

public class Residence {
	
	private int apartmentCode;
	private String address;
	private int floorArea;
	private String tenureStatus;
	private String occupancyStatus;
	private int roomsNo;
	private int habitansNo;

	public Residence() {
	}

	public Residence(int apartmentCode, String address, int floorArea, String tenureStatus, String occupancyStatus,
			int roomsNo, int habitansNo) {
		super();
		this.apartmentCode = apartmentCode;
		this.address = address;
		this.floorArea = floorArea;
		this.tenureStatus = tenureStatus;
		this.occupancyStatus = occupancyStatus;
		this.roomsNo = roomsNo;
		this.habitansNo = habitansNo;
	}

	public String getTenureStatus() {
		return tenureStatus;
	}

	public void setTenureStatus(String tenureStatus) {
		this.tenureStatus = tenureStatus;
	}

	public String getOccupancyStatus() {
		return occupancyStatus;
	}

	public void setOccupancyStatus(String occupancyStatus) {
		this.occupancyStatus = occupancyStatus;
	}

	public int getHabitansNo() {
		return habitansNo;
	}

	public void setHabitansNo(int habitansNo) {
		this.habitansNo = habitansNo;
	}

	public int getApartmentCode() {
		return apartmentCode;
	}

	public String getAddress() {
		return address;
	}

	public int getFloorArea() {
		return floorArea;
	}

	public int getRoomsNo() {
		return roomsNo;
	}

	@Override
	public String toString() {
		return "Residence [apartmentCode=" + apartmentCode + ", address=" + address + ", floorArea=" + floorArea
				+ ", tenureStatus=" + tenureStatus + ", occupancyStatus=" + occupancyStatus + ", roomsNo=" + roomsNo
				+ ", habitansNo=" + habitansNo + "]";
	}

}
