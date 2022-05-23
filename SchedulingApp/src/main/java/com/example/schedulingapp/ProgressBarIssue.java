/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdemo;

/**
 *
 * @author Mzie
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class ProgressBarIssue extends Application{
    
    
    public static void main(String args[]){
      launch(args);
   }
    
      @Override
      public void start(Stage st) {
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
      st.setTitle("Progress Bar");
      st.setScene(scene);
      st.show();
   }
   
}

