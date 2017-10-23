/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Skaha_AM
 */
public class BankingController implements Initializable {

    @FXML
    private JFXButton button1;
    @FXML
    private JFXButton button2;
    @FXML
    private JFXButton button3;
    @FXML
    private JFXButton button4;
    @FXML
    private JFXButton button5;
    @FXML
    private JFXButton button6;
    @FXML
    private JFXButton button7;
    @FXML
    private JFXButton button8;
    @FXML
    private JFXButton button9;
    @FXML
    private JFXButton clear;
    @FXML
    private JFXButton button0;
    @FXML
    private JFXPasswordField proses;
    @FXML
    private JFXButton btnoke;
    
    String pin="";
    String mypin="3333";
    int kesempatan=3;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tkn1(ActionEvent event) {
         pin += "1";
        proses.setText(pin);
    }

    @FXML
    private void tkn2(ActionEvent event) {
         pin += "2";
        proses.setText(pin);
    }

    @FXML
    private void tkn3(ActionEvent event) {
         pin += "3";
        proses.setText(pin);
    }

    @FXML
    private void tkn4(ActionEvent event) {
         pin += "4";
        proses.setText(pin);
    }

    @FXML
    private void tkn5(ActionEvent event) {
         pin += "5";
        proses.setText(pin);
    }

    @FXML
    private void tkn6(ActionEvent event) {
         pin += "6";
        proses.setText(pin);
    }

    @FXML
    private void tkn7(ActionEvent event) {
         pin += "7";
        proses.setText(pin);
    }

    @FXML
    private void tkn8(ActionEvent event) {
         pin += "8";
        proses.setText(pin);
    }

    @FXML
    private void tkn9(ActionEvent event) {
         pin += "9";
        proses.setText(pin);
    }

    @FXML
    private void tkn0(ActionEvent event) {
         pin += "0";
        proses.setText(pin);
    }
    
     @FXML
    private void clear(ActionEvent event) {
         pin = "";
        proses.setText(pin);
    }
    @FXML
    private void ok(ActionEvent event) {
          if(pin.equals(mypin)){
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("nominal.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("MokletBank");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
          }
    }
}
