package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Button;

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



    public void Spin (ActionEvent event){
        bt0.setText(Integer.toString(rd.nextInt(10)));
        bt1.setText(Integer.toString(rd.nextInt(10)));
        bt2.setText(Integer.toString(rd.nextInt(10)));
        bt3.setText(Integer.toString(rd.nextInt(10)));
        bt4.setText(Integer.toString(rd.nextInt(10)));
        bt5.setText(Integer.toString(rd.nextInt(10)));
        bt6.setText(Integer.toString(rd.nextInt(10)));
        bt7.setText(Integer.toString(rd.nextInt(10)));
        bt8.setText(Integer.toString(rd.nextInt(10)));
        bt9.setText(Integer.toString(rd.nextInt(10)));
        for (int i = 0 ; i < 10 ; i ++){
            if (bt1.getText().equals(bt0.getText())){
                bt1.setText(Integer.toString(rd.nextInt(10)));
            }else if (bt2.getText().equals(bt0.getText()) || bt2.getText().equals(bt1.getText())){
                bt2.setText(Integer.toString(rd.nextInt(10)));
            }else if (bt3.getText().equals(bt0.getText()) || bt3.getText().equals(bt1.getText()) || bt3.getText().equals(bt2.getText())){
                bt3.setText(Integer.toString(rd.nextInt(10)));
            }else if (bt4.getText().equals(bt0.getText()) || bt4.getText().equals(bt1.getText()) || bt4.getText().equals(bt2.getText()) || bt4.getText().equals(bt3.getText())){
                bt4.setText(Integer.toString(rd.nextInt(10)));
            }else if (bt5.getText().equals(bt0.getText()) || bt5.getText().equals(bt1.getText()) || bt5.getText().equals(bt2.getText()) || bt5.getText().equals(bt3.getText()) || bt5.getText().equals(bt4.getText())){
                bt5.setText(Integer.toString(rd.nextInt(10)));
            }else if (bt6.getText().equals(bt0.getText()) || bt6.getText().equals(bt1.getText()) || bt6.getText().equals(bt2.getText()) || bt6.getText().equals(bt3.getText()) || bt6.getText().equals(bt4.getText()) || bt6.getText().equals(bt5.getText())){
                bt6.setText(Integer.toString(rd.nextInt(10)));
            }else if (bt7.getText().equals(bt0.getText()) || bt7.getText().equals(bt1.getText()) || bt7.getText().equals(bt2.getText()) || bt7.getText().equals(bt3.getText()) || bt7.getText().equals(bt4.getText()) || bt7.getText().equals(bt5.getText()) || bt7.getText().equals(bt6.getText())){
                bt7.setText(Integer.toString(rd.nextInt(10)));
            }else if (bt8.getText().equals(bt0.getText()) || bt8.getText().equals(bt1.getText()) || bt8.getText().equals(bt2.getText()) || bt8.getText().equals(bt3.getText()) || bt8.getText().equals(bt4.getText()) || bt8.getText().equals(bt5.getText()) || bt8.getText().equals(bt6.getText()) || bt8.getText().equals(bt7.getText())){
                bt8.setText(Integer.toString(rd.nextInt(10)));
            }else if (bt9.getText().equals(bt0.getText()) || bt9.getText().equals(bt1.getText()) || bt9.getText().equals(bt2.getText()) || bt9.getText().equals(bt3.getText()) || bt9.getText().equals(bt4.getText()) || bt9.getText().equals(bt5.getText()) || bt9.getText().equals(bt6.getText()) || bt9.getText().equals(bt7.getText()) || bt9.getText().equals(bt8.getText())){
                bt9.setText(Integer.toString(rd.nextInt(10)));
            }
        }
    }
}
