package proyectof;

import Conexion.CreateConnection;
import java.sql.SQLException;

public class ProyectoF {

    public static void main(String[] args)  throws SQLException{
    CreateConnection conexionPostgres = new CreateConnection();
    conexionPostgres.getConection();
 }
}    
