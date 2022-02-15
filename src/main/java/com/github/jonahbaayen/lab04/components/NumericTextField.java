package com.github.jonahbaayen.lab04.components;

import javafx.scene.control.TextField;

public class NumericTextField extends TextField {
    @Override
    public void replaceText(int start, int end, String text) {
        if (validate(text))
        {
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceSelection(String text) {
        if (validate(text))
        {
            super.replaceSelection(text);
        }
    }

    private boolean validate(String text) {
        // Check if text is number using regex
        return text.matches("[\\d]*");
    }
}
