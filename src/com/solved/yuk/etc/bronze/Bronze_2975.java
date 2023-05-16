package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2975 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input, arr[];
        while (!"0 W 0".equals(input = br.readLine())){
            arr = input.split(" ");
            int x = Integer.parseInt(arr[0]),
                y = Integer.parseInt(arr[2]);
            if("W".equals(arr[1])) x -= y;
            else x += y;
            if(x < -200) bw.write("Not allowed\n");
            else bw.write(x+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

