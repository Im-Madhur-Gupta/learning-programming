import java.util.*;

// Q3
class Solution {
    public int largestInteger(int num) {
        String numS = Integer.toString(num);

        ArrayList<Integer> odd = new ArrayList<Integer>();
        HashSet<Integer> oddIndxs = new HashSet<>();
        ArrayList<Integer> even = new ArrayList<Integer>();

        for (int i = 0; i < numS.length(); i++) {
            int dig = Character.getNumericValue(numS.charAt(i));
            if (dig % 2 == 0) {
                even.add(dig);
            } else {
                odd.add(dig);
                oddIndxs.add(i);
            }
        }

        Collections.sort(odd, Collections.reverseOrder());
        int oddIndx=0, evenIndx=0;
        Collections.sort(even, Collections.reverseOrder());

        int ans = 0;
        for (int i = 0; i < numS.length(); i++){
            if (oddIndxs.contains(i)) {
                // odd num ana chahiye
                ans = ans*10 + odd.get(++oddIndx);
            }
            else{
                ans = ans*10 + even.get(++evenIndx);
            }
        }

        return ans;
    }
}