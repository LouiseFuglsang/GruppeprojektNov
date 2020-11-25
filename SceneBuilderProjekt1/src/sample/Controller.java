package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    TextField textFelt2;

    public void PressButton() {
        // System.out.println("...");
        textFelt2.appendText("YEAH YEAH YEAH (linjeskift virker bare ikke øv øv)\n");
    }
}
