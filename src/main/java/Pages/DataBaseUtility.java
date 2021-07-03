package Pages;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.client.*;
import org.bson.Document;
import org.postgresql.util.PSQLException;

import java.lang.annotation.Documented;
import java.sql.*;
import java.util.Iterator;

public class DataBaseUtility {


    public String readData(String Query) {

        Connection c = null;
        Statement stmt = null;
        String data = null;
        try{
            Class.forName("org.postgresql.Driver");
            c= DriverManager.getConnection("jdbc:postgresql://localhost:5432/kuchtoh","postgres","12345");
            stmt = c.createStatement();
            if (Query.toLowerCase().startsWith("delete")){
                try{
                    c.setAutoCommit(true);
                    stmt.executeQuery(Query);
                    BasePage.deadWait(2000);
                }catch  (PSQLException e) {
                    // Do nothing as query return no value for DML operation
                }

            }else {
                c.setAutoCommit(false);
                ResultSet rs = stmt.executeQuery(Query);
//            ResultSet rs = stmt.executeQuery("Select otp from otps where phone = '9689201869'");
                while (rs.next()) {
                    System.out.println(rs.getString("otp"));
                    data = (rs.getString("otp"));
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

        }
    return data;
    }


}
