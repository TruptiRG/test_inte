module com.masai.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.masai.test to javafx.fxml;
    exports com.masai.test;
}