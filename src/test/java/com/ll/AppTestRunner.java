package com.ll;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTestRunner {

    public static String run(String cmd) { // t3, t4테스트 케이스 중복코드를 따로 뺌
        cmd.stripIndent();
        cmd += "\n종료"; // 마지막은 항상 종료 될 수 있도록

        Scanner sc = TestUtil.genScanner(cmd);
        ByteArrayOutputStream output = TestUtil.setOutToByteArray();

        new App(sc).run(); // 어플 시작

        String rs = output.toString();
        TestUtil.clearSetOutToByteArray(output);

        return rs;
    }
}
