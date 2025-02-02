package com.datastructuresandalgorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;

public class MaxOccurance {
            public static void main(String[] args) {
//                String str = "aaabbccc";
//                int[] freq = new int[256];
//
//                for (int i = 0; i < str.length(); i++) {
//                    freq[str.charAt(i)]++;
//                }
//
//                char maxChar = str.charAt(0);
//                int maxFreq = -1;
//                for (int i = 0; i < str.length(); i++) {
//                    if (freq[str.charAt(i)] > maxFreq) {
//                        maxFreq = freq[str.charAt(i)];
//                        maxChar = str.charAt(i);
//                    }
//                }
//
//                System.out.println("Maximum occurring character: " + maxChar + " with frequency: " + maxFreq);
                Scanner sc = new Scanner(System.in);
                System.out.println("enter name: ");
                String str = sc.nextLine();
                Map<Character,Integer> map = new HashMap<>();
                for (char ch : str.toCharArray()){
                    map.put(ch, map.getOrDefault(ch,0)+1);
                }
                map.forEach((c,i)-> {
                    Predicate<Integer> p = (m)->map.get(c) >= map.get(c);
                    System.out.println(c +"-" + i);

                });

//                Set<Map.Entry<Character,Integer>> set = map.entrySet();
//                System.out.println(map);
//                System.out.println(set);


            }
        }


