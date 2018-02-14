//Lizzie Ellman


import java.util.*;

public class Purse
{
    private ArrayList <Coin> pocket = new ArrayList<>();
    
    public Purse (ArrayList <Coin> purse)
    {
        pocket = purse;
    }
    
    /**
     * calculates and returns total
     * @return double total
     */
    public double getTotal()
    {
        double total = 0;
        for (int i = 0; i < pocket.size(); i++)
        {
            total += pocket.get(i).getValue();
        }
        return total;
    }
    
    /**
     * adds a coin to the purse
     * @param Coin coin
     */
    public void addCoin(Coin coin)
    {
        pocket.add(coin);
    }
    
    /**
     * removes a coin from the purse
     * @param int index value
     */
    public void removeCoin(int num)
    {
        pocket.remove(num);
    }
    
    /**
     * displays each coin object (value and type)
     * @return String message
     */
    public String toString()
    {
        String result = "";
        for (int i = 0; i < pocket.size(); i++)
        {
            result += pocket.get(i) + "\n";
        }
        return result;      
    }
    
    //following methods go thru purse and find the number of each type of coin
    
    public int getDimes()
    {
        int num = 0;
        for (int i = 0; i < pocket.size(); i++)
        {
            if (pocket.get(i).getType() == 'd')
            {
                num++;
            }
        }
        return num;
    }
    
    public int getPennies()
    {
        int num = 0;
        for (int i = 0; i < pocket.size(); i++)
        {
            if (pocket.get(i).getType() == 'p')
            {
                num++;
            }
        }
        return num;
    }
    
    public int getNickels()
    {
        int num = 0;
        for (int i = 0; i < pocket.size(); i++)
        {
            if (pocket.get(i).getType() == 'n')
            {
                num++;
            }
        }
        return num;
    }
    
    public int getQuarters()
    {
        int num = 0;
        for (int i = 0; i < pocket.size(); i++)
        {
            if (pocket.get(i).getType() == 'q')
            {
                num++;
            }
        }
        return num;
    }
}