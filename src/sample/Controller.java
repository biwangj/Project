package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class Controller
{
    @FXML
    private AnchorPane rootWindow;

    @FXML
    public void signUp() throws IOException
    {
        AnchorPane choiceWindow = FXMLLoader.load(getClass().getResource("../fxml/UserLoginSinup.fxml"));
        rootWindow.getChildren().setAll(choiceWindow);
    }
}
