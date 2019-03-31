import java.awt.*;

public class Calculator extends Frame{

	//선언부
Panel pN = new Panel();
Panel pC = new Panel();
Panel pS = new Panel();

Label numL = new Label();
Label operL = new Label();

Button btn[] = new Button[16];
String num[] = {"7","8","9","+","4","5","6","-","1","2","3","*","0","C","=","/"};
Button exit = new Button("종료");

CalculatorController calculatorController;

public Calculator(){
		super("Calculator");
		//배치부
		pN.setLayout(new BorderLayout(5, 5));
		pN.add(numL, "Center");
		numL.setBackground(Color.GRAY);
		pN.add(operL, "East");
		pS.add(exit);

		pC.setLayout(new GridLayout(4, 4, 10, 10));
		
		int len = btn.length;
		for(int i = 0; i < len; i++){
				for(int j = 10; j < len; j++){

				btn[i] = new Button();
				btn[i].setLabel(num[i]);
				pC.add(btn[i]);
				btn[i].setBackground(new Color(153, 34 + j, 25 + j));
				j+= 10;
			}
		}

		add(pN, "North");
		add(pC, "Center");
		add(pS, "South");

		setBounds(300, 200, 300, 400);
		setVisible(true);

		calculatorController = new CalculatorController(this);
		exit.addActionListener(calculatorController);
	
		for(int i = 0; i <=15; i ++){
			btn[i].addActionListener(calculatorController);
		}


	}


public static void main(String [] agrs){
		new Calculator();
	}
}
