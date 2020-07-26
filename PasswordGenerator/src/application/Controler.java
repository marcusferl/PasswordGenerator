package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Controler {

	@FXML
	TextField input;
	@FXML
	TextField output;
	@FXML
	Text info;

	String zeichen = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!§$%&/()=?+#";
	Random r = new Random();
	char[] zeichenChar = zeichen.toCharArray();
	

	public void generate(ActionEvent event) {
		

		if (input.getText().matches("[0-9]*") && !input.getText().isEmpty()){
			StringBuilder stringbuilder = new StringBuilder();
			String inputString = input.getText();
			int inputToInt = Integer.parseInt(inputString);
			
			
			for (int i = 0; i < inputToInt ; i++) {
				char c = zeichenChar[r.nextInt(zeichenChar.length)];
			stringbuilder.append(c);
		}
		String password = stringbuilder.toString();	
		output.setText(password);
		info.setFill(Color.BLACK);
		info.setText("Wie lang soll das Passwort sein?");
				
		}else {
			info.setFill(Color.DARKRED);
			info.setText("Bitte Zahl oder Zahlen eingeben!");
		
		
		
	}
	}
}
