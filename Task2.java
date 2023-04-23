package class12;

public class Task2 {
    public static void main(String[] args) {
        String day="Sunday";
        String rev="";
        for (int i = day.length()-1; i >=0 ; i--) {
            rev=rev+day.charAt(i);
        }
        System.out.println(rev);
    }
}
