import java.sql.*;
public class TransactionHandling{
    public static void transfer(Connection con,int from,int to,double amount)throws SQLException{
        try{
            con.setAutoCommit(false);
            PreparedStatement d=con.prepareStatement("UPDATE accounts SET balance=balance-? WHERE id=?");
            PreparedStatement c=con.prepareStatement("UPDATE accounts SET balance=balance+? WHERE id=?");
            d.setDouble(1,amount); d.setInt(2,from); d.executeUpdate();
            c.setDouble(1,amount); c.setInt(2,to); c.executeUpdate();
            con.commit();
            System.out.println("Transfer successful");
        }catch(Exception e){
            con.rollback();
            System.out.println("Transaction rolled back");
        }
    }
}