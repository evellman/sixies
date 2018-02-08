public class AccountTest 
{
    public static void main (String[] args)
    {
        Address home0 = new Address("123 Maple Street", "Lisle", "IL", 12473);
        Address home1 = new Address("123 Gartner Road", "Crab", "IL", 60540);
        Address home2 = new Address("356 Chicago Ave", "Aurora", "IL", 60500);
        Address home3 = new Address("999 Blerg Street", "Naperville", "IL", 56372);
        Address home4 = new Address("135 Yog Lane", "Bristol", "UK", 83459);
        Address home5 = new Address("098 Slops Road", "Naperville", "IL", 61230);
        Address home6 = new Address("123 Maple Road", "Lisle", "IL", 98756);
        Address home7 = new Address("654 February Street", "Naperville", "IL", 13365);
        Address home8 = new Address("876 Frog Street", "Lisle", "IL", 60350);
        Address home9 = new Address("987 Shark Ave", "Clam", "IL", 56789);
        
        
        Account p0 = new Account("Homer Simpson" , 0001, 1090.45, home0);
        Account p1 = new Account("Megan Brimstead",0002, 786.54,  home1);
        Account p2 = new Account("Karri Meirey",   1564, 4571.60, home2);
        Account p3 = new Account("Liz Wilson",     1349, 2034.52, home3);
        Account p4 = new Account("Jack Hagested",  2389, 280.67,  home4);
        Account p5 = new Account("Bill Hagested",  2391, 1008.53, home5);
        Account p6 = new Account("Emy Hayes",      3598, 1260.84, home6);
        Account p7 = new Account("Doug Dralle",    4562, 5783.90, home7);
        Account p8 = new Account("Eric Willhelm",  3208, 3420.75, home8);
        Account p9 = new Account("Megan MulCahey", 4568, 9041.49, home9);
        
        Account[] accounts = {p0,p1,p2,p3,p4,p5,p6,p7,p8,p9};
        
        int[] hash_nums = new int[accounts.length];
        
        for (int i = 0; i < accounts.length; i++)
        {
            hash_nums[i] = accounts[i].hash_code();

        }
        
        for (int num : hash_nums)
        {
            System.out.println(num);
        }
    }
}