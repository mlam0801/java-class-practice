public class FillInTheBlankQuestion extends ObjectiveQuestion{

    public FillInTheBlankQuestion(int points, int difficulty, int answerSpace, String questionText,String correctAns){
        super(points,difficulty,answerSpace,questionText, correctAns);
    }

    public String toString(){
        return questionText + "\n";
    }

    public String toAnswerString(){
        return "Answer: " + correctAnswer + "\n";
    }
    




}
