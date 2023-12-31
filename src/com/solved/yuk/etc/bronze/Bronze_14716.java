package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14716 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]),
            y = Integer.parseInt(input[1]),
            z = Integer.parseInt(input[2]);
        for(int i = 1; i <= z; i ++){
            if(i % x == 0 && i % y == 0) bw.write("FizzBuzz");
            else if (i % x == 0) bw.write("Fizz");
            else if (i % y == 0) bw.write("Buzz");
            else bw.write(i+"");
            bw.newLine();
        }



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

