package com.mycompany.proyecto_m3;

import java.io.IOException;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    RadioButton login;
    @FXML
    TextField usuario;
    @FXML
    PasswordField contraseña;
    @FXML
    TextArea respuesta;

    int intentar = 0;

    public void login() throws IOException {

        final String usuari = "raul";
        final String contra = "123";

        boolean correcte = false;

        if (usuario.getText().equals(usuari)
                && contraseña.getText().equals(contra)) {
            respuesta.setText("Has entrado correctamente ");
            App.setRoot("secondary");

        } else {
            respuesta.setText("Has fallado, intenta-lo de nuevo! ");
            intentar++;
        }
        
        if (intentar > 2) {
            respuesta.setText("Usuario Bloqueado");
        }
        
    }
    @FXML
    private void switchToPrimary() throws IOException {
        
    }
    

}
