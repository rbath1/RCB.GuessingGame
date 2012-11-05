package rcb.guessinggame;



/**
 *
 * @author Bob
 */
public class GuessingGameService {
private int answerConv;
private int theNumber = 1 + (int)(Math.random() * ((10 - 1) + 1));
private boolean checkWin = false;
private String youWin = "You Guessed the number!";
private String youLose = "Try again!";
    public GuessingGameService(){
    }
    
    public void checkGuess(String answer){
        answerConv = Integer.parseInt(answer);
        
        if (answerConv == theNumber){
            checkWin = true;
        } else {
            checkWin = false;
        }
    }
    
    public String getWin(){
        if (checkWin == true){
            return youWin;
        } else {
            return youLose;
        }
    }
    
 
    
}
