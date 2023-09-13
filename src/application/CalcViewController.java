package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcViewController {
	@FXML
	private TextField affichag;
	private CalculatorModel theModel = new CalculatorModel();
	
	double num1=0, num2=0;
	String operator="", str1="";

	// Event Listener on Button.onAction
	@FXML
	private void CalculateListener(ActionEvent e) {
		String affichage = affichag.getText();

		Button btn = (Button) e.getSource();
		String btnTxt = btn.getText();
		
		if(btnTxt.equals("0")||btnTxt.equals("1")||btnTxt.equals("2")||btnTxt.equals("3")||btnTxt.equals("4")||btnTxt.equals("5")||btnTxt.equals("6")||btnTxt.equals("7")||btnTxt.equals("8")||btnTxt.equals("9"))
		{
			affichag.setText(affichage + btnTxt);
			str1=str1 + btnTxt; //e.getActionCommand()
		}
		if(btnTxt.equals("+")||btnTxt.equals("-")||btnTxt.equals("/")||btnTxt.equals("*")) {
			num1=Double.parseDouble(affichage);
			operator=btnTxt;
			affichag.setText(affichage + btnTxt);
			str1="";
		}
		
		if(btnTxt.equals("=")) {
			num2=Double.parseDouble(str1);
			switch(operator) {
			case "+": theModel.addTwoNumbers1(num1, num2);
			          break;
			case "-": theModel.subtractTwoNumbers1(num1, num2);
	                  break;
			case "*": theModel.multiplyTwoNumbers1(num1, num2);
	                  break;
			case "/": if(str1.equals("0")) {
						affichag.setText("Error");
						return;
					  }
					  else theModel.divideTwoNumbers1(num1, num2);
	                  break;
			}
			affichag.setText(""+ theModel.getCalculationValue1());
			num1=theModel.getCalculationValue1();
		}
		if(btnTxt.equals("C")) {
			affichag.setText("");
		}
			
	}
	
	
}
