package hospital.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {

    Connection connection;
    Statement statement;


    public connection(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management_system","root","12345678");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
