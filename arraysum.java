public class Arraysum{
    public static void main(String[]args){
        int[] numbers = {5,10,15,20,25};
        int sum = 0;
        for (int i = 0; 1<numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Sum of elements in tje array;" +sum);
        }
}
