package controller;

import java.util.ArrayList;
import java.util.Random;

import javazoom.jl.player.MP3Player;
import model.MusicVO;

public class MainController {
	//controller의 역할 : 자료조작과 계산을 수행하는 비즈니스 로직.
	// View로부터 데이터를 받아서 가공하거나 처리하는 역할.
	// Model의 데이터를 수정하거나 가지고 오는 역할.
	
	//곡을 5개 저장할 수 있는 ArrayList 생성
	ArrayList<MusicVO> musicList = new ArrayList<MusicVO>(5);
	
	//노래를 재생 / 정지 할 수 있는 기능을 가진 객체.
	//Player.jar에 있는 MP3Player 클래스를 이용해 생성.
	MP3Player mp3 = new MP3Player();
	int index = 0;
	
	public MainController() {
		//Controller 객체가 생성되자마자 음악을 미리 준비하도록 하기 위해서.
		// 1. MusicVO 객체 생성.
		// 2. 해당 객체를 musicList라고하는 ArrayList에 add
		
		musicList.add(new MusicVO("I AM","아이브",3,"../Ex10MusicPlayer/musicList/IVE 아이브 I AM.mp3","다른 문을 열어 따라 갈 필요는 없어\r\n"
				+ "넌 너의 길로 난 나의 길로 음\r\n"
				+ "하루하루마다 색이 달라진 느낌\r\n"
				+ "밝게 빛이 나는 길을 찾아\r\n"
				+ "I'm on my way 넌 그냥 믿으면 돼\r\n"
				+ "I'm on my way 보이는 그대로야\r\n"
				+ "너는 누군가의 Dreams come true\r\n"
				+ "제일 좋은 어느 날의 데자뷰\r\n"
				+ "머물고픈 어딘가의 낯선 뷰\r\n"
				+ "I'll be far away\r\n"
				+ "That's my\r\n"
				+ "Life is 아름다운 갤럭시\r\n"
				+ "Be a writer, 장르로는 판타지\r\n"
				+ "내일 내게 열리는 건 big big 스테이지\r\n"
				+ "So that is who I am\r\n"
				+ "Look at me\r\n"
				+ "now\r\n"
				+ "어제랑 또 다른 짜릿한 나\r\n"
				+ "두려운 모든 게 설레이게\r\n"
				+ "I'm in sky high, OMG\r\n"
				+ "사소한 건 다 아득해져 와\r\n"
				+ "Look at me now\r\n"
				+ "I'm on fire\r\n"
				+ "I'm on my way 넌 그냥 믿으면 돼\r\n"
				+ "I'm on my way 보이는 그대로야\r\n"
				+ "너는 누군가의 Dreams come true\r\n"
				+ "제일 좋은 어느 날의 데자뷰\r\n"
				+ "머물고픈 어딘가의 낯선 뷰\r\n"
				+ "I'll be far away\r\n"
				+ "That's my\r\n"
				+ "Life is 아름다운 갤럭시\r\n"
				+ "Be a writer, 장르로는 판타지\r\n"
				+ "내일 내게 열리는 건 big big 스테이지\r\n"
				+ "So that is who I am\r\n"
				+ "어느 깊은 밤 길을 잃어도\r\n"
				+ "차라리 날아올라 그럼 네가\r\n"
				+ "지나가는 대로 길이거든\r\n"
				+ "1, 2, 3\r\n"
				+ "Fly up\r\n"
				+ "I hope you'd be someone's dreams come true\r\n"
				+ "제일 좋은 어느 날의 데자뷰\r\n"
				+ "머물고픈 어딘가의 낯선 뷰\r\n"
				+ "I'll be far away\r\n"
				+ "That's my\r\n"
				+ "Life is 아름다운 갤럭시\r\n"
				+ "Be a writer, 장르로는 판타지\r\n"
				+ "내일 내게 열리는 건 big big 스테이지\r\n"
				+ "So that is who I am"));
		musicList.add(new MusicVO("꽃","지수",3,"../Ex10MusicPlayer/src/musicList/JISOO  꽃.mp3","ABC 도레미만큼 착했던 나\r\n"
				+ "그 눈빛이 싹 변했지 어쩌면 이 또한 나니까\r\n"
				+ "난 파란 나비처럼 날아가\r\n"
				+ "잡지 못한 건 다 네 몫이니까\r\n"
				+ "활짝 꽃피웠던 시간도 이제 모두\r\n"
				+ "내겐 lie lie lie\r\n"
				+ "붉게 타버려진 너와 나\r\n"
				+ "난 괜찮아 넌 괜찮을까\r\n"
				+ "구름 한 점 없이 예쁜 날\r\n"
				+ "꽃향기만 남기고 갔단다\r\n"
				+ "꽃향기만 남기고 갔단다\r\n"
				+ "You and me, 미칠 듯이 뜨거웠지만\r\n"
				+ "처참하게 짓밟혀진 내 하나뿐인 라일락\r\n"
				+ "난 하얀 꽃잎처럼 날아가\r\n"
				+ "잡지 않은 것은 너니까\r\n"
				+ "살랑살랑 부는 바람에 이끌려\r\n"
				+ "봄은 오지만 우린 bye bye bye\r\n"
				+ "붉게 타버려진 너와 나\r\n"
				+ "난 괜찮아 넌 괜찮을까\r\n"
				+ "구름 한 점 없이 예쁜 날\r\n"
				+ "꽃향기만 남기고 갔단다\r\n"
				+ "꽃향기만 남기고 갔단다\r\n"
				+ "이젠 안녕 goodbye\r\n"
				+ "뒤는 절대 안 봐\r\n"
				+ "미련이란 이름의 잎새 하나\r\n"
				+ "봄비에 너에게서 떨어져\r\n"
				+ "꽃향기만 남아\r\n"
				+ "꽃향기만 남기고 갔단다"));
		musicList.add(new MusicVO("spicy","에스파",3,"../Ex10MusicPlayer/src/musicList/에스파 Spicy .mp3","\"Uh Uh Too Spicy\\r\\n\"\r\n"
				+ "				+ \"You want my A to the Z\\r\\n\"\r\n"
				+ "				+ \"But you won't 어림없지\\r\\n\"\r\n"
				+ "				+ \"맞혀봐 Sweet 또는 Freak\\r\\n\"\r\n"
				+ "				+ \"What's hiding underneath\\r\\n\"\r\n"
				+ "				+ \"(I see)\\r\\n\"\r\n"
				+ "				+ \"망설이듯 간 보는 너\\r\\n\"\r\n"
				+ "				+ \"기회는 없어 Oh\\r\\n\"\r\n"
				+ "				+ \"Nah You won't get it\\r\\n\"\r\n"
				+ "				+ \"No No, You won't get it\\r\\n\"\r\n"
				+ "				+ \"I say\\r\\n\"\r\n"
				+ "				+ \"깜빡 한순간\\r\\n\"\r\n"
				+ "				+ \"끌어당겨\\r\\n\"\r\n"
				+ "				+ \"You'll be mine (Mine)\\r\\n\"\r\n"
				+ "				+ \"살짝 다가와\\r\\n\"\r\n"
				+ "				+ \"Can cross my borderline\\r\\n\"\r\n"
				+ "				+ \"(Line Line Line)\\r\\n\"\r\n"
				+ "				+ \"널 따분하게 했던 Every day\\r\\n\"\r\n"
				+ "				+ \"흥미로운 덫을 던져줄게\\r\\n\"\r\n"
				+ "				+ \"뛰어들어 봐\\r\\n\"\r\n"
				+ "				+ \"Just right now\\r\\n\"\r\n"
				+ "				+ \"'Cause I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"for your heart\\r\\n\"\r\n"
				+ "				+ \"Ring the fire alarm\\r\\n\"\r\n"
				+ "				+ \"심장을 파고들어 넌\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"번지는 자극 속에 넌\\r\\n\"\r\n"
				+ "				+ \"바로 그 순간\\r\\n\"\r\n"
				+ "				+ \"또 다른 나를 발견해\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy too too\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"Don't Stop 겁내지 마\\r\\n\"\r\n"
				+ "				+ \"Bang Bang 외쳐봐\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"Yeah I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"You know that I\\r\\n\"\r\n"
				+ "				+ \"Don't Stop 용기 내 봐\\r\\n\"\r\n"
				+ "				+ \"Next step, Myself\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"Too Spicy too too\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"Tell me what you see\\r\\n\"\r\n"
				+ "				+ \"When you look at me\\r\\n\"\r\n"
				+ "				+ \"'Cause I am a 10\\r\\n\"\r\n"
				+ "				+ \"out of 10 honestly\\r\\n\"\r\n"
				+ "				+ \"기세가 다른 Move\\r\\n\"\r\n"
				+ "				+ \"널 압도하는 Groove\\r\\n\"\r\n"
				+ "				+ \"But you keep wasting\\r\\n\"\r\n"
				+ "				+ \"your time Dude\\r\\n\"\r\n"
				+ "				+ \"Don't chase me\\r\\n\"\r\n"
				+ "				+ \"경고해 난\\r\\n\"\r\n"
				+ "				+ \"Erase me\\r\\n\"\r\n"
				+ "				+ \"멀리 달아나\\r\\n\"\r\n"
				+ "				+ \"Hey 이젠 알겠니\\r\\n\"\r\n"
				+ "				+ \"원래부터 Bad I'm so bad honestly\\r\\n\"\r\n"
				+ "				+ \"So bad\\r\\n\"\r\n"
				+ "				+ \"전부 가질래\\r\\n\"\r\n"
				+ "				+ \"지금부턴\\r\\n\"\r\n"
				+ "				+ \"Call you mine (Mine)\\r\\n\"\r\n"
				+ "				+ \"도망칠 거면\\r\\n\"\r\n"
				+ "				+ \"Don't cross my borderline\\r\\n\"\r\n"
				+ "				+ \"(Line Line Line)\\r\\n\"\r\n"
				+ "				+ \"늘 뻔하기만 했던 Every day\\r\\n\"\r\n"
				+ "				+ \"이제 그만 Rule을 벗어날 때\\r\\n\"\r\n"
				+ "				+ \"어렵지 않아\\r\\n\"\r\n"
				+ "				+ \"Just right now\\r\\n\"\r\n"
				+ "				+ \"'Cause I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"for your heart\\r\\n\"\r\n"
				+ "				+ \"Ring the fire alarm\\r\\n\"\r\n"
				+ "				+ \"심장을 파고들어 넌\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"번지는 자극 속에 넌\\r\\n\"\r\n"
				+ "				+ \"바로 그 순간\\r\\n\"\r\n"
				+ "				+ \"또 다른 나를 발견해\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy too too\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"Ready? Uh\\r\\n\"\r\n"
				+ "				+ \"좀 더 강도를 높여\\r\\n\"\r\n"
				+ "				+ \"다음다음다음\\r\\n\"\r\n"
				+ "				+ \"One of a kind\\r\\n\"\r\n"
				+ "				+ \"우린 한계를 앞서\\r\\n\"\r\n"
				+ "				+ \"Wow Wow Wow\\r\\n\"\r\n"
				+ "				+ \"That's Right\\r\\n\"\r\n"
				+ "				+ \"'Cause I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"for your heart\\r\\n\"\r\n"
				+ "				+ \"Ring the fire alarm\\r\\n\"\r\n"
				+ "				+ \"새로운 도전 끝에 넌\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"변화할 시간이야 넌\\r\\n\"\r\n"
				+ "				+ \"지금 이 순간\\r\\n\"\r\n"
				+ "				+ \"또 다른 나를 찾아내\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy too too\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"Don't Stop 겁내지 마\\r\\n\"\r\n"
				+ "				+ \"Bang Bang 외쳐봐\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"Yeah I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"You know that I\\r\\n\"\r\n"
				+ "				+ \"Don't Stop 용기 내 봐\\r\\n\"\r\n"
				+ "				+ \"Next step, Myself\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy too too\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"'Cause I\\r\\n\"\r\n"
				+ "				+ \"Oh Yeah\\r\\n\"\r\n"
				+ "				+ \"Yeah I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"for your heart\\r\\n\"\r\n"
				+ "				+ \"(Yeah I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"for your heart)\\r\\n\"\r\n"
				+ "				+ \"마침내 번져오는 Joy\\r\\n\"\r\n"
				+ "				+ \"(Enjoy joy joy joy)\\r\\n\"\r\n"
				+ "				+ \"Yeah I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"for your heart\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy too too\\r\\n\"\r\n"
				+ "				+ \"I'm too Spicy\\r\\n\"\r\n"
				+ "				+ \"For you\""));
		musicList.add(new MusicVO("퀸카","여자아이들",4,"../Ex10MusicPlayer/musicList/여자아이들GIDLE  퀸카 .mp3","\"Hey you\\r\\n\"\r\n"
				+ "				+ \"뭘 보니? 내가 좀 Sexy Sexy 반했니\\r\\n\"\r\n"
				+ "				+ \"Ye you\\r\\n\"\r\n"
				+ "				+ \"뭐 하니? 너도 내 Kiss Kiss 원하니\\r\\n\"\r\n"
				+ "				+ \"월 화 수 목 금 토 일 미모가 쉬지를 않네\\r\\n\"\r\n"
				+ "				+ \"머리부터 발끝까지 눈부셔 빛이 나네\\r\\n\"\r\n"
				+ "				+ \"Oh 저기 언니야들 내 Fashion을 따라 하네\\r\\n\"\r\n"
				+ "				+ \"아름다운 여자의 하루는 다 아름답네\\r\\n\"\r\n"
				+ "				+ \"이 Party에 준비된 Birthday cake\\r\\n\"\r\n"
				+ "				+ \"태어나서 감사해 Every day\\r\\n\"\r\n"
				+ "				+ \"I don't need them\\r\\n\"\r\n"
				+ "				+ \"그래 내가 봐도 난\\r\\n\"\r\n"
				+ "				+ \"퀸카 I'm hot\\r\\n\"\r\n"
				+ "				+ \"My boob and booty is hot\\r\\n\"\r\n"
				+ "				+ \"Spotlight 날 봐\\r\\n\"\r\n"
				+ "				+ \"I'm a star star star\\r\\n\"\r\n"
				+ "				+ \"퀸카 I'm the top\\r\\n\"\r\n"
				+ "				+ \"I'm twerking on the runway\\r\\n\"\r\n"
				+ "				+ \"I am a 퀸카\\r\\n\"\r\n"
				+ "				+ \"You wanna be the 퀸카\\r\\n\"\r\n"
				+ "				+ \"I'm a 퀸카\\r\\n\"\r\n"
				+ "				+ \"I'm a 퀸카\\r\\n\"\r\n"
				+ "				+ \"I'm a I'm a I'm a 퀸카\\r\\n\"\r\n"
				+ "				+ \"I'm a 퀸카 (Take a photo)\\r\\n\"\r\n"
				+ "				+ \"I'm a 퀸카\\r\\n\"\r\n"
				+ "				+ \"I'm a 퀸카\\r\\n\"\r\n"
				+ "				+ \"I'm a I'm a I'm a 퀸카\\r\\n\"\r\n"
				+ "				+ \"I'm a 퀸카\\r\\n\"\r\n"
				+ "				+ \"Look so cool look so sexy like Kim Kardashian\\r\\n\"\r\n"
				+ "				+ \"Look so cute look so pretty like Ariana\\r\\n\"\r\n"
				+ "				+ \"I wanna with you 뽀뽀\\r\\n\"\r\n"
				+ "				+ \"I wanna with you 포옹\\r\\n\"\r\n"
				+ "				+ \"자꾸 예뻐져 거울 속 너어\\r\\n\"\r\n"
				+ "				+ \"이 Party에 준비된 Blue Champagne\\r\\n\"\r\n"
				+ "				+ \"태어난 걸 축하해 Every day\\r\\n\"\r\n"
				+ "				+ \"I don't need them\\r\\n\"\r\n"
				+ "				+ \"그래 내가 봐도 난\\r\\n\"\r\n"
				+ "				+ \"퀸카 I'm hot\\r\\n\"\r\n"
				+ "				+ \"My boob and booty is hot\\r\\n\"\r\n"
				+ "				+ \"Spotlight 날 봐\\r\\n\"\r\n"
				+ "				+ \"I'm a star star star\\r\\n\"\r\n"
				+ "				+ \"퀸카 I'm the top\\r\\n\"\r\n"
				+ "				+ \"I'm twerking on the runway\\r\\n\"\r\n"
				+ "				+ \"I am a 퀸카\\r\\n\"\r\n"
				+ "				+ \"You wanna be the 퀸카\\r\\n\"\r\n"
				+ "				+ \"I'm a 퀸카\\r\\n\"\r\n"
				+ "				+ \"I'm a 퀸카\\r\\n\"\r\n"
				+ "				+ \"I'm a I'm a I'm a 퀸카\\r\\n\"\r\n"
				+ "				+ \"I'm a 퀸카 (Take a photo)\\r\\n\"\r\n"
				+ "				+ \"I'm a 퀸카\\r\\n\"\r\n"
				+ "				+ \"I'm a 퀸카\\r\\n\"\r\n"
				+ "				+ \"I'm a I'm a I'm a 퀸카\\r\\n\"\r\n"
				+ "				+ \"I'm a 퀸카\\r\\n\"\r\n"
				+ "				+ \"아무거나 걸친 Girl 퀸카카카\\r\\n\"\r\n"
				+ "				+ \"마르거나 살찐 Girl 퀸카카카\\r\\n\"\r\n"
				+ "				+ \"자신감 넘치는 Girl 퀸카카카\\r\\n\"\r\n"
				+ "				+ \"I am a 퀸카\\r\\n\"\r\n"
				+ "				+ \"You wanna be the 퀸카\""));
		
	}
	
	
	//재생
	public void play() {
		//현재 재생중인 음악이 있는지 확인하기
		if(mp3.isPlaying()) {
			//재생중인 음악 정지
			mp3.stop();
		}
		
		//index가 가리키고 있는 위치에 음악을 재생
		mp3.play(musicList.get(index).getMusicPath());
		show();
	}
	
	
	// 정지
	public void stop() {
		mp3.stop();
		
	}
	
	// 다음곡
	public void next() {
		if(mp3.isPlaying()) { // 실행중인곡 있다면 정지. 
			mp3.stop();
		}
		
		if(index < musicList.size() - 1) {
			index++;
		} else { index = 0; }
		mp3.play(musicList.get(index).getMusicPath());
		show();
		
	}
	
	// 이전 곡
	public void pre() {
		if(mp3.isPlaying()) { mp3.stop(); }
		if(index > 0) {
			index--;
		}else { // index == 0일 경우
			index = musicList.size()- 1; // 0번곡 일때 이전 곡을 재생할때는 마지막 곡으로 이동
		}
		mp3.play(musicList.get(index).getMusicPath());
		show();
	}
		
	
    // 곡정보 출력
	// public, private 접근제한자 둘다 사용 가능 호출하는 건 같은 class안이기 때문
	private void show() {
		System.out.println(musicList.get(index).getTitle()+" - "+musicList.get(index).getSinger() + 
				" "+musicList.get(index).getPlaytime()+ "분" );
	}
	
	
	// 가사
	public void musicL() {
		System.out.println(musicList.get(index).getLyrics());
	}
	
		
	// 음악 이름 찾아 재생하기
	public void search(String name) {
		for(int i=0; i< musicList.size(); i++) {
			MusicVO music = musicList.get(i);
			if(music.getTitle().equals(name)) {
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(music.getMusicPath());
				index = i; // 다음곡, 이전곡 재생 하기 위해서 넣어줌. 현재 위치확인.
				show();
			}
		}
	}
	
	
	// 랜덤 재생하기
		public void random() {
			Random rd = new Random();
			index = rd.nextInt(musicList.size());
     //		System.out.println(index);
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play(musicList.get(index).getMusicPath());
			show();
		}
		
		
	// 원하는 곡 삭제
	public void delete(int num) {
      musicList.remove(num);
      System.out.println("삭제 되었습니다.");
      System.out.println("남아있는 곡 : " +musicList.size());
    }
	
	
	
		// 리 스타트
//		public void restart() {
//			if(!mp3.isPlaying()) {
//				
////				mp3.play(musicList.get(index).getMusicPath());
//				show();
//			}
//			
//		}
		
}
