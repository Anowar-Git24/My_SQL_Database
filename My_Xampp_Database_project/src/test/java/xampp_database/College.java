package xampp_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class College {

    @Test(priority = 1)
    public void testDB1() throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        // Connect to MySQL DB
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personal_information");

            System.out.println("Connected to MySQL DB");

            // Process the results
            while (rs.next()) {
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String emailaddress = rs.getString("email");

                System.out.println("FirstName: " + firstname);
                System.out.println("LastName: " + lastname);
                System.out.println("EmailAddress: " + emailaddress);
            }
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        }
    }

    @Test(priority = 2)
    public void testDB2() throws ClassNotFoundException, SQLException {

        // Load the MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        // Connect to MySQL DB
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM students_details");

            // Process the results
            while (rs.next()) {
                String roll = rs.getString("roll");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String age = rs.getString("age");
                String gpa = rs.getString("gpa");

                System.out.println("Roll: " + roll);
                System.out.println("Name: " + name);
                System.out.println("Gender: " + gender);
                System.out.println("Age: " + age);
                System.out.println("GPA: " + gpa);
            }
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        }
    }

    @Test(priority = 3)
    public void testDB3() throws ClassNotFoundException, SQLException {

        // Load the MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        // Connect to MySQL DB
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM teachers");

            // Process the results
            while (rs.next()) {
                String teacherid = rs.getString("teacherid");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String gender = rs.getString("gender");
                String dateofbirth = rs.getString("dateofbirth");
                String email = rs.getString("email");
                String phonenumber = rs.getString("phonenumber");
                String department = rs.getString("department");
                String salary = rs.getString("salary");
                String hiredate = rs.getString("hiredate");
                String isfulltime = rs.getString("isfulltime");

                System.out.println("TeacherID: " + teacherid);
                System.out.println("FirstName: " + firstname);
                System.out.println("LastName: " + lastname);
                System.out.println("Gender: " + gender);
                System.out.println("DateOfBirth: " + dateofbirth);
                System.out.println("Email: " + email);
                System.out.println("PhoneNumber: " + phonenumber);
                System.out.println("Department: " + department);
                System.out.println("Salary: " + salary);
                System.out.println("HireDate: " + hiredate);
                System.out.println("IsFullTime: " + isfulltime);
            }
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        }
    }
}
