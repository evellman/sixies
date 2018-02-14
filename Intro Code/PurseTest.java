//Lizzie Ellman


import java.util.*;
public class PurseTest
{
    public static void main(String[] args)
    {
        ArrayList <Coin> coins = new ArrayList<>();
        Purse pocket = new Purse(coins);
        
        Coin coin1 = new Coin(.25,'q');
        Coin coin2 = new Coin(.10,'d');
        Coin coin3 = new Coin(.25,'q');
        Coin coin4 = new Coin(.25,'q');
        Coin coin5 = new Coin(.25,'q');
        Coin coin6 = new Coin(.05,'n');
        
        pocket.addCoin(coin1);
        pocket.addCoin(coin2);
        pocket.addCoin(coin3);
        pocket.addCoin(coin4);
        pocket.addCoin(coin5);
        pocket.addCoin(coin6);
        
        Scanner scan = new Scanner(System.in);
        char var = 'o';
        while (var != 'Q')
        {
            System.out.println("\nA - Add a coin");
            System.out.println("R - Remove a coin");
            System.out.println("D - Display the purse");
            System.out.println("Q - Quit");
            var = scan.next().charAt(0);
            
            if (var == 'A')
            {
                System.out.println("What is the value of the coin? ");
                double value = scan.nextDouble();
                Coin coin = new Coin(0,'z');
                if (value == .25)
                {
                    coin.setValue(.25);
                    coin.setType('q');
                }
                else if (value == .1)
                {
                    coin.setValue(.10);
                    coin.setType('d');
                }
                else if (value == .05)
                {
                    coin.setValue(.05);
                    coin.setType('n');
                }
                else
                {
                    coin.setValue(.01);
                    coin.setType('p');
                }

                pocket.addCoin(coin);
            }
            else if (var == 'R')
            {
                System.out.println(pocket);
                System.out.println("What is the index of the coin you would like to remove? ");
                int remove_index = scan.nextInt();
                pocket.removeCoin(remove_index);
            }
            else if (var == 'D')
            {
                System.out.println(pocket);
            }
        }
        System.out.println("Thanks for using the purse program!");
    }
}