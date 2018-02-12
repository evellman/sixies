//********************************************************************
//  Coin.java       Author: Lewis/Loftus/Cocking
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************

import java.util.Random;

public class Coin
{
   private final int HEADS = 0;
   private final int TAILS = 1;

   private int face;
   private double value;
   private char type;

   /**-----------------------------------------------------------------
   //  Sets up the coin by setting value and type and flipping it initially
   */
   public Coin (double amount, char type)
   {
       value = amount;
       this.type = type;
       flip();
   }

   /**-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   */
   public void flip ()
   {
      face = (int) (Math.random() * 2);
   }

   /**-----------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
        @return boolean, true if heads
   */
   public boolean isHeads ()
   {
      return (face == HEADS);
   }

   public double getValue()
   {
       return value;
    }
    
   public char getType()
   {
       return type;
    }
    
   /**-----------------------------------------------------------------
   //  Returns the type of coin and value as a string
        @return String
   */
   public String toString()
   {
      String result = "";
      result += (type + " " + value);
      return result;
   }
}
