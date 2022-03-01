package lab3;

public class Boom {
    public  static  void main( String [] args)
    {
        int current=(int)(Math.random()*101);
        System.out.println("the current is "+ current);
testDivSeven(current);
checkSevenDig(current);

    }
    public  static void testDivSeven(int cuuNum){

        if(cuuNum%7==0){
            System.out.println("BOOoOooooooOOM !!!!!!!!!");
        }
        else  {
            System.out.println("not divide by 7");
        }
    }
    public  static  void  checkSevenDig(int numberTest){

        if(numberTest/10==7 || numberTest/100==7){
            System.out.println("BOOoOooooooOOM  there is  7 digit !!!!!!!!!");

        }

        else  {
            System.out.println("does not have 7 digit  , the cuurent is :"+ numberTest);
        }
    }

}
