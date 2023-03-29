import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {

	public static void main(String[] args) {
		
		try {
			
			Connection miConexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Vanilla Sweet","postgres","Lia1607");			
			Statement miStatement = miConexion.createStatement();
//--------------------------------------------------------------------------------------------------------------------------------------------			
			//Insertar Datos
			//String InsertSQL = "insert into ingredientes(id_ingrediente,precio_ingrediente, nom_ingrediente) values ('3','0,25','Obleas')";
			//miStatement.executeUpdate(InsertSQL);
			
			System.out.println("Insercion Completa");
//--------------------------------------------------------------------------------------------------------------------------------------------			
			//Eliminar Datos
			//String EliminarSQL = "Delete from ingredientes where \"id_ingrediente\"=''";
			//miStatement.executeLargeUpdate(EliminarSQL);
			System.out.println("\nDatos Eliminados Correctamente");
			
//--------------------------------------------------------------------------------------------------------------------------------------------			
			//Actualizar Datos
			//String UpdateSQL = "update ingredientes set precio_ingrediente=? where id_ingrediente=?";
			//miStatement.executeLargeUpdate(UpdateSQL);
			System.out.println("\nDatos Actualizados Correctamente");
			
//--------------------------------------------------------------------------------------------------------------------------------------------			
			
			//Mostrar un Dato
			String MostrarDatoSQL = "Select * from ingredientes where id_ingrediente=1";
			ResultSet miResultSet = miStatement.executeQuery(MostrarDatoSQL);

			
//--------------------------------------------------------------------------------------------------------------------------------------------			
			//Mostrar Datos
			//String MostrarQSL = "Select * from ingredientes order by id_ingrediente asc";
			//ResultSet miResultSet1 = miStatement.executeQuery(MostrarQSL);
//--------------------------------------------------------------------------------------------------------------------------------------------
			
			
			while(miResultSet.next()) {
				
				System.out.println("\nID: "+miResultSet.getInt("id_ingrediente")+
						"\nPrecio: "+miResultSet.getString("precio_ingrediente")+
						"\nNombre: "+miResultSet.getString("nom_ingrediente"));
				
			}			
		}catch(Exception e) {
			
			System.out.println("Ocurrio un Error"+ e);
			
		}
		
		
	}

}
