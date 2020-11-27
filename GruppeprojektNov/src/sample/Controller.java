

package sample;

import javafx.fxml.FXML;

public class Controller {

// koble fxml til java
    @FXML
    TextArea textField1;

    public void showHej(){
        textField1.clear();
        System.out.println("Button hej was clicked");
        textField1.appendText("Hej!\n");
    }


}
