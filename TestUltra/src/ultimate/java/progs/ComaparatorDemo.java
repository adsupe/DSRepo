package ultimate.java.progs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComaparatorDemo {

	public static void main(String[] args) {

		State s1 = new State(44, "Abn");
		State s2 = new State(32, "ee");
		State s3 = new State(41, "rr");
		State s4 = new State(47, "gg");
		
		List<State> listState = new ArrayList<State>();
		listState.add(s1);
		listState.add(s2);
		listState.add(s3);
		listState.add(s4);
		
		Collections.sort(listState, new StateComparator());
		for(State s : listState) {
			System.out.println(s.getStateId()+"- "+s.getName());
		}
		
		listState.stream().sorted(Comparator.comparingInt(State::getStateId))
		.forEach(i->System.out.println(i.getStateId()+" - "+i.getName()));
		
		System.out.println("Sort by Name ::");
		listState.stream().sorted((o1,o2)->{return o1.getName().compareTo(o2.getName());})
		.forEach(i->System.out.println(i.getStateId()+" - "+i.getName()));
//		double value = 125;
//		double m = 3;
//		double nth = 0;
//		nth = Math.pow(value, 1/m);
//		nth = Math.round(Math.pow(value, 1/m));
////		System.out.println("Nth root of :"+new BigDecimal(nth, new MathContext(2, RoundingMode.HALF_DOWN)));
//		System.out.println("Nth root of :"+nth);
	}

}


class State {
	
	public State(int stateId, String name) {
		this.stateId = stateId;
		this.name = name;
	}
	
	private int stateId;
	private String name;
	
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}


class StateComparator implements Comparator<State>{
	@Override
	public int compare(State o1, State o2) {
		if(o1.getStateId() > o2.getStateId()) {
			return 1;
		} else if(o1.getStateId() < o2.getStateId() ) {
			return -1;
		} else {
			return 0;
		}
	}
}