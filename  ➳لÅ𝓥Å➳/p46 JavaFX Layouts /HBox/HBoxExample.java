//HBox is used to lay out children in a single horizontal row. It is part of the JavaFX library.
// It is a simple layout container that arranges its children in a single row, allowing you to specify the spacing between them.



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox hbox = new HBox(10); // spacing of 10px
        hbox.getChildren().addAll(new Button("One"), new Button("Two"), new Button("Three"));

        Scene scene = new Scene(hbox, 300, 100);
        primaryStage.setTitle("HBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
