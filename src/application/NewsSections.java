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
	    lblTechnology.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblTechnology.setFont(new Font(15));
		
	    Label lblAI = new Label("Artifical Intelligence");
	    lblAI.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblAI.setFont(new Font(12));
		
	    Label lblCryptoCurrency = new Label("Crypto Currency");
	    lblCryptoCurrency.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblCryptoCurrency.setFont(new Font(12));
		
	    Label lblSpaceExploration = new Label("Space Exploration");
	    lblSpaceExploration.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblSpaceExploration.setFont(new Font(12));
	    
	    
		
		
		Label lblPolitics = new Label("Politics");
	    lblPolitics.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblPolitics.setFont(new Font(20));
	    
	    Label lblDemocrats = new Label("Democrats");
	    lblDemocrats.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblDemocrats.setFont(new Font(12));
	    
	    Label lblRepublicans = new Label("Republicans");
	    lblRepublicans.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblRepublicans.setFont(new Font(12));
	    
	    Label lblDonaldTrump = new Label("Donald Trump");
	    lblDonaldTrump.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblDonaldTrump.setFont(new Font(12));
	    
	    Label lblCongress = new Label("Congress");
	    lblCongress.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblCongress.setFont(new Font(12));
		
	    Label lblWhiteHouse = new Label("White House");
	    lblWhiteHouse.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblWhiteHouse.setFont(new Font(12));
	    
	    
	    
		
		Label lblSports = new Label("Sports");
	    lblSports.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblSports.setFont(new Font(20));
	    
	    Label lblNBA = new Label("NBA");
	    lblNBA.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblNBA.setFont(new Font(12));
	    
	    Label lblNFL = new Label("NFL");
	    lblNFL.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblNFL.setFont(new Font(12));
	    
	    Label lblNHL = new Label("NHL");
	    lblNHL.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblNHL.setFont(new Font(12));
	    
	    Label lblMLB = new Label("MLB");
	    lblMLB.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblMLB.setFont(new Font(12));
		
		
		
	    
	    Label lblWeather = new Label("Weather");
	    lblWeather.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblWeather.setFont(new Font(20));
	    
	    Label lblClimateCrisis = new Label("Climate Change");
	    lblClimateCrisis.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblClimateCrisis.setFont(new Font(12));
	    
	    Label lblTornadoes= new Label("Tornadoes");
	    lblTornadoes.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblTornadoes.setFont(new Font(12));
	    
	    Label lblHurricanes = new Label("Hurricanes");
	    lblHurricanes.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblHurricanes.setFont(new Font(12));
	    
		
		
		
		Label lblJobs = new Label("Jobs");
	    lblJobs.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblJobs.setFont(new Font(20));
	    
	    Label lblUnemployment = new Label("Unemployment");
	    lblUnemployment.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblUnemployment.setFont(new Font(12));
	    
	    Label lblNewJobs = new Label("New Jobs");
	    lblNewJobs.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblNewJobs.setFont(new Font(12));
	    
	    Label lblAutomation = new Label("Automation");
	    lblAutomation.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblAutomation.setFont(new Font(12));
	    
	    
	    
		Label lblHealth = new Label("Health");
	    lblHealth.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblHealth.setFont(new Font(20));
	    
	    Label lblAbortion = new Label("Abortion");
	    lblAbortion.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblAbortion.setFont(new Font(12));
	    
	    Label lblCoronavirus = new Label("Coronavirus");
	    lblCoronavirus.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblCoronavirus.setFont(new Font(12));
	    Label lblWellness = new Label("Wellness");
	    lblWellness.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lblWellness.setFont(new Font(12));
	    
	    
	    
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
	    
	    gp.add(lblAI, 1, 2);
	    gp.setMargin(lblAI, new Insets(0, 0, 0, 30));
	    
	    gp.add(lblCryptoCurrency, 1, 3);
	    gp.setMargin(lblCryptoCurrency, new Insets(0, 0, 0, 30));
	    
	    gp.add(lblSpaceExploration, 1, 4);
	    gp.setMargin(lblSpaceExploration, new Insets(0, 0, 0, 30));
	    
	    
	    gp.add(lblPolitics, 2, 1);
	    
	    
	    gp.add(lblDemocrats, 2, 2);
	    gp.add(lblRepublicans, 2, 3);
	    gp.add(lblDonaldTrump, 2, 4);
	    gp.add(lblCongress, 2, 5);
	    
	    
	    
	    gp.add(lblSports, 3, 1);
	    
	    gp.add(lblNBA, 3, 2);
	    gp.setMargin(lblNBA, new Insets(0, 0, 0, 20));
	    
	    gp.add(lblNFL, 3, 3);
	    gp.setMargin(lblNFL, new Insets(0, 0, 0, 20));
	    
	    gp.add(lblNHL, 3, 4);
	    gp.setMargin(lblNHL, new Insets(0, 0, 0, 20));
	    
	    gp.add(lblMLB, 3, 5);
	    gp.setMargin(lblMLB, new Insets(0, 0, 0, 20));
	    
	    gp.add(lblWeather, 1, 7);
	    
	    

	    gp.setMargin(lblTechnology, new Insets(100, 0, 0, 0));
	    gp.setMargin(lblPolitics, new Insets(100, 0, 0, 0));
	    gp.setMargin(lblSports, new Insets(100, 0, 0, 0));
	    
	    
	    gp.setMargin(lblWeather, new Insets(100, 0, 0, 50));
	    
	    gp.add(lblClimateCrisis, 1, 8);
	    gp.setMargin(lblClimateCrisis, new Insets(0, 0, 0, 50));
	    
	    gp.add(lblHurricanes, 1, 9);
	    gp.setMargin(lblHurricanes, new Insets(0, 0, 0, 50));
	    
	    gp.add(lblTornadoes, 1, 10);
	    gp.setMargin(lblTornadoes, new Insets(0, 0, 0, 50));
	    
	    
	    gp.add(lblJobs, 2, 7);
	    gp.add(lblUnemployment, 2, 8);
	    gp.add(lblNewJobs, 2, 9);
	    gp.add(lblAutomation, 2, 10);
	    
	    gp.setMargin(lblJobs, new Insets(100, 0, 0, 0));
	    
	    gp.add(lblHealth, 3, 7);
	    gp.add(lblWellness, 3, 8);
	    gp.add(lblCoronavirus, 3, 9);
	    gp.add(lblAbortion, 3, 10);
	    
	    gp.setMargin(lblHealth, new Insets(100, 0, 0, 0));
	    
	    gp.setHgap(50);
	    
	    gp.setStyle("-fx-background-color: #000039");;
	    
	    Scene scene  = new Scene(gp,650,650);
		return scene;
	    
	    
		
	}
}