/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.javapp.devj140.javafxmlcsstable;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author VOsipenkov
 */
public class JavaFXMLCSSTable extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("JavaFXMLCSSTable.fxml"));
             
        Scene scene = new Scene(root,300,250);
        scene.getStylesheets().add(getClass().getResource("StyleFirst.css").toString());
        stage.setTitle("JavaFXMLCSSTable");
        stage.setScene(scene);
        //stage.setResizable(false); //в случае если требуется постоянный размер окна
        stage.show();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
