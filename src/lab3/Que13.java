package lab3;

public class Que13 {
    public  static  void  main( String []args) {
        int digit = (int) (Math.random() * 10001);
        int digit2 = (int) (Math.random() * 100001);

        System.out.println(digit); //
        printNumDig(digit);//
        System.out.println("**************");//
        leftDigit(digit);//
        System.out.println("**************");//
        sumOfDig(digit);
        System.out.println("**************");
        printDig(digit);
        System.out.println("**************");
        poly(digit2);
    }



    public  static  void printNumDig(int number) {
        if (number / 10 == 0) {
            System.out.println(" number of digit is : one digit");
        } else if (number / 100 == 0) {

            System.out.println("number of digit is : Two digit");
        } else if (number / 1000 == 0) {

            System.out.println("number of digit is : three digit");
        } else if (number / 10000 == 0) {

            System.out.println("number of digit is : four digit");
        } else {
            System.out.println("number of digit is : nothing ");
        }
    }
    public  static void leftDigit(int dig){
        while( dig>=10)  //68 yes
            dig=dig/10; //6 .8 -> 6 because int
        System.out.println("the first left  digit is :"+dig);
    }


    public  static void sumOfDig(int ran){
        int reminder=0;
        while (ran>0){ //98
            reminder=reminder+(ran%10); //0+8  +9
            ran=ran/10; //9 0
        }
        System.out.println("the sum of digit num is :"+reminder);
    }


    public  static  void printDig(int digits){
        int j =0;
        while (digits>0)
        { //199
            j=(j*10)+(digits%10); // 0+9
            digits=digits/10; //19 0
        }
        System.out.println("The oppiste order of the number is :"+j);
    }

public static  void poly(int bar){
        // 1234   4321

//opposit like the forward
    int mind =0;
    int eq=bar;
    while (bar>0)
    { //199
        mind=(mind*10)+(bar%10); // 0+9
       bar=bar/10; //19 0 //mind is the oppsite

    }
    if(bar ==eq)
    {
        System.out.println("the polyindron is :"+bar);
    }
    else {
        System.out.println("not a polyindrom");
    }

}

}




