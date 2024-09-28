package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28702 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 0;
        for (int i = 0; i < 3; i++){
            String input = br.readLine();
            if(!"FizzBuzz".equals(input) && !"Fizz".equals(input) && !"Buzz".equals(input)) {
                num = Integer.parseInt(input) + (3-i);
                break;
            }
        }
        if(num % 3 == 0 && num % 5 == 0) bw.write("FizzBuzz");
        else if (num % 3 == 0) bw.write("Fizz");
        else if (num % 5 == 0) bw.write("Buzz");
        else bw.write(num+"");

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}