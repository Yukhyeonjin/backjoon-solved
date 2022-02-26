package com.solved.yuk.class3.silver;

import java.io.*;

public class Silver_1074 {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // class3
        // 재귀 문제
        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            r = Integer.parseInt(input[1]),
            c = Integer.parseInt(input[2]),
            size = (int)Math.pow(2,N); // 한 변의 길이
        find(size,r,c);
        bw.write(count+"");
        bw.flush();
        bw.close();
    }

    public static void find(int size, int r, int c){
        if(size == 1) return;
        if(r < size /2 && c < size /2){ // 1사분면
            find(size / 2, r, c);
        }else if(r < size /2 && c >= size /2){ // 2사분면
            count += size * size / 4;
            find(size / 2, r, c - size/2);
        }else if(r >= size /2 && c < size /2){ // 3사분면
            count += (size * size / 4)*2;
            find(size / 2, r - size/2, c);
        }else if(r >= size /2 && c >= size /2){ // 4사분면
            count +=( size * size / 4)*3;
            find(size / 2, r - size/2, c - size/2);
        }
    }
}
