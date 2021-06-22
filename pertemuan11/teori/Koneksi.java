public class Koneksi {
    static Connection con;
    
    public static Connection connection(){
        if(con==null){
            MysqlDataSource data=new MysqlDataSource();
            data.setDatabaseName("db_crud");
            data.setUser("root");
            data.setPassword("");
            try{
                con=data.getConnection();
            }catch(SQLException ex){
                System.out.println("tidak konek");
            }
        }
        return con;
        
    }
    
}