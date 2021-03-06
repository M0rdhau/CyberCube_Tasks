import tasks.LetterChecker;
import tasks.FruitBasket;

public class main {
    
    public static void main(String[] args){
        checkLetters("", "f");
        System.out.println(FruitBasket.collectFruits(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}));
    }

    public static void checkLetters(String original, String added){
        String diff = LetterChecker.compare(original, added);
        if(diff.equals("")){
            System.out.println("Strings are identical");
        }else{
            System.out.println("Added letter: " + diff);
        }
    }
}
