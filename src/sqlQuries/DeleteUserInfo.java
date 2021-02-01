package sqlQuries;

import com.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DeleteUserInfo 
{
    String SQLDeleteQuery = "DELETE FROM tbl_user WHERE uid = ?";
    public DeleteUserInfo()
    {

    }

    //Delete Row
    public void deleteRow(int id)
    {

        try(
                Connection connection = DatabaseConnection.getConnection();
            
                PreparedStatement statement = connection.prepareStatement(this.SQLDeleteQuery);
           )
        {
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Success Deleting");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
