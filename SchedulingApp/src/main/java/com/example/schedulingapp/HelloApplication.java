package com.example.schedulingapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class HelloApplication extends Application {
    Stage window;
    Scene addingEvent;
    Scene eventList;


    @Override
    public void start(Stage stage) throws IOException {

       /* Scene scene = new Scene(,320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/
        
        /*Hanno's code for setting the stage to the adding event window
        window  = stage;
        AddingEvent event1 = new AddingEvent();
        event1.setAddingEvent_GUI();
        window.setScene(event1.addingEvent);
        window.setTitle(event1.getTitle());
        window.show();
         */


/* Karabo's code
        window = stage;
        VBox layout = new VBox();
        eventList = new Scene(layout, 800, 600);
        window.setScene(eventList);
        window.setTitle("Event List");
        window.show();
        */
    }

    public static void main(String[] args) {launch();}

    }

