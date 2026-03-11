class NotEligibleForEngineering extends RuntimeException
{
	NotEligibleForEngineering(String s){
		super(s);
	}
}
class NotEligibleForVJIT extends RuntimeException
{
	NotEligibleForVJIT(String s){
		super(s);
	
}
}
class TSEngineeringAdmission
{ 
public static void main(String[] args){
  try{
	  int score=Integer.parseInt(args[0]);
	  if(score<50){
		  throw new NotEligibleFoeEngineering("NotEligible for Engineering");
      }
	  else if(score<70){
		  throw new NotEligibleForVJIT("Not eligible for vjit");
	  }
	  else{
		  System.out.println("Welcome to vjit-thanks for registration");
		  
	  }}
	  catch(NotEligibleFoeEngineering | NotEligibleForVJIT e){
		  System.out.println("using e.printStackTrace():");
		  e.printstackTrace();
		  System.out.println("using e.getMessage():");
		  e.getmessage();
		  System.out.println("using e.toString():");
		  e.toString();
	  }
	  System.out.println("Rest of the code");
}
}

