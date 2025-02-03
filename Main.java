import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        second();
    }
    
        public static void second(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number for its factorial: ");
        
        int num = scanner.nextInt();
        
        int answer = num;
        for (int i = num -1; i > 0 ; i--){
        answer *= i;
        
        }
        System.out.println("The factorial of " + num + " is " + answer); 
        
    }
}
