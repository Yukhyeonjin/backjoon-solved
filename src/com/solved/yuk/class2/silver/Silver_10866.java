package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Silver_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        String[] input;
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            String command = input[0];
            if(command.equals("push_front")){
                int number = Integer.parseInt(input[1]);
                deque.offerFirst(number);
                continue;
            }else if(command.equals("push_back")){
                int number = Integer.parseInt(input[1]);
                deque.offerLast(number);
                continue;
            }else if(command.equals("pop_front")){
                bw.write(deque.isEmpty()? "-1" : Integer.toString(deque.pollFirst()));
            }else if(command.equals("pop_back")){
                bw.write(deque.isEmpty()? "-1" : Integer.toString(deque.pollLast()));
            }else if(command.equals("size")){
                bw.write(Integer.toString(deque.size()));
            }else if(command.equals("empty")){
                bw.write(deque.isEmpty()? "1" : "0");
            }else if(command.equals("front")){
                bw.write(deque.isEmpty()? "-1" : Integer.toString(deque.peekFirst()));
            }else if(command.equals("back")){
                bw.write(deque.isEmpty()? "-1" : Integer.toString(deque.peekLast()));
            }
            bw.newLine();
        }


        bw.flush();
        bw.close();
    }
}
