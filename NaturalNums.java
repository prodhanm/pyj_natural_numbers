import java.util.Scanner;

class NaturalNums {
    public static int sumNums(int num) {
        int totalNum = (num*(num+1))/2;
        return totalNum;
    }

    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = inp.nextInt();
        int result = sumNums(n);
        System.out.printf("The sum of the first %d natural numbers is: %d\n", n, result);
        inp.close();
    }
}