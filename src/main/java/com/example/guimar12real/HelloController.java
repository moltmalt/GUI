package com.example.guimar12real;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private GridPane pnLogin;

    @FXML
    private AnchorPane pnMain;

    @FXML GridPane pnHome;

    @FXML
    public AnchorPane pnHomeParent;

    @FXML
    public TextField usernameField;
    @FXML
    private TextField passwordField;

    @FXML private Text actiontarget;

    public static String username;
    public String pass;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) throws IOException {

        Parent homeview = FXMLLoader.load(HelloApplication.class.getResource("home-view.fxml"));
        AnchorPane p = (AnchorPane) pnLogin.getParent();
        String usernameCheck = usernameField.getText();
        String passwordCheck = passwordField.getText();

        username = usernameCheck;
        pass = passwordCheck;


        if((usernameCheck.equals("moltmalt") && passwordCheck.equals("12345"))
        || (usernameCheck.equals("escanosimon") && passwordCheck.equals("iloverinnah"))
        || (usernameCheck.equals("deathisquiet") && passwordCheck.equals("54321"))){

            if(usernameCheck.equals("moltmalt")){
                pnMain.getScene().getStylesheets().clear();
                pnMain.getScene().getStylesheets().add(getClass().getResource("homeview.css").toExternalForm());
                System.out.println("MHM");
            }else if(usernameCheck.equals("escanosimon")){
                pnMain.getScene().getStylesheets().clear();
                pnMain.getScene().getStylesheets().add(getClass().getResource("homeview.css").toExternalForm());
            }else{
                pnMain.getScene().getStylesheets().clear();
                pnMain.getScene().getStylesheets().add(getClass().getResource("homeview.css").toExternalForm());
            }

            p.getChildren().remove(pnLogin);;
            p.getChildren().add(homeview);


        }else{
            actiontarget.setText("Unsuccessful log-in!");
        }
    }


}