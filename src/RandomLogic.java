import java.util.Random;

public class RandomLogic {
    private static final String[] computerChoices = {"Krapow Moo", "Som Tum", "Moo kratha"};

    private String  computerChoice;

    public String getComputerChoice() {

        return computerChoice;
    }
    
    private  Random random;

    public RandomLogic(){

        random = new Random();
    }
    public void RandomFoodChoice() {
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];
    }
}
