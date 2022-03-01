package lab3;

public class Ques17
{
    public static void main(String[] args) {
        char[] arrq = {'a', 'b', 'c', 'a', 'b', 'd', 'r', 'c'};
        String l="Jhon Brace";
        String str = "Sara Shara Shir Cameach";
        coun(arrq);
        counqq(arrq);
        coi(l);
        coif(str);
    }

    public static void coun(char[] arra) {
        int count = 0;
        for (int i = 0; i < arra.length; i++) {
            if (arra[i] == 'a') {
                count++;
            }

        }
        System.out.println(" the number of 'a' is :" + count);

    }

    public static void counqq(char[] arraaa) {

        int count2222 = 0;
        for (int i = 0; i < arraaa.length; i++) {
            if (arraaa[i] == 'a' || arraaa[i] == 'c') {
                count2222++;
            }

        }
        System.out.println(" the number of 'a' or 'c' is :" + count2222);

    }
    public  static  void coi(String s){

        char [] c =new char[s.length()];
        int f=0;
        for (int i=0; i<s.length();i++)
        {
                c [i] = s.charAt(i);
                if(c[i]=='h' || c[i]=='H')
                {
                    f++;
                }
        }
        System.out.println("the number of h in the string is: "+f);
    }

    public  static  void coif(String s){

        char [] c =new char[s.length()];
        int f=0;
        for (int i=0; i<s.length();i++)
        {
            c [i] = s.charAt(i);
            if(c[i]=='A' || c[i]=='a'|| c[i]=='E'|| c[i]=='e' ||c[i]=='I'|| c[i]=='i'|| c[i]=='O'|| c[i]=='o' ||c[i]=='U'|| c[i]=='u')
            {
                f++;
            }
        }
        System.out.println("the number of vowels in the string is: "+f);
    }









}



