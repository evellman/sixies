//Lizzie and Brad


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
   public void addCD (CD cd)
   {// must rewrite this method!!!!!!!!!
       int x = 0;
       if (collection.size() == 0)
       {
           collection.add(cd);
        }
        for(int i = 0; i < collection.size();i++)
        {
            if (cd.getRating()> collection.get(i).getRating())
            {
                collection.add(i,cd);
                i = collection.size();
            }
        }
       
        collection.add(cd);
     
      totalCost += cd.getPrice();
      //count++;
      
      //our attempt :(
      
       // if (count == collection.size())
      //   increaseSize();

      //collection[count] = new CD (title, artist, cost, tracks);
      //collection.add(new CD (title, artist, cost, tracks, rating));
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
   
   

   public CD removeCD(String CDName)
   {
       int r = collection.indexOf(CDName);
       CD new_cd = collection.remove(r);
       
       return new_cd;
    }
   
    //couldn't figure out how to do this in CD
    public CD cheapest(int rate)
   {
       CD cheapest = new CD("","",100,0,rate);
       for(int i = 0; i < collection.size(); i++)
       {
           if (collection.get(i).getRating() == rate)
           {
               if (collection.get(i).getPrice() < cheapest.getPrice())
               {
                   cheapest = collection.get(i);
                }
            }
        }
       
       
       return cheapest;
    }
    
    public ArrayList<CD> choices(double low, double high, double rating)
    {
        ArrayList<CD> temp = new ArrayList<>();
        
        for(int i = 0; i < collection.size();i++)
        {
            if (collection.get(i).getRating() == rating)
            {
                if(collection.get(i).getPrice() > low && collection.get(i).getPrice() < high)
                {
                    temp.add(collection.get(i));
                }
            }
        }
        return temp;
    }
    
    public void print()
    {
        for(int i = 0; i < collection.size();i++)
        {
            System.out.printf("Artist: %10s \n", collection.get(i).getArtist());
        }
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







