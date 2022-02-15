package com.github.jonahbaayen.lab04.components;

import javafx.scene.control.TextField;

public class EmailTextField extends TextField {
    public boolean isValid() {
        // Check if text is valid email using regex
        return this.getText().matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$");
    }
}
