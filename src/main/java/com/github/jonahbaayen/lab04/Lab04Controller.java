package com.github.jonahbaayen.lab04;

import com.github.jonahbaayen.lab04.components.EmailTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Lab04Controller {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField fullnameField;

    @FXML
    private EmailTextField emailField;

    @FXML
    private Label emailError;

    @FXML
    private TextField phoneField;

    @FXML
    private DatePicker dateofbirthField;

    @FXML
    private Label error;

    @FXML
    private void register(ActionEvent event) {
        event.consume();

        if (!this.areEntriesValid()) {
            error.setText("You must fill out all the fields properly!");
            return;
        } else {
            error.setText("Printed info to console.");
        }

        System.out.println("Registered a user with the following info:");
        System.out.println("\tUsername: " + usernameField.getText());
        System.out.println("\tPassword: " + passwordField.getText());
        System.out.println("\tFull Name: " + fullnameField.getText());
        System.out.println("\tE-Mail: " + emailField.getText());
        System.out.println("\tPhone #: " + phoneField.getText());
        System.out.println("\tDate of Birth: " + dateofbirthField.getValue().toString());
    }

    @FXML
    private void checkEmail(KeyEvent event) {
        event.consume();
        if (!emailField.isValid()) {
            emailError.setText("Invalid e-mail!");
        } else {
            emailError.setText("");
        }
    }

    private boolean areEntriesValid() {
        return !usernameField.getText().isBlank() &&
                !passwordField.getText().isBlank() &&
                !fullnameField.getText().isBlank() &&
                !emailField.getText().isBlank() &&
                emailField.isValid() &&
                !phoneField.getText().isBlank() &&
                dateofbirthField.getValue() != null;
    }
}
