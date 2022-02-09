package StringPract;

import java.util.ArrayList;
import java.util.List;

/*
    * Example 1:

        Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
        Output: 1
        Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

        Example 2:

        Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
        Output: 2
        Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.

* */
public class CountItemsMatchingRule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;

        for(int i=0; i<items.size(); i++){
            List<String> list = items.get(i);

            if(ruleKey.equals("type")){
                String type = list.get(0);
                if(type.equals(ruleValue)){
                    ans++;
                }
            }else if(ruleKey.equals("color")){
                String col = list.get(1);
                if(col.equals(ruleValue)){
                    ans++;
                }
            }else{ // name
                String name = list.get(2);
                if(name.equals(ruleValue)){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>( new ArrayList<>());
        List<String> row1 = new ArrayList<>();
        row1.add("phone");
        row1.add("blue");
        row1.add("pixel");
        items.add(row1);

        List<String> row2 = new ArrayList<>( new ArrayList<>());
        row2.add("computer");
        row2.add("silver");
        row2.add("lenovo");
        items.add(row2);

        List<String> row3 = new ArrayList<>();
        row3.add("phone");
        row3.add("gold");
        row3.add("iphone");
        items.add(row3);


//       String ruleKey = "color";
//       String ruleValue = "silver";
        String ruleKey = "type";
        String ruleValue = "phone";
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }
}
