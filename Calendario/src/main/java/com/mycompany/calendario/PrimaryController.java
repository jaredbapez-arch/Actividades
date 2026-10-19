package com.mycompany.calendario;

import java.io.IOException;
import java.net.URL;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML private TextField txtFecha;
    @FXML private Label lblResultado;
    private Fecha f;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void calcular() {
        try {
            String[] partes = txtFecha.getText().trim().split("/");
            if (partes.length != 3) {
                throw new NumberFormatException();
            }
            f = new Fecha(Integer.parseInt(partes[0].trim()),
                          Integer.parseInt(partes[1].trim()),
                          Integer.parseInt(partes[2].trim()));

            LocalDate nacimiento = LocalDate.of(f.getAnio(), f.getMes(), f.getDia());
            LocalDate hoy = LocalDate.now();

            if (nacimiento.isAfter(hoy)) {
                lblResultado.setText("La fecha no puede ser futura");
                return;
            }

            Period edad = Period.between(nacimiento, hoy);
            lblResultado.setText("Tiene " + edad.getYears() + " años con "
                    + edad.getMonths() + " meses y " + edad.getDays() + " días");

        } catch (NumberFormatException | DateTimeException e) {
            lblResultado.setText("Fecha inválida. Usa el formato d/m/aaaa");
        }
    }

    @FXML
    private void limpiar() {
        txtFecha.clear();
        lblResultado.setText("");
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}