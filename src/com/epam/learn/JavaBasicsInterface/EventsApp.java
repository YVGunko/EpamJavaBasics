package com.epam.learn.JavaBasicsInterface;

public class EventsApp {
    public static void main(String args[]){
        Button button = new Button(new ButtonClickHandler());
        button.click();
        button = new Button(new ButtonPressHandler());
        button.click();
        button = new Button(new TvButtonPressHandler());
        button.click();
        button.click();
        button.click();
        button = new Button(() -> System.out.println("Lambda test"));
        button.click();
    }
}
interface EventHandler {
    void execute();
}

class Button {
    EventHandler eventHandler;
    Button(EventHandler action){
        this.eventHandler = action;
    }
    void click(){
        eventHandler.execute();
    }
}
class ButtonClickHandler implements EventHandler {
    public void execute() {
        System.out.println("Button was clicked.");
    }
}
class ButtonPressHandler implements EventHandler{
    public void execute(){
        System.out.println("Button was pressed.");
    }
}
class TvButtonPressHandler implements EventHandler{
    private Boolean on = false;
    public void execute(){
        if (on) {
            System.out.println("TV was ON. Now it is OFF.");
            on = false;
        }else {
            System.out.println("TV was OFF. Now it is ON.");
            on = true;
        }
    }
}