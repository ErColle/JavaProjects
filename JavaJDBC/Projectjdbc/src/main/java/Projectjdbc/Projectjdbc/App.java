package Projectjdbc.Projectjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App 
{
    
    static public void insertLibro (Connection conn, String titolo, String autore, Double prezzo)  throws SQLException{
        
        String insertSql="Insert into libro (titolo, autore, prezzo) values(?, ?, ?)";
        
        try(PreparedStatement insertPostgres = conn.prepareStatement(insertSql)){
            
            insertPostgres.setString(1, titolo );
            insertPostgres.setString(2, autore );
            insertPostgres.setDouble(3, prezzo );
            
            // ritorna il numero di righe modificate (executeUpdate)
            int righe = insertPostgres.executeUpdate();
            System.out.println("Ho inserito " +righe+ " righe");
            
        }
    }   
    
    static public void getLibro(Connection conn ) throws SQLException {
    	
        String selectSql="Select id, titolo, autore, prezzo from libro";
        
        try(PreparedStatement selectPostgres = conn.prepareStatement(selectSql)){
        	
        	ResultSet rs = selectPostgres.executeQuery();
        	
        	while(rs.next()) {
        		int id = rs.getInt("id");
            	String titolo = rs.getString("titolo");
            	String autore = rs.getString("autore");
            	Double prezzo = rs.getDouble("prezzo");
            	
            	System.out.println( id + " - " + titolo + " - " + autore + " - " + titolo);
            	
        	}
        } 
    }
    
    public static void main( String[] args ) 
    {
        // variabili con url user e psw del db 
        final String URL="jdbc:postgresql://localhost:5432/biblioteca";
        final String USER="postgres";
        final String PSW="postgres";
        
        try {
            Connection conn1 = DriverManager.getConnection(URL, USER, PSW);
            
            insertLibro(conn1, "La bibbia2", "CULO", 400000.0);
            getLibro(conn1);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
//      try {
//          // creo l'ogg che si connette al db 
//          Connection conn = DriverManager.getConnection(URL, USER, PSW);
//          // creo la variabile insert
//          String insertSql="Insert into libro (titolo, autore, prezzo) values(?, ?, ?)";
//          
//          try(PreparedStatement psInsert=conn.prepareStatement(insertSql)){
//              
//              //richiamo la variabile insert
//              psInsert.setString(1, "La bibbia");
//              psInsert.setString(2, "Sconosciuto");
//              psInsert.setDouble(3, 40.000);
//              
//              //esegue insert preparate nel preparateStatement
//              int righe = psInsert.executeUpdate();
//              System.out.println("Ho inserito " +righe+ " righe");
//          }
//          
//          // variabile con SELECT
//          String selectSql="Select id, titolo, autore, prezzo from libro";
//          
//          try(PreparedStatement psSelect = conn.prepareStatement(selectSql)){
//              // salva il risultato della query nelloggetto ResultSet: res
//              ResultSet rs = psSelect.executeQuery();
//              
//              System.out.println("-----LISTA LIBRI -----");
//              
//              //iteriamo per rs e salviamo le value delle chiavi 
//              while(rs.next()) { // finche ce un prossimo elemento nella lista
//                  int id = rs.getInt("id");
//                  String titolo = rs.getString("titolo");
//                  String autore = rs.getString("autore");
//                  Double prezzo = rs.getDouble("prezzo");
//                  
//                  //stampo 
//                  System.out.println(id+" - " + titolo + " - " + autore + " - " + prezzo );
//              }
//          }
//          
//          
//      }catch(SQLException e) {
//          //System.out.println("Errore JDBC");
//          e.printStackTrace();
        
    }
}