import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStmt {
  public static void main(String[] args){
    String userid = UserStudent.userid;
    String password = UserStudent.password;
    String url = "jdbc:mysql://localhost:3306/books?autoReconnect=true&useSSL=false";
    String query = "insert into JavaCourse(Roll,Name,Marks,Grade) values (?,?,?,?)";
    try(Connection conn = DriverManager.getConnection(url,userid,password);
      Statement stmt = conn.createStatement();
      PreparedStatement pstmt = conn.prepareStatement(query);){
      stmt.executeUpdate("drop table if exists JavaCourse");
      stmt.executeUpdate("create table JavaCourse(Roll integer primary key," +
	  "Name varchar(30) not null, Marks integer not null, Grade char(2))");
      ResultSet rs = stmt.executeQuery("show tables");
      System.out.println("Tables in the books database");
      String tableName;
      while(rs.next()){
	tableName = rs.getString("Tables_in_books");
	System.out.println("Table Name: " + tableName);
      }
      System.out.println();
      //inserting records using prepared statement
      Scanner sc = new Scanner(System.in);
      String name, grade;
      int roll, marks, answer;
      do {
	System.out.print("Enter Roll number: ");
	roll = sc.nextInt();
	sc.nextLine(); //flush
	System.out.print("Enter Name: ");
	name = sc.nextLine();
	System.out.print("Enter Marks: ");
	marks = sc.nextInt();
	grade = (marks >= 90) ? "EX" : ((marks >= 75) ? "A+" : ((marks >= 60) ? "A" : ((marks >= 50) ? "B" : "C")));

	pstmt.setInt(1,roll);
	pstmt.setString(2,name);
	pstmt.setInt(3,marks);
	pstmt.setString(4,grade);
	pstmt.executeUpdate();
	
	System.out.println("More Records: (1. Yes, 2. No): ");
	answer = sc.nextInt() ;
	sc.nextLine(); // flush
      } while (answer == 1);
      rs = stmt.executeQuery("select * from JavaCourse");
      System.out.println("Records in the JavaCourse Table");
      String strRoll, strName, strMarks, strGrade;
      while (rs.next()){
	strName = rs.getString("Name");
	strRoll = rs.getString("Roll");
	strMarks = rs.getString("Marks");
	strGrade = rs.getString("Grade");
	System.out.println("Roll: " + strRoll + 
	  "\t Name: " + strName + 
	  "\t Marks: " + strMarks + 
	  "\t Grade: " + strGrade);
      }
    } catch (SQLException sqle){
      System.out.println("SQLException: " + sqle.getMessage());
    }
  }
}
