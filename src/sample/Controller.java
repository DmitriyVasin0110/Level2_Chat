package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
   @FXML
   TextArea mainTextArea;
   @FXML
   TextField mainTextField;
   @FXML
   Button sendButton;

    public void sendMassage(){
        if(!mainTextField.getText().equals("")) {
            mainTextArea.appendText(mainTextField.getText() + "\n");
            mainTextField.clear();
            mainTextField.requestFocus();
        }
        else {
            System.out.println("Введите текст сообщения");
        }
    }
}
