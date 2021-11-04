package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.Stack;

public class Silver_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        String[] input;
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            String command = input[0];
            if(command.equals("push")){
                int number = Integer.parseInt(input[1]);
                stack.push(number);
                continue;
            }else if(command.equals("pop")){
                bw.write(stack.isEmpty()? "-1" : Integer.toString(stack.pop()));
            }else if(command.equals("size")){
                bw.write(Integer.toString(stack.size()));
            }else if(command.equals("empty")){
                bw.write(stack.isEmpty()? "1" : "0");
            }else if(command.equals("top")){
                bw.write(stack.isEmpty()? "-1" : Integer.toString(stack.peek()));
            }
            bw.newLine();
        }


        bw.flush();
        bw.close();
    }
}
