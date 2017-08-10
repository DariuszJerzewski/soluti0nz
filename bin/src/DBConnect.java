import java.sql.*;

class DBConnect {


    private static ResultSet ExecuteQuery(String query) throws ClassNotFoundException, SQLException {
            Class driver = Class.forName("com.mysql.jdbc.Driver");
        Connection c = null;
            c = DriverManager.getConnection("jdbc:mysql://192.168.1.104/employees",
                            "root", "password");

        Statement st = null;
            st = c.createStatement();

        ResultSet rs = null;

            rs = st.executeQuery(
                    query);

            c.close();

        return rs;
    }
}
