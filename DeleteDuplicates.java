public class DeleteDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) {
            return 0;
        }
        //int i=0;
        int j = 0;
        for(int i=1; i<nums.length; i++){
            if( nums[j]!= nums[i]) {
                nums[++j]=nums[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
       int[] nums= {1,2,2,3,4,4,4};
       DeleteDuplicates remover =  new DeleteDuplicates();
       int newLength = remover.removeDuplicates(nums);
       
       System.out.print("Remover Duplicates for the arrays:");
       int i;

       for (i=0; i < newLength; i++) {
        System.out.print(nums[i]+" ");
       }

    }
}
