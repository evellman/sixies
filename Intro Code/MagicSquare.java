public class MagicSquare
{
    public static int magicNum;
    public static int[][] square;
    
    public MagicSquare(int[][] magic_square)
    {
        square = magic_square;
        
        magicNum = addRow(0);
        
    }
    
    public static void setMagicSquare(int[][] magic_square)
    {
        square = magic_square;
        magicNum = addRow(0);
    }
    
    public static int getMagicNum()
    {
        return magicNum;
    }
    
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
    
    private static int addRow(int row)
    {
        int num = 0;
        for(int i = 0; i < square[row].length; i++)
        {
            num += square[row][i];
        }
        return num;
    }
    
    private static int addCol(int col)
    {
        int num = 0;

        for (int j = 0; j < square[0].length; j++)
        {
            num += square[0][j];
        }

        return num;
    }
    
    private static int addDiag1()
    {
        int num = 0;
        
        for(int i = 0; i < square.length; i++)
        {
            num += square[i][i];
        }
        
        return num;
    }
    
    private static int addDiag2()
    {
        int num = 0;
        
        for(int i = 0; i < square.length;i++)
        {
            num += square[i][square.length-1];
        }
        
        return num;
    }
}