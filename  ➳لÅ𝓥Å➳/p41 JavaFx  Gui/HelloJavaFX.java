//JavaFx intended to replace Swing and AWT
// JavaFX is a software platform for creating and delivering desktop applications and rich internet application 
//rich internet applications means web applications that have the features and functionality of desktop applications


//JavaFX IS modern java GUI toolkit
//It SUPPORTS 2D and 3D graphics, audio, video, and web content


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {  //automatiically called when lauch method is called . It is the entry point of JavaFX application.
        // Create a Button
        Button button = new Button("Click Me!");

        // Create a Layout and add Button
        StackPane root = new StackPane();
        root.getChildren().add(button);
        

        // Create a Scene with the Layout
        Scene scene = new Scene(root, 300, 200);

        // Set the Scene to the Stage (Window)
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) { // when we launch the application , the main method is called first .It takes string array as argument . so we need to write launch(args) method to start the application.
        launch(args); // It is used to start the JavaFXapplication.
    }
}


// There are three main components 
// 1) Stage: The main window of the application.
// 2) Scene: The content inside the stage. It can contain multiple UI elements (nodes).
// 3) Nodes: The UI elements (like buttons, labels, etc.) that are added to the scene.