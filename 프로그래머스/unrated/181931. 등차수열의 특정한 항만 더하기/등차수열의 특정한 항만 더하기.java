import java.util.Arrays;
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int[] arr = new int[included.length];
        for(int i = 0 ; i < arr.length;i++) {
            arr[i] = a + d*i; 
        }
        int answer = 0;
        for(int i = 0 ; i < included.length;i++) {
            if(included[i] == true) {
                answer+=arr[i];
            }
        }
        return answer;
    }
}