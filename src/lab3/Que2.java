package lab3;

public class Que2 {
    public static void main(String [] args) {
incWay();
System.out.println("****************");
DecWay();
System.out.println("****************");
whWay();
System.out.println("****************");
whWayDec();
    }
        public static  void incWay(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }

    }
        public static  void DecWay(){
        for (int j = 10; j > 0; j--) {
            System.out.println("Hello World");
        }

    }
    public static  void whWay(){
    int d=0;
       while(d<10) {
            System.out.println("Hello World");
           d++;
        }

    }
    public static  void whWayDec(){
        int m=10;
        while(m>0) {
            System.out.println("Hello World");
            m--;
        }

    }

}


