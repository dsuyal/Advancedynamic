package in.co.rays.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJdbc {
	
			public static void main(String[] args) throws Exception {
			
			for (int i = 1; i <=5; i++) {
				
				System.out.println("Connection" + i);
				testGet();
				
			}
			
		}

		private static void testGet() throws Exception {
			Connection conn = JdbcDataSource.getConnection();
			
			PreparedStatement ps = conn.prepareStatement("select * from marksheet where id = 1");
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t" + rs.getInt(3));
				System.out.print("\t" + rs.getInt(4));
				System.out.print("\t" + rs.getInt(5));
				System.out.println("\t" + rs.getInt(6));
			
			
		}
		}

	}



