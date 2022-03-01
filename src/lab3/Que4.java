package lab3;

public class Que4 {
    public  static void main(String []args) {

        int num1 = (int) (Math.random() * 101);
        int num2 = (int) (Math.random() * 101);
        System.out.println("number 1 is " +num1);
        System.out.println("number 2 is " +num2);
        if(num1>num2){
            for (int i =num2;i<num1+1;i++){
                System.out.println(i);

            }
        }
        else for (int j =num1;j<num2+1;j++){
            System.out.println(j);

        }
    }

}
