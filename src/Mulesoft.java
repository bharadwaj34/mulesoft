import java.sql.*;

	
public class Mulesoft {
	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:movie.db");
			 //String query = "CREATE TABLE movies(movie_name VARCHAR(20),actor VARCHAR(20)," + " actress VARCHAR(20), director VARCHAR(20), " + "Release_Year INT )";
			String q1 = "INSERT INTO movies values('jai bhim','jose','mani','shakar',2021)";
			 String q2 = "INSERT INTO movies values('soorarai','surya','aparana','paresh',2012)";
				String query = "SELECT * FROM movies";
				Statement st = con.createStatement();
				st.executeUpdate(q1);
				st.executeUpdate(q2);
				
				ResultSet rs = st.executeQuery(query);
				while (rs.next()) {
					System.out.println(rs.getString(1) + ":" + rs.getString(2) + ":" + rs.getString(3) + ":"
							+ rs.getString(4) + ":" + rs.getInt(5));
				}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}