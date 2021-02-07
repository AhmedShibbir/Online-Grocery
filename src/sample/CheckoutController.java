package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class CheckoutController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private ListView<String> buyingTable;

    @FXML
    private Button ExitButton;


    @FXML
    private Label tokenLabel;
    @FXML
    private Button returnToShopButton;


    @FXML
    void exitButtonAction(ActionEvent event) {

       Stage stage = (Stage)ExitButton.getScene().getWindow();
       stage.close();

    }

    @FXML
    void returntoShopButtonAction(ActionEvent event) throws IOException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource("mainshoppingpage.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setUpTable(ObservableList<String> tabledata){

        buyingTable.setItems(tabledata);

    }

    public void setLabel(String label){

        tokenLabel.setText(label);
    }


}
