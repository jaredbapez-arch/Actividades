package com.mycompany.cantidaddinero;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PrimaryController {

    @FXML
    private TextField txtDinero;

    @FXML
    private void switchToSecondary() throws IOException {  
        App.setRoot("secondary");  
    }

    @FXML
    private void desglosar() {
        try {
            
            String texto = txtDinero.getText();
            if (texto == null || texto.isEmpty()) {
                mostrarAlerta("Error", "Por favor ingresa una cantidad de dinero.");
                return;
            }
            
            int cantidad = Integer.parseInt(texto);
            
            
            int[] denominaciones = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
            StringBuilder resultado = new StringBuilder("Desglose para: " + cantidad + "\n");
            
            int resto = cantidad;
            for (int denom : denominaciones) {
                if (resto >= denom) {
                    int nBilletes = resto / denom;
                    resto = resto % denom;
                    
                    // Creamos tu clase Billetes por cada denominación encontrada
                    Billetes b = new Billetes(nBilletes);
                    resultado.append(denom).append(" : ").append(b.getBilletes()).append("\n");
                }
            }
            
            // Mostramos el resultado (puedes enviarlo a otra vista o mostrarlo en pantalla)
            mostrarAlerta("Desglose de Dinero", resultado.toString());
            
        } catch (NumberFormatException e) {
            mostrarAlerta("Error de formato", "Por favor ingresa solo números enteros válidos.");
        }
    }

    @FXML
    private void limpiar() {
        // Limpiamos el campo de texto
        if (txtDinero != null) {
            txtDinero.clear();
        }
    }
    
    // Método auxiliar para mostrar alertas rápidas al usuario
    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}