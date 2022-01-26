//Displaying the contents of the authors table
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DisplayAuthors {
  public static void main(String args[]){
    final String url = "jdbc:mysql://localhost:3306/books?autoReconnect=true&useSSL=false";
    String userid = UserStudent.userid;
    String password = UserStudent.password;
    final String select_query = "select AuthorID, FirstName, LastName from Authors";
    //use try-with-resources to connect and query the database
    try (Connection conn = DriverManager.getConnection(url, userid, password);
      Statement st = conn.createStatement();) {
      ResultSet resultSet = st.executeQuery(select_query);
      // get ResultSet's meta data
      ResultSetMetaData metaData = resultSet.getMetaData();
      int numberOfColumns = metaData.getColumnCount();
      System.out.printf("Author Table of Books Database:\n\n");
      //display the names of columns in the ResultSet
      for (int i=1; i<=numberOfColumns; i++){
	System.out.printf("%-8s\t", metaData.getColumnName(i));
      }
      System.out.println();
      //display query results
      while (resultSet.next()){
	for (int i=1; i<=numberOfColumns; i++){
	  System.out.printf("%-8s\t", resultSet.getObject(i));
	}
	System.out.println();
      }
    }
    catch (SQLException sqle){
      System.out.println("SQLException: " + sqle.getMessage());
    }
  }
}
