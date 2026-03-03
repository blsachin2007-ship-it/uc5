public class BannerAppUC5 {
    public static void main(String[] args) {
        // Declare and initialize a String array in a single statement using array literal syntax
        // Each line is constructed using String.join() to combine characters
        String[] bannerLines = {
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),              // Line 1: 10 asterisks
            String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", "*"),              // Line 2: asterisk, 8 spaces, asterisk
            String.join("", "*", " ", "O", "O", "P", "S", " ", "B", " ", "*"),              // Line 3: asterisk, "OOPS B", asterisk
            String.join("", "*", " ", "B", "a", "n", "n", "e", "r", " ", "*"),              // Line 4: asterisk, "Banner", asterisk
            String.join("", "*", " ", "A", "p", "p", " ", "U", "C", "5", "*")              // Line 5: asterisk, "App UC5", asterisk
            String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", "*"),              // Line 6: asterisk, 8 spaces, asterisk
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")               // Line 7: 10 asterisks
        };
        
        // Use a for-each loop to iterate through the array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}