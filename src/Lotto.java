import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
//		6개의 숫자 입력받기
		
		int[] myNumbers = new int[6];
		
		Scanner myScanner = new Scanner(System.in);
		for(int i =0; i < myNumbers.length; i++) {
			while(true) {
			System.out.print((i+1) +"번째 숫자 : ");
			int inputNum = myScanner.nextInt();
			
			boolean isRangeOK = (1 <= inputNum) &&(inputNum <= 45);
			boolean isDupok = true;
			for(int myNum : myNumbers) {
				if(myNum == inputNum) {
					isDupok = false;
					break;
				}
			}
			if(isRangeOK && isDupok) {
				myNumbers[i] = inputNum;
				
				break;
			}
			}
		}
		
		
		int[] winNumber = new int[6];
		for(int i = 0; i < winNumber.length; i ++) {
			while(true) {
//				Math.random() => 0 <= 랜덤값 < 1
//				cf) Random 클래스를 활용해도 됨
				int randomNum = (int) (Math.random() * 45 + 1);
				
				boolean isDuplOk = true;
				
				for(int num : winNumber) {
					if(num == randomNum) {
						isDuplOk = false;
								break;
					}
				}
				if(isDuplOk) {
					winNumber[i] = randomNum;
					break;
				}
				
			}
		}
		for(int num : winNumber) {
			System.out.println(num);
		}
		
	}
}
