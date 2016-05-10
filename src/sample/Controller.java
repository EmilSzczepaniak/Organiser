package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;


import java.time.LocalDate;
import java.util.Random;

public class Controller {
    LocalDate data;
    @FXML
    private Label myMessage;
    public void generateRandom(ActionEvent event){
    Random rand  = new Random();
        int myrand = rand.nextInt(50) + 1;

    }
    public void getDate(ActionEvent event){
        DatePicker datePicker = new DatePicker();
        datePicker.setOnAction(e -> {
            data = datePicker.getValue();
            System.out.println(data);
        });
        StackPane root = new StackPane();
        root.getChildren().add(datePicker);


}
}
