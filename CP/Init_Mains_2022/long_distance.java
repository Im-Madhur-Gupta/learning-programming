import java.util.Scanner;

class Solution1{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int prts[] = new int[n];
            for(int x=0;x<n;x++){
                prts[x] = obj.nextInt();
            }
            int l=obj.nextInt()-1; // lower bound of the pair
            int u=obj.nextInt()-1; // upper bound of the pair
            int pairs=0;
            for(int i=l;i<u+1;i++){
                for(int j=i+1;j<u+1;j++){
                    int dist = j-i-1;
                    if((prts[i]%2==0 && prts[j]%2==0) || (prts[i]%2!=0 && prts[j]%2!=0)){
                        if(dist % 2 == 0){
                            pairs++;
                        }
                    }
                    else{
                        if(dist % 2 != 0){
                            pairs++;
                        }
                    }
                }
            }
            System.out.println(pairs);
        }
    }
}
