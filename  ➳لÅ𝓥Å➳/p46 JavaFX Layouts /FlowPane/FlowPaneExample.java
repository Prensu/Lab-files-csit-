// FlowPane arranges nodes in a flow , either horizontally or vertically .




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FlowPane flowPane = new FlowPane();
        
        for (int i = 1; i <= 5; i++) {
            Button button = new Button("Button " + i);
            flowPane.getChildren().add(button);
        }

        Scene scene = new Scene(flowPane, 300, 200);
        primaryStage.setTitle("FlowPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
