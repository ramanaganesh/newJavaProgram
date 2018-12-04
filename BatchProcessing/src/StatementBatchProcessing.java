import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class StatementBatchProcessing 
{
	static Statement stmt;
	static String sql,check=null;
	
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/users","root","root");  
			stmt=con.createStatement();
			do
			{
			System.out.println("enter the name");
			String name=scanner.next();
			System.out.println("enter the age");
			int age=scanner.nextInt();
			sql="insert into details(name,age) values('"+name+"',"+age+")";
			System.out.println("the query is:");
			System.out.println(sql);
			stmt.addBatch(sql);
			System.out.println("u want to add more details yes/no");
			check=scanner.next();
			}while(check.equals("yes"));
			stmt.executeBatch();
		}
		 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
	}
}
