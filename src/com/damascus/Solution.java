package com.damascus;

public class Solution {
    public String solution(String S, int K) {
        // write your code in Java SE 8
        S = S.toUpperCase();
        StringBuilder reversedWord = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int c = 1;

        // Reverse
        for ( int i = S.length() - 1; i >= 0; i-- ){
            if( S.charAt(i) != '-' ){
                if( c < K ) {
                    reversedWord.append(S.charAt(i));
                    c++;
                } else{
                    try{
                        reversedWord.append(S.charAt(i));
                        S.charAt(i - 1);
                        reversedWord.append('-');
                    }catch (IndexOutOfBoundsException ex){
                    }
                    finally {
                        c = 1;
                    }
                }
            }
        }

        for ( int i = reversedWord.length() - 1; i >= 0; i-- ){
            result.append(reversedWord.charAt(i));
        }

        return result.toString();
    }
}
