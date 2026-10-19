module com.mycompany.cantidaddinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cantidaddinero to javafx.fxml;
    exports com.mycompany.cantidaddinero;
}
