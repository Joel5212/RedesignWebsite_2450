package application;
import application.MainPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class NewsSections{

	public static Scene newsSectionsScene(Stage primaryStage) throws FileNotFoundException
	{
		Image image = new Image(new FileInputStream("C:\\Users\\joelj\\eclipse-workspace\\RedesignWebsite_2450\\resources\\exit.png"));
		ImageView exit = new ImageView(image);
		exit.setFitHeight(50); 
	    exit.setFitWidth(50);
	    
	    Label lblTechnology = new Label("Science and Technology");
	    Label lblAI = new Label("Artifical Intelligence");
	    Label lblCryptoCurrency = new Label("Crypto Currency");
	    Label lblSpaceExploration = new Label("Space Exploration");
	    
	    Label lblPolitics = new Label("Politics");
	    Label lblDemocrats = new Label("Democrats");
	    Label lblRepublicans = new Label("Republicans");
	    Label lblDonaldTrump = new Label("Donald Trump");
	    Label lblCongress = new Label("Congress");
	    Label lblWhiteHouse = new Label("White House");
	    
	    
	    Label lblSports = new Label("Sports");
	    Label lblNBA = new Label("NBA");
	    Label lblNFL = new Label("NFL");
	    Label lblNHL = new Label("NHL");
	    Label lblMLB = new Label("MLB");
	    
	    Label lblWeather = new Label("Weather");
	    Label lblClimateCrisis = new Label("Climate Crisis");
	    Label lblTornadoes= new Label("Tornadoes");
	    Label lblHurricanes = new Label("Hurricanes");
	    
	    Label lblJobs = new Label("Jobs");
	    Label lblUnemployment = new Label("Unemployment");
	    Label lblNewJobs = new Label("New Jobs");
	    Label lblAutomation = new Label("Automation");
	    
	    Label lblHealth = new Label("Health");
	    Label lblAbortion = new Label("Abortion");
	    Label lblCoronavirus = new Label("Coronavirus");
	    Label lblWellness = new Label("Wellness");
	    
	    
	    
	    
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
	    
	    gp.add(lblTechnology, 1, 1);
	    lblTechnology.setFont(new Font(15));
	    lblTechnology.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
	    
	    gp.add(lblAI, 1, 2);
	    gp.setMargin(lblAI, new Insets(0, 0, 0, 30));
	    
	    gp.add(lblCryptoCurrency, 1, 3);
	    gp.setMargin(lblCryptoCurrency, new Insets(0, 0, 0, 30));
	    
	    gp.add(lblSpaceExploration, 1, 4);
	    gp.setMargin(lblSpaceExploration, new Insets(0, 0, 0, 30));
	    
	    
	    gp.add(lblPolitics, 2, 1);
	    lblPolitics.setFont(new Font(15));
	    lblPolitics.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
	    
	    gp.add(lblDemocrats, 2, 2);
	    gp.add(lblRepublicans, 2, 3);
	    gp.add(lblDonaldTrump, 2, 4);
	    gp.add(lblCongress, 2, 5);
	    gp.add(lblWhiteHouse, 2, 6);
	    
	    gp.add(lblSports, 3, 1);
	    lblSports.setFont(new Font(15));
	    lblSports.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
	    
	    gp.add(lblNBA, 3, 2);
	    gp.setMargin(lblNBA, new Insets(0, 0, 0, 5));
	    
	    gp.add(lblNFL, 3, 3);
	    gp.setMargin(lblNFL, new Insets(0, 0, 0, 5));
	    
	    gp.add(lblNHL, 3, 4);
	    gp.setMargin(lblNHL, new Insets(0, 0, 0, 5));
	    
	    gp.add(lblMLB, 3, 5);
	    gp.setMargin(lblMLB, new Insets(0, 0, 0, 5));
	    
	    gp.add(lblWeather, 1, 6);
	    lblWeather.setFont(new Font(15));
	    lblWeather.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
	    gp.setMargin(lblWeather, new Insets(0, 0, 0, 50));
	    
	    gp.add(lblClimateCrisis, 1, 7);
	    gp.setMargin(lblClimateCrisis, new Insets(0, 0, 0, 50));
	    
	    gp.add(lblHurricanes, 1, 8);
	    gp.setMargin(lblHurricanes, new Insets(0, 0, 0, 50));
	    
	    gp.add(lblTornadoes, 1, 9);
	    gp.setMargin(lblTornadoes, new Insets(0, 0, 0, 50));
	    
	    gp.setStyle("-fx-background-color: #000039;");
	    
	    gp.setHgap(50);
	    
	    Scene scene  = new Scene(gp,650,650);
		return scene;
	    
	    
		
	}
}