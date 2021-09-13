import java.util.*;

public class TruthTables 
{

	public static void main(String[] args) 
	   {
	       // variables for p and q
	       Boolean p=false,q=false;
	       Boolean trt = false;
	       Scanner kbd = new Scanner(System.in);
	       
	       System.out.print("What is proposition p? ");
	       p = kbd.nextBoolean();
	       System.out.print('\n'+"What is proposition q? ");
	       q = kbd.nextBoolean();
	       
	       TruthTables truth = new TruthTables();
	      
	       System.out.println('\n'+"The conjunction truth value is: "+truth.conjunction(p, q));
	       
	       System.out.println("The disjunction truth value is: "+truth.disjunction(p, q));
	       
	       System.out.println("The exclusive OR truth value is: "+truth.exclusiveor(p, q));
	       
	       System.out.println("The conditional truth value is: "+truth.conditional(p, q));
	       
	       System.out.println("The biconditional truth value is: "+truth.biconditional(p, q));
	   }
	   Boolean conjunction(Boolean p, Boolean q)
	   	{
	       	return (p && q);
	   	}
	  
	   Boolean disjunction(Boolean p, Boolean q)
	   	{
	       	return (p || q);
	   	}
	  
	   Boolean exclusiveor(Boolean p, Boolean q)
	   	{
	       	return (p ^ q);
	   	}
	  
	   Boolean conditional(Boolean p, Boolean q)
	   	{
	       	return (!p || q);
	   	}
	  
	   Boolean biconditional(Boolean p, Boolean q)
	   	{
	       	return (!p || q) && (!q || p);
	   	}

}

