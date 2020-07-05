import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		Person p = (Person) ctx.getBean("person");
		p.speak();
		
		((FileSystemXmlApplicationContext)ctx).close();
	}
}
