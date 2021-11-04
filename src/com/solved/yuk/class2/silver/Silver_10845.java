package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Silver_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        String[] input;
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            String command = input[0];
            if(command.equals("push")){
                int number = Integer.parseInt(input[1]);
                queue.offer(number);
                continue;
            }else if(command.equals("pop")){
                bw.write(queue.isEmpty()? "-1" : Integer.toString(queue.poll()));
            }else if(command.equals("size")){
                bw.write(Integer.toString(queue.size()));
            }else if(command.equals("empty")){
                bw.write(queue.isEmpty()? "1" : "0");
            }else if(command.equals("front")){
                bw.write(queue.isEmpty()? "-1" : Integer.toString(queue.peek()));
            }else if(command.equals("back")){
                bw.write(queue.isEmpty()? "-1" : Integer.toString((int)queue.toArray()[queue.size()-1]));
            }
            bw.newLine();
        }


        bw.flush();
        bw.close();
    }
}
