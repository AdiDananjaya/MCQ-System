public class Student {
    String name;
    static int correctAnswer;
    static int wrongAnswer;
    static double score;
    public Student(String input) {
        this.name = input;
        Main.s = this;
    }
    public static double getScore() {
        return score;
    }
    public String setName(String name) {
        return this.name = name;
    }

    public static int getWrongAnswer(){
        return wrongAnswer;
    }

    public static int getCorrectAnswer(){
        return correctAnswer;
    }
}
