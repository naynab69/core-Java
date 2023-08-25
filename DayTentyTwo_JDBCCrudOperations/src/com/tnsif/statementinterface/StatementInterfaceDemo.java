//Program to demonstrate Statement Interface
package com.tnsif.statementinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class StatementInterfaceDemo {
	static Connection cn;

	static Statement st;
	static {
		cn = DBUtil.getConnetion();
		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//create/insert
	public static int addEmployee(int empId, String empName, double empSalary) {

		int n = 0;
		try {

			String query = "INSERT INTO emp VALUES(" + empId + ",'" + empName + "'," + empSalary + ")";
			n = st.executeUpdate(query);
			System.out.println("One Employee is added");
		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
			n = 0;
		}
		return n;

	}

	public static int validateEmp(int empId) {
		int n = 0;
		try {
			String query = "SELECT count(*) FROM emp where id=" + empId;
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				if (rs.getInt(1) != 0)
					n = 1;
			}

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return n;
	}
//delete
	public static boolean deleteEmp(int empId) {
		boolean status = false;

		try {

			int n = validateEmp(empId);
			if (n == 1) {
				String query = "DELETE FROM emp WHERE id=" + empId;
				st.executeUpdate(query);
				status = true;
				System.out.println("one Employee is deleted");
			}

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	
	//update-name 
	public static boolean updateEmpName(int empId, String empName) {
		boolean status = false;
		try {

			if (validateEmp(empId) == 1) {
				String query = "UPDATE emp set name='" + empName + "' WHERE id=" + empId;
				st.executeUpdate(query);
				status = true;
				System.out.println("One record is updated");
			} else

				System.out.println("No such Employee Record.....");

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	
	//update-salary
	public static boolean updateEmpSalary(int empId, double salary) {
		boolean status = false;
		try {

			if (validateEmp(empId) == 1) {
				String query = "UPDATE emp SET salary=" + salary + " WHERE id=" + empId;
				st.executeUpdate(query);
				status = true;
				System.out.println("Salary is updated");
			} else
				System.out.println("No such Employee Record.....");

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	//retrieve all
	public static void showEmp() {
		try {

			String query = "SELECT * FROM emp";
			ResultSet rs = st.executeQuery(query);

		
			if (rs.next()) {
				while (rs.next()) {

					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3));
				}
			} else
				System.out.println("No Employee Records.....");
			rs.close();

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
	}

	public void closeConnection() {
		try {
			st.close();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
