import java.sql.*;

public class main {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/my_schema";
        String username = "root";
        String pass= "password";
        String query = "SELECT * FROM my_schema.comercios";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(URL, username, pass);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            System.out.println(resultSet);

            while (resultSet.next()){
                String comercioData = "";
                for (int i = 1; i <= 3; i++){
                    comercioData+=resultSet.getString(i) + ";";
                }
                System.out.println(comercioData);
            }


        } catch (SQLDataException e){
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
