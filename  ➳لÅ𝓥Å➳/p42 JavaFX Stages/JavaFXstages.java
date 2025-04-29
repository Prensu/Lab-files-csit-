import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class JavaFXstages extends Application {
    public static void main(String[] args) {
        launch(args); // Start the JavaFX application
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a root node (Group) to hold the scene graph
        Group root = new Group();
        
        // Create a scene with the root node and background color (use JavaFX Color)
        Scene scene = new Scene(root, 400, 300, Color.LIGHTBLUE);

        Image icon=new Image("techmaicha-logo.jpg"); // Load the image from the resources folder
        primaryStage.getIcons().add(icon); // Set the icon for the stage
        

        // Set the scene to the primary stage
        primaryStage.setScene(scene);
        
        // Set the title of the window
        primaryStage.setTitle("Prensu's Personal JavaFX Application");

        primaryStage.setWidth(420); // Set the width of the window  just set the width 420 becoz brocode said its a funny number 
        primaryStage.setHeight(420); // Set the height of the window
        primaryStage.setResizable(false); // Disable resizing of the window
        // Show the primary stage
        primaryStage.show();
    }
}
