package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test05 {
   @SuppressWarnings("resource")
   public static void main(String[] args) {
      
   
      //강제로 예외 설정하기.. price 나 people은 음수가 되면 안된다.... 
      // jvm이 인지할수 있게 해준다.
      // - 문제 상황을 감지하여 catch 블록으로 throw 시킨다. 
      
      try {
         Scanner sc =new Scanner (System.in);
         System.out.println("금액입력");
         long price = sc.nextLong(); //여기서 미스매치 오류 발생 
         if(price<0) {//강제 예외발생코드 
         //   예외 객체 
             throw new Exception("금액은 음수면 안됩니다.");
         }
         
         
         
         System.out.println("인원수입력");
         int people =sc.nextInt();
         
         
         sc.close();
         
         
         long a= price/people;   
         long b= price%people;
         
         
         System.out.println("한명당"+a+"원");
         
         System.out.println("남은돈"+b+"원");
      }
      catch(Exception e) {
         if(e.getMessage()==null) {
            System.err.println("오류발생");
         }else {
          System.out.println(e.getMessage()); //원인메시지 출력
         }
      
      e.printStackTrace(); // 예외로그의 출력 (개발용 ) -만드는사람이 보기 편하려고 배포시에는 삭제바람 ..
   }

}
}