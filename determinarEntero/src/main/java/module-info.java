module com.mycompany.determinarentero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.determinarentero to javafx.fxml;
    exports com.mycompany.determinarentero;
}
