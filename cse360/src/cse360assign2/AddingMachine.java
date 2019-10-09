package cse360assign2;
/*Author: Oluwaseun G. Talabi
 *Class ID:70642
 * Assignment: #2
 * Description: This class performs a series of basic calculations based on what is inputed and computes
 * the addition of the parameters, the subtraction of parameters from the total, turning the operations 
 * performed into a string, and lastly clearing the parameters and total.
 */
public class AddingMachine {


	private int total;
	private String operations="0" ;

	public AddingMachine () //class constructor to instantiate total to a value
	{
		total = 0;  // not needed - included for clarity
		
	}

	public int getTotal () // @return the current total
	{
		return total; //@returns the value of total
	}

	public void add (int value) //method used to add the values together into total
	{
		total = total + value;
		
		operations = operations +" + " + value;
	}

	public void subtract (int value) //subtract the parameter from the total variable
	{
		total = total - value;
		
		operations = operations +" - " + value;
	}

	public String toString () //@returns the operations performed as a string.
	{
		return operations;//@returns at string of operations 
	}

	public void clear() //resets the values of the parameters and total
	{
		operations = "0";
	}

}
