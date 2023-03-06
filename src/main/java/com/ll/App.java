package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) { // main()에서 넘긴 Scanner로 생성자 초기화
        this.sc = sc;
    }

    public void run() { // 명언 앱 실행 시작
        System.out.println("== 명언 앱 ==");

        long lastWiseSayingId = 0; // 마지막 명언 id 값을 저장
        List<WiseSaying> wiseSayingList = new ArrayList<>();
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
                    wiseSayingList.add(new WiseSaying(id, content, authorName));

                    System.out.printf("%d번 명언이 등록되었습니다.\n", id);
                    break;
                case "목록":
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("-".repeat(30));
                    for (int i = wiseSayingList.size() - 1; i >= 0; i--) {
                        System.out.printf("%d / %s / %s\n", wiseSayingList.get(i).getId(), wiseSayingList.get(i).getAuthorName(), wiseSayingList.get(i).getContents());
                    }
                    break;
                default:
                    System.out.printf("`%s`(은)는 올바르지 않은 명령입니다.\n", cmd);
                    break;
            }
        }
    }
}