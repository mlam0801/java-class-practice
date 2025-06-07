public class TestPapersMain {
    public static void main(String[] args){

        String posAns[] = {"Peter Griffin", "Scooby Doo", "Eric Cartman"};
        ObjectiveQuestion [] list = new ObjectiveQuestion [4];
        list[0] = new ObjectiveQuestion(4, 1, 1, "What is the city of brotherly love?", "Philadelphia");
        list[1] = new MultipleChoiceQuestion(2, 1, 1, "Who lives in a pineapple under the sea?", posAns, "Spongebob Squarepants");
        list[2] = new FillInTheBlankQuestion(6, 2, 1, "_________ was the 16th US President", "Abraham Lincoln was the 16th US President");
        list[3] = new ObjectiveQuestion(4, 1, 1, "Who invented the lightbulb?", "Thomas Edison");

        Test aTest = new Test(list);
        System.out.println(aTest);
        System.out.println("Answer Key");
        System.out.println(aTest.toAnswerString());
    }

}
