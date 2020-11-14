package dad.inicio.mvc.app;

import dad.inicio.mvc.controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application{

	Controller controller=new Controller();
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene=new Scene(controller.getView(),320,150);
		primaryStage.setScene(scene);
		primaryStage.setTitle("inicio mvc");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
