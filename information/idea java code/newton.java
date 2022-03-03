import java.util.Scanner;
public class newton {
    public static void main(String[] args) {
        int total_x_numbers;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of x values : ");
        total_x_numbers=sc.nextInt();
        int a[]=new int[total_x_numbers];                               //declaration
        System.out.print("Enter x values (ascending order) : ");
        for(int i=0; i<total_x_numbers; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Your x values are successfully stored.");
        System.out.println("Enter the same amount of f(x) corresponing x values : ");
        int b[]=new int[total_x_numbers];
        for(int j=0; j<total_x_numbers; j++)
        {
            b[j] = sc.nextInt();
        }
        System.out.println("Your F(x) values are successfully stored.");
        System.out.println("Please input your target node that we can calculate the newton rapshon math");
        int target =sc.nextInt();
        System.out.println("Your amount is :"+target+" \nNow we going for our internal calculations. ");
        function_main_formula(a,b,target);

    }

    private static void function_main_formula(int[] a, int[] b, int target) {
        int b0;
        int b1;
        int b2;
        int b3;
        int x0=b[0];    //here are x0 to x3 are representing f(x')
        int x1=b[1];
        int x2=b[2];
        int x3=b[3];

        int y0=a[0];    //here are y0 to y3 are representing x
        int y1=a[1];
        int y2=a[2];
        int y3=a[3];

        //System.out.println(y0+" "+y1+" "+y2+" "+y3);
        //System.out.println(x0+" "+x1+" "+x2+" "+x3);

        double c1 = (double)((x1-x0)/(y1-y0)); // here is the b1
        double c2 = (double)((x2-x1)/(y2-y1));
        double c3 = (double)((x3-x2)/(y3-y2));
        double c4 = (double)((c2-c1)/(y2-y0)); // here is the b2
        double c5 = (double)((c3-c2)/(y3-y1));
        double c6 = (double)((c5-c4)/(y3-y0)); // here is the b3

        System.out.println("Here is Newton’s interpolating polynomial of order 3 formula f(x) = b0 + b1(x'-x0) + b2(x'-x0)(x'-x1) + b3(x'-x0)(x'-x1)(x'-x2)");
        System.out.println("Here is your Newton’s interpolating polynomial equation (according to your given data) : f(x)="+x0+"+"+c1+"*"+("("+target+"-"+y0+")+")+c4+"*"+("("+target+"-"+y0+")")+("*("+target+"-"+y1+")+(")+c6+")*"+("("+target+"-"+y0+")")+("*("+target+"-"+y1+")")+("*("+target+"-"+y2+")"));
        double g = (double)x0+(double)(c1*(target-y0))+(double)(c4*(target-y0)*(target-y1))+(double)(c6*(target-y0)*(target-y1)*(target-y2));
        System.out.println("Your f("+target+") result is ="+g);
    }


}
