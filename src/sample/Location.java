package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javax.swing.*;
import java.io.IOException;

public class Location
{
    @FXML
    public AnchorPane Location_root;

    @FXML
    private JFXComboBox Current_location_combobox, Destination_combobox;

    @FXML
    protected JFXButton Done_button;

    @FXML private String empty=new String();

    //Location Initialize
    @FXML
    protected void initialize() throws IOException
    {
        Current_location_combobox.getItems().add("Manila");
        Current_location_combobox.getItems().add("Cebu");
        Current_location_combobox.getItems().add("Davao");
        Current_location_combobox.getItems().add("Leyte");
        Current_location_combobox.getItems().add("Palawan");
        Current_location_combobox.getItems().add("Ilocos");

        Destination_combobox.getItems().add("Manila");
        Destination_combobox.getItems().add("Cebu");
        Destination_combobox.getItems().add("Davao");
        Destination_combobox.getItems().add("Leyte");
        Destination_combobox.getItems().add("Palawan");
        Destination_combobox.getItems().add("Ilocos");


        Current_location_combobox.setValue(empty );
        Destination_combobox.setValue(empty);
    }

    @FXML
    public void set_location_Method() throws IOException
    {
        if(Current_location_combobox.getValue().equals(empty)&&Destination_combobox.getValue().equals(empty))
        {
            JPanel panel1 = new JPanel();
            JOptionPane.showMessageDialog(panel1, "Choose An Option", "Error", JOptionPane.ERROR_MESSAGE);
        }

        else if(Current_location_combobox.getValue().equals(empty))
        {
            JPanel panel1 = new JPanel();
            JOptionPane.showMessageDialog(panel1, "Choose Departure Location", "Error", JOptionPane.ERROR_MESSAGE);
        }

        else if(Destination_combobox.getValue().equals(empty))
        {
            JPanel panel1 = new JPanel();
            JOptionPane.showMessageDialog(panel1, "Choose your Destination", "Error", JOptionPane.ERROR_MESSAGE);
        }

       if (Current_location_combobox.getValue().equals("Manila") && Destination_combobox.getValue().equals("Manila"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

        else if (Current_location_combobox.getValue().equals("Manila") && Destination_combobox.getValue().equals("Cebu"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

       else if (Current_location_combobox.getValue().equals("Manila") && Destination_combobox.getValue().equals("Davao"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

       else if (Current_location_combobox.getValue().equals("Manila") && Destination_combobox.getValue().equals("Leyte"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

       else if (Current_location_combobox.getValue().equals("Manila") && Destination_combobox.getValue().equals("Palawan"))
       {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Manila") && Destination_combobox.getValue().equals("Ilocos"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

        else if (Current_location_combobox.getValue().equals("Cebu") && Destination_combobox.getValue().equals("Manila"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

        else if (Current_location_combobox.getValue().equals("Cebu") && Destination_combobox.getValue().equals("Cebu"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

        else if (Current_location_combobox.getValue().equals("Cebu") && Destination_combobox.getValue().equals("Davao"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

        else if (Current_location_combobox.getValue().equals("Cebu") && Destination_combobox.getValue().equals("Leyte"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

        else if (Current_location_combobox.getValue().equals("Cebu") && Destination_combobox.getValue().equals("Palawan"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

        else if (Current_location_combobox.getValue().equals("Cebu") && Destination_combobox.getValue().equals("Ilocos"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

        else if (Current_location_combobox.getValue().equals("Davao") && Destination_combobox.getValue().equals("Manila"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

        else if (Current_location_combobox.getValue().equals("Davao") && Destination_combobox.getValue().equals("Cebu"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

        else if (Current_location_combobox.getValue().equals("Davao") && Destination_combobox.getValue().equals("Davao"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

        else if (Current_location_combobox.getValue().equals("Davao") && Destination_combobox.getValue().equals("Leyte"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

        else if (Current_location_combobox.getValue().equals("Davao") && Destination_combobox.getValue().equals("Palawan"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

        else if (Current_location_combobox.getValue().equals("Davao") && Destination_combobox.getValue().equals("Ilocos"))
        {
            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

       else if (Current_location_combobox.getValue().equals("Leyte") && Destination_combobox.getValue().equals("Manila"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Leyte") && Destination_combobox.getValue().equals("Cebu"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Leyte") && Destination_combobox.getValue().equals("Davao"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Leyte") && Destination_combobox.getValue().equals("Leyte"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Leyte") && Destination_combobox.getValue().equals("Palawan"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Leyte") && Destination_combobox.getValue().equals("Ilocos"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Palawan") && Destination_combobox.getValue().equals("Manila"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Palawan") && Destination_combobox.getValue().equals("Cebu"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Palawan") && Destination_combobox.getValue().equals("Davao"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Palawan") && Destination_combobox.getValue().equals("Leyte"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Palawan") && Destination_combobox.getValue().equals("Palawan"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Palawan") && Destination_combobox.getValue().equals("Ilocos"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Ilocos") && Destination_combobox.getValue().equals("Manila"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Ilocos") && Destination_combobox.getValue().equals("Cebu"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Ilocos") && Destination_combobox.getValue().equals("Davao"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Ilocos") && Destination_combobox.getValue().equals("Leyte"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Ilocos") && Destination_combobox.getValue().equals("Palawan"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }

       else if (Current_location_combobox.getValue().equals("Ilocos") && Destination_combobox.getValue().equals("Ilocos"))
       {
           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
    }
}

