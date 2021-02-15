import javafx.application.Application;
import javafx.application.Platforms;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Menu{
  public void start(Stage stage){
    BorderPane pane = new BorderPane();
    Scene scene = new Scene(pane);
    stage.setScene(scene);
    stage.setTitle("please work");
    stage.show();
  }

 public static void main(String... args){
  Application.launch(args);
 }
}