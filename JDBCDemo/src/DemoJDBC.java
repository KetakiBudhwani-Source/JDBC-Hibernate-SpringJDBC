import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        import package
        load and register
        create connection
        create statement
        execute statement
        process results
        close
         */
        String url="jdbc:postgresql://localhost:5432/ketakidb";
        String username="postgres";
        String password="Test@123";
        //String sql ="select * from student";
        //String sql="insert into student values (5,'John',48)";
        //String sql="update student set sname='Max' where sid=5";
        //String sql="delete from student where sid=5";

        //sql statement using user variables;
        int sid = 101;
        String sname ="Jasmine";
        int marks=77;
        //String sql = "insert into student values ("+sid+",'"+sname+"',"+marks+")";
        //using sql for preparedStatement
        String sql="insert into student values (?,?,?)";

       //Class.forName("org.postgresql.Driver");
       Connection conn = DriverManager.getConnection(url,username,password);
       System.out.println("Connection Established");
       //Statement st = conn.createStatement();

       //****************************Read
       //executeQuery method is used to get back result set after execution
     /* ResultSet rs= st.executeQuery(sql);
       while(rs.next()){
           System.out.print(rs.getInt(1)+"-");
           System.out.print(rs.getString(2)+"-");
           System.out.println(rs.getInt(3));
       }*/

        //***************************Insert,update,delete
        //st.execute(sql); // execute returns a boolean value , if it returns resultSet object the true

        //Using a prepared statement

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,sid);
        ps.setString(2,sname);
        ps.setInt(3,marks);

        ps.execute();
       /*rs.next();
       String name =rs.getString("sname");
       System.out.println("Name of Student is : "+name);*/
       conn.close();
       System.out.println("Connection Closed");

    }
}
