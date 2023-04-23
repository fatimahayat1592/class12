package class12;

public class Task1 {
    public static void main(String[] args) {
        String word="hello";
        if(!word.isEmpty()){
            if(word.length()/2!=0 && word.length()>=3){
                int middleCharOfWord= word.length()/2;
                System.out.println(word.charAt(middleCharOfWord));
            }
        }
    }
}
