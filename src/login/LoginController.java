package login;


import java.io.IOException;

import admin.AdminController;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utility.buttonUtility;

public class LoginController {
	
	@FXML 
	private TextField userNameInput;
	
	@FXML
	private Button LoginButton;
	
	@FXML
	private Button QuitButton;
	
	public void start(Stage mainStage) {
		userNameInput.setText("test");
	}
	
	public void login(Stage stage, ActionEvent E) throws IOException  {
		
		String username = userNameInput.getText();
		
		if(username.equals("admin")) {// User is admin
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(buttonUtility.class.getResource("/admin/admin.fxml"));
			Parent root = null;
					try {
						root = loader.load();
					} catch(IOException e) {
						e.printStackTrace();
					}
			
			AdminController controller = loader.getController();
			controller.start(stage);
			stage.setScene(new Scene(root));
			stage.show();
		}
	}

	public LoginController() {
		
		// TODO Auto-generated constructor stub
	}

}
