/**
 * Big O
 * 
 * 
 * קוד לא יעיל כי מספר הפעמים n
 * זה גם אותו מספר הפעולות
 * @author user
 */

public class BigOOn {
    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // קריאה לדוגמה לפונקציה עם n = 5
        printItems(5);
    }
}