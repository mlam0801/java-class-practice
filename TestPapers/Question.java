public class Question {

    final int MIN_DIFFICULTY = 1;
    final int MAX_DIFFICULTY = 5;
    
    int points;
    int difficulty;
    int answerSpace;
    String questionText;

    public Question(int points, int difficulty, int answerSpace, String questionText){

        this.points = points;
        this.difficulty = difficulty;
        this.answerSpace = answerSpace;
        this.questionText = questionText;

    }
    
    public String toString(){
        return questionText;
    }

}
