/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.studenttimescedulerv2;

import javafx.scene.control.CheckBox;

/**
 *
 * @author Hanno
 */
public class Events {

    private String eventName, eventType, dueDate;

    CheckBox priority;


    public Events(){

        this.eventName = "";
        this.eventType = "";
        this.dueDate = "";
        this.priority = new CheckBox();
    }

    public Events(String eventName, String eventType, String dueDate, CheckBox priority) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.dueDate = dueDate;
        this.priority = new CheckBox();
    }

    // Getters

    public String getEventName() {
        return eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public String getDueDate() {
        return dueDate;
    }

    public CheckBox getPriority() {
        return priority;
    }


    //Setters


    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setPriority(CheckBox priority) {
        this.priority = priority;
    }
}
