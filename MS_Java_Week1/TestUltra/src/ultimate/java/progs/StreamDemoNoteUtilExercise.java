package ultimate.java.progs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamDemoNoteUtilExercise {

	public static void main(String[] args) {
		List<NoteUtil> noteList = new ArrayList<NoteUtil>();
		
		List<Fuss> fussList = new ArrayList<Fuss>();
		fussList.add(new Fuss(4,"fuss4"));
		fussList.add(new Fuss(2,"fuss2"));
		fussList.add(new Fuss(6,"fuss6"));
		fussList.add(new Fuss(11,"fuss11"));
		
		noteList.add(new NoteUtil(3, "eee", "p",new BigDecimal(25000.00),25000.34,fussList));
		noteList.add(new NoteUtil(1, "www", "p",new BigDecimal(15000.00),15000.24,fussList));
		noteList.add(new NoteUtil(3, "rrr", "e",new BigDecimal(45000.00),45000.22,fussList));
		noteList.add(new NoteUtil(6, "mmm", "e",new BigDecimal(60000.00),60000.77,fussList));
		noteList.add(new NoteUtil(8, "ttt", "p",new BigDecimal(30000.00),30000.28,fussList));
		
		Map<String,Integer> noteRecords = noteList.stream().sorted(Comparator.comparingInt(NoteUtil::getId))
				.collect(Collectors.toMap(NoteUtil::getName, NoteUtil::getId,(oldValue,newValue)->oldValue , LinkedHashMap::new));


		Map<String,BigDecimal> mapNamePrice = noteList.stream().
				collect(Collectors.toMap(NoteUtil::getName,NoteUtil::getPrice,(oldValue,newValue)->oldValue, TreeMap::new));
		System.out.println("Map records with Name and Price :: "+mapNamePrice);
		System.out.println("Map records ::"+noteRecords);

		Map<Integer,String> mapIdName = noteList.stream().collect(Collectors.toMap(NoteUtil::getId, NoteUtil::getName,(o,n)->o,TreeMap::new));
		System.out.println("Map of ID and Name :: "+mapIdName);
		System.out.println("Group The NoteUtil By Model");
		Map<String, List<NoteUtil>> mapNoteUtilModule = noteList.stream().collect(Collectors.groupingBy(NoteUtil::getModel));
		System.out.println(mapNoteUtilModule);

		System.out.println("Find max value for BigDecimal :: "+noteList.stream().map(i->i.getPrice()).max((m1,m2)->{return m1.compareTo(m2);}).get());
		//       noteList.stream().sorted(Comparator.comparing(NoteUtil::getName).thenComparingInt(NoteUtil::getId).reversed())
		//       .forEach(i->System.out.println(i.getId()+":"+i.getName()));

		noteList.stream().sorted((note1,note2)-> {return note2.getPrice().compareTo(note1.getPrice());})
		.forEach(i->System.out.println(i.getName()+":"+i.getPrice()));

		System.out.println("Sorted with reverse order by salary::");

		noteList.stream().sorted(Comparator.comparingDouble(NoteUtil::getSalary).reversed())
		.forEach(i->System.out.println(i.getName()+":"+i.getSalary()));

		System.out.println("Filter the module 3 and update the model with G :: ");
		noteList.stream().filter(i->i.getId().intValue()%3==0).forEach(c->c.setModel("G"));

		noteList.forEach(i-> System.out.print(i.getModel()+" "));
		System.out.println("");
		
		List<Fuss> list = noteList.stream().flatMap(i-> i.getListOfFuss().stream()).collect(Collectors.toList());
		System.out.println("List of list fuss :: "+list);
		
		//Sort based on name if name is null then sort it based on model
		noteList.stream().sorted((t1,t2)->{
			
			if(t1.getName() != null) {
				return t1.getName().compareTo(t2.getName());
			} else {
				return t1.getModel().compareTo(t2.getModel());
			} 
		}).forEach(i->System.out.println(i.getName()+" -"+i.getModel()));
		
		
		Optional<Integer> op = noteList.stream().map(i->i.getId()).findFirst();
		op.ifPresentOrElse(null, null);
	}

}
