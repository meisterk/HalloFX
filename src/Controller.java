
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.*;
import javafx.scene.control.*;

class Controller implements Initializable {

    //---------------------------------------------
    // Membervariablen für Steuerelemente
    //---------------------------------------------        
    @FXML
    TextField textFieldEingabe;

    @FXML
    Button buttonDruecken;

    @FXML
    Label labelAusgabe;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //---------------------------------------------
        // Eventhandler
        //---------------------------------------------    
        buttonDruecken.setOnAction(event -> {
            String eingabe = textFieldEingabe.getText();
            labelAusgabe.setText(eingabe);
        });

        //---------------------------------------------
        // Start
        //---------------------------------------------
        // Code wird ausgeführt,
        // wenn Fenster und Steuerelemente bereit sind
    }
}
