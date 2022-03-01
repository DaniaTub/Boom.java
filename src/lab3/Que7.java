package lab3;
//question 7 + 8
public class Que7 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 8);
        System.out.println("the  random number is: " + num);
        System.out.println(normalWay(num));
        System.out.println("*********without loop*************");
        IncVic(num);
        System.out.println("******for loop increment ****************");
        decVic(num);
        System.out.println("*******for loop decrement ***************");
        whileInc(num);
        System.out.println("*********while loop inc *************");
        whileDec(num);
        System.out.println("*********while loop dec *************");

    }

    public  static  void IncVic(int tes)
    {
        int k=1;
        for(int u=1;u<tes+1;u++){
            k=k*u;
        }
        System.out.println("the victoria is: " +k);
    }

    public  static  void decVic(int tes2) {
        int k = 1;
        for (int u = tes2; u > 1; u--) {
            k = k * u;
        }
        System.out.println("the victoria is: " + k);
    }

    public  static  int normalWay(int tes3) {
     int l=1;
     if( tes3==0){
         return  1;
     }
     else
     return tes3* normalWay(tes3-1);
    }


    public  static  void whileInc(int tes4) {
       int comp=1;
     while(tes4>0) {// 5>1  4 3 2 1
         comp=comp*tes4; //5*1 *4 *3 *2 *1
         tes4--;// 4 3 2 1  0
     }
     System.out.println(comp);
}


    public  static  void whileDec(int tes5) {
        int comp1=1; // tes5=1
        while(comp1<tes5+1)
        {   //yes  1 2 3 4  5
            comp1=comp1*tes5; // 1*5 *2 *3 *4 *5
            tes5++; //2 3 4 5   6
        }
        System.out.println(comp1);
    }
}
