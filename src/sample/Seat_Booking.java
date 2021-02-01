package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class Seat_Booking
{
    public static Scene scene;
    @FXML private AnchorPane Seat_Booking_root;
    @FXML public int totalseats=0,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25,i26,i27,i28,i29,i30,i31,i32,i33,i34,i35,i36;
    @FXML public int i37,i38,i39,i40,i41,i42,i43,i44,i45,i46,i47,i48,i49,i50,i51,i52,i53,i54,i55,i56,i57,i58,i59,i60,i61,i62,i63,i64,i65,i66,i67,i68,i69,i70,i71,i72,i73;
    @FXML static public Button Choose_button;

    @FXML private void seat_choose_method() throws IOException
    {
        totalseats = 1000+i1+i2+i3+i4+i5+i6+i7+i8+i9+i10+i11+i12+i13+i14+i15+i16+i17+i18+i19+i20+i21+i22+i23+i24+i25+i26+i27+i28+i29+i30+i31+i32+i33+i34+i35+i36+i37+i38+i39+i40+i41+i42+i43+i44+i45+i46+i47+i48+i49+i50+i51+i52+i53+i54+i55+i56+i57+i58+i59+i60+i61+i62+i63+i64+i65+i66+i67+i68+i69+i70+i71+i72+i73;
        AnchorPane seat_ticket_root = FXMLLoader.load(getClass().getResource("../fxml/SeatTicketAmount.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/SeatTicketAmount.fxml"));
        Parent root = loader.load();
        SeatTicketAmount controller = loader.getController();
        controller.total.setText("P " + totalseats);
        Scene scene = new Scene(root, 600.0, 337.0);
        Stage stages = new Stage();
        stages.setScene(scene);
        stages.show();
        Seat_Booking_root.getChildren().setAll(seat_ticket_root);
        i1 = 0;
        i2 = 0;
        i3 = 0;
        i4 = 0;
        i5 = 0;
        i6 = 0;
        i7 = 0;
        i8 = 0;
        i9 = 0;
        i10 = 0;
        i11 = 0;
        i12 = 0;
        i13 = 0;
        i14 = 0;
        i15 = 0;
        i16 = 0;
        i17 = 0;
        i18 = 0;
        i19 = 0;
        i20 = 0;
        i21 = 0;
        i22 = 0;
        i23 = 0;
        i24 = 0;
        i25 = 0;
        i26 = 0;
        i27 = 0;
        i28 = 0;
        i29 = 0;
        i30 = 0;
        i31 = 0;
        i32 = 0;
        i33 = 0;
        i34 = 0;
        i35 = 0;
        i36 = 0;
        i37 = 0;
        i38 = 0;
        i39 = 0;
        i40 = 0;
        i41 = 0;
        i42 = 0;
        i43 = 0;
        i44 = 0;
        i45 = 0;
        i46 = 0;
        i47 = 0;
        i48 = 0;
        i49 = 0;
        i50 = 0;
        i51 = 0;
        i52 = 0;
        i53 = 0;
        i54 = 0;
        i55 = 0;
        i56 = 0;
        i57 = 0;
        i58 = 0;
        i59 = 0;
        i60 = 0;
        i61 = 0;
        i62 = 0;
        i63 = 0;
        i64 = 0;
        i65 = 0;
        i66 = 0;
        i67 = 0;
        i68 = 0;
        i69 = 0;
        i70 = 0;
        i71 = 0;
        i72 = 0;
        i73 = 0;
    }

    @FXML private void bx1() throws IOException{
        i1 = 700;
    }

    @FXML private void bx2() throws IOException{
        i2 = 700;

    }
    @FXML private void bx3() throws IOException{
        i3 = 700;

    }
    @FXML private void bx4() throws IOException{
        i4 = 700;

    }
    @FXML private void bx5() throws IOException{
        i5 = 700;

    }

    @FXML private void bx6() throws IOException{
        i6 = 700;

    }

    @FXML private void bx7() throws IOException{
       i7 = 700;

    }

    @FXML private void bx8() throws IOException{
        i8 = 700;

    }

    @FXML private void bx9() throws IOException{
        i9 = 700;

    }

    @FXML private void bx10() throws IOException{
        i10 = 700;

    }

    @FXML private void bx11() throws IOException{
        i11 = 700;

    }

    @FXML private void bx12() throws IOException{
        i12 = 700;

    }

    @FXML private void bx13() throws IOException{
        i13 = 700;

    }

    @FXML private void bx14() throws IOException{
        i14 = 700;

    }

    @FXML private void bx15() throws IOException{
        i15 = 700;

    }

    @FXML private void bx16() throws IOException{
        i16 = 700;

    }

    @FXML private void bx17() throws IOException{
        i17 = 700;

    }

    @FXML private void bx18() throws IOException{
        i18 = 700;

    }

    @FXML private void bx19() throws IOException{
        i19 = 700;

    }

    @FXML private void bx20() throws IOException{
        i20 = 700;

    }

    @FXML private void bx21() throws IOException{
        i21 = 700;

    }

    @FXML private void bx22() throws IOException{
        i22 = 700;

    }

    @FXML private void bx23() throws IOException{
        i23 = 700;

    }

    @FXML private void bx24() throws IOException{
        i24 = 700;

    }

    @FXML private void bx25() throws IOException{
        i25 = 700;

    }

    @FXML private void bx26() throws IOException{
        i26 = 700;

    }

    @FXML private void bx27() throws IOException{
        i27 = 700;

    }

    @FXML private void bx28() throws IOException{
        i28 = 700;

    }

    @FXML private void bx29() throws IOException{
        i29 = 700;

    }

    @FXML private void bx30() throws IOException{
        i30 = 700;

    }

    @FXML private void bx31() throws IOException{
        i31 = 700;

    }

    @FXML private void bx32() throws IOException{
        i32 = 700;

    }

    @FXML private void bx33() throws IOException{
        i33 = 200;

    }

    @FXML private void bx34() throws IOException{
        i34 = 200;

    }

    @FXML private void bx35() throws IOException{
        i35 = 200;

    }

    @FXML private void bx36() throws IOException{
        i36 = 200;

    }

    @FXML private void bx37() throws IOException{
        i37 = 200;

    }

    @FXML private void bx38() throws IOException{
        i38 = 200;

    }

    @FXML private void bx39() throws IOException{
        i39 = 200;
    }

    @FXML private void bx40() throws IOException{
        i40 = 200;

    }
    @FXML private void bx41() throws IOException{
        i41 = 200;

    }
    @FXML private void bx42() throws IOException{
        i42 = 200;

    }
    @FXML private void bx43() throws IOException{
        i43 = 200;

    }

    @FXML private void bx44() throws IOException{
        i44 = 200;

    }

    @FXML private void bx45() throws IOException{
        i45 = 200;

    }

    @FXML private void bx46() throws IOException{
        i46 = 200;

    }

    @FXML private void bx47() throws IOException{
        i47 = 200;

    }

    @FXML private void bx48() throws IOException{
        i48 = 200;

    }

    @FXML private void bx49() throws IOException{
        i49 = 200;

    }

    @FXML private void bx50() throws IOException{
        i50 = 200;

    }

    @FXML private void bx51() throws IOException{
        i51 = 200;

    }

    @FXML private void bx52() throws IOException{
        i52 = 200;

    }

    @FXML private void bx53() throws IOException{
        i53 = 200;

    }

    @FXML private void bx54() throws IOException{
        i54 = 200;

    }

    @FXML private void bx55() throws IOException{
        i55 = 200;

    }

    @FXML private void bx56() throws IOException{
        i56 = 200;

    }

    @FXML private void bx57() throws IOException{
        i57 = 200;

    }

    @FXML private void bx58() throws IOException{
        i58 = 200;

    }

    @FXML private void bx59() throws IOException{
        i59 = 200;

    }

    @FXML private void bx60() throws IOException{
        i60 = 200;

    }

    @FXML private void bx61() throws IOException{
        i61 = 200;

    }

    @FXML private void bx62() throws IOException{
        i62 = 200;

    }

    @FXML private void bx63() throws IOException{
        i63 = 200;

    }

    @FXML private void bx64() throws IOException{
        i64 = 200;

    }

    @FXML private void bx65() throws IOException{
        i65 = 200;

    }

    @FXML private void bx66() throws IOException{
        i66 = 200;

    }

    @FXML private void bx67() throws IOException{
        i67 = 200;

    }

    @FXML private void bx68() throws IOException{
        i68 = 200;

    }

    @FXML private void bx69() throws IOException{
        i69 = 200;

    }

    @FXML private void bx70() throws IOException{
        i70 = 200;

    }

    @FXML private void bx71() throws IOException{
        i71 = 200;

    }

    @FXML private void bx72() throws IOException{
        i72 = 200;

    }

    @FXML private void bx73() throws IOException{
        i73 = 200;

    }

    @FXML private void Choose_back_button() throws IOException
    {
        AnchorPane Flight_Schedle_root= FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
        Seat_Booking_root.getChildren().setAll(Flight_Schedle_root);
    }
}


