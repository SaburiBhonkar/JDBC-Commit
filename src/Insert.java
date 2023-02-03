import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";
		Connection connection = null;
		String sql = " INTO student VALUES(3,'bc','bc@mail.com')";
		try {
			// load register the driver m]
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish the connection

			connection = DriverManager.getConnection(url, username, password);
			// Create statement

			Statement statement = connection.createStatement();

			// Execute the statemnt

			statement.execute(sql);
			// close the connection
			connection.close();
			System.out.println("All good");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
				System.out.println("close");
			}
		}

	}

}
