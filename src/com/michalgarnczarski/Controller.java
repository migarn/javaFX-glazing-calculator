package com.michalgarnczarski;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label headerLabel;

    @FXML
    private TextField glassWidthTextField;

    @FXML
    private TextField glassHeightTextField;

    @FXML
    private TextField spacerWidthTextField;

    public void initialize() {
        headerLabel.setText("Kalkulator służy do obliczania minimalnych grubości szyb." +
                "\nObliczenia oparte są na normie zakładowej firmy PRESS GLASS SA.");

        glassWidthTextField.setText("0");
        glassHeightTextField.setText("0");
        spacerWidthTextField.setText("16");

    }
}
