public class Test {
    ObjectiveQuestion[] questions;
    int totalPoints;
    
    public Test(ObjectiveQuestion[] questions){
        this.questions = questions;
        this.totalPoints = 0;
        for(int i = 0; i < questions.length; i++){
            this.totalPoints += questions[i].points;
        }
    
    }
    public String toString(){
        String result="";
        for(int i = 0; i < questions.length ; i++){
            if(!(questions[i] == null)){
               result += questions[i].toString(); 
            }
        }
        return result;
    }

    public String toAnswerString(){
        String result="";
        for(int i = 0; i < questions.length ; i++){
            if(!(questions[i] == null)){
               result += questions[i].toAnswerString(); 
            }
        }
        return result;
    }



}