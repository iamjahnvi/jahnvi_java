import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {1 ,2 , 3 ,4 , 5, 6 , 7 , 8 , 9 ,10};
        System.out.print("Enter the element you are searching for : ");
        int input = sc.nextInt();
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == input){
                System.out.println(input + " is found at index " + i + ".");
            }
        }
    }
}
// whatever argument we will pass in terminal , that is called as Command Line Argument, here we have to pass the first element of array - args and that will be displayed as output.

