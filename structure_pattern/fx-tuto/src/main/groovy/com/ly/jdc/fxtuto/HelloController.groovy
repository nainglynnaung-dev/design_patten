package com.ly.jdc.fxtuto

import javafx.fxml.FXML
import javafx.scene.control.Label

class HelloController {
    @FXML
    private Label welcomeText

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("How are you!")
    }
}