package view;

import java.util.Scanner;

import controller.MainController;

public class MainView {

	public static void main(String[] args) {
		//View 의 역할 : 사용자의 인터페이스(UI)
		//기능을 사용자가 선택할 수 있도록 만들기.
		//재생, 정지, 다음곡, 이전곡, 검색, 종료
		
		Boolean toggle = true;
		Scanner sc = new Scanner(System.in);
		MainController c = new MainController();
		int sel; // 사용자의 선택
		
		while(toggle) {
			System.out.print("[1]재생 [2]정지 [3]다음곡 [4]이전곡 [5]음악찾기 [6]가사보기 [7] 음악 삭제 [8]랜덤 Play [9]종료 >> ");
			sel = sc.nextInt();
			
			switch(sel) {
			case 1 :
				c.play();
				break;
				
			case 2:
				c.stop();
				break;
				
			case 3:
				c.next();
				break;
				
			case 4:
				c.pre();
				break;
				
			case 5:
				System.out.println("재생할 음악이름 >> ");
				c.search(sc.next());
				break;
				
			case 6:
				// 가사 보기
				c.musicL();
				break;
				
			case 7:
				System.out.println("삭제할 번호 입력해주세요.");
	            int num = sc.nextInt();
	            c.delete(num);
	            break;
	            
			case 8:
			    System.out.println("랜덤 재생 됩니다 ");
	            c.random();
	            break;
			
			default:
				if(toggle) { 
					c.stop(); // 노래 멈추고
					System.out.println("뮤직 플레이 종료합니다.");
					toggle = false;
				}
				break;
			}
			
		}
		
	}

}
