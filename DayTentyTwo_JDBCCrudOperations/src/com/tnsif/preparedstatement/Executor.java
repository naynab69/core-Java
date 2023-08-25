//Program to demonstrate PreparedStatement Interface
package com.tnsif.preparedstatement;



public class Executor {

	public static void main(String[] args) {
		System.out.println("Employee Details Retrieve Operation");	
		PreparedStatementDemo.showEmp();
		System.out.println("__________________________________");
		PreparedStatementDemo.updateEmpName(12, "Firoz");
		PreparedStatementDemo.updateEmpSalary(12, 90000);
		System.out.println("Employee Details After Update Operation");
		PreparedStatementDemo.showEmp();
		System.out.println("__________________________________");

		
		PreparedStatementDemo.addEmployee(13, "Pallavi", 93000);
		System.out.println("Employee Details After Create Operation");
		PreparedStatementDemo.showEmp();
		System.out.println("__________________________________");

		if(PreparedStatementDemo.deleteEmp(2)==false)
			System.err.println("No such employee...");
			else
				System.out.println("Employee removed....");
		System.out.println("Employee Details After Delete Operation");
		PreparedStatementDemo.showEmp();

	}

}
