public class Successors {

    public static Position findPosition(int target, int[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                if (array[i][j] == target) return new Position(i, j);
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] array){
        Position[][] successorArray = new Position[array.length][array[0].length];

        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                int successor = array[i][j] + 1;
                successorArray[i][j] = findPosition(successor, array);
            }
        }

        return successorArray;
    }




}


