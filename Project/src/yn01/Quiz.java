package yn01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz {

	public static void main(String[] args) {
		
	    {
	        BufferedReader myReader
	            = new BufferedReader( new InputStreamReader(System.in));
	        
	        //초기 메시지 표시
            System.out.println("=========== 삼지선다형 퀴즈 ===========");
            System.out.println("문제의 답을 지문에서 선택하여 숫자로 답하시오.\n");
	 
	        try{
	           
	            //문제와 해답을 저장하기 위한 배열을 작성
	            String strQuiz[][] = new String [5][5];
	 
	            //[0:문제 / 1~3: 지문 / 4 : 해답 ]
	 
	            //첫번째 문제
	            strQuiz[0][0] = "알을 가장 많이 낳는 동물은?";
	            strQuiz[0][1] = "거미";
	            strQuiz[0][2] = "개미";
	            strQuiz[0][3] = "개복치";
	            strQuiz[0][4] = "3";
	            
	            //두번째 문제
	            strQuiz[1][0] = "가장 긴 혀를 가진 동물은?";
	            strQuiz[1][1] = "카멜레온";
	            strQuiz[1][2] = "기린";
	            strQuiz[1][3] = "대왕개미핥기";
	            strQuiz[1][4] = "3";
	 
	            //세번째 문제
	            strQuiz[2][0] = "가장 잠이 많은 동물은?";
	            strQuiz[2][1] = "나무늘보";
	            strQuiz[2][2] = "코알라";
	            strQuiz[2][3] = "고양이";
	            strQuiz[2][4] = "1";
	           
	            //네번째 문제
	            strQuiz[3][0] = "사람을 잘 공격하는 아프리카 동물은?";
	            strQuiz[3][1] = "물소";
	            strQuiz[3][2] = "하마";
	            strQuiz[3][3] = "사자";
	            strQuiz[3][4] = "2";
	 
	         	//다섯번째 문제
	            strQuiz[4][0] = "사람에게 가장 위험한 동물은?";
	            strQuiz[4][1] = "식인상어";
	            strQuiz[4][2] = "모기";
	            strQuiz[4][3] = "뱀";
	            strQuiz[4][4] = "2";
	
	 
	            //득점 카운터의 선언과 초기화
	            int intPoint = 0;
	 
	            //메인 루틴
	            for(int intCounter = 0; intCounter<=4; intCounter++){
	 
	                //문제의 표시
	                System.out.println();
	                System.out.println("문제"+(intCounter+1)+") "+strQuiz[intCounter][0]);
	                System.out.println();
	                System.out.println("① " + strQuiz[intCounter][1]);
	                System.out.println("② " + strQuiz[intCounter][2]);
	                System.out.println("③ " + strQuiz[intCounter][3]);
	               
	                //답의 입력을 요구
	                System.out.print("답은 몇번?: ");
	               
	                //입력된 값을 읽어들여 변수에 대입
	                int myAnswer = Integer.parseInt(myReader.readLine());
	 
	 
	                //정답 유무
	                if(myAnswer == Integer.parseInt(strQuiz[intCounter][4])){
	                    System.out.println("\n축하합니다. 정답입니다.");
	                    intPoint ++;
	                }else{
	                    System.out.println("\n유감입니다! 정답은 " + strQuiz[intCounter][4]
	                        + "번입니다");
	                }
	            }
	           
	            //정답의 수와 메시지 표시
	 
	            System.out.println("\n===========당신의 성적=============");
	 
	            switch (intPoint) {
	 
	            case 0:
	                System.out.println("전멸입니다. 다음에 더 노력합시다");
	                break;
	            case 1:
	                System.out.println("한 문제밖에 맞히지 못했습니다. 다음에 더 노력합시다.");
	                break;
	            case 2:
	                System.out.println("두 문제만 정답입니다. 다음에 더 노력합시다.");
	                break;
	            case 3:
	                System.out.println("세 문제 정답입니다. 보통입니다.");
	                break;
	            case 4:
	                System.out.println("네 문제 정답입니다. 열심히 하셨군요.");
	                break;
	            case 5:
	                System.out.println("퍼펙트! 훌륭합니다. 만점이네요");
	                break;
	            }
	           
	        }catch(IOException e){
	 
	        }catch(NumberFormatException ne){
	 
	        }
	    }
	}
}