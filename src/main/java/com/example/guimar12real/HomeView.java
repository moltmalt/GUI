package com.example.guimar12real;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HomeView {

    @FXML AnchorPane pnHomeParent;
    @FXML GridPane pnHome;

    @FXML ColorPicker cpPicker;

    @FXML
    protected void backToLogin(ActionEvent event) throws IOException {

        Parent homeview = FXMLLoader.load(HelloApplication.class.getResource("login-view.fxml"));
        try{

            if(HelloController.username.equals("moltmalt")){
                BufferedWriter bw = new BufferedWriter(new FileWriter(getClass().getResource("homeview.css").getPath()));
                bw.write(".root{ -fx-background: yellow;}");
                bw.newLine();
                bw.write(".signoutButton{-fx-background-color: #" + cpPicker.getValue().toString().substring(2,8) + ";} ");
                bw.close();
            }else if(HelloController.username.equals("escanosimon")){
                BufferedWriter bw = new BufferedWriter(new FileWriter(getClass().getResource("homeview.css").getPath()));
                bw.write(".root{ -fx-background-color: red;}");
                bw.newLine();
                bw.write(".signoutButton{-fx-background-color: #" + cpPicker.getValue().toString().substring(2,8) + ";} ");
                bw.close();
            }else {
                BufferedWriter bw = new BufferedWriter(new FileWriter(getClass().getResource("homeview.css").getPath()));
                bw.write(".root{ -fx-background-color: green;}");
                bw.newLine();
                bw.write(".signoutButton{-fx-background-color: #" + cpPicker.getValue().toString().substring(2,8) + ";} ");
                bw.close();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        GridPane p = (GridPane) pnHome.getParent();
        p.getChildren().remove(pnHome);;
        p.getChildren().add(homeview);

    }
}
