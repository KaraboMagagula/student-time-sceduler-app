/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmenubar;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/**
 *
 * @author Karabo Magagula
 */
public class MainMenuBar extends Application {
   @Override
public void start(Stage primaryStage) {
// setting the title of application
//primaryStage.setTitle("Student Scheduler App");
//creating menu bar
MenuBar menuBar=new MenuBar();
//creating menu for adding menu items
Menu menu=new Menu("Menu");
//creating menu items
MenuItem eventList=new MenuItem("EventList");
MenuItem timetable=new MenuItem("TimeTable");
MenuItem calender=new MenuItem("Calender");
MenuItem progressBar=new MenuItem("ProgressBar");
MenuItem history=new MenuItem("History");
MenuItem settings=new MenuItem("Settings");
//adding menu items to the menu
menu.getItems().add(eventList);
menu.getItems().add(timetable);
menu.getItems().add(calender);
menu.getItems().add(progressBar);
menu.getItems().add(history);
menu.getItems().add(settings);
//adding menu to the menu bar
menuBar.getMenus().add(menu);
//creating VBox for adding all menu bar
VBox vBox=new VBox(menuBar);
//adding scroll pane to the scene
/*Scene scene = new Scene(vBox, 401, 201);
primaryStage.setScene(scene);
 BackgroundFill background_fill = new BackgroundFill(Color.PINK, 
                                          CornerRadii.EMPTY, Insets.EMPTY);
  
            // create Background
            Background background = new Background(background_fill);
  
            // set background
            vBox.setBackground(background);
//showing the output
primaryStage.show();*/
} 
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
