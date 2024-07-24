package ultimate.java.progs;

import java.util.Arrays;

public class ArrayListCustom {

	public static void main(String[] args) throws Exception {

		ArrayListCustom custList = new ArrayListCustom(10);
		custList.add(2);
		custList.add(12);
		custList.add(44);
		custList.add(34);
		custList.add(87);
		custList.add(36);
		custList.add(99);
		
		custList.display();
		
		System.out.println("GET :"+custList.get(4));
		
		System.out.println("Remove :"+custList.remove(3));
		
		custList.display();

	}

	private int size;
	private int[] elementsData;
	
	public ArrayListCustom(int initalCapacity) {
		elementsData = new int[initalCapacity];
		size = 0;
	}
	
	public void add(int e) {
		if(elementsData.length == size) {
			ensureCapacity();
		}
		elementsData[size] = e;
		size++;
	}
	
	public int get(int index) {
		if(index < 0 || index >=size) {
			throw new IndexOutOfBoundsException("Index out of bound exception");
		}
		return elementsData[index];
	}
	
	public int remove(int index) {
		if(index < 0 || index >=size) {
			throw new IndexOutOfBoundsException("Index out of bound exception");
		}
		
		int removeElement = elementsData[index];
		for(int i=index ; i<size-1;i++) {
			elementsData[i] = elementsData[i+1];
		}
		size--;
		return removeElement;
	}
	
	private void ensureCapacity() {
		int newCapacity = elementsData.length * 2;
		elementsData = Arrays.copyOf(elementsData, newCapacity);
	}
	
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.println(elementsData[i]);
		}
	}
}
