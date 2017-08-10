import java.sql.*;

class DBConnect {
    private userName;
    private pass;
    private hostName;

    private static ResultSet ExecuteQuery(String query) throws ClassNotFoundException, SQLException {
            Class driver = Class.forName("com.mysql.jdbc.Driver");
        Connection c = null;
            c = DriverManager.getConnection("jdbc:mysql://localhost/world",
                            userName, pass);

        Statement st = null;
            st = c.createStatement();

        ResultSet rs = null;

            rs = st.executeQuery(
                    query);

        return rs;
    }
}
