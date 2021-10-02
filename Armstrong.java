import java.util.Scanner;

class Armtrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      System.out.print("Enter the no:");
      int n=in.nextInt();
      armtsrong(n);
    }
        static  void armtsrong( int m){
            int sum = 0;
            int res=m;
            while (m > 0) {
                int rem = m % 10;
                sum = sum + rem * rem * rem;
                m = m / 10;
            }
            if(sum==res) {
                System.out.println("Armstrong no.");
            }
            else {
                System.out.println("NOT a Armstrong no");
            }


        }
    }

