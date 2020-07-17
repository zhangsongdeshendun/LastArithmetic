package swordOffer;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {

    public String reverseWords(String s) {
        if(s==null||s.length()==0){
            return "";
        }

        List<String> tempList = new ArrayList<>();
        char[] chars = s.toCharArray();
        char[] chartemp = new char[chars.length + 1];

        for (int i = 0; i < chars.length; i++) {
            chartemp[i] = chars[i];
        }
        chartemp[chars.length] = ' ';

        StringBuilder stringBuilder = null;
        for (char item : chartemp) {
            if (item != ' ') {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append(item);
            } else {
                if (stringBuilder != null) {
                    tempList.add(stringBuilder.toString());
                    stringBuilder = null;
                }
            }


        }
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = tempList.size() - 1; i >= 0; i--) {
            stringBuilder1.append(tempList.get(i)).append(" ");
        }
        String resultString = stringBuilder1.toString();
        String finalString=null;
        if (resultString.endsWith(" ")) {
            finalString=resultString.substring(0, resultString.length() - 1);
        }

        return finalString;

    }

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        System.out.println(reverseWords.reverseWords("the sky is blue"));
        System.out.println(reverseWords.reverseWords("  hello world!  "));
        System.out.println(reverseWords.reverseWords("a good   example"));

    }


}
