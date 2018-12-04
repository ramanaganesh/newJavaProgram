import java.sql.Connection;
import java.util.Scanner;
import java.sql.*;  
 

public class MainRunner 
{
	
		
		public static void main(String args[]){  
		try{  
		  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","root");  
		con.setAutoCommit(false);  
		  
		PreparedStatement preparedStatement=con.prepareStatement("insert into details(name,age) values(?,?)");  
		  Scanner br=new Scanner(System.in);
	//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		while(true){  
		  
		
		System.out.println("enter name");  
		String name=br.next(); 
		  
		System.out.println("enter age");  
		int  age=br.nextInt();  
		  
		  
		  
		preparedStatement.setString(1,name);  
		preparedStatement.setInt(2,age);  
		preparedStatement.executeUpdate();  
		  
		System.out.println("commit/rollback");  
		String answer=br.next();  
		if(answer.equals("commit")){  
		con.commit();  
		}  
		if(answer.equals("rollback")){  
		con.rollback();  
		}  
		  
		  
		System.out.println("Want to add more records y/n");  
		String ans=br.next();  
		if(ans.equals("n")){  
		break;  
		}  
		  
		}  
		con.commit();  
		System.out.println("record successfully saved");  
		  
		con.close();
		br.close();//before closing connection commit() is called  
		}catch(Exception e){System.out.println(e);
	}  
		  
	
	}
}
