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
		Object ob = e.getSource();
		String str = e.getActionCommand(); //이벤트가 발생하는 버튼을 문자열로 리턴
				
		Button b = (Button) ob;
		String bStr = b.getLabel();


		if(str.equals("종료")){
				calculatorService.exit();
		}

		else if(calculatorService.inNumber(str)){
				calculatorService.push(str);
			
		}
			else{
				calculatorService.operator(str);
			}
		
		if(str.equals("C")){
			calculatorService.clear();
		}
	
	}
}
