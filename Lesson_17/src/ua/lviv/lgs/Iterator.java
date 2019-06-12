package ua.lviv.lgs;

public interface Iterator {
	
	public boolean hasNext();
	public Object next();
}
	class Collection {
		private static Object[] arr;
		Collection (Object [] arr){
	
			this.arr =arr;
	}
		public class Fordward implements Iterator {
			
			private int count = 0;
			@Override
			public boolean hasNext() {
				return count<arr.length;
			}

			@Override
			public Object next() {
				return arr[count++];
			}		
		}
		 
		public Fordward createFordward() {
			return new Fordward();
		}
		
		public class Backward implements Iterator {
			private int count = arr.length-1;
			@Override
			public boolean hasNext() {
				return count>=0;
			}

			@Override
			public Object next() {
			return arr[count--];
			}		
		}
		
		public Backward createBackward() {
			return new Backward();
		}
		
		public Iterator anoniIterator () {
			return new Iterator() {
				private int count = arr.length-1;
				@Override
				public boolean hasNext() {				
					return count>=0;
				}

				@Override
				public Object next() {
					return arr[count--];
				}
				
			} ;
		}
	
	
}
