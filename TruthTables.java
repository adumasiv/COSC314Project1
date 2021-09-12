import java.util.*;

public class TruthTables 
{

	public static void main(String[] args) 
	   {
	       
	       Boolean p=false,q=false;
	       Boolean trt = false;
	       Scanner kbd = new Scanner(System.in);
	       
	       System.out.print("What is proposition p? ");
	       p = kbd.nextBoolean();
	       System.out.print('\n'+"What is proposition q? ");
	       q = kbd.nextBoolean();
	       
	       System.out.println('\n'+"The conjunction truth value is: "+conjunction(p, q));
	       
	       System.out.println("The disjunction truth value is: "+disjunction(p, q));
	       
	       System.out.println("The exclusive OR truth value is: "+exclusiveor(p, q));
	       
	       System.out.println("The conditional truth value is: "+conditional(p, q));
	       
	       System.out.println("The biconditional truth value is: "+biconditional(p, q));
	   }
	   static Boolean conjunction(Boolean p, Boolean q)
	   	{
	       	return (p && q);
	   	}
	  
	   static Boolean disjunction(Boolean p, Boolean q)
	   	{
	       	return (p || q);
	   	}
	  
	   static Boolean exclusiveor(Boolean p, Boolean q)
	   	{
	       	return (p ^ q);
	   	}
	  
	   static Boolean conditional(Boolean p, Boolean q)
	   	{
	       	return (!p || q);
	   	}
	  
	   static Boolean biconditional(Boolean p, Boolean q)
	   	{
	       	return (!p || q) && (!q || p);
	   	}

}

