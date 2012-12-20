
public class Main {


	public static void main(String[] args) {
		
		TimeStamp time = new TimeStamp(23, 45, 17);
		
		
		//Time from TimeStamp class
		System.out.println("Time: " + time.toString());
		
		
		T1 t = new T1(23, 45, 17,25);
		
		
		//Time from T1 class.. Violation!!!!
		System.out.println("Time: " + t.toString());
		System.out.println("Time: ");
		System.out.println("Time: ");
		System.out.println("Time: ");
		System.out.println("Time: ");

	}

}
