import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    BufferedReader reader;
    public void startTest(String fileName) {
        Scanner answer;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String output = "";
            System.out.println("\nPlease answer this question..");
            while ((output = reader.readLine()) != null) {
                String[] data = output.split(",");
                System.out.printf("%s", data[1]);
                System.out.println();
                System.out.printf("   A.%s \n   B.%s \n   C.%s \n   D.%s", data[2], data[3], data[4], data[5], data[6], data[7]);
                System.out.println("\n");
                answer = new Scanner(System.in);
                    System.out.print("Your answer: ");
                    String getAnswer = answer.nextLine();
                    System.out.println();
                    

                    if (getAnswer.equalsIgnoreCase(data[6])) {
                        System.out.println("You choose Correct Answer");
                        Student.score++;
                        Student.correctAnswer++;
                    }
                    else {
                        System.out.println("Wrong Answer. The Correct Answer is:"+ data[7] +"\n");
                        Student.wrongAnswer++;
                    }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
