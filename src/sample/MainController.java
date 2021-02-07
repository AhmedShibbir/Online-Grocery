package sample;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sample.DBConnect;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class MainController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField SignInemailField;
    @FXML
    private Button signInButton;
    @FXML
    private PasswordField SignInPassField;
    @FXML
    private TextField SignUpNameField;
    @FXML
    private TextField SignUpEmailField;
    @FXML
    private TextField SignUpMobileField;
    @FXML
    private Button signUpButton;
    @FXML
    private PasswordField SignUpPassField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO


    }

    @FXML
    private void signInButtonAction(ActionEvent event) throws SQLException, IOException {

            String warning = "field left empty!!";

            if(SignInemailField.getText().trim().isEmpty()){

                SignInemailField.setPromptText(warning);

            }

            if(SignInPassField.getText().trim().isEmpty()){

                SignInPassField.setPromptText(warning);
            }

            boolean isfilled = !SignInemailField.getText().trim().isEmpty() ||
                                !SignInPassField.getText().trim().isEmpty();

            if(isfilled){

                String email = SignInemailField.getText().trim();
                String  pass = SignInPassField.getText().trim();

                DBConnect db = new DBConnect();

                ResultSet rs = db.getResultset("SELECT * FROM user_list;");

                boolean login = false;

                while(rs.next()){

                    if(email.equals(rs.getString("email")) && pass.equals(rs.getString("password"))){
                        login = true;
                    }
                }

                if(login ==true){
                    AnchorPane pane = FXMLLoader.load(getClass().getResource("mainshoppingpage.fxml"));
                    rootPane.getChildren().setAll(pane);
                }



            }



    }

    @FXML
    private void signnUpButtonAction(ActionEvent event) throws SQLException {

        String warning = "can't leave empty!";

        if(SignUpPassField.getText().trim().isEmpty()){

            SignUpPassField.setPromptText(warning);
        }

        if(SignUpEmailField.getText().isEmpty()){

            SignUpEmailField.setPromptText(warning);
        }

        if(SignUpNameField.getText().trim().isEmpty()){

            SignUpNameField.setPromptText(warning);
        }

        if(SignUpMobileField.getText().trim().isEmpty()){

            SignUpMobileField.setPromptText(warning);
        }


        boolean isfilled = !SignUpPassField.getText().trim().isEmpty() ||
                !SignUpEmailField.getText().isEmpty() ||
                !SignUpNameField.getText().trim().isEmpty()
                ||!SignUpMobileField.getText().trim().isEmpty();




        if(isfilled){

            DBConnect db = new DBConnect();
            String query = "INSERT INTO user_list VALUES('"+ SignUpNameField.getText().trim()+"','"+
                    SignUpEmailField.getText().trim()+"','"+SignUpMobileField.getText().trim()+"','"+
                    SignUpPassField.getText().trim()+"');";


            db.insertData(query);

            String succes = "Success!";


            SignUpEmailField.setText("");
            SignUpEmailField.setPromptText(succes);
            SignUpNameField.setText("");
            SignUpNameField.setPromptText(succes);
            SignUpMobileField.setText("");
            SignUpMobileField.setPromptText(succes);
            SignUpPassField.setText("");




            System.out.println("Successfully inserted data");
        }


    }

}
