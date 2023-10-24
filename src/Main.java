import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(method(word));
    }

    static String method(String word ) {
        String newWord = word.trim().toUpperCase();
        for (int i = 0; i < word.length(); i++) {
            char letter = newWord.charAt(i);
            if(letter == 'a' || letter == 'A'){
                return  newWord.substring(0, i);
            }
        }
        return "Не содержит";
    }
}