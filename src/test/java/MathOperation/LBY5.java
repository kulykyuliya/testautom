package MathOperation;
import java.util.Scanner;

public class LBY5 {
    public static void main(String[] args) {
       // float[] name = new float[] {21.989f, 88.98f, 101.87878f};
     //   System.out.println(name[2]);
int[] a;
int n;
Scanner in = new Scanner(System.in);
System.out.print("Enter numbers of array: ");
n = in.nextInt();
a = new int[n];
for (int i = 0; i < n; i++) {
    System.out.print("Enter a["+ i + "]=");
    a[i] = in.nextInt();
        }
    }
}
