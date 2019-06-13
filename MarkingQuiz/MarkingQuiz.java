import java.util.Scanner;
import java.io.*;

public class MarkingQuiz
{

    public static void main(String args[]){
        File f = new File("quiz responses.csv");

        try{
            Scanner input = new Scanner(f);
            String name = input.nextLine();
            final String[] ans = input.nextLine().split(",");
            System.out.print("ANSWER IS ");
            for(int i=1; i<ans.length; i++)
                System.out.print(ans[i]);
                System.out.println();
            int score = 0;
            int totalScore = 0;
            int number = 0;
            while(input.hasNext()){
                number++;
                score = 0;
                String str = input.nextLine();	
                //System.out.println("\n"+str);
                String[] marks = str.split(","); 
                System.out.print("["+marks[0]+"]");
                for(int i=1; i<marks.length; i++){
                    if(marks[i].equals(ans[i]))score++;
                    //System.out.print(marks[i]);
                   
                }
                //
                System.out.println(" SCORE: "+score+"/8");
                totalScore+=score;
            }
            System.out.println("Average Score: "+totalScore/number+"/8");
        }

        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }


}