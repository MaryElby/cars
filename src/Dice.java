import java.util.Random;
public class Dice {
    private int dicevalue;

    public int getDicevalue() {
        return dicevalue;
    }

    public void setDicevalue(int dicevalue) {
        this.dicevalue = dicevalue;
    }

    public int throwDice(Dice thisdice){
        int Dicevalue = ((int) (Math.random() * 6));
        //Get rid of zero - a dice doesn't have a zero
        if (Dicevalue ==0)
        {
            Dicevalue=1;
        }
        //System.out.println(Dicevalue);
        return Dicevalue;
    }
}
