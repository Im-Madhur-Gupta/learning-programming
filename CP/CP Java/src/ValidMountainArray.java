class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        boolean isInc = true, didInc=false, didDec=false;
        if (arr.length<3) return false;
        if (arr[0]>arr[1]) return false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]) return false;
            if(isInc && arr[i]>arr[i+1]){
                isInc = false;
                didDec = true;
            }
            else if(!isInc && arr[i]>arr[i+1]){
                return false;
            }
        }
        return didDec;
    }
}
