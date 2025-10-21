package ejemplofx.ejemplofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("example-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 440);
        stage.setTitle("Ejemplo FX");
        stage.setScene(scene);
        stage.setOnCloseRequest(event -> {
            //TODO write in the file the list of books (a static method of HelloController)
            HelloController.WriteFile();
        });
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}