package admin;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import users.User;

public class AdminController {

	@FXML
	private TextField CreateUserInput;
	
	@FXML
	private Label UserNameLabel;
	
	@FXML
	private Label NumAlbumsLabel;
	
	@FXML
	private ListView<User> UserList;
	
	@FXML
	private Button AddButton;
	
	@FXML
	private Button ClearButton;
	
	@FXML
	private Button LogOutButton;
	
	@FXML
	private Button QuitButton;
	
	public void start(Stage MainStage) {
		
	}
	
	
	
}
