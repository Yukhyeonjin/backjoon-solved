package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.Stack;

public class Silver_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        String input;
        Stack<Character> stack;
        boolean flag;
        while (true){
            input = br.readLine();
            if(input.equals(".")) break;
            else if(input.contains("(") || input.contains(")") || input.contains("[") || input.contains("]")) {
                stack = new Stack<>();
                boolean stackFlag = false;
                for(int i = 0; i < input.length(); i ++){
                    char character = input.charAt(i);
                    if(character == '(' || character == '[') {
                        stack.push(character);
                    } else if(!stack.isEmpty() && ((character == ')' && stack.peek() == '(') || (character == ']' && stack.peek() == '['))){
                        stack.pop();
                        stackFlag = true;
                    } else if(!stack.isEmpty() && ((character == ')' && stack.peek() == '[') || (character == ']' && stack.peek() == '('))){
                        stackFlag = false;
                        break;
                    } else if(stack.isEmpty() && (character == ')' || character == ']')){
                        stackFlag = false;
                        break;
                    }
                }
                if(stackFlag && stack.isEmpty()) bw.write("yes" + "\n");
                else bw.write("no" + "\n");
            }
            else bw.write("yes"+"\n");
        }
        bw.flush();
        bw.close();
    }

}
