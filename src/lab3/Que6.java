package lab3;

public class Que6 {
    public static void main(String[] args) {

        int max = (int) (Math.random() * 101);
        int den = (int) (Math.random() * 101);
        System.out.println("max is "+max);
        System.out.println("den is "+den);

        for(int i=0;i<max+1;i++){
            if(i%den==0){
                System.out.println(i);
            }
        }
    }
    }
