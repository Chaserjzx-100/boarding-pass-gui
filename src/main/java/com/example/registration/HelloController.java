package com.example.registration;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label title;
    @FXML
    private DatePicker date;
    @FXML
    private LocalDate flightDate;
    @FXML
    public void getDate(ActionEvent event){
        LocalDate myDate = date.getValue();
        flightDate = myDate;
    }
    @FXML
    private ChoiceBox<String> ageBox;
    @FXML
    private String[] age = {"0-12", "13-59", "60+"};
    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        ageBox.getItems().addAll(age);
    }
    @FXML
    private RadioButton maleOption, femaleOption, otherOption;
    @FXML
    private TextField nameText;
    @FXML
    private TextField emailText;
    @FXML
    private TextField phoneNumberText;
//    @FXML
//    private TextField flightDate;
    @FXML
    private TextField flightTime;
    @FXML
    private TextField departureLocation;
    @FXML
    private TextField destination;

    String passengerName;
    String passengerEmail;
    String passengerPhone;
    String passGender;
    String flightdate;
    String time;
    String departLoc;
    String arrivalDest;
    public void getGender(ActionEvent e){
        //If statement to check which radio button was selected.
        if (maleOption.isSelected()){
            passGender = "Male";
        } else if (femaleOption.isSelected()){
            passGender = "Female";
        } else if (otherOption.isSelected()){
            passGender = "Other";
        }
    }
    public void submit(ActionEvent e){
        passengerName = nameText.getText();
        passengerEmail = emailText.getText();
        passengerPhone = phoneNumberText.getText();
        flightdate = flightDate.toString();
        time = flightTime.getText();
        departLoc = departureLocation.getText();
        arrivalDest = destination.getText();

        System.out.println("Name: " + passengerName);
        System.out.println("Email: " + passengerEmail);
        System.out.println("Phone: " + passengerPhone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3"));
        System.out.println("Gender: " + passGender);
        System.out.println("Flight Date: " + flightdate + " Time: " + time);
        System.out.println("Departure: " + departLoc);
        System.out.println("Arrival: " + arrivalDest);
    }
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}