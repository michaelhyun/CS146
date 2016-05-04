public class RefinedBookDB{
	RefinedBook[] db;
	List<Book> list;

	RefinedBookDB(List<Book> list, String word){

		db = new RefinedBook[list.size()];
		this.list = list;
			for(int i = 0; i < list.size(); i++){
				db[i].setRef(i);
				int x = list.getTitle().indexOf(word);
				db[i].setIndex(x);
			}
	}

	public void sortRef(int high, int low){
		 int i = low;
         int j = high;
        
        int pivot = db[low+(high-low)/2].getIndex();
        
        while (i <= j) {
           
            while (db[i].getIndex() < pivot) {
                i++;
            }
            while (db[j].getIndex() > pivot) {
                j--;
            }
            if (i <= j) {
            	int temp = db[i].getIndex();
       			db[i.getIndex() = db[j].getIndex();
        		db[j].getIndex() = temp;                        
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);
    }

    public List<Book> returnList(){
    	List<Book> newList = new List();
    	for(RefinedBook book: db){
    		newList.add(list.get(book.getRef()));
    	}
    }
	}

}
