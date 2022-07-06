package com.javatpoint.springbootcrudoperation.dto;

public class BookDto {

	private int id;
	private String empName;
	private String address;
	private int number;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "BookDto [id=" + id + ", empName=" + empName + ", address=" + address + ", number=" + number + "]";
	}
}
