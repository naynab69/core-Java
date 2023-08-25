////Program to demonstrate PreparedStatement Interface 
package com.tnsif.preparedstatement;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class PreparedStatementDemo {

	static Connection cn;

	static PreparedStatement pst;
	static {
		cn = DBUtil.getConnectionObject();
		
		if(cn != null)
			System.out.println("JDBC:connection is taken..");

	}

	//add an employee 
	public static int addEmployee(int empId, String empName, double empSalary) {

		int n = 0;
		try {

			pst = cn.prepareStatement("INSERT INTO emp values(?,?,?)");
			pst.setInt(1, empId);
			pst.setString(2, empName);
			pst.setDouble(3, empSalary);

			n = pst.executeUpdate();
			System.out.println("Empolyee is added");
		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return n;

	}

	//validate employee by empId
	public static int validateEmp(int empId) {
		int n = 0;
		try {
			String query = "SELECT count(*) FROM emp where id=" + empId;
			pst = cn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getInt(1));
				n = 1;
			}

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return n;
	}

	//Delete employee 
	public static boolean deleteEmp(int empId) {
		boolean status = false;

		try {

			int n = validateEmp(empId);
			
			if (n == 1) {
				String query = "DELETE FROM emp WHERE id=" + empId;
				pst=cn.prepareStatement(query);
				n=pst.executeUpdate();
				if (n==1)
					status = true;
			}

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	//Update Employee Name
	public static boolean updateEmpName(int empId, String empName) {
		boolean status = false;
		try {

			if (validateEmp(empId) == 1) {
				String query = "UPDATE emp set name='" + empName + "' WHERE id=" + empId;
				pst = cn.prepareStatement(query);
				pst.executeUpdate();
				status = true;
			}

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	//Update Employee Salary
	public static boolean updateEmpSalary(int empId, double salary) {
		boolean status = false;
		try {

			if (validateEmp(empId) == 1) {
				String query = "UPDATE emp SET salary=" + salary + " WHERE id=" + empId;
				pst = cn.prepareStatement(query);
				pst.executeUpdate();
				status = true;
			}

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	public static void showEmp() {
		try {

			String query = "SELECT * FROM emp";
			pst = cn.prepareStatement(query);
			ResultSet rs = pst.executeQuery(query);

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
			pst.close();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
