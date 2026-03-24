public class Task8 {
    public static boolean checkDigits(String s, int i){
        if (i == s.length()){
            return true;
        }
        if(!Character.isDigit(s.charAt(i))){
            return false;
        }
        return checkDigits(s, i + 1);
    }
    public static void main(String[] args){
        String s = "12345d6";
        if(checkDigits(s, 0)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
