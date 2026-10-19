package com.mycompany.determinarentero;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class PrimaryController {
    
    @FXML private TextField txtNumero;
    @FXML private TextField txtCantidad;
    @FXML private TextField txtImpares;
    @FXML private TextField txtPares;
    @FXML private TextField txtTotal;
    @FXML private TextField txtMayor;
    @FXML private TextField txtMenor;
    @FXML private TextArea txtDivisores; 
    
     @FXML
    private void analizar() {
        int numero = Integer.parseInt(txtNumero.getText().trim());
        int n = numero; 

        int cantidad = 0;
        int impares = 0;
        int pares = 0;
        int mayor = 0;
        int menor = 9;

        while (n > 0) {
            int cifra = n % 10;
            n = n / 10;

            cantidad++;
            if (cifra % 2 == 0) {
                pares += cifra;
            } else {
                impares += cifra;
            }
            if (cifra > mayor) {
                mayor = cifra;
            }
            if (cifra < menor) {
                menor = cifra;
            }
        }

        txtCantidad.setText(String.valueOf(cantidad));
        txtImpares.setText(String.valueOf(impares));
        txtPares.setText(String.valueOf(pares));
        txtTotal.setText(String.valueOf(pares + impares));
        txtMayor.setText(String.valueOf(mayor));
        txtMenor.setText(String.valueOf(menor));

    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= numero; i++) {
        if (numero % i == 0) {
            sb.append(i).append("\n");
        }
    }
    txtDivisores.setText(sb.toString());
    }

   
    @FXML
    private void limpiar() {
     txtNumero.clear();
     txtCantidad.clear();
     txtImpares.clear();
     txtPares.clear();
     txtTotal.clear();
     txtMayor.clear();
     txtMenor.clear();
     txtDivisores.clear();
      }
   
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
