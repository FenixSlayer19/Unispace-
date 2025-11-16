package conexión;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexión {

    // Obtiene la ruta del proyecto automáticamente
    private static final String BASE_PATH = System.getProperty("user.dir");

    // Ruta interna del proyecto → carpeta "database"
    private static final String URL = "jdbc:sqlite:" + BASE_PATH + "/database/BaseDatosProyecto.db";

    public static Connection getConexion() {
        Connection conexión = null;

        try {
            conexión = DriverManager.getConnection(URL);
            System.out.println("Conexión exitosa con SQLite");
        } catch (SQLException e) {
            System.out.println("Error al conectar con SQLite: " + e.getMessage());
            System.out.println("Ruta utilizada: " + URL);
        }

        return conexión;
    }
}
