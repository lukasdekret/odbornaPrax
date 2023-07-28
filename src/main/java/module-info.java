module com.example.odbornaprax {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.odbornaprax to javafx.fxml;
    opens com.example.odbornaprax.framework.components to javafx.graphics;
    opens com.example.odbornaprax.application_test to javafx.graphics;
    exports com.example.odbornaprax;
}