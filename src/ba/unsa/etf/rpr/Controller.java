package ba.unsa.etf.rpr.tut7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;



public class Controller {
    @FXML
    public void initialize() {

    }

    public void clickDodaj(ActionEvent actionEvent) {
    }

    public void clickKraj(ActionEvent actionEvent) {
        Node n = (Node) actionEvent.getSource();
        Stage stage =(Stage) n.getScene().getWindow();
        stage.close();
    }
}
