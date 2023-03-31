module com.mycompany.proyecto_m3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.proyecto_m3 to javafx.fxml;
    exports com.mycompany.proyecto_m3;
}
