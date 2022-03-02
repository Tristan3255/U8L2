import java.util.ArrayList;

public class Arrays {


    public Arrays(){

    }
        public static boolean isDuplicate(int[][] array){
            for(int c = 0; c < array[0].length; c++){
                for(int r = 0; r < array.length - 1; r++){
                    int currentNum = array[r][c];
                    for(int x = r+1; x < array.length; x++){
                        if(currentNum == array[x][c]){
                            return true;
                        }
                    }
                }
            }
            return false;
        }
}
