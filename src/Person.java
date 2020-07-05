
public class Person {

	private String lang;
	private String name;
	private int Id;
	
	public Person(String n,int i) {
		name = n;
		Id = i;
	}
	
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public void speak() {
		System.out.println("Person is speaking "+lang+" "+name+Id);
	}

}
