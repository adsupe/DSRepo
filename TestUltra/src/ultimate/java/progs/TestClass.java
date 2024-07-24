package ultimate.java.progs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {
	static int minParkingSpaces(int[][] parkingStartEndTimes) {
		return 0;
          // YOUR CODE HERE

	}

	// DO NOT MODIFY ANYTHING BELOW THIS LINE!!

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int[][] parkingStartEndTimeList = new int[n][2];
		String[] parkingStartEndTimes = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
			for (int j = 0; j < parkingStartEndTime.length; j++) {
				parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
			}
		}

		int out = minParkingSpaces(parkingStartEndTimeList);
		System.out.println(out);

		wr.close();
		br.close();
		
		
		
		Thread t1 = new Thread(new Abc());
		
		Thread t2 = new Efg();
		
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


class Abc implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class Efg extends Thread {
	@Override
	public void run() {
		
	}
	
}

class Lmn {
	Thread t1 = new Thread(new Abc());
	
	Thread t2 = new Efg();
}