public class Coin
{
    private double value;
    private char type;
    
    public Coin(double value, char type)
    {
        this.value = value;
        this.type = type;
    }
    
    public double getValue()
    {
        return value;
    }
    
    public char getType()
    {
        return type;
    }
    
    public String toString()
    {
        String result;
        
        if (type == 'p')
        {
            result = "Penny\t" + value;
        }
        else if (type == 'n')
        {
            result = "Nickel\t" + value;
        }
        else if (type == 'd')
        {
            result = "Dime\t" + value;
        }
        else if (type == 'q')
        {
            result = "Quarter\t" + value;
        }
        else
        {
            result = "???";
        }
        
        return result;
    }
}