package com.mycompany.helloyou;

import java.util.HashSet;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;;

public class HelloYou extends Application {


    public static void main(String[] args) {
        launch(HelloYou.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label infotext = new Label("Write your name and start");
        TextField namefield = new TextField();
        Button startbutton = new Button("Start");
        Label welctext = new Label("");
        
        GridPane gridi = new GridPane();
        gridi.add(infotext, 0, 0);
        gridi.add(namefield, 0, 1);
        gridi.add(startbutton, 0, 2);
        
        gridi.setVgap(10);
        gridi.setHgap(10);
        gridi.setPadding(new Insets(20, 20, 20, 20));
        gridi.setPrefSize(300, 180);
        gridi.setAlignment(Pos.CENTER);          
        
        Scene first = new Scene(gridi);
        
        Label welcome = new Label("");
        StackPane stacke = new StackPane();        
        stacke.setPrefSize(300, 180);
        stacke.getChildren().add(welcome);
        stacke.setAlignment(Pos.CENTER);
 
        Scene second = new Scene(stacke);
        
        startbutton.setOnAction(e ->{
            if(namefield.getText().isEmpty()){
                return;
            }
            welcome.setText("Welcome " + namefield.getText() +"!");
            stage.setScene(second);
        });
                     
        stage.setScene(first);
        stage.show();
    }
}
