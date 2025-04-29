import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class JavaFXdraw extends Application {
    
    public static void main(String[] args) {
        launch(args); // This starts the JavaFX application
    }

    @Override
    public void start(Stage primaryStage) {  // Note: Use the provided primaryStage
        Group root = new Group();
        Scene scene = new Scene(root, 600, 400, Color.LIGHTBLUE); // Added size and color
        
        Image icon = new Image("techmaicha-logo.jpg"); // Load the image from the resources folder
        primaryStage.getIcons().add(icon); // Set the icon for the stage
        // Add some sample content to make the window visible
        Text helloText = new Text(50, 50, "Hello Its Prensu Learning JavaFX!");

        Line line = new Line(50, 100, 200, 100); // A simple line
        line.setStartX(200);
        line.setStartY(100);
        line.setEndX(400);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(200);
        rectangle.setY(150);
        rectangle.setWidth(100);
        rectangle.setHeight(50);
        rectangle.setFill(Color.RED); // Fill color for the rectangle
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK); // Stroke color for the rectangle

        Polygon triangle = new Polygon();   
        triangle.getPoints().setAll(300.0, 200.0, 350.0, 250.0, 250.0, 250.0); // Triangle points
        triangle.setFill(Color.YELLOW); // Fill color for the triangle
        triangle.setStrokeWidth(5);
        triangle.setStroke(Color.BLACK); // Stroke color for the triangle

            
        Image image=new Image("techmaicha-logo.jpg"); // Load the image from the resources folder
        ImageView imageView = new ImageView(image); // Create an ImageView to display the image
        imageView.setX(50); // Set the x position of the image
        imageView.setY(50); // Set the y position of the image
        imageView.setFitWidth(100); // Set the width of the image
        imageView.setFitHeight(100); // Set the height of the image


        root.getChildren().add(helloText);
        root.getChildren().add(line); // Add the line to the root group
        root.getChildren().add(rectangle); // Add the rectangle to the root group   
        root.getChildren().add(triangle); // Add the triangle to the root group
        root.getChildren().add(imageView); // Add the image to the root group

        
        
        // Configure and show the stage
        primaryStage.setTitle("Prensu Dangol's Personal JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.show();  // This was missing - crucial to display the window

    }
}