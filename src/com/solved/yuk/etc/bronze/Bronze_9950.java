package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9950 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input, inputArr[];
        while (!"0 0 0".equals((input = br.readLine()))){
            inputArr = input.split(" ");
            int x = Integer.parseInt(inputArr[0]);
            int y = Integer.parseInt(inputArr[1]);
            int z = Integer.parseInt(inputArr[2]);
            if(x == 0) {
                x = z / y;
            }
            else if(y == 0) {
                y = z / x;
            }
            else if(z == 0) {
                z = x * y;
            }
            bw.write(x + " " + y + " " + z);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
