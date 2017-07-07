package Texample;

public class PriorityQueueDemo {
	private int size;

	public static void main(String[]args) {
	PriorityQueueDemo pq=new PriorityQueueDemo();
	
	

pq.add("java");
pq.add("net");
pq.add("UI");
pq.add("phyton");
pq.add("");
for(String s:pq)
	System.out.println(s);
System.out.println();
System.out.println();
while(pq.size>0)
System.out.println(pq.remove());
}

	private char[] remove() {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}