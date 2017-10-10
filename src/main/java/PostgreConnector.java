/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author arkane
 */
public class PostgreConnector {
    
    private void CheckClass(){
        System.out.println("------------------PostgreSQL " +
                "JDBC Connection Testing ------------");
        try{
            Class.forName("org.postgresql.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
            e.printStackTrace();
        }
    }
    //This is a filler code. DOES NOT WORK YET!!!!!
    public void ConnectDC(){
        CheckClass();
        Connection connect = null;
        try{
            connect = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:0000/testdb",
                    "arkane","password");
        }
        catch (SQLException e){

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        if (connect != null) {
            System.out.println("Connection to Database established");
        } 
        else {
            System.out.println("Failed to make connection!");
        }
    }
}
