module com.damdaw.ejemplojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.damdaw.ejemplojavafx to javafx.fxml;
    exports com.damdaw.ejemplojavafx;
}