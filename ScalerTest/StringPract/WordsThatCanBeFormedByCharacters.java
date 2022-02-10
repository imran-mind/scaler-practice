package StringPract;

import java.util.HashMap;
import java.util.Map;

/*
  Leetcode -> 1160. Find Words That Can Be Formed by Characters
    * You are given an array of strings words and a string chars.
    A string is good if it can be formed by characters from chars (each character can only be used once).
    Return the sum of lengths of all good strings in words.

    Example 1:

        Input: words = ["cat","bt","hat","tree"], chars = "atach"
        Output: 6
        Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
    Example 2:

        Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
        Output: 10
        Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
* */
public class WordsThatCanBeFormedByCharacters {

    public static int countCharacters(String[] words, String chars) {
        int ans = 0;

        for(int i=0; i<words.length; i++){

            boolean flag = true;
            String word = words[i];
            for(int j=0; j<word.length(); j++){
                if(!chars.contains(word.charAt(j)+"")){
                    System.out.println(chars);
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans = ans + word.length();
            }
        }
        return ans;
    }

    public  static int countCharacterMap(String[] words, String chars) {

        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        int count=0;
        int sum=0;

        char[] ar= chars.toCharArray();

        for(int i=0;i<ar.length;i++)
        {
            char ch= ar[i];
            if(map1.containsKey(ch))
                map1.put(ch, map1.get(ch)+1);
            else
                map1.put(ch,1);
        }
        System.out.println("map1=> "+map1);

        for(int i=0;i<words.length;i++)
        {
            map2.clear();
            map2.putAll(map1);

            boolean isGood= true;
            char[] word= words[i].toCharArray();
            System.out.println(" word = "+ words[i]);

            for(int j=0;j<word.length;j++)
            {
                if(map2.containsKey(word[j]) && map2.get(word[j])>0)
                    map2.put(word[j], map2.get(word[j])-1);
                else
                    isGood= false;
            }
            System.out.println("map2=>  "+map2);
            if(isGood)
            {
                sum=sum+word.length;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
       String[] words = {"cat","bt","hat","tree"};
       String chars = "atach";
//        String[] words = {"hello","world","leetcode"};
//        String chars = "welldonehoneyr";
//        String[] words = {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
//        String chars = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";

        System.out.println(countCharacterMap(words, chars));
    }
}
