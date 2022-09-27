package com.example.stackpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StackPane extends Application {
    @Override
    public void start(Stage stage)
    {

        try {

            // titulo para el stage
            stage.setTitle("StackPane");

            // creacion de label
            Label label = new Label("Ejemplo de StackPane");

            // fondo para label
            label.setFont(new Font(30));
            label.setStyle("-fx-font-weight: bold");

            // creación de circulo
            Circle circle = new Circle(100, 100, 70);

            // rellenamos el circulo
            circle.setFill(Color.LIGHTGREEN);

            // creamos rectangulo
            Rectangle rectangle = new Rectangle(100, 100, 180, 160);

            // rellenamos el rectangulo
            rectangle.setFill(Color.YELLOW);

            // creamos el StackPane
            javafx.scene.layout.StackPane stack_pane = new javafx.scene.layout.StackPane(rectangle, circle, label);

            // Creamos la escena
            Scene scene = new Scene(stack_pane, 400, 300);

            // Ponemos la escena en la stage
            stage.setScene(scene);

            stage.show();
        }

        catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    // Main
    public static void main(String args[])
    {

        // lanzamos app
        launch(args);
    }
}