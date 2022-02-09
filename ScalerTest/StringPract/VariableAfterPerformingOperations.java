package StringPract;

public class VariableAfterPerformingOperations {

    /*
    * There is a programming language with only four operations and one variable X:

    ++X and X++ increments the value of the variable X by 1.
    --X and X-- decrements the value of the variable X by 1.
    Initially, the value of X is 0.

    Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
    *
    * Input: operations = ["--X","X++","X++"]
    Output: 1
    Explanation: The operations are performed as follows:
    Initially, X = 0.
    --X: X is decremented by 1, X =  0 - 1 = -1.
    X++: X is incremented by 1, X = -1 + 1 =  0.
    X++: X is incremented by 1, X =  0 + 1 =  1.
    * */
    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(int i=0; i<operations.length; i++){
            boolean isInc = (operations[i].equals("X++") || operations[i].equals("++X"));
            ans = isInc ? ans+1 : ans-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
}
