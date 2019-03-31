

public class CalculatorService{

		private CalculatorController cc;
		private Calculator c;
		private int op; //연산자 구분 번호 +:1 -:2 *:3 /:4
		private double temp; //숫자 저장소 
		private boolean state = true; //사용자가 숫자버튼을 연속적으로 눌렀는지 검사 true 면 한자리 false 면 두자리
		private boolean opState = true; //연산자 버튼을 연속으로 눌렀는지 검사 연속으로 누른다면 true

		public CalculatorService(CalculatorController calculatorController){
				cc = calculatorController;
				c = calculatorController.calculator;
		}
		
		public void exit(){
			System.exit(0);
		}
		
		public void clear(){
			c.numL.setText("");
			temp = 0;
		}

		public boolean inNumber(String str){
				boolean flag = true;

				int len = str.length();
				for (int i = 0; i < len; i++){
						int number = str.charAt(i) - 48;
						if( number < 0 || number > 9){
								flag = false;
								break;
						}
				}
				return flag;
		}

		public void push(String str){
		
				if(state) {
						
						c.numL.setText(str);
				} else {
						c.numL.setText(c.numL.getText() + str);
						state = false;
				}
		}

	public void operator(String str){
			if(str.equals("+")){
					op = 1;
					if(opState) result();
					opState = true;
					c.operL.setText("+");
			} else if(str.equals("-")){
					op = 2;
					if(opState) result();
					opState = true;
			}/* else if(str.equlas("*")){
					op = 3;
					if(opState) result();
					opState = true;
			} else if(str.equlas("/")){
					op = 4;
					if(opState) result();
					opState = true;
			}*/ else {
					result();
			}
			temp = (new Double(c.numL.getText())).doubleValue();
			state = true;
		}
			
		public void result(){
				double result = 0;
				double in = (new Double(c.numL.getText())).doubleValue();

				switch(op){
						case 1: result = temp + in; break;
						case 2: result = temp - in; break;
						case 3: result = temp * in; break;
						case 4: result = temp / in; break;
				} c.numL.setText(result + "");
					opState = false;
		}
	}

