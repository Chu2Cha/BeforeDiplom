package Recursion.Palindrome;

public class Palindrome {
    public static void main(String[] args){
        if(isPalindrome("А роза упала на лапу не Азора")){
            System.out.println("Эта фраза палиндром!");
        } else {
            System.out.println("Эта фраза не палиндром!");
        }
    }

    private static boolean isPalindrome(String testString) {
        String normalString = testString.trim().toLowerCase();
        if(!normalString.isEmpty()){ // пустая строка — это палиндром
            if(normalString.length() > 1){ // строка из одного символа — тоже
                char firstChar = normalString.charAt(0);
                char lastChar = normalString.charAt(normalString.length() - 1);
                return firstChar == lastChar && isPalindrome(normalString.substring(1, normalString.length() - 1));
            }
        }
        return true;
    }
}
