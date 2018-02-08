


import java.util.*;

public class Purse
{
    public static void main(String[] args)
    {
        Coin coin1 = new Coin(.01,'p');
        Coin coin2 = new Coin(.10,'d');
        Coin coin3 = new Coin(.25,'q');
        Coin coin4 = new Coin(.25,'q');
        Coin coin5 = new Coin(.05,'n');
        
        ArrayList <Coin> pocket = new ArrayList<>();
        
        pocket.add(coin1);
        pocket.add(coin2);
        pocket.add(coin3);
        pocket.add(coin4);
        pocket.add(coin5);
    }
}