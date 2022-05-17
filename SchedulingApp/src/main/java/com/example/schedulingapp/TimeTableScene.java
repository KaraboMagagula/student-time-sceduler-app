package com.example.schedulingapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class TimeTableScene extends Application {
     Stage windowTwo;
     Scene addingTimeTable;

    @Override
    public void start(Stage primaryStage) {
        //Ferdouz's scene, do not edit.
        windowTwo = primaryStage;
        VBox layout2 = new VBox();
        addingTimeTable = new Scene(layout2, 750,650);
        windowTwo.setScene(addingTimeTable);
        windowTwo.setTitle("Adding a Time Table");
        windowTwo.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}