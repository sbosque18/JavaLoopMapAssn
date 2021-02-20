package loopMap;
import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>(5);
        int sum=0;
        int product=1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int line;
  
        for(int i = 0; i < 5; i++){
            System.out.println("Enter an Integer");
            line = Integer.parseInt(scanner.nextLine());
            numbers.add(i, line);
            sum+=line;
            product*=line;
            if(line > max){
                max = line;
            }
            if(line < min){
                min = line;
            }
        }
        System.out.println("sum " + sum + " product " + product + " max " + max + " min " + min);
        
        HashMap<String, String> inventory = new HashMap<String, String>();
        inventory.put("Mazda", "M3");
        inventory.put("Ford", "Bronco");
        inventory.put("Nissan", "Altima");
        inventory.put("Honda", "Accord");

        String model="";
        System.out.println("what model of car are you looking for?");
        model = scanner.nextLine();
        if(inventory.containsKey(model)){
            System.out.println("We have " + model + " it is a " + inventory.get(model));
        }
        else {
            System.out.println("We do NOT have " + model);
        }


    }





}