import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = "delete from northwind.strings where string_id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4);
            int result = statement.executeUpdate();
            System.out.println("Kayıt Silindi...");

        }
        catch (SQLException exception){

            helper.showErrorMessage(exception);

        }
        finally {
            statement.close();
            connection.close();
        }

    }

    public static void selectDemo() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select employee_id,ship_name from northwind.orders");
            ArrayList<Orders> orders = new ArrayList<Orders>();
            while (resultSet.next()){
                orders.add(new Orders(resultSet.getString("employee_id"),resultSet.getString("ship_name")));

            }

            System.out.println(orders.size());

        }
        catch (SQLException exception){

            helper.showErrorMessage(exception);

        }
        finally {
            connection.close();
        }
    }

    public static void insertData() throws SQLException{

        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = "insert into northwind.strings (string_data) values (?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"defsf");
            int result = statement.executeUpdate();
            System.out.println("Kayıt Eklendi...");

        }
        catch (SQLException exception){

            helper.showErrorMessage(exception);

        }
        finally {
            statement.close();
            connection.close();
        }

    }

    public void updateData() throws SQLException{

        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = "update northwind.strings set string_data = ? where string_id=2";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Yusuf");
            int result = statement.executeUpdate();
            System.out.println("Kayıt Güncellendi...");

        }
        catch (SQLException exception){

            helper.showErrorMessage(exception);

        }
        finally {
            statement.close();
            connection.close();
        }


    }
}
