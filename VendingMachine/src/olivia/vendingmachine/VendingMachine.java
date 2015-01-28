/*Vending Machine that shows user its products. Asks user to put in money using coins, dollar bills, or five dollar bills. 
 * VM computes amount of money that user put in and lets user choose which items they want to buy.
 * VM computes how much money the user is spending and subtracts it from the money they put in from the beginning.
 * if the money the user put is greater than the money spending then VM gives change in coins.
 * if money user put is less than money spending = error
 * if money user put in is equal to money spending = no change
 */

package olivia.vendingmachine;
import java.lang.String;
import java.util.Scanner;
import java.text.*;

public class VendingMachine {

  //products in vending machine and their price
	
	static String chips = "CHIPS";//$0.75
	static String chocolate = "CHOCOLATE"; //$1.50
    static String muffin = "MUFFIN"; //$1.25
    static String nuts = "NUTS"; //$2.00
    static String poptarts = "POPTARTS"; //$2.25
    static String done ="DONE";
    
  //what vending machine accepts

    static double penny = 0.01; //$0.01
    static double nickel = 0.05; //$0.05
    static double dime = 0.10; //$0.10
    static double quarter = 0.25; //$0.25
    static double dollar = 1.00; //$1.00
    static double five = 5.00; //$5.00
    
    static DecimalFormat currency = new DecimalFormat("#.00");
    
    static boolean cash = true;
    static boolean item = true;


    static double moneyIn = 0.0; //the amount of money the user gave the machine
    static double moneyUsed = 0; //the amount of money the user is going to spend
    static double change; //the amount left over after purchase
    
    //computations
    
    static double amount; //amount being put in to the machine   
    static double selection;//items that are being bought

    //Tell user about options in vending machine
   
   
	public static void main(String[] args) { 
	
		System.out.println("Choices from this awesome vending machine include:");
		System.out.println("1. chips");
		System.out.println("2. poptarts");
		System.out.println("3. chocolate");
		System.out.println("4. muffin");
		System.out.println("5. nuts");
		
	
	
		@SuppressWarnings({ "unused", "resource" })
		Scanner keyboard= new Scanner(System.in); 
		
	    amount();  //calling method
	    selection(); //calling method
	    change();  //calling method
	}
	
	public static void showMoney(){
        System.out.println("Your total balance is: " + currency.format(moneyIn)); //shows how much money is put in with $ sign
        System.out.println("Enter money: ");   
	}
	
	//prompt the user to enter penny's, nickels, dimes, quarters, dollar bills, or 5 dollar bills to get the amount they are willing to spend.
    public static double amount() { 
    	System.out.println("Please enter money you want to spend. Vending machine takes coins, 1 dollar bills, and 5 dollar bills. Enter 0 when done.");
    	System.out.println("Enter money: ");
    	int caught = 0;
    		while(cash==true){
    			caught = 0;
    			amount = 0;
    			@SuppressWarnings("resource")
				Scanner keyboard= new Scanner(System.in);
    			try{
    				amount = keyboard.nextDouble();
    			}
    				catch (Exception e){
    					System.out.println("Error! Input was not a valid form of money.\nTry again.");
    					caught = 1;
    				}
	    			if(amount == penny){
	    				moneyIn += penny;
	    				showMoney();
	    			}
	    			else if(amount == nickel){
	    				moneyIn += nickel;
	    				showMoney();
	    			}
	    			else if (amount == dime){
	    				moneyIn += dime;
	    				showMoney();
	    			}
	    			else if(amount == quarter){
	    				moneyIn += quarter;
	    				showMoney();
	    			}
	    			else if(amount == dollar){
	    				moneyIn += dollar;
	    				showMoney();
	    			}
	    			else if(amount == five){
	    				moneyIn += five;
	    				showMoney();
	    			}
	    			else if(amount == 0 && caught == 0){
	    				cash = false;
	    				System.out.println("You have entered: $"+currency.format(moneyIn));
	    			}
	    			else if (caught == 0){
	    				System.out.println("Invalid money input. Try again.");
			
	    			}
      
    
    		}
    		return moneyIn;
    	}

    //Prompt the user to choose what they want to buy
    @SuppressWarnings("resource")
	public static double selection() { 
        
    	while(item==true){
    	        		System.out.println("Enter the name of the product that you want to buy (type \"done\" when complete).");
    	    			Scanner keyboard= new Scanner(System.in); 
    	    			String selection = keyboard.nextLine();
    	    	
    	    	selection = selection.toUpperCase(); // forces to use uppercase to make for case-insensitive string comparison
    	    			
    	    	if(selection.equals(chips)){
    	    		double chips = .75;
    	    		moneyUsed += chips;
    	    		System.out.println("That selection cost $" + chips + ". Your total spending so far is: $" + currency.format(moneyUsed));
    	    		
    	    	}
    	    	else if (selection.equals(chocolate)){
    	    		double chocolate = 1.5;
    	            moneyUsed += chocolate;
    	    		System.out.println("That selection cost $" + chocolate + ". Your total spending so far is: $" + currency.format(moneyUsed));
    	           
    			}  
    	    	else if(selection.equals(muffin)){
    	    		double muffin = 1.25;
    	            moneyUsed += muffin;
    	    		System.out.println("That selection cost $" + muffin + ". Your total spending so far is: $" + currency.format(moneyUsed));
    	                    
    	        }
    	    	else if(selection.equals(nuts)){
    	    		double nuts = 2;
    	            moneyUsed += nuts;
    	    		System.out.println("That selection cost $" + nuts + ". Your total spending so far is: $" + currency.format(moneyUsed));
    	              
    	    	}
    	    	else if(selection.equals(poptarts)){
    	    		double poptarts = 2.25;
    	            moneyUsed += poptarts;
    	    		System.out.println("That selection cost $" + poptarts + ". Your total spending so far is: $" + currency.format(moneyUsed));
    	           
    	        }
    	    	else if(selection.equals(done)){
    	        	item = false;
    	        	System.out.println("Your total spending is: $" + currency.format(moneyUsed));
    	        }	
    	        else{
    	        	System.out.println("Invalid entry. Please try again");
    	        }
    	
    		}
    	    		return moneyUsed;
    }  
    
    //computes the change in coins that the user will get
    public static String getChangeInCoins(){
    	//take care of denominations from largest to smallest (.25, .1, .05, .01)
    	int quarters, nickels, dimes, pennies;
    	quarters = nickels = dimes = pennies = 0;
    	int change_int = (int)(change * 100);
    	quarters = (change_int - change_int % 25) / 25;
    	change_int -= quarters * 25;
    	dimes = (change_int - change_int % 10) / 10;
    	change_int -= dimes * 10;
    	nickels = (change_int - change_int % 5) / 5;
    	change_int -= nickels % 5;
    	pennies = change_int;
    	String qString, dString, nString, pString;
    	qString = dString = nString = pString = "";
    	if (quarters != 0)
    		if (quarters == 1)
    			qString = quarters + " quarter\n";
    		else
    			qString = quarters + " quarters\n";
    	if (dimes != 0)
    		if (dimes == 1)
    			dString = dimes + " dime\n";
    		else
    			dString = dimes + " dimes\n";
    	if (nickels != 0)
    		if (nickels == 1)
    			nString = nickels + " nickel\n";
    		else
    			nString = nickels + " nickels\n";	
    	if (pennies != 0)
    		if (pennies == 1)
    			pString = pennies + " penny\n";
    		else
    			pString = pennies + " pennies\n";
    	return qString + dString + nString + pString;
    }
    
    public static double change(){
    	String changeInCoins = "";
    	
    	if(moneyIn>moneyUsed){
    			change = moneyIn - moneyUsed;
    			changeInCoins = getChangeInCoins();
    			System.out.println("Your change is $" + currency.format(change) + ":\n" + changeInCoins + "\nThank you for shopping at this awesome vending machine\nCome again!");
    	}
    	else if(moneyIn<moneyUsed){
    		System.out.println("Sorry, not enough money was given. Try again.");
    	}
    	else if(moneyIn==moneyUsed){
    		System.out.println("No change. Thank you for shopping at this awesome vending machine! Come again!");
    	}
    	return change;
    }
}
