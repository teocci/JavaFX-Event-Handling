package com.github.teocci.codesample.eventhandling;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import static com.github.teocci.codesample.eventhandling.util.Config.FXML_EVENT_HANDLING;

/**
 * Main class to start the application.
 *
 * @author Marco Jakob
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Event Handling");

        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource(FXML_EVENT_HANDLING));
            AnchorPane page = (AnchorPane) loader.load();
            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}