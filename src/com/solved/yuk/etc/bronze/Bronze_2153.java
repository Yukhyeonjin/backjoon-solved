package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2153 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int sum = 0;
        for(int i = 0; i < input.length(); i ++){
            int number = (int)input.charAt(i);
            if(number >= 97) {
                number-=96;
            }else {
                number-=64;
                number+=26;
            }
            sum+=number;
        }
        boolean flag = true;
        for(int i = 2; i <= sum/2; i++){
            if(sum % i == 0) {
                flag = false;
                break;
            }
        }
        String result = flag ? "It is a prime word." : "It is not a prime word.";
        bw.write(result);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

