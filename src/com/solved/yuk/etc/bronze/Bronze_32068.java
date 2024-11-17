package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Bronze_32068 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        int l, r, s, ls, rs;
        StringTokenizer st;
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            l = Integer.parseInt(st.nextToken()); // 왼쪽 보물
            r = Integer.parseInt(st.nextToken()); // 오른쪽 보물
            s = Integer.parseInt(st.nextToken()); // 현재 위치

            ls = s - l; // 현재 위치에서 왼쪽 보물까지 거리
            rs = r - s; // 현재 위치에서 오른쪽 보물까지 거리

            if (ls < rs) { // 왼쪽이 더 가깝다면
                // 거리에 2배에 처음 시작때 조사를 하기 때문에 +1
                sb.append(ls * 2 + 1).append("\n");
            } else {
                // 거리 2배의 -1인데 처음 시작때 조사를 하기 때문에 +1
                sb.append(2 * rs).append("\n");
            }
        }

        bw.write(sb.toString());


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}