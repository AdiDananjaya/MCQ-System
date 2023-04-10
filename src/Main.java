import java.util.Scanner;

public class Main {
    static Scanner sc = null;
    public static Student s;
    public static void main(String[] args) {
        fillYourName();
        selectYourMCQ();
        showResult();
    }

    private static void showResult() {
        double finalScore = Student.getScore();
        int finalwrongans = Student.getWrongAnswer();
        int finalCorrectAns = Student.getCorrectAnswer();
        String name = s.name;
        System.out.println("You answered "+ finalCorrectAns+ " Questions right,"+ finalwrongans + " Questions wrong from "+ (finalCorrectAns+finalwrongans) +" Questions");
        System.out.println("Name: " + name +" Score: " + (finalScore/(finalCorrectAns+finalwrongans))*100+"%");
    }
    private static void selectYourMCQ() {
                Test test1 = new Test();
                test1.chooseTheTest();
            
    }
    public static void fillYourName() {
                    sc = new Scanner(System.in);
                    System.out.print("Welcome to MCQ Test! \n\nPlease enter your name: ");
                    String name = sc.nextLine();
                    Student students = new Student(name);
                    students.setName(name);
                    System.out.println("Hi " + students.name + " do your best :) \n");
                
            }
}
