package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.Stack;

public class Silver_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int n = Integer.parseInt(br.readLine()),
                stackInputNumber = 1, lineNumber;
        Stack<Integer> stack = new Stack<>();
        StringBuilder output = new StringBuilder();
        for(int line = 0; line < n; line++){
            lineNumber = Integer.parseInt(br.readLine());
            if(lineNumber >= stackInputNumber){
                for(int i = stackInputNumber; i <= lineNumber; i ++){
                    stack.push(i);
                    output.append("+\n");
                }
                stackInputNumber = lineNumber+1;
            }else if(stack.peek() != lineNumber){
                output = new StringBuilder();
                output.append("NO");
                break;
            }
            stack.pop();
            output.append("-\n");
        }
        bw.write(output.toString());

        bw.flush();
        bw.close();
    }
}
