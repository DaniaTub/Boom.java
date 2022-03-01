package lab3;

public class Que9 {
    public  static  void  main( String []args) {
        int right = (int) (Math.random() * 10001);
        System.out.println("the number is :" + right);

        rightDig(right);
        leftDig(right);
        printOpp(right);
    }

    public  static  int rightDig(int digit){
       int k=digit%10;
        System.out.println("the right is :"+k);

        return k;
    }

    public  static  int leftDig(int digit){
        while( digit>=10)  //68 yes
            digit=digit/10; //6 .8 -> 6 because int
        System.out.println("the left is :"+digit);
        return  digit;
    }

    public  static  void printOpp(int digits){
        int j =0;
      while (digits>0)
      { //199
          j=(j*10)+(digits%10); // 0+9
          digits=digits/10; //19 0
      }
        System.out.println("The oppiste of the number is :"+j);
    }
    }
