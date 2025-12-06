package Stack;

public class Stack {
    public int[] arr = new int[10];
    public int pointer = -1;


    public void push(int inp){
        if(pointer==arr.length-1){
            System.out.println("Stack Overflow! ");
            return;
        }
        pointer++;
        arr[pointer] = inp;
    }

    public int pop(){
        if(pointer == -1){
            System.out.println("Nothing in Stack!");
            return 0;
        }
        int data = arr[pointer];
        pointer--;
        return data;
    }

    public void printElements(){
        for(int i = 0;i<10;i++){
            System.out.println(arr[9-i]);
        }
    }
}
