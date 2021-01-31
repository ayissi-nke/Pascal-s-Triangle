
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleGenerator
{

    
    public PascalsTriangleGenerator()
    {
    }

    public static  int[][] generateTriangle(  final int  numRows)
    {
        // list of a list of array
        List<int[]> temp = new ArrayList<>();
        
        
        for (int i = 0; i < numRows; ++i)
        {   
            /* creating an array of size equals to the row position +1 
               

            */
            int[] tab = new int[i+1] ;
            
            for (int j = 0; j <= i; ++j)
            {   
                /*ensurint that value element of the first column and element where 
                index i = index j is 1*/
                if (j == 0 || j == i)
                {
                    
                      tab[j] = 1;
                } else
                {
                      // set the entry to be the sum of the adjacent element of the above list entry 
                       tab[j] = temp.get(i-1)[j - 1] + temp.get(i-1)[j];
                }  

            }
            
            temp.add(tab);

        }
        // converting the list of array to a 2D array to have the appropiate result
        int[][] pascalTriangle = new int[temp.size()][];
        
        for(int i = 0; i<temp.size(); i++){
            pascalTriangle[i] = temp.get(i);
        }
        
        return pascalTriangle;
    }

}


