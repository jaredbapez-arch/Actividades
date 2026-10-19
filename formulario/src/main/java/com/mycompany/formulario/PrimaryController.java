package com.mycompany.formulario;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtRefrigerios;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;
    @FXML private TextField txtTotal;
    @FXML private TextField txtMasAlto;
    
    @FXML
    private void calcular(){
        int alimentacion = Integer.parseInt(txtAlimentacion.getText().trim());
    int refrigerios  = Integer.parseInt(txtRefrigerios.getText().trim());
    int transporte   = Integer.parseInt(txtTransporte.getText().trim());
    int telefonia    = Integer.parseInt(txtTelefonia.getText().trim());
    int otros        = Integer.parseInt(txtOtros.getText().trim());

    // 2. Total
    int total = alimentacion + refrigerios + transporte + telefonia + otros;

    // 3. Gasto más alto: empiezo suponiendo que es el primero
    int mayor = alimentacion;
    String nombre = "Alimentación";

    if (refrigerios > mayor) {
        mayor = refrigerios;
        nombre = "Refrigerios";
    }
    if (transporte > mayor) {
        mayor = transporte;
        nombre = "Transporte";
    }
    if (telefonia > mayor) {
        mayor = telefonia;
        nombre = "Telefonía";
    }
    if (otros > mayor) {
        mayor = otros;
        nombre = "Otros";
    }

    // 4. Mostrar resultados
    txtTotal.setText(String.valueOf(total));
    txtMasAlto.setText(nombre);
    }
    
     @FXML
    private void limpiar(){
        txtTotal.clear();
        txtMasAlto.clear();
    }
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
