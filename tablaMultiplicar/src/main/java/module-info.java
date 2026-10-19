module com.mycompany.tablamultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tablamultiplicar to javafx.fxml;
    exports com.mycompany.tablamultiplicar;
}
