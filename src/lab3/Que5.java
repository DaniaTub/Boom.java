package lab3;

public class Que5 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 101);
        System.out.println(num);
        for(int i=0;i<num+1;i++)
        {
            if(i%2==0){
                System.out.println("even numbers :"+i);
            }


        }

    }
}
