import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Test extends Application{
  
  Maze game = new Maze(10, 10, 5);
 public void start(Stage stage){
  BorderPane pane = new BorderPane();
  Scene scene = new Scene(pane);
  stage.setScene(scene);
  stage.setTitle("please work");
  stage.show();

  //move the player using the keyboard
  scene.setOnKeyPressed(e -> {
    String s = e.getCode().getName();
    if (s == "A" || s == "a" || s == "Left"){
        game.move(0);
        System.out.println(game);
        System.out.println("\n");
        System.out.println("\n");
    }
    
    if (s == "D" || s == "d" || s == "Right"){
        game.move(1);   
        System.out.println(game);
        System.out.println("\n");
        System.out.println("\n");
    }
    
    if (s == "S" || s == "s" || s == "Down"){
        game.move(2);
        System.out.println(game);
        System.out.println("\n");
        System.out.println("\n");
    }
    
    if (s == "W" || s == "w" || s == "Up"){
        game.move(3);
        System.out.println(game);
        System.out.println("\n");
        System.out.println("\n");
    }
    });
 }

 public static void main(String... args){
  Application.launch(args);
 }
}