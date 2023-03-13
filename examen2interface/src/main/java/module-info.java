module com.mycompany.examen2interface {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.examen2interface to javafx.fxml;
    exports com.mycompany.examen2interface;
}
