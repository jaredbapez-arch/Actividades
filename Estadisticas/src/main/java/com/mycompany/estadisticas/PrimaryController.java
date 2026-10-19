package com.mycompany.estadisticas;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML private TextArea txtAlumnos;
    @FXML private TextField txtEstadisticas;
    @FXML private TextField porcentajeAprobado;
    @FXML private TextField porcentajeReprodados;
    @FXML private TextField mejorPromedio;
    @FXML private TextField peorPromedio;
    @FXML private TextField Promedio;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<Alumnos> lista = new ArrayList<>();
        lista.add(new Alumnos("Giorno", 9));
        lista.add(new Alumnos("Goku", 5));
        lista.add(new Alumnos("Subaru", 8));
        lista.add(new Alumnos("Astolfo", 10));
        lista.add(new Alumnos("Reze", 9));
        lista.add(new Alumnos("power", 7));
        lista.add(new Alumnos("Makima", 9));
        lista.add(new Alumnos("Denji", 4));
        lista.add(new Alumnos("Yoru", 8));
        lista.add(new Alumnos("Basuma", 3));

        StringBuilder sb = new StringBuilder();
        for (Alumnos al : lista) {
            sb.append(al.getNombre())
              .append(" - ")
              .append(al.getCalificiacion())
              .append("\n");
        }
        txtAlumnos.setText(sb.toString());

        Estadisticas est = new Estadisticas(lista);
        txtEstadisticas.setText(est.toString());
        porcentajeAprobado.setText(String.format("%.1f%%", est.getAprobados()));
        porcentajeReprodados.setText(String.format("%.1f%%", est.getReprobados()));
        mejorPromedio.setText(String.valueOf(est.getMejorCalf()));
        peorPromedio.setText(String.valueOf(est.getPeorCalf()));
        Promedio.setText(String.format("%.2f", est.getPromedio()));
    }
}