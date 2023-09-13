package com.filehandiling;

public class Employee {
	int id=3456;
	String Compyname="Vtalent";
	int noofdepts=3;
	static double networth=500.00;
	public static void main(String[] args) {
		int eid=101;
		String empname="alex";
		double salary=300.00;
		
		Employee e1= new Employee();
         e1.getid()	;
         Employee e2= new Employee();
         e2.getnetworth();
	}

	public int getid(){
		return id;	
	}
	public static double getnetworth() {
		return networth;
	}
	public void deleteEmployee(int id) {
	
	}

}

