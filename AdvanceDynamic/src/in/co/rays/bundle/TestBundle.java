package in.co.rays.bundle;


import java.util.ResourceBundle;

public class TestBundle {

	public static void main(String[] args) {
			
			ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundle.system");
			String driver = rs.getString("greeting");
			
			System.out.println(driver);
		}

	}


