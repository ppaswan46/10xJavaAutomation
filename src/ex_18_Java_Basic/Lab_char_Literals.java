package ex_18_Java_Basic;

public class Lab_char_Literals {
    public static void main(String[] args) {
        char c1 = 'A';  //A to Z , a to z, @#$%^^&&
        // c2 = "A"  //this is not chat it is a String
        char c2 = ' '; //blank space

        //Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char backspace = '\b';
        char carriage_return = '\r';

        System.out.println("PrashantPaswan");
        System.out.println("Prashant"+new_line+"Paswan");
        System.out.println("Prashant"+tab_line+"Paswan");
        System.out.println("Prashant"+backspace+"Paswan");
        System.out.println("Prashant"+carriage_return+"Paswan");

    }
}
