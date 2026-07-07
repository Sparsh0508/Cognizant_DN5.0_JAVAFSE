import java.sql.*;
public class StudentDAO{
    Connection con;
    public StudentDAO(Connection con){this.con=con;}
    public void insertStudent(int id,String name)throws SQLException{
        PreparedStatement ps=con.prepareStatement("INSERT INTO students VALUES(?,?)");
        ps.setInt(1,id); ps.setString(2,name); ps.executeUpdate();
    }
    public void updateStudent(int id,String name)throws SQLException{
        PreparedStatement ps=con.prepareStatement("UPDATE students SET name=? WHERE id=?");
        ps.setString(1,name); ps.setInt(2,id); ps.executeUpdate();
    }
}