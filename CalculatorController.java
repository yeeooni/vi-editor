import java.awt.*;
import java.awt.event.*;

public class CalculatorController implements ActionListener{

	Calculator calculator;
	CalculatorService calculatorService;


	public CalculatorController(Calculator calculator){
			this.calculator = calculator;
			calculatorService = new CalculatorService(this);
	}

	@Override
	public void actionPerformed(ActionEvent e){
//		Object ob = e.getSource();
//		Button b = (Button) ob;
//		String bStr = b.getLabel();
		String str = e.getActionCommand(); //이벤트가 발생하는 버튼을 문자열로 리턴		



		if(str.equals("종료")){
				calculatorService.exit();
		}
		
		if(str.equals("C")){
			calculatorService.clear();		
		
		}

		//	calculator.numL.setText("");

		if(calculatorService.inNumber(str)){
				calculatorService.push(str);		
			//	calculatorService.operator(str)
		}
		else{
				//calculatorService.opfalse(str);
				//calculatorService.clear();
				calculatorService.operator(str);
			}
						
			/*if(str.equals("+")){
				calculatorService.inNumber(str);
				return;
			} else if(str.equals("-")){
				calculatorService.inNumber(str);
				return;
			} else if(str.equals("-")){
				calculatorService.inNumber(str);
				return;
			}*/
	}
}
