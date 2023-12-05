package com.solved.yuk.etc.bronze;
import java.io.*;

public class Bronze_30794 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int lv = Integer.parseInt(input[0]);
        if("bad".equals(input[1])) bw.write(lv*200+"");
        else if("cool".equals(input[1])) bw.write(lv*400+"");
        else if("great".equals(input[1])) bw.write(lv*600+"");
        else if("perfect".equals(input[1])) bw.write(lv*1000+"");
        else bw.write("0");
        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}