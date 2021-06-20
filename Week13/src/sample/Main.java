package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Calculator");
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 300, 300);


        Text number1 = new Text("Number 1: ");
        TextField val1 = new TextField();
        Text number2 = new Text("Number 2: ");
        TextField val2 = new TextField();
        Text sum = new Text("Sum is: ");
        Font font = Font.loadFont("/Users/jonathandase/Desktop/Java/javafx/TimeNew.ttf", 32);

        System.out.println("Before Fonts");
        number1.setFont(Font.font("Times-Roman", 10));
        number2.setFont(Font.font("Times-Roman", 10));
        sum.setFont(Font.font("Times-Roman", 10));

        System.out.println("Fonts set");

        rootNode.getChildren().addAll(number1, val1, number2, val2, sum);
        primaryStage.setScene(myScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
