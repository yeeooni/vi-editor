

public class CalculatorService{

		private CalculatorController cc;
		private Calculator c;
		private int op; //연산자 구분 번호 +:1 -:2 *:3 /:4
		private double temp; //첫번째 받는 숫자의 값
		private double in; // 두번째 받는 숫자의 값
		private boolean state = true; // 한 자리 숫자 true / 두 자리 숫자 false
		private boolean opState = false; //연산자 버튼을 연속으로 누르면  true / 아니면 false
		private double result = 0; // 결과 값 저장
		private String numstr = ""; //연속으로 계산된 숫자를 받을 때 저장되는 변수
		

		//생성자
		public CalculatorService(CalculatorController calculatorController){
				cc = calculatorController;
				c = calculatorController.calculator;
		}
		
		//종료 메소드
		public void exit(){
			System.exit(0);
		}
		
		//지우기 메소드
		public void clear(){
			c.numL.setText("");
			temp = 0;
			in = 0;
			numstr = "";
		}
		
		/*public void opfalse(String str){
				if(str.equals("+")){
					c.numL.setText("숫자를 입력하세요.");
				} else if(str.equals("-")){
						c.numL.setText("숫자를 입력하세요. 제발요.");
				} else if(str.equals("*")){
						c.numL.setText("숫자를 입력하세요. 정말요.");
				} else if(str.equals("/")){
						c.numL.setText("숫자만 입력하라고. 얼른!");
				}
		}*/

		//숫자 유효성 검사 메소드
		public boolean inNumber(String str){
			boolean flag = true; //숫자이면 true / 숫자가 아니면 false		
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

		// 입력 메소드
		public void push(String str){
			//숫자가 한 숫자라면
				c.numL.setText(str);
				
				//숫자가 두자리 이상이면
				if(!state){
					c.numL.setText(str);
					numstr += str;
					c.numL.setText(numstr);
				}
		}

	// 연산 메소드
	public void operator(String str){
			
			if(str.equals("+")){
					c.operL.setText("+");
					op = 1;
					if(!opState)
					temp = (new Double(c.numL.getText())).doubleValue(); 
					opState = true;
					
			} else if(str.equals("-")){
					c.operL.setText("-");
					op = 2;
					if(!opState)
					temp = (new Double(c.numL.getText())).doubleValue(); 
					opState = true;

			} else if(str.equals("*")){
					c.operL.setText("*");
					op = 3;
					if(!opState)
						temp = (new Double(c.numL.getText())).doubleValue();
						opState = true;	

			} else if(str.equals("/")){
					c.operL.setText("/");
					op = 4;
					if(!opState)
						temp = (new Double(c.numL.getText())).doubleValue();
						opState = true;
			} 
				else {
				
					result();
					numstr = "";
					temp = (new Double(c.numL.getText())).doubleValue();
					state = false;
				
				}	
		}
			
		public void result(){
				
				in	=(new Double(c.numL.getText())).doubleValue();
			    
				switch(op){
						
					case 1: result = temp + in; break;
					case 2: result = temp - in; break;
					case 3: result = temp * in; break;
					case 4: result = temp / in; break;
						
				}
				c.numL.setText(result + "");
			//	c.numL.setText(numstr + "");
				temp = in;
				opState = false;
		}
	}

