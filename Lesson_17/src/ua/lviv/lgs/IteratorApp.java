package ua.lviv.lgs;

public class IteratorApp {
    public static void main(String[] args) {
    	
	 Integer[] array = {44,6,-29,9,12,7,-32,98,39,-64,29,52};
	 
	 Collection coll = new Collection(array);
	 
	 System.out.println("CreateFordward");
	 Iterator iterForward = coll.createFordward();
		while (iterForward.hasNext()) {
			Integer next = (Integer) iterForward.next();
			System.out.println((next%2==0) ? next:0);
		}
		
		System.out.println();
		System.out.println("CreateBackward");
		
		Iterator iterBackward = coll.createBackward();
		int key=0;
		while (iterBackward.hasNext()) {
			Integer next = (Integer) iterBackward.next();
			if (key == 2) key = 0;
			if (key == 0) { System.out.println(next);
	       }
			key++;
		}
		
		System.out.println();
		System.out.println("Anonimous");
		
		Iterator anonimous = coll.anoniIterator();
		int n = 0;
		while (anonimous.hasNext()) {
			Integer next = (Integer) anonimous.next();
			if (n == 3) n = 0;
			if (n == 0) { if (next % 2 == 1) {System.out.println(next);	}			
			}
			n++;
		}		
  }
}
