package com.selvakumar.pojo;

public class Person {
	
	private Integer id;
	private String name;
	private int age;
	private String country;
	private String phone;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", country=" + country + ", phone=" + phone
				+ "]";
	}
	
	
	
//	@Override
//	public int compareTo(Person o) {
//		int result = this.name.compareTo(o.getName());
//		if(result == 0){
//	        result = this.age > o.getAge() ? 1 : this.age < o.getAge() ? -1 : 0;
//	    }
//		if(result ==0) {
//			 result = this.country.compareTo(o.getCountry());
//		}
//		return result;
//	}
	

	
}
