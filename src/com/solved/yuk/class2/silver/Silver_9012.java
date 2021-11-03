package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.Stack;

public class Silver_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int N = Integer.parseInt(br.readLine());
        String input;
        for(int i = 0; i < N; i ++){
            input = br.readLine();
            if(isVPS(input)) bw.write("YES" + "\n");
            else bw.write("NO" + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static boolean isVPS(String sentence){
        Stack<Character> stack = new Stack<>();
        char word;
        for(int i = 0; i < sentence.length(); i++){
            word = sentence.charAt(i);
            if(stack.isEmpty() && word == ')') return false;
            else if(word == '(') stack.push(word);
            else if(stack.peek() == '(' && word == ')') stack.pop();
        }
        return stack.isEmpty();
    }
}
