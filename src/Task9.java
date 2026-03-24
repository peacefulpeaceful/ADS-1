public class Task9 {
    public static int countElements(String s, int i){
        if (i == s.length()){
            return 0;
        }else {
            return 1 + countElements(s, i + 1);
        }
    }
    public static void main(String[] args){
        String s = "hello";
        int result = countElements(s, 0);
        System.out.println(result);
    }
}

