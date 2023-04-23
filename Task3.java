package class12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
       /* Write a program that reads two people's first
        names and if they expecting boy or girl?
                Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Mom's first name?");
        String name1=scan.nextLine();
        System.out.println("Dad's first name?");
        String name2=scan.nextLine();
        System.out.println("Gender");
        String g=scan.nextLine();
        String boyName=name2.substring(0,3).toUpperCase()+name1.substring(2,4).toUpperCase();
        String girlName=name1.substring(0,2).toUpperCase()+name2.substring(3,6).toUpperCase();
        if(g.equals("boy")){
            System.out.println(boyName);
        }else{
            System.out.println(girlName);
        }
    }
}
