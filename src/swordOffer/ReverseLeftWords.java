package swordOffer;

public class ReverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        if (s == null) {
            return null;
        }

        char[] chars = s.toCharArray();
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i < n) {
                stringBuilder1.append(chars[i]);
            } else {
                stringBuilder2.append(chars[i]);
            }
        }
        return stringBuilder2.toString() + stringBuilder1.toString();

    }

    public static void main(String[] args){
        ReverseLeftWords reverseLeftWords=new ReverseLeftWords();
        System.out.println(reverseLeftWords.reverseLeftWords("lrloseumgh",6));
    }


}
