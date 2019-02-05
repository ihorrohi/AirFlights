package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import static javafx.application.Platform.exit;

public class LoginController {

    @FXML
    private TextField userNameTxtField;

    @FXML
    private PasswordField passPField;

    @FXML
    private Button signInBtn;

    @FXML
    private Hyperlink forgotHyperlink;

    @FXML
    private Button signUpBtn;

    @FXML
    private Button closeBtn;

    @FXML
    void initialize(){
        userNameTxtField.setFocusTraversable(false);
        passPField.setFocusTraversable(false);

        closeBtn.setOnAction(event -> exit());

    }

}
