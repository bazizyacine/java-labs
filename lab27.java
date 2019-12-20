import java.sql.*;

public class lab27 {
	public static void main(String[] args) {
		new Connect();	
	}
}

class Connect {
	public Connect() {
		Connection conn = null;
		Statement state = null;
		ResultSet result = null;
		ResultSetMetaData resultMeta = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/m2i_python_db?useSSL=false";
			String user = "root";
			String passwd = "";

			conn = DriverManager.getConnection(url, user, passwd);

			// Création d'un objet Statement
			state = conn.createStatement();
			
			// L'objet ResultSet contient le résultat de la requête SQL
			result = state.executeQuery("SELECT * FROM animal");
			
			// On récupère les MetaData
			resultMeta = result.getMetaData();

			System.out.println("\n**********************************");
			
			// On affiche le nom des colonnes
			for(int i = 1; i <= resultMeta.getColumnCount(); i++)
				System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");

			System.out.println("\n**********************************");

			while (result.next()) {         
				for(int i = 1; i <= resultMeta.getColumnCount(); i++)
					System.out.print("\t" + result.getString(i) + "\t |");

				System.out.println("\n---------------------------------");
			}
			
			if (result != null) {
				try { 
					result.close();
				} 
				catch (SQLException e) {
				/* Traiter les erreurs éventuelles ici. */
				}
			}
			
			if (state != null) {
				try { 
					state.close();
				} 
				catch (SQLException e) {
				/* Traiter les erreurs éventuelles ici. */
				}
			}
			
			if (conn != null) {
				try { 
					conn.close();
				} 
				catch (SQLException e) {
				/* Traiter les erreurs éventuelles ici. */
				}
			}
		}
		catch (ClassNotFoundException e) {
				System.err.println("Echec du chargement du driver");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}