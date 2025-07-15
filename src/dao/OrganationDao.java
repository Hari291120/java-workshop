import java.sql.SQLException;

public class OrganationDao {
    public void createTable() 
   
   public void createTable(Connection dbConnection) {
       try(Statement statement= dbConnection.createStatement()){

         statement.execute("""
                     create table organation(
                       NAME VARCHAR(100),
                       WEBSITE VARCHAR(100),
                       EMAIL VARCHAR(100),
                       CONTACT_NUMBER VARCHAR(100),
                       REGISTRATION_NO INT)
                          """);
     }catch(SQLException sqlException){
          
            System.out.println("error creating table:"+  sqlException);
     }

}
public int save (Connection dbConnection,Organation vet){

    try(PreparedStatement preparedStatement = dbConnection.prepareStatement("""
            insert into organation, website, email, contact_number,
            registration_no, description) values(?,?,?,?,?,?)
            """)) {
                preparedStatement.setString(1, vet.name());
                preparedStatement.setString(2, vet.website());
                preparedStatement.setString(3, vet.email());
                preparedStatement.setString(4, vet.contactNumber());
                preparedStatement.setLong(5,   vet.registrationNumber());
                preparedStatement.setString(6, vet.description());
                preparedStatement.executeUpdate();
            }catch(SQLException sqlException){
                System.out.println("Error inserting into table :"+ sqlException);
            }
            return 0;
}
}

