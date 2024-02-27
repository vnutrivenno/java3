import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            
            // Удаляем пробелы и приводим к нижнему регистру
            input = input.replaceAll("\\s", "").toLowerCase();
            
            if (isPalindrome(input)) {
                System.out.println("Это палиндром!");
            } else {
                System.out.println("Это не палиндром.");
                break; // Завершаем программу, если строка не палиндром
            }
        }
        
        scanner.close();
    }
    
    // Функция для проверки является ли строка палиндромом
    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
