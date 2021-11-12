package com.solved.yuk.class3.silver;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Silver_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        int M = Integer.parseInt(br.readLine()), number;
        String[] input; String command;
        Set<Integer> set = new HashSet<>(),
                changeSet = new HashSet<>();
        for(int i = 1; i <= 20; i ++) changeSet.add(i);
        StringBuilder returnText = new StringBuilder();
        for(int i = 0; i < M; i ++){
            input = br.readLine().split(" ");
            command = input[0];
            if(input.length == 2){
                number = Integer.parseInt(input[1]);
                if(command.equals("add")){
                    set.add(number);
                }else if(command.equals("remove")){
                    set.remove(number);
                }else if(command.equals("check")){
                    if(set.contains(number)){
                        returnText.append("1\n");
                    }else {
                        returnText.append("0\n");
                    }
                }else if(command.equals("toggle")){
                    if(set.contains(number)){
                        set.remove(number);
                    }else {
                        set.add(number);
                    }
                }
            }else if(input.length == 1){
                if(command.equals("all")){
                    set.addAll(changeSet);
                }else if(command.equals("empty")){
                    set.clear();
                }
            }
        }
        bw.write(returnText.toString());
        bw.flush();
        bw.close();
    }
}

