public class ObjectiveQuestion extends Question{

    String correctAnswer;

    public ObjectiveQuestion(int points, int difficulty, int answerSpace, String questionText,String correctAns){
        super(points,difficulty,answerSpace,questionText);
        correctAnswer=correctAns;
    }

    public String toString(){
        return questionText + "\n";
    }

    public String toAnswerString(){
        return "Answer: " + correctAnswer + "\n";
    }
}

