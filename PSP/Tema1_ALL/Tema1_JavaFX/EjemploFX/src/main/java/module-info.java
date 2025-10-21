module ejemplofx.ejemplofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ejemplofx.ejemplofx to javafx.fxml;
    opens model;
    exports ejemplofx.ejemplofx;
}