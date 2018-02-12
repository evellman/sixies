
public class AccountTest 
{
    public static void main (String[] args)
    {
        Address home = new Address("123 Maple Street", "Lisle", "IL", 12473);
        
        Account p0 = new Account("Homer Simpson" , 0001, 1090.45, home);
        Account p1 = new Account("Megan Brimstead",0002, 786.54,  home);
        Account p2 = new Account("Karri Meirey",   1564, 4571.60, home);
        Account p3 = new Account("Liz Wilson",     1349, 2034.52, home);
        Account p4 = new Account("Jack Hagested",  2389, 280.67,  home);
        Account p5 = new Account("Bill Hagested",  2391, 1008.53, home);
        Account p6 = new Account("Emy Hayes",      3598, 1260.84, home);
        Account p7 = new Account("Doug Dralle",    4562, 5783.90, home);
        Account p8 = new Account("Eric Willhelm",  3208, 3420.75, home);
        Account p9 = new Account("Megan MulCahey", 4568, 9041.49, home);
        
        Account[] accounts = {p0,p1,p2,p3,p4,p5,p6,p7,p8,p9};
        
        int[] hashes = new int[accounts.length];

        
        for (int i = 0; i < accounts.length; i++)
        {
            int num = (accounts[i].hash_code()) % 100000000;
            if (num < 0)
                num *= -1;
            hashes[i] = num;
        }
        
        int[] new_accounts = new int[accounts.length * 2];
        /*
         * figure out how to put accounts into array 
         */
    }
}