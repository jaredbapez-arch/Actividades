package com.mycompany.tablamultiplicar;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextArea txtTabla;
    
    @FXML
    private void calcular(){
        int n =Integer.parseInt(txtNumero.getText().trim());
        
      StringBuilder sb = new StringBuilder();
      for (int i = 1; i <= 10; i++) {
        
      sb.append(n).append("x").append(i).append(" = ").append(n * i).append("\n");
    }
      txtTabla.setText(sb.toString());
    }
    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtTabla.clear();
    }
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
