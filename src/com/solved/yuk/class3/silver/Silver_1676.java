package com.solved.yuk.class3.silver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Silver_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]),
                M = Integer.parseInt(firstLine[1]);
        Map<String, Integer> pokemonMap = new HashMap<>();
        String[] pokemonArr = new String[N];
        String pokemon;
        for(int i = 0; i < N; i ++){
            pokemon = br.readLine();
            pokemonMap.put(pokemon, i+1);
            pokemonArr[i] = pokemon;
        }
        String findingPokemon;
        for(int i = 0; i < M; i ++){
            findingPokemon = br.readLine();
            try{
                int index = Integer.parseInt(findingPokemon);
                bw.write(pokemonArr[index-1]);
            }catch (NumberFormatException e){
                bw.write(Integer.toString(pokemonMap.get(findingPokemon)));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
