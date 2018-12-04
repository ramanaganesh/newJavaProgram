import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MainRunner 
{
	
	static Connection con;
	static String check=null;
	static ResultSet resultSet;
	static PreparedStatement statement;
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/users","root","root");
			if(con!=null)
			{
				statement=con.prepareStatement("insert into details(name,age) values(?,?)");
				do
				{
					System.out.println("enter the name");
					String name=scanner.next();
					System.out.println("enter the age");
					int age=scanner.nextInt();
					statement.setString(1, name);
					statement.setInt(2,age);
					System.out.println("u want to add more details");
					check=scanner.next();
					statement.addBatch();
				}while(check.equals("yes"));
				statement.executeBatch();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		scanner.close();
	}
}
