module com.mycompany.calendario {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.calendario to javafx.fxml;
    exports com.mycompany.calendario;
}
