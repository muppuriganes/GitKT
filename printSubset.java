import java.util.*;
public class printSubset {
    public static void printSubSet (ArrayList<Integer> subset) {
        for(int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if(n == 0) {
            printSubSet(subset);
            return;
        }

        //do add
        subset.add(n);
        findSubsets(n-1, subset);
        
        //Do not add
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    public static void main(String[]args){
            int n = 5;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}