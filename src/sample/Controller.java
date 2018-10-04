package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Random;

public class Controller {
    public Button bt0;
    public Button bt1;
    public Button bt2;
    public Button bt3;
    public Button bt4;
    public Button bt5;
    public Button bt6;
    public Button bt7;
    public Button bt8;
    public Button bt9;
    public Button spin;
    public Random rd = new Random();
    public int [] num = new int[10] ;



    public void Spin (ActionEvent event){
        for (int i = 0 ; i < 10 ; i ++){
            num[i] = rd.nextInt(10);
            for (int j = 0 ; j < i ; j ++ ){
                if (num[i] == num[j]){
                    num[i] = rd.nextInt(10);
                    j = -1 ;
                }
            }
        }
        bt0.setText(Integer.toString(num[0]));
        bt1.setText(Integer.toString(num[1]));
        bt2.setText(Integer.toString(num[2]));
        bt3.setText(Integer.toString(num[3]));
        bt4.setText(Integer.toString(num[4]));
        bt5.setText(Integer.toString(num[5]));
        bt6.setText(Integer.toString(num[6]));
        bt7.setText(Integer.toString(num[7]));
        bt8.setText(Integer.toString(num[8]));
        bt9.setText(Integer.toString(num[9]));

        try {
            Parent anotherRoot = FXMLLoader.load(getClass().getResource("new.fxml"));
            Stage anotherStage = new Stage();
            anotherStage.setTitle("Another Window Triggered by Clicking");
            anotherStage.setScene(new Scene(anotherRoot, 600, 329));
            anotherStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
