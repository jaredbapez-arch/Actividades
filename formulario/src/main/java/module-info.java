module com.mycompany.formulario {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.formulario to javafx.fxml;
    exports com.mycompany.formulario;
}
