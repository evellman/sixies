//Lizzie Ellman
//2-6-18

public class MagicSquare
{
    public static int magicNum;
    public static int[][] square;
    
    public MagicSquare(int[][] magic_square)
    {
        square = magic_square;
        
        magicNum = addRow(0);
        
    }
    
    /**
     * changes magic square and finds potential magic num
     */
    public static void setMagicSquare(int[][] magic_square)
    {
        square = magic_square;
        magicNum = addRow(0);
    }
    
    /**
     * return the magic number
     */
    public static int getMagicNum()
    {
        return magicNum;
    }
    
    /**
     * adds up rows, columns, and diagonals 
     * returns if it is a magic square or not
     */
    public static boolean isMagic()
    {
        for (int i = 0; i < square.length; i++)
        {
            if (addRow(i) != magicNum)
            {
                return false;
            }
        }
        
        for(int j = 0; j < square[0].length; j++)
        {
            if(addCol(j) != magicNum)
            {
                return false;
            }
        }
        
        if (addDiag1() != magicNum)
        {
            return false;
        }
        
        if (addDiag2() != magicNum)
        {
            return false;
        }
        
        return true;
    }
    
    /**
     * adds given row
     * return sum
     */
    private static int addRow(int row)
    {
        int num = 0;
        for(int i = 0; i < square[row].length; i++)
        {
            num += square[row][i];
        }
        return num;
    }
    
    /**
     * adds given column
     * return sum
     */
    private static int addCol(int col)
    {
        int num = 0;

        for (int j = 0; j < square[0].length; j++)
        {
            num += square[0][j];
        }

        return num;
    }
    
    /**
     * adds diagonal (from top left to bottom right)
     * return sum
     */
    private static int addDiag1()
    {
        int num = 0;
        
        for(int i = 0; i < square.length; i++)
        {
            num += square[i][i];
        }
        
        return num;
    }
    
    /**
     * adds diagonal (from top right to bottom left)
     * return sum
     */
    private static int addDiag2()
    {
        int num = 0;

        for (int i = 0; i < square.length; i++)
        {
            num += square[i][square.length-(1+i)];
        }
        
        return num;
    }
}