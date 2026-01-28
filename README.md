# BOJ
- Baekjoon Online Judge

## 개요
- 백준 문제 풀이 코드를 모아 놓은 리포지토리입니다.
- 모든 문제의 코드는 본 저자가 직접 작성한 코드입니다.
- 참고는 가능하나, 그대로 가져다 쓰는 치팅은 금지합니다.

## 템플릿
- 백준에서 권장하는 빠른 입출력 방식을 활용한 템플릿입니다.
```java
// Copyright 2024 @ https://velog.io/@bami/백준에서-자바-사용#최종-템플릿

import java.util.*;
import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
        }

        bw.write("정답");
        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
```