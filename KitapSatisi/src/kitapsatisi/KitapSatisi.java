
package kitapsatisi;

import java.sql.*;


public class KitapSatisi {

    
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE kitaplar(adi TEXT, sayfa INTEGER, yazar TEXT, yayinEvi TEXT)");
            
            statement.close();
            conn.close();
                    
            
        }catch(SQLException e){
            System.out.println("HATA !!!" + e);
        }

        
    }
    
}
