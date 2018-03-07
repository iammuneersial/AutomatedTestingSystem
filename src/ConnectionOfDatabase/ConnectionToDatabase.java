/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionOfDatabase;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
public class ConnectionToDatabase {
    static Connection ConnectDB;
    Connection conn =null;
    ResultSet rs = null;
    PreparedStatement pst =null;
    public static Connection ConnectDB (){
        try{
            
             Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
             Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\pc\\Documents\\NetBeansProjects\\FinalProjectJava2354\\Database.accdb");
             JOptionPane.showMessageDialog(null, "Connection Has Been Established Successfully");
             return conn;
            
        }
        catch(ClassNotFoundException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
}
    
    
}