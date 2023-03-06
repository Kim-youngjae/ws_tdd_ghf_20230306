package com.ll;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) { // main()에서 넘긴 Scanner로 생성자 초기화
        this.sc = sc;
    }

    public void run() { // 명언 앱 실행 시작
        System.out.println("== 명언 앱 ==");

        long lastWiseSayingId = 0; // 마지막 명언 id 값을 저장

        while (true) { // 계속해서 반복
            System.out.print("명령) ");

            String cmd = sc.nextLine().trim(); // 한 줄 단위로 입력 받는데 앞뒤 공백을 제거해줌

            if (cmd.isEmpty()) continue; // 명령어가 비어있으면 계속 입력받음

            switch (cmd) {
                case "종료":
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                case "등록":
                    System.out.print("명언 : ");
                    String content = sc.nextLine().trim();
                    System.out.print("작가 : ");
                    String authorName = sc.nextLine().trim();

                    long id = ++lastWiseSayingId;

                    System.out.printf("%d번 명언이 등록되었습니다.\n", id);
                    break;
                default:
                    System.out.printf("`%s`(은)는 올바르지 않은 명령입니다.\n", cmd);
                    break;
            }
        }
    }
}