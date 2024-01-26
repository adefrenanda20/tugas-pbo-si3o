/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author User
 */
public class koneksi {
    public static Connection koneksiDb()
    {
        try{
            Class.forName("com.mysql.jdbo.driver");
            Connection koneksi = DriverManager.getConnection("jdbmysqli//localhost/db_library","root");
            return koneksi;
        }
        catch (Expotion e)
        {
            JOptionfame.abovfamemanagedialog(null, e);
           return null; 
      }
    }
}