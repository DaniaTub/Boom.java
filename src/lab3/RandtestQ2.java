package lab3;

public class RandtestQ2 {
    public  static  void  main(String [] args)
    {
      //  int index=(int)(Math.random()*40); //range 1-40
       // geFab(index);
        int randInd=(int)(Math.random()*60);
        System.out.println(randInd);
        fabrand(randInd);
    }
    // I didnt understand //




    public static  void geFab(int a)
    {
        int numb1=1; int numb2=1;
        int sum = 0;
        for (int i=2;i<a;i++) { // 1 1 2 4 8 ..
            sum = numb1 + numb2;
            System.out.println(" " + sum);
            numb1 = numb2;
            numb2 = sum;
        }
    }
      public static void fabrand(int k) {
          int numberr1 = 1;
          int numberr2 = 1;
          int sum = 0;
          System.out.println(numberr1 + " " + numberr2 + "  ");

          for (int i = 2; i < k; i++) { // 1 1 2 4 8 ..
              sum = numberr1 + numberr2;
              System.out.println(" " + sum);
              numberr1 = numberr2;
              numberr2 = sum;
          }
      }
}
