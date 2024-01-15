import java.util.*;

class PR_lv2_이진변환반복 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int len = s.length();
        
        while(len > 1){
            int zero = count(s);
            s = convert(len-zero);
            len = s.length();
            
            answer[0]++;
            answer[1]+=zero;
        }
        
        return answer;
    }
    
    //0개수 체크
    public int count(String s){
        int cnt = 0;
        for(char c:s.toCharArray()){
            if(c=='0') cnt++;
        }
        return cnt;
    }
    
    //int를 이진법 변환
    public String convert(int len){
        return Integer.toBinaryString(len);
    }
}
