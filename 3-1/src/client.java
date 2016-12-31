
public class client {
	
	public static void main(String args[])
	{
         try
         {
         	people p ;
         	String makeName=XMLUtil.getMakeName();
         	p = nvWa.make(makeName);
         	p.makePeople();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
	
}
