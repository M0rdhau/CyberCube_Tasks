package tasks;

import java.util.*;

public class FruitBasket {

    public static int collectFruits(int[] trees){
        //basket 1 holds the latest type of fruit, basket 0 holds the one before that
        //-1 means an empty basket
        int[] baskets = {-1, -1};
        int maxFruits = 0;
        int fruitsNow = 0;
        int lastConsecFruits = 0;
        for(int fruit : trees){
            if(baskets[1] == fruit ){
                fruitsNow++;
                lastConsecFruits++;
            }else{
                //if our old basket is not empty, only leave the fruits we picked the last
                //if this is the max amount of fruits, record it
                if(baskets[0] != -1 && baskets[0] != fruit){
                    if(fruitsNow > maxFruits){
                        maxFruits = fruitsNow;
                    }
                    fruitsNow = lastConsecFruits;
                }
                //latest fruit type becomes old, new tree fruit type becomes latest
                baskets[0] = baskets[1];
                baskets[1] = fruit;
                fruitsNow++;
                lastConsecFruits = 1;
            }
        }
        if(fruitsNow > maxFruits){
            maxFruits = fruitsNow;
        }


        return maxFruits;
    }

}
