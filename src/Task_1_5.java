import java.util.Scanner;

public class Task_1_5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);

        int nLettrs = 0, nSpaces = 0, nNumb = 0, nOthers = 0;

        for(int i = 0; i < str.length(); i++){
            if (Character.isWhitespace(str.charAt(i))){
                nSpaces++;
            }else if (Character.isDigit(str.charAt(i))){
                        nNumb++;
                } else if (Character.isLetter(str.charAt(i))){
                            nLettrs++;
                        } else nOthers++;
        }

        System.out.println("String: " + str);
        System.out.println("Lettres: " + nLettrs);
        System.out.println("Spaces: " + nSpaces);
        System.out.println("Numbers: " + nNumb);
        System.out.println("Others: " + nOthers);

    }
}