package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.Stack;

public class Silver_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        int inputNumber;
        for(int i = 0; i < K; i ++){
            inputNumber = Integer.parseInt(br.readLine());
            if(inputNumber == 0){
                if(!stack.isEmpty()) stack.pop();
            }else {
                stack.push(inputNumber);
            }
        }
        int sum = 0;
        while (!stack.isEmpty()){
            sum+=stack.pop();
        }
        bw.write(Integer.toString(sum));

        bw.flush();
        bw.close();
    }

}
