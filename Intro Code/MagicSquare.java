public class MagicSquare
{
    public static int magicNum;
    public static int[][] square;
    
    public MagicSquare(int[][] magic_square)
    {
        for(int j = 0; j < magic_square[0].length; j++)
        {
            magicNum += j;
        }
        square = magic_square;
    }
    
    public static boolean isMagic()
    {
        int total = 0;
        for (int i = 0; i < square.length;i++)
        {
            for (int j = 0; j < square[i].length;j++)
            {
                total += j;
            }
            
            if (total != magicNum)
            {
                return false;
            }
            
            total = 0;
        }
        return true;
    }
}