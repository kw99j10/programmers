#StringBuilder
class Solution {
    public String solution(int n) {
        StringBuilder answer=new StringBuilder();
        
        while(n>0){
            if(n%3==0){
                answer.append(4);
                n-=1; //각 자리수의 계산을 위함 cf)없을 경우 n이 3이면 4가 나와야 되지만 n=n/3은 1이므로 StringBuilder에는 41(reverse 14)가 저장됨
            }
            else if(n%3==1){
                answer.append(1);
            }
            else{
                answer.append(2);
            }
            n=n/3;
        }
        return answer.reverse().toString(); //stack과 유사한 구현
    }
}

#stack
import java.util.*;
class Solution {
    public String solution(int n) {
        String answer = "";

        var s=new Stack<Integer>();

        while(n>3){

            if(n%3==0){
                s.push(3);
                n=n/3-1;
            }
            else{
                s.push(n%3);
                n=n/3;
            }
        }
        s.push(n);

        while(!s.isEmpty()){
            if(s.peek()==3){
                answer+="4";
                s.pop();
            }
            else{
                answer+=String.valueOf(s.pop());
            }
        }
        return answer;
    }
}
