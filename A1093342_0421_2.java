import java.util.*;
public class A1093342_0421_2 {
    public static void main (String[] args){
        int year, month, date;

        System.out.print("Enter a date in (YYYY/MM/DD or MM/DD/YYYY): ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] parts = input.split("/");
        if(parts.length == 3 && parts[0].length() == 4){
            year = Integer.parseInt(parts[0]);
            month = Integer.parseInt(parts[1]);
            date = Integer.parseInt(parts[2]);
        }else if(parts.length == 3 && parts[2].length() == 4){
            year = Integer.parseInt(parts[2]);
            month = Integer.parseInt(parts[0]);
            date = Integer.parseInt(parts[1]);
        }else{
            System.out.println("Invalid");
            return;
        }

        System.out.println("Year    : " +year);
        System.out.println("Month   : " +month);
        System.out.println("Date    : " +date);
    }
}
