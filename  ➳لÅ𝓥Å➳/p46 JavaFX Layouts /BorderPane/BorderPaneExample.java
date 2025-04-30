// BorderPane divides the layout into top, bottom, left, right, and center regions.
// Its great dashboards for ui 



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();

        pane.setTop(new Button("Top"));
        pane.setBottom(new Button("Bottom"));
        pane.setLeft(new Button("Left"));
        pane.setRight(new Button("Right"));
        pane.setCenter(new Button("Center"));

        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setTitle("BorderPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
