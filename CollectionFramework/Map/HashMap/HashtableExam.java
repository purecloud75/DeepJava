package Map.HashMap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExam {
    public static void main(String[] args) {

        Map<String,String> map = new Hashtable<>();

        map.put("spring","aa");
        map.put("summer","bb");
        map.put("fall","cc");
        map.put("winter","dd");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("아이디하고 비밀번호 입력하십시오");
            System.out.println("아이디 : ");
            String id = scanner.nextLine();

            System.out.println("비밀번호 : ");
            String password = scanner.nextLine();

            if(map.containsKey(id)) {
                if(map.get(id).equals(password)) {
                    System.out.println("로그인되었습니다.");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다");
                }
            } else {
                System.out.println("입력하신 아이디가 존재하지 않습니다.");
            }
        }
    }
}

/*
List 컬렉션 중에서 Vector 클래스와 똑같은 포지션.
HashMap 과 똑같은친구인데 동기화메소드로 구성되어있어서 멀티스레드 환경엣 안정하다.
id 를 키로, 비번을 값으로 여긴듯
 */
