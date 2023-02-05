import java.util.*;

class Ques1 {
    public long pickGifts(int[] gifts, int k) {
        // declaring a max priority queue / max heap
        // remember by default priority queue in java is min priority queue
        PriorityQueue<Integer> giftsHeap = new PriorityQueue<Integer>(
                Collections.reverseOrder());

        for (int i = 0; i < gifts.length; i++) {
            giftsHeap.add(gifts[i]);
        }

        while (k > 0) {
            int largest = (int) giftsHeap.poll();
            giftsHeap.add((int) Math.floor(Math.sqrt(largest + 0.0)));
            k--;
        }

        Iterator<Integer> iter = giftsHeap.iterator();
        long sum = 0;
        while (iter.hasNext()) {
            sum += (int) iter.next();
        }

        return sum;
    }
}

class Ques2 {
    boolean isCharVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    
    boolean getIsStartEndVowel(String word){
        int wordLength = word.length();
        char startChar = word.charAt(0);
        char endChar = word.charAt(wordLength-1);
        if(isCharVowel(startChar)&&isCharVowel(endChar)){
            return true;
        }
        return false;
    }
    
    public int[] vowelStrings(String[] words, int[][] queries) {
        int prefixSum[] = new int[words.length];
        
        for(int i=0;i<words.length;i++){
            boolean isWordStartEndVowel = getIsStartEndVowel(words[i]);
            int prevSum = i>0 ? prefixSum[i-1] : 0;
            if(isWordStartEndVowel) prevSum++;
            prefixSum[i] = prevSum;
        }
        
        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            ans[i] = prefixSum[end] - (start>0?prefixSum[start-1]:0);
        }
        
        return ans;
    }
}
