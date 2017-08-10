import java.sql.*;

class DBConnect {


    private static ResultSet ExecuteQuery(String query) throws ClassNotFoundException, SQLException {
            Class driver = Class.forName("com.mysql.jdbc.Driver");
        Connection c = null;
            c = DriverManager.getConnection("jdbc:mysql://localhost/world",
                            "root", "password");

        Statement st = null;
            st = c.createStatement();

        ResultSet rs = null;

            rs = st.executeQuery(
                    query);

        return rs;
    }
}
