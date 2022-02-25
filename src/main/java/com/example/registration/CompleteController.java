package com.example.registration;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CompleteController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToCompleted(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("CompleteForm.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
