module com.mycompany.estadisticas {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.estadisticas to javafx.fxml;
    exports com.mycompany.estadisticas;
}
