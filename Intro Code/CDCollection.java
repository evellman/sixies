//********************************************************************
//  CDCollection.java       Author: Lewis/Loftus/Cocking
//
//  Represents a collection of compact discs.
//********************************************************************

import java.text.NumberFormat;
import java.util.*;


public class CDCollection
{
   //private CD[] collection;
   ArrayList <CD> collection = new ArrayList<>();
   private int count;
   private double totalCost;
   /**
   *  Creates an initially empty collection.
   */
   public CDCollection ()
   {
      //collection = new CD[100];
      //collection.add()
      //count = 0;
      totalCost = 0.0;
   }

   /**
   *  Adds a CD to the collection, keeping list in order according to
      rating.
   *  @param
   */
   public void addCD (String title, String artist, double cost,
                      int tracks, double rating)
   {// must rewrite this method!!!!!!!!!

       
      // if (count == collection.size())
      //   increaseSize();

      //collection[count] = new CD (title, artist, cost, tracks);
      collection.add(new CD (title, artist, cost, tracks, rating));
      totalCost += cost;
      //count++;
   }

   /**
   *  Returns a report describing the CD collection.
   */
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      String report = "******************************************\n";
      report += "My CD Collection\n\n";

      report += "Number of CDs: " + count + "\n";
      report += "Total cost: " + fmt.format(totalCost) + "\n";
      report += "Average cost: " + fmt.format(totalCost/count);

      report += "\n\nCD List:\n\n";

      
      for (int cd = 0; cd < collection.size(); cd++)
         report += collection.get(cd).toString() + "\n";

      return report;
   }
   
   
   //WHAT ARE WE SUPPOSED TO RETURN???
   public void removeCD(String CDName)
   {
       int r = collection.indexOf(CDName);
       collection.remove(r);
       
       //return collection.get(r);
       
    }
   
    //couldn't figure out how to do this in CD
    public CD cheapest(int rate)
   {
       ArrayList <CD> temp = new ArrayList<>();
       for(int i = 0; i < collection.size(); i++)
       {
           if (collection.get(i).getRating() == rate)
           {
               temp.add(collection.get(i));
            }
        }
        
       for(int i = 0; i < temp.size()-1; i++)
       {
           if (temp.get(i).getPrice() < temp.get(i+1).getPrice())
           {
               temp.remove(temp.get(i+1));
            }
           
        }
       CD cheap = temp.get(0); 
       
       return cheap;
    }
   //-----------------------------------------------------------------
//    //  Doubles the size of the collection by creating a larger array
//    //  and copying the existing collection into it.
//    //-----------------------------------------------------------------
//    private void increaseSize ()
//    {
//       CD[] temp = new CD[collection.length * 2];
// 
//       for (int cd = 0; cd < collection.length; cd++)
//          temp[cd] = collection[cd];
// 
//       collection = temp;
//    }
}







