
public class Student {
	private String sName;
	private int sAge;
	private String sSex;
	
	public Student(String sName, int sAge, String sSex) {
		this.sAge = sAge;
		this.sName = sName;
		this.sSex = sSex;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	
	public String getsSex() {
		return sSex;
	}
	public void setsSex(String sSex) {
		this.sSex = sSex;
	}
	
	
}
