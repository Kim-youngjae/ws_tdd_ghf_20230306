package com.ll;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class TestUtil {
    // gen == generate 생성하다.
    public static Scanner genScanner(String input) { // 우리가 프로그램 실행했을 때 프로그램이 자동으로 입력을 넣어주도록 해줌
        InputStream in = new ByteArrayInputStream(input.getBytes()); // ByteArrayInputStream을 이용해서 리턴받은 문자열을 Scanner에 자동으로 넣어줌
        // 테스트 자동화 시 자동 입력을 하기 위함

        return new Scanner(in); // System.in -> 이건 키보드에서 입력을 받는 것
    }
}