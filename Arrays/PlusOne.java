package Arrays;

//Question URL:- https://leetcode.com/problems/plus-one/

public class PlusOne {
    public int[] plusOne(int[] digits){

        for (int i = digits.length-1; i >= 0; i--) {
            //If digit is 9, make it 0.
            if(digits[i]==9){
                digits[i] = 0;
            }else{
                //If it is not 9, increase the number
                digits[i]++;
                return digits;
            }
        }

        //We are here because all digits are 9
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
    public static void main(String[] args) {

        int[] input = {4,3,2,1};
        PlusOne plusOne = new PlusOne();
        int[] result = plusOne.plusOne(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
