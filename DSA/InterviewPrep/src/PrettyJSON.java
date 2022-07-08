import java.util.*;

class Solution {
    public ArrayList<String> prettyJSON(String A) {
        // Assuming a valid JSON

        int n = A!=null ? A.length() : 1;
        ArrayList<String> result = new ArrayList<>(n);

        // trivial case
        if(n<=1){
            result.add(A);
            return result;
        }

        // VERY VERY IMPORTANT -
        // We are not considering the case here in which a string value inside of the json object contains
        // '[', ']', '{', '}', ':' and ','
        // Meaning following is an INVALID input -
        // ["A:[,", "B:[]}{"]

        // iterating thorugh the String
        // now 3 cases are possible
        // 1. we get { or [
        // 2. we get } or ]
        // 3. we get ___: or ___,
        int i=0;
        StringBuffer indent = new StringBuffer("");
        while(i<n){
            if(A.charAt(i)=='{' || A.charAt(i)=='['){
                result.add(indent.toString() + A.charAt(i));
                indent.append('\t'); // increase the indent
            }
            else if(A.charAt(i)=='}' || A.charAt(i)==']'){
                indent.deleteCharAt(indent.length()-1); // decrease the indent
                String closeBracketStr = "" + A.charAt(i);
                if(i<n-1 && A.charAt(i+1)==','){
                    closeBracketStr += ",";
                    i++;
                };
                result.add(indent.toString() + closeBracketStr);
            }
            else{
                int start = i;
                while(i<n){
                    boolean colonCondition = A.charAt(i)==':' && (A.charAt(i+1)=='{' || A.charAt(i+1)=='[');
                    boolean commaCondition = A.charAt(i)==',';
                    boolean closeBracketCondition = A.charAt(i+1)=='}' || A.charAt(i+1)==']';
                    if(colonCondition || commaCondition || closeBracketCondition){
                        result.add(indent.toString() + A.substring(start, i+1));
                        break;
                    }
                    i++;
                }
            }
            i++;
        }

        return result;
    }
}
