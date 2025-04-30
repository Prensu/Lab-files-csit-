// GridPane arranges the nodes in a row and columns , like a spreadsheet 
//good for creating forms and layouts where you need to align components in a grid pattern



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(new Label("Name:"), 0, 0);
        grid.add(new TextField(), 1, 0);
        grid.add(new Label("Email:"), 0, 1);
        grid.add(new TextField(), 1, 1);

        Scene scene = new Scene(grid, 300, 150);
        primaryStage.setTitle("GridPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
