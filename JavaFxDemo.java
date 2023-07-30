/*
Program For JavaFx
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class JavaFxDemo
{
	public void start(Stage ps)
	{
		Label l1 = new Label("Hello World");
		StackPane root= new StakePane(l1);
		Scene sn = new Scene(root,400,500);
		ps.setScene(sn);
		ps.setTitle("StakePane+Label");
		ps.show();
	}
	public static void main(String args[])
	{
		launch("");
	}
}