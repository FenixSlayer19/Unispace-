
package conexión;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexión {

    private static final String BASE_PATH = System.getProperty("user.dir");
    private static final String URL = "jdbc:sqlite:" + BASE_PATH + "/database/BaseDatosProyecto.db";

    private static Connection conexion = null;

    // Obtener una sola conexión (Singleton)
    public static synchronized Connection getConexion() throws SQLException {
        if (conexion == null || conexion.isClosed()) {
            conexion = DriverManager.getConnection(URL);
            System.out.println("Conexión creada.");
        }
        return conexion;
    }

    // Cerrar conexión correctamente
    public static synchronized void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}

