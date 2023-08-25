//Program to demonstrate Statement Interface
package com.tnsif.statementinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.*;

public class Executor {

	public static void main(String[] args) {
		StatementInterfaceDemo.showEmp();
		System.out.println("----------------------------------------------");
		
		System.out.println(StatementInterfaceDemo.updateEmpName(12, "Ranjeetha"));
		StatementInterfaceDemo.updateEmpSalary(106, 80000);
		System.out.println("-------------After Updating Name and Salary------------");
		StatementInterfaceDemo.showEmp();
		StatementInterfaceDemo.deleteEmp(107);
		StatementInterfaceDemo.deleteEmp(101);
		StatementInterfaceDemo.updateEmpName(202,"Nayna");
		System.out.println("-----------After Deleting --------------------");
		StatementInterfaceDemo.showEmp();
		StatementInterfaceDemo.addEmployee(203, "Tejswini", 85000);
		StatementInterfaceDemo.showEmp();

	}

}
