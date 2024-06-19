import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtContraseña;

    @FXML
    private TextField txtUsuario;
    
    Modelo ob1 = new Modelo();
    
    @FXML
    void initialize() {
        assert btnLogin != null : "fx:id=\"btnLogin\" was not injected: check your FXML file 'InicioSesionNasa.fxml'.";
        assert txtContraseña != null : "fx:id=\"txtContraseña\" was not injected: check your FXML file 'InicioSesionNasa.fxml'.";
        assert txtUsuario != null : "fx:id=\"txtUsuario\" was not injected: check your FXML file 'InicioSesionNasa.fxml'.";

    }

}
