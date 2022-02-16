package BFS_DFS_QUES;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int calcMoves(String combo){
        return calcMoves(combo.charAt(0)) + calcMoves(combo.charAt(1)) + calcMoves(combo.charAt(2)) + calcMoves(combo.charAt(3));

    }
    static int calcMoves(char dig){
        int num=Character.getNumericValue(dig);
        if(num>5) return 10-num;
        return num;
    }

    static char[] getNeghbourChars(char dig){
        int num = Character.getNumericValue(dig);
        char ahead = (char)(getNumOneAhead(num)+'0');
        char behind = (char)(getNumOneBehind(num)+'0');
        return new char[]{behind, dig, ahead};
    }
    static int getNumOneAhead(int num){
        if(num==9) return 0;
        return num+1;
    }
    static int getNumOneBehind(int num){
        if(num==0) return 9;
        return num-1;
    }

    public int openLock(String[] deadends, String target) {
        // Mujhe ek combination string ko as a node samjhna he
        // phir is node ke corresponding neighbours 80 honge jinko mai check karunga ki wo target he ke ni
        // ye bhi check akrunga ki deadend ya visited to ni he.

        String initialCombo = "0000";
        HashSet<String> visitedCombos = new HashSet<>(10000); // To contain the visited nodes.

        // Mai sare deadends ko BFS se pehle hi visited mann leta hu.
        // Bcz once I arrive at a deadend I don't want to go ahead.
        for(String deadend:deadends){
            visitedCombos.add(deadend);
        }

        // Preparing for BFS
        Queue<String> q = new LinkedList();
        q.offer(initialCombo);
        visitedCombos.add(initialCombo);

        String currCombo;
        // BFS starts
        while(!q.isEmpty()){
            currCombo = q.poll();

            // checking whether the currCombo equals to target or not.
            if(currCombo.equals(target)){
                return calcMoves(currCombo);
            }

            // Not target then check whether a neighbour is visited or not
            // if not -> add it to the queue and mark it visited

            // getting all the neighbour chars in corres. arrs
            char carr0[] = getNeghbourChars(currCombo.charAt(0));
            char carr1[] = getNeghbourChars(currCombo.charAt(1));
            char carr2[] = getNeghbourChars(currCombo.charAt(2));
            char carr3[] = getNeghbourChars(currCombo.charAt(3));

            // generating combos and checking
            String genCombo;
            for(char c0:carr0){
                for(char c1:carr1){
                    for(char c2:carr2){
                        for(char c3:carr3){
                            genCombo = c0+c1+c2+c3+"";
                            if(!visitedCombos.contains(genCombo)){
                                q.offer(genCombo);
                                visitedCombos.add(genCombo);
                            }
                        }
                    }
                }
            }
        }

        return -1; // incase we dont find the target
    }
}
