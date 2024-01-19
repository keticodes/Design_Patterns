module com.example.design_patterns {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.design_patterns to javafx.fxml;
    exports com.example.design_patterns;
}