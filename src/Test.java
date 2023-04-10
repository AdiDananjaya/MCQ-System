import java.io.File;
import java.util.Scanner;

public class Test extends ReadFile {
    ReadFile reader = new ReadFile();
    Scanner choice;
    File dir = new File("MCQtes");
    public void chooseTheTest() {
        showFiles (dir.listFiles());
        choice = new Scanner(System.in);
        String[] f = dir.list();
        System.out.print("\nChoose your test: ");
        int userChoice = choice.nextInt() -1;
        String path = "MCQtes/" + f[userChoice];
        reader.startTest(path);
    }

    public void showFiles(File[] files){
        for (int i = 0; i < files.length; i++){
            System.out.println("Available MCQ set: " + files[i].getName().replace(".csv","") + "(choose " + (i + 1) + ")");
        }
    }
}
