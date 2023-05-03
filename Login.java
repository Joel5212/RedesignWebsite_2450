import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome to Hacker News");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label firstName = new Label("First Name:");
        grid.add(firstName, 0, 1);

        TextField firstNameTextField = new TextField();
        grid.add(firstNameTextField, 1, 1);

        Label lastName = new Label("Last Name:");
        grid.add(lastName, 0, 2);

        TextField lastNameTextField = new TextField();
        grid.add(lastNameTextField, 1, 2);

        Label age = new Label("Age:");
        grid.add(age, 0, 3);

        TextField ageTextField = new TextField();
        grid.add(ageTextField, 1, 3);

        Label email = new Label("Email Address:");
        grid.add(email, 0, 4);

        TextField emailTextField = new TextField();
        grid.add(emailTextField, 1, 4);

        Label phone = new Label("Phone Number:");
        grid.add(phone, 0, 5);

        TextField phoneTextField = new TextField();
        grid.add(phoneTextField, 1, 5);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 6);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 6);

        Label pw2 = new Label("Confirm Password:");
        grid.add(pw2, 0, 7);

        PasswordField pwBox2 = new PasswordField();
        grid.add(pwBox2, 1, 7);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 8);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 9);

        btn.setOnAction(e -> {
            if (firstNameTextField.getText().isEmpty() || lastNameTextField.getText().isEmpty() || ageTextField.getText().isEmpty() 
                    || emailTextField.getText().isEmpty() || phoneTextField.getText().isEmpty() || pwBox.getText().isEmpty() || pwBox2.getText().isEmpty()) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Please fill in all fields.");
            } else if (!pwBox.getText().equals(pwBox2.getText())) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Passwords do not match.");
            } else {
                actiontarget.setFill(Color.GREEN);
                actiontarget.setText("Sign in successful.");
            }
        });

        Scene scene = new Scene(grid, 400, 400);
        scene.getStylesheets().add(Login.class.getResource("style.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
