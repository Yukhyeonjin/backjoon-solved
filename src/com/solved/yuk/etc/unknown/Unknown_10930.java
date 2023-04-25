package com.solved.yuk.etc.unknown;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Unknown_10930 {

    public static void solution() throws IOException, NoSuchAlgorithmException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(S.getBytes());

        StringBuilder builder = new StringBuilder();
        for (byte b : md.digest()) {
            builder.append(String.format("%02x", b));
        }
        
        bw.write(builder.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException  {
        solution();
    }


}

