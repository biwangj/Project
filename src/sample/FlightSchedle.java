package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class FlightSchedle
{
    @FXML private AnchorPane Flight_Schedle_root;

    @FXML public  void seat_select() throws IOException
    {
        AnchorPane Seat_Booking_root= FXMLLoader.load(getClass().getResource("../fxml/Seat_Booking.fxml"));
        Flight_Schedle_root.getChildren().setAll(Seat_Booking_root);
    }
}
