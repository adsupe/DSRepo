package scb.com.javaft;

public class RecordCreationDemo {

	public static void main(String[] args) {

		RecordPojo rp1 = new RecordPojo("Sitara", 2);
		RecordPojo rp2 = new RecordPojo("tara", 3);
		
		System.out.println(rp1.getName()+" : "+rp1.show());
		System.out.println(rp2.getId()+" : "+rp1.show());
	}

}


record RecordPojo(String getName, int getId) {
	public String show() {
		return "method show from RecordPojo";
	}
}