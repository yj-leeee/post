package one;

import java.util.Scanner;

public class sinbun {
//본인신분증
	static Scanner scanner = new Scanner(System.in);
	static gongdong.receive noreceive = new gongdong.receive();
	
	public void sinbun() {
		// TODO Auto-generated method stub
		System.out.println("신분증을 지참하셨습니까?");
		System.out.println("네 : 1 \n아니요 : 2");
		int firstsinbun = scanner.nextInt();
		scanner.nextLine();
		
		switch(firstsinbun) {
		case 1 : //다음단계 진행
			
		case 2 : //등기수령 불가
			noreceive.receive();
		}
		
	}
	
}
