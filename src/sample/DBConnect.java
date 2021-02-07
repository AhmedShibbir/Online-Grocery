package sample;

import java.sql.*;

public class DBConnect {

    private String url = "jdbc:mysql://localhost/grocery";
    private String user = "root";
    private String pass = "";

    private Connection con ;
    private Statement st ;
    private ResultSet rs;


    public DBConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            st = con.createStatement();
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("Error: "+e);
        }
    }

    public ResultSet getResultset(String query) throws SQLException {

        rs = st.executeQuery(query);

        return rs;
    }

    public void insertData(String query) throws SQLException {

        st.execute(query);

    }


}
