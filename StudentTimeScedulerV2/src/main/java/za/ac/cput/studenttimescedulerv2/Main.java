/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.studenttimescedulerv2;

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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

/**
 *
 * @author Hanno
 */
public class Main extends Application {

    Stage window;
    // Scene addingEvent;
    Scene eventList, addingTimeTable;

    Button exitButton;

    TableView<Events> table;

    //@Override
    public void start(Stage stage) throws IOException {


        /*Hanno's code for setting the stage to the adding event window*/
        window = stage;
/*
        AddingEvent event1 = new AddingEvent();
        event1.setAddingEvent_GUI();
        window.setScene(event1.addingEvent);
        window.setTitle(event1.getTitle());
        window.show();*/

      

        /*Cebisani*/
 /*window = stage;

        window.setTitle("Sorting Events Scene");

        window.setOnCloseRequest(e -> closeApp());


//Setting up the table and Columns
        //Table Columns

        TableColumn <Events, String> eventNameColumn = new TableColumn<>("Event Name: ");
        eventNameColumn.setMinWidth(300);
        eventNameColumn.setCellValueFactory(new PropertyValueFactory<>("eventName"));
/////////
        TableColumn <Events, String> eventTypeColumn = new TableColumn<>("Event Type: ");
        eventTypeColumn.setMinWidth(200);
        eventTypeColumn.setCellValueFactory(new PropertyValueFactory<>("eventType"));
/////////
        TableColumn <Events, String> eventDateColumn = new TableColumn<>("Event Date: ");
        eventDateColumn.setMinWidth(100);
        eventDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
///////
        TableColumn <Events, String> eventPriorityColumn = new TableColumn<>("Priority: ");
        eventPriorityColumn.setMinWidth(100);
        eventPriorityColumn.setCellValueFactory(new PropertyValueFactory<>("priority"));
//////////Setting the table

        table = new TableView<>();

        table.setItems(getEvents());
        table.getColumns().addAll(eventNameColumn,eventTypeColumn,eventDateColumn,eventPriorityColumn);

/////// Adding

        Menu sortMenu = new Menu("Sort By:");

////Menu Items

        sortMenu.getItems().add(new MenuItem("Ascending Order"));
        sortMenu.getItems().add(new MenuItem("Descending Order"));
        sortMenu.getItems().add(new MenuItem("Due Date"));
        sortMenu.getItems().add(new MenuItem("Event Name"));
        sortMenu.getItems().add(new MenuItem("Event Type"));

/////MenuBar

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(sortMenu);


/////Exit Button
        exitButton = new Button("Exit");
        exitButton.setOnAction(e -> closeApp());


///////Setting up the VBox

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table,menuBar,exitButton);
////
        Scene scene = new Scene(vBox,700, 400);
        window.setScene(scene);
        window.show();
         */
//Karabo's code
        /* window = stage;
        //VBox layout = new VBox();
       // eventList = new Scene(layout, 800, 600);
        EventList eventL = new EventList();
        eventL.setEventList_GUI();
        window.setScene(eventL.eventList);
        window.setTitle("Event List");

        window.show(); 

        window.show();*/
//Mzie
/*
//Creating a progress bar
      ProgressBar progress = new ProgressBar();
      //Setting value to the progress bar
      progress.setProgress(0.8);
      //Creating a progress indicator
      ProgressIndicator pieChart = new ProgressIndicator(0.8);
      //Setting the size of the progress bar
      progress.setPrefSize(300, 30);
      //Creating a hbox to hold the progress bar and progress indicator
      HBox box = new HBox(50);
      box.setSpacing(5);
      box.setPadding(new Insets(80, 155, 55, 65));
      box.getChildren().addAll(progress, pieChart);
      //Setting the stage
      Group rt = new Group(box);
      Scene scene = new Scene(rt, 595, 200, Color.WHITE);
      stage.setTitle("Progress Bar");
      stage.setScene(scene);
      stage.show();
        
         */
//Ferdouz's code

        /*
window = stage;
        VBox layout2 = new VBox();
        addingTimeTable = new Scene(layout2, 750,650);
        window.setScene(addingTimeTable);
        window.setTitle("Adding a Time Table");
        window.show();
         */
    }

//Cebisani
/*public void closeApp(){
        Boolean result = ConfirmBox.display("Close Application", "Do you want to exit ?");
        if(result)
            window.close();
    }


    //Calling the Events Class
    public ObservableList<Events> getEvents(){
        ObservableList<Events> events = FXCollections.observableArrayList();
        events.add(new Events("Applications Development Practice","Test","21-06-22", new CheckBox() ));
        events.add(new Events("Information Management","LinkedIn","29-05-22",new CheckBox()));
        events.add(new Events("Information systems","Exam","09-06-22",new CheckBox()));
        events.add(new Events("Multimedia Applications Fundamentals","Study","09-06-22",new CheckBox()));
        events.add(new Events("Professional Communications","Assignment","18-05-22",new CheckBox()));
        events.add(new Events("Applications Development Fundamentals","Tutorial","29-05-22",new CheckBox()));
        events.add(new Events("Electives - Python ","Exam","03-06-22",new CheckBox()));


        return events;

    }*/
    public static void main(String[] args) {
        launch(args);
    }
}
