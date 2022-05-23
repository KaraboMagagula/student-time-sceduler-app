package com.example.schedulingapp;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//Karabo's code
public class EventList {
    Scene eventList;
    GridPane listGrid;
    Label listHeading, event1, event2, event3, more, space, space1;
    Button menuEvent, addEvent, sortEvent, filterEvent, editEvent;
    ComboBox moreDetails;
   // TextField event1, event2, event3;

    public void setEventList_GUI(){
        listGrid = new GridPane();
        eventList = new Scene(listGrid, 600, 500);
        listHeading = new Label("EVENT LIST");
        menuEvent = new Button("MENU");
        addEvent = new Button("ADD");
        sortEvent = new Button("SORT");
        filterEvent = new Button("FILTER");
        editEvent = new Button("EDIT");
        moreDetails = new ComboBox<>();
        event1 = new Label("First Event");
        event2 = new Label("Second Event");
        event3 = new Label("Third Event");
        more = new Label("More");
        space = new Label(" ");
        space1 = new Label(" ");


        setEventList_Grid();
        setEventList_CSS();
    }

    private void setEventList_CSS() {
        listGrid.setBackground(new Background(new BackgroundFill(Color.POWDERBLUE, CornerRadii.EMPTY,
                Insets.EMPTY)));
        Font font = new Font("Ariel", 25);
        Font f2 = new Font("Ariel", 20);
        Font f3 = new Font("Ariel", 15);
        Font f4 = new Font("Ariel", 25);
        listHeading.setFont(font);
        event1.setFont(f2);
        event2.setFont(f2);
        event3.setFont(f2);
        more.setFont(f3);
        space.setFont(f4);
        space1.setFont(f4);
    }

    private void setEventList_Grid() {
        listGrid.setAlignment(Pos.TOP_LEFT);
        listGrid.add(listHeading, 1, 1, 1, 1);
        listGrid.add(menuEvent, 0, 1, 1, 1);

        listGrid.add(event1, 0, 2, 1, 1);
        listGrid.add(event2, 0, 3, 1, 1);
        listGrid.add(event3, 0, 4, 1, 1);

        listGrid.add(space, 0, 6, 1, 1);
        listGrid.add(space1, 0, 7, 1, 1);


        listGrid.add(more, 0, 7, 1, 1);
        listGrid.add(moreDetails, 1, 7, 1, 1);
        listGrid.add(addEvent, 1, 8, 1, 1);
        listGrid.add(sortEvent, 1, 9, 1, 1);
        listGrid.add(filterEvent, 1, 10, 1, 1);
        listGrid.add(editEvent, 1, 11, 1, 1);


    }


}
