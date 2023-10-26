module com.example.causinhausis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.causinhausis to javafx.fxml;
    exports com.example.causinhausis;
}