
package sac.serplastin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class Conexion {

  // Propiedades
  private static Connection conn = null;
  private String driver;
  private String url;
  private String usuario;
  private String password;

  // Constructor
  private Conexion() {

    String url = "jdbc:mysql://localhost:3306/bd_serplastin";
    String driver = "com.mysql.cj.jdbc.Driver";
    String usuario = "root";
    String password = "";

    try {
      Class.forName(driver);
      conn = DriverManager.getConnection(url, usuario, password);
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  } // Fin constructor

  // Métodos
  public static Connection getConnection() throws SQLException {

    if (conn == null || conn.isClosed()) {
      
      new Conexion();
    }

    return conn;
  } // Fin getConnection
}