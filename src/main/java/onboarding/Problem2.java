package onboarding;

public class Problem2 {
	public static String solution(String cryptogram) {
		
		 char left;
		 char right;
		 String answer=cryptogram;
		 char [] ch=cryptogram.toCharArray();
		 boolean chk=true;
		 while(chk) {
			 ch=answer.toCharArray();
			 answer="";
			 if(ch.length==0) {
				 return answer;
			 }
			 chk=false;
			 for(int i=0;i<ch.length;i++) {
				 if(i+1 == ch.length) {
					 answer+=ch[i];
				 }else {
					 left=ch[i]; 
					 right=ch[i+1]; 
					 if(left == right) {
						 i++;
						 chk=true;
					 }else {
						 answer+=left;
					 } 
				 }
			 }
		 }
		 return answer;
	}
}
