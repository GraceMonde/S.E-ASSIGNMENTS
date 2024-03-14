import java.util.Scanner;

//In this class the number of die are specified, rolling is simulated and the results are printed out for 1 round
public class DiceGame{
    private Die dice;

    //This constructor specifies the number of dice in the game
    public DiceGame (int numDice) {
        this.dice = new ArrayList();
         for (int i = 0; i < numDice; i++){
            dice.add(new Die());
        }
    }

    //This method simulates the rolling of the dice in the game, it created a list of the values rolled
    public  rollDice(){
        Integer rolledValues = rollDice();
        for (Die dice : numDice){
            rolledValues.add(die.roll()); //call the roll method in Die class and adds them to the list
        }
        return rolledValues;
    }

    //This plays 1 round of the game and calls the rollDice method to print out the values rolled
    public void playRound() {
        Integer rolledValues = rollDice();
        System.out.println("Rolled: " + rolledValues);
    }
}

public class Die{
    private int numSides;

    public Die(){
        this.numSides = 6;
    } 

    public int roll(){
        return (int) (Math.random() * numSides) + 1; 
    }

    public int getNumSides(){
        return numSides;
    }
} 



public class Person{

    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void takeTurn(DiceGame diceGame){
        System.out.println(name + "'s turn: ");
        diceGame.playRound();
    }
} 

public class SimpleGameDie{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        DiceGame game = new DiceGame(2);

        System.out.println("Enter your name: ");
        String name = scn.nextLine();

        Person player1 = new Person(name);
        player1.takeTurn(game);
    }
}
