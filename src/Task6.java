public class Task6 {
    public static int powerOfNumber(int a, int n){
        if (n == 0){
            return 1;
        }else {
            return a*powerOfNumber(a, n - 1);
        }
    }
    public static void main(String [] args){
        int a = 2;
        int n = 10;
        int result = powerOfNumber(a, n);
        System.out.println(result);
    }

}
