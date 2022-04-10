class Solution {
    public int largestInteger(int num) {
        String numStr = Integer.toString(num);

        for (int i = 0; i < numStr.length(); i++) {
            int largest = Character.getNumericValue(numStr.charAt(i));
            int swapIndx = i;
            for (int j = i + 1; i < numStr.length(); j++) {
                int checkVal = Character.getNumericValue(numStr.charAt(j));
                if (largest < checkVal && largest % 2 == checkVal % 2) {
                    largest = checkVal;
                    swapIndx = j;
                }
            }
            if (swapIndx == numStr.length() - 1)
                numStr = numStr.substring(0, i) + numStr.charAt(swapIndx)
                        + numStr.substring(i + 1, swapIndx) + numStr.charAt(i);

            else {

                numStr = numStr.substring(0, i) + numStr.charAt(swapIndx)
                        + numStr.substring(i + 1, swapIndx) + numStr.charAt(i)
                        + numStr.substring(swapIndx + 1, numStr.length());
            }
        }

        return Integer.parseInt(numStr.toString());
    }
}