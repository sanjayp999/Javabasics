package com.oops;

public class Institute {
	public static void main(String[] args) {
	
	Students s=new Students();
	s.setId(347);
	s.getId();
	s.setName("haiden");
	s.getName();
	s.setRollnumber(76897);
	s.getRollnumber();
	System.out.println(s.getId()+s.getName()+s.getRollnumber());

	}
}