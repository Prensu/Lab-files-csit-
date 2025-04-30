import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UIControlsExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Enter your name:");
        TextField textField = new TextField();

        Button button = new Button("Submit");

        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        ToggleGroup genderGroup = new ToggleGroup();
        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);

        CheckBox java = new CheckBox("Java");
        CheckBox python = new CheckBox("Python");

        button.setOnAction(e -> {
            String name = textField.getText();
            System.out.println("Name: " + name);
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(label, textField, male, female, java, python, button);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("JavaFX Controls Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
