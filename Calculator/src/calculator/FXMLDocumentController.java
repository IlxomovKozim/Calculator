package calculator;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    public JFXButton one;
    public JFXButton two;
    public JFXButton three;
    public JFXButton four;
    public JFXButton five;
    public JFXButton six;
    public JFXButton seven;
    public JFXButton eight;
    public JFXButton nine;
    public JFXButton zero;
    
    public JFXButton point;
    public JFXButton C;
    public JFXButton plus;
    public JFXButton minus;
    public JFXButton mul;
    public JFXButton div;
    public JFXTextField input;
    public Label prom;
    
    private long fnumber;
    private long snumber;
    private String operation;

    @Override

public void initialize(URL arg0, ResourceBundle arg1) {   
    }
     public void one_click(){
         String oldvalue = input.getText();
         String set = "1";
         input.setText(oldvalue + set);
    }
     public void two_click(){
         String oldvalue = input.getText();
         String set = "2";
         input.setText(oldvalue + set);
    }
     public void three_click(){
         String oldvalue = input.getText();
         String set = "3";
         input.setText(oldvalue + set);
    }
     public void four_click(){
         String oldvalue = input.getText();
         String set = "4";
         input.setText(oldvalue + set);
    }
     public void five_click(){
         String oldvalue = input.getText();
         String set = "5";
         input.setText(oldvalue + set);
    }
      public void six_click(){
         String oldvalue = input.getText();
         String set = "6";
         input.setText(oldvalue + set);
    }
     public void seven_click(){
         String oldvalue = input.getText();
         String set = "7";
         input.setText(oldvalue + set);
    }
     public void eight_click(){
         String oldvalue = input.getText();
         String set = "8";
         input.setText(oldvalue + set);
    }
     public void nine_click(){
         String oldvalue = input.getText();
         String set = "9";
         input.setText(oldvalue + set);
    }
     public void zero_click(){
         String oldvalue = input.getText();
         String set = "0";
         input.setText(oldvalue + set);
    }
     public void point_click(){
         String oldvalue = input.getText();
         String set = ".";
         input.setText(oldvalue + set);
    }
     public void C_click(){
         input.setText("");
         prom.setText("");
         this.fnumber = 0;
         this.snumber = 0;
     }
      public void plus_click(){
         String value = input.getText();
         long valuenumber = Integer.parseInt(value);
         this.fnumber = valuenumber;
         input.setText("");
         prom.setText(value + "+");
         operation = "+";
    }
     public void minus_click(){
         String value = input.getText();
         long valuenumber = Integer.parseInt(value);
         this.fnumber = valuenumber;
         input.setText("");
         prom.setText(value + "-");
         operation = "-";
    }
     public void mul_click(){
         String value = input.getText();
         long valuenumber = Integer.parseInt(value);
         this.fnumber = valuenumber;
         input.setText("");
         prom.setText(value + "×");
         operation = "×";
    }
    public void div_click(){
         String value = input.getText();
         long valuenumber = Integer.parseInt(value);
         this.fnumber = valuenumber;
         input.setText("");
         prom.setText(value + "÷");
         operation = "÷";
    }
     public void equal_click(){
         switch(operation){
             case "+":
                 String value = input.getText();
                 this.snumber = Integer.parseInt(value);
                 long system = this.fnumber + this.snumber;
                 input.setText(String.valueOf(system));
                 String oldprom = prom.getText();
                 prom.setText(oldprom + value);
                 break;
             case "-":
                 String valuem = input.getText();
                 this.snumber = Integer.parseInt(valuem);
                 long systemm = this.fnumber - this.snumber;
                 input.setText(String.valueOf(systemm));
                 String oldpromm = prom.getText();
                 prom.setText(oldpromm + valuem);
                 break;
             case "×":
                 String valueml = input.getText();
                 this.snumber = Integer.parseInt(valueml);
                 long systemml = this.fnumber * this.snumber;
                 input.setText(String.valueOf(systemml));
                 String oldpromml = prom.getText();
                 prom.setText(oldpromml + valueml);
                 break;
             case "÷":
                 String valued = input.getText();
                 this.snumber = Integer.parseInt(valued);
                 long systemd = this.fnumber / this.snumber;
                 input.setText(String.valueOf(systemd));
                 String oldpromd = prom.getText();
                 prom.setText(oldpromd + valued);
                 break;
         }
    }
     
    }
     
