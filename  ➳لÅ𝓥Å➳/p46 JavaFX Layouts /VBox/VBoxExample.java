//VBox is used to lay out children in a single vertical column. It is part of the JavaFX library.



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(10); // spacing of 10px
        vbox.getChildren().addAll(new Button("Top"), new Button("Middle"), new Button("Bottom"));

        Scene scene = new Scene(vbox, 200, 150);
        primaryStage.setTitle("VBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
