package dxc;

public class Participant {

	static int counter;
	String registrationId;
	String name;
	long contactNumber;
	String city;
	static
	{
		counter=10000;
	}
	public Participant(String name, long contactNumber, String city) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.city = city;
	}
	

	public String getRegistrationId() {
		return registrationId="D"+ ++counter;
	}


	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public static int getCounter() {
		return counter;
	}


	public static void setCounter(int counter) {
		Participant.counter = counter;
	}


	public static void main(String[] args) 
	{
		
		
		Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
		
		//Create more objects and add them to the participants array for testing your code
		System.out.println("Name          : "+participant1.getName());
		System.out.println("Contact Number: "+participant1.getContactNumber());
		System.out.println("City          : "+participant1.getCity());
		
		Participant participant2 = new Participant("Merina", 7890423112L, "New York");
		System.out.println("\nName          : "+participant2.getName());
		System.out.println("Contact Number: "+participant2.getContactNumber());
		System.out.println("City          : "+participant2.getCity());
		
		Participant[] participants = { participant1, participant2 };
		for (Participant participant : participants) {
		System.out.println("\nHi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
		}
		 
	}

}
