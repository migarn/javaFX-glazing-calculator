package com.michalgarnczarski;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Controller {

    @FXML
    private Label headerLabel;

    public void initialize() {
        headerLabel.setText("Kalkulator służy do obliczania minimalnych grubości szyb." +
                "\nObliczenia oparte są na normie zakłądowej firmy PRESS GLASS SA");
    }
}
