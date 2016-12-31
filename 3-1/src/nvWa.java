
public class nvWa {
	public static people make(String sex) throws unsupportedPeopleException{
		if(sex.equalsIgnoreCase("man")){
			return new man();
		}
		if(sex.equalsIgnoreCase("woman")){
			return new woman();
		}
		if(sex.equalsIgnoreCase("robot")){
			return new robot();
		}
		else
			throw new unsupportedPeopleException("女娲制造不出这个东西");
	}
}
