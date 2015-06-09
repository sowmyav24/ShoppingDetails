import java.util.Scanner;

public class Items {
    public String[] parseInput(String input) {
        String[] subString = input.split(" ");
        for (String s : subString) {
            System.out.println(s);
        }
        return subString;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String input= in.nextLine();
        Items items=new Items();
        items.parseInput(input);
    }
}
