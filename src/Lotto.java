import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
//		6개의 숫자 입력받기
		
		Scanner myScanner = new Scanner(System.in);
		for(int i =0; i < 6; i++) {
			while(true) {
			System.out.print((i+1) +"번째 숫자 : ");
			int inputNum = myScanner.nextInt();
			
			boolean isRangeOK = (1 <= inputNum) &&(inputNum <= 45);
			if(isRangeOK) {
				break;
			}
			}
		}
	}
}
