package InterviewQuestion_01;

public class Grade_Calculator {
    public static void main(String[] args) {
        int score = 85;
        char grade ;
        if (score >= 90 && score <=100){    //&& give the value if both the statement is tue or false
            grade = 'A' ;
        } else if (score >=80 && score <90) {
            grade = 'B';
        } else if (score >=70 && score <80) {
            grade = 'B';
        } else if (score >=60 && score <70) {
            grade = 'B';
        }else {
            grade = 'F';
        }
        System.out.println("Your grade is: " + grade);
    }
}
