class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        //System.out.println(myString.indexOf(pat));
        for(int i = 0 ; i <= myString.length()-pat.length();i++) {
            if(pat.equals(myString.substring(i,i+pat.length()))) {
                
                answer++;
            }
            System.out.println(myString.substring(i,i+pat.length()));
        }
        return answer;
    }
}