
package application;
import application.MainPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NewsSections{
	
	
	public static Scene newsSectionsScene(Stage primaryStage) throws FileNotFoundException
	{
		
		
		Image image = new Image(new FileInputStream("C:\\Users\\joelj\\eclipse-workspace\\RedesignWebsite_2450\\resources\\exit.png"));
		ImageView exit = new ImageView(image);
		exit.setFitHeight(50); 
	    exit.setFitWidth(50);
	    
	    exit.setOnMouseClicked(e ->{
	    	Scene scene = null;
			try {
				scene = MainPage.mainPageScene(primaryStage);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	primaryStage.setScene(scene);
	    });
		
	    GridPane gp = new GridPane();
	    gp.add(exit, 0, 0);
	    
	    Scene scene = new Scene(gp,650,650);
	    return scene;
		
	}
}