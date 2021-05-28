package tasks;

import java.util.*;

public class FruitBasket {

    public static int collectFruits(int[] trees){
        List<Integer> bigSelection = new ArrayList<>();
        Set<Integer> currentFruits = new HashSet<>();
        int biggestSize = 0;

        for (int fruit :
                trees) {
            if(currentFruits.contains(fruit)){
                bigSelection.add(fruit);
            }else{
                if(currentFruits.size() != 2){
                    currentFruits.add(fruit);
                    bigSelection.add(fruit);
                }else{
                    if(biggestSize < bigSelection.size()) { biggestSize = bigSelection.size(); }
                    List<Integer> tempFruits = new ArrayList<>(bigSelection);
                    Collections.reverse(tempFruits);
                    bigSelection.clear();
                    int lastFruit = tempFruits.get(0);
                    currentFruits.clear();
                    currentFruits.add(lastFruit);
                    currentFruits.add(fruit);
                    for (int oldFruit :
                            tempFruits) {
                        if (oldFruit == lastFruit) {
                            bigSelection.add(oldFruit);
                            bigSelection.add(fruit);
                        }else{
                            break;
                        }
                    }
                }
            }
        }
        if(biggestSize < bigSelection.size()) { biggestSize = bigSelection.size(); }
        return biggestSize;
    }

}
