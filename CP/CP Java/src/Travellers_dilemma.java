import java.util.*;

public class Travellers_dilemma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int v = sc.nextInt();
            long e = sc.nextLong();
            int path[] = new int[v-1];

            if(v%2!=0){ // when v is odd
                int even = v-1;
                int odd = 3;
                int k=0;
                while(even>0 && odd<=v){
                    path[k++] = even;
                    path[k++] = odd;
                    even-=2;
                    odd+=2;
                }
            }
            else{ // when v is even
                int largest=v,smallest=2,k=0;
                while(largest>smallest){
                    path[k++] = largest;
                    path[k++] = smallest;
                    largest-=2;
                    smallest+=2;
                }
                if(largest==smallest){
                    path[k++] += smallest;
                }

                largest=v-1;
                smallest=3;
                int l=0, temp[] = new int[(v/2)-1];
                while(largest>smallest){
                    temp[l++] = largest;
                    temp[l++] = smallest;
                    largest-=2;
                    smallest+=2;
                }
                if(largest==smallest){
                    temp[l] = smallest;
                }

                for(l=temp.length-1;l>=0;l--){
                    path[k++] = temp[l];
                }

            }

            long e_req=0;
            for(int m=0;m<path.length-1;m++){
                e_req += ((long)path[m]*path[m+1]);
            }
            e_req += (path[0]+path[path.length-1]);
            System.out.println(e>=e_req?"True":"False");
        }
    }
}
