package com.programmers;

public class Babbling {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] basicWord = new String[]{"aya", "ye", "woo", "ma"};
        for(String word : babbling) {
            for(String bw : basicWord) {
                int foundIdx = word.indexOf(bw);
//                if (foundIdx != -1 && word.charAt(foundIdx + 1)) {
//                    word = word.substring(word.indexOf(bw), bw.length());
//                }
            }
            if(word.equals("")) {
                answer++;
            }
        }
        return answer;
    }
}
