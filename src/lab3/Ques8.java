package lab3;

public class Ques8 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 10001);
        System.out.println(number);
        ////////////////////////////////////////

         if(number/10==0) {
             System.out.println("one digit");
         }
            else if(number/100==0) {

             System.out.println("Two digit");
         }
         else if(number/1000==0) {

             System.out.println("three digit");
         }
         else if(number/10000==0) {

             System.out.println("four digit");
         }
         else {
             System.out.println("nothing ");
         }
    }
}
