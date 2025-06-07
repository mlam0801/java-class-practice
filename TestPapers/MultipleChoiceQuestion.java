public class MultipleChoiceQuestion extends ObjectiveQuestion{
    String possibleAnswers[] = new String[3];
    String correctAnswer;

    public MultipleChoiceQuestion(int points, int difficulty, int answerSpace, String questionText, String posAns[], String correctAns){
        super(points, difficulty, answerSpace, questionText, correctAns);
        correctAnswer = correctAns;
        for (int i=0;i < 3;i++){
            possibleAnswers[i] = posAns[i];
        }
    }

    public String toString(){
        String Result="";
        Result = questionText + "\n";
        for(int i = 0; i < 3; i++){
            Result += (i+1) + ".) " +possibleAnswers[i] + "\n";
        }
        Result += "4.) " + correctAnswer + "\n";
        return Result;
    }

    public String toAnswerString(){
        String Result="";
        Result = questionText + "\n";
        for(int i = 0; i < 3; i++){
            Result += + (i+1) + ".) " +possibleAnswers[i] + "\n" ;
        }
        Result += "4.) ***" + correctAnswer + "\n";
        return Result;
    }
}
