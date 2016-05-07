import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class RefinedBookDB{
	RefinedBook[] db;
        List<Book> list;

	

	RefinedBookDB(List<Book> list, String word){

		db = new RefinedBook[list.size()];
		this.list = list;
			for(int i = 0; i < list.size(); i++){
				db[i].setRef(i);
				int x = list.get(i).getTitle().toLower().indexOf(word);
				db[i].setIndex(x);
			}
	}

	public void sortRef(int low, int high){
	int i = low;
        int j = high;
         
        
        int pivot = db[(low+high)/2].getIndex();
        
        while (i <= j) {
           
            while (db[i].getIndex() < pivot) {
                i++;
            }
            while (db[j].getIndex() > pivot) {
                j--;
            }
            if (i <= j) {
            	RefinedBook temp = db[i];
       			db[i] = db[j];
        		db[j] = temp;                        
                i++;
                j--;
            }
        }

        if (low < j){
            sortRef(low, j);
        }
        if (i < high){
            sortRef(i, high);
        }
    }


    public List<Book> returnList(){
    	List<Book> newList = new ArrayList();
    	for(RefinedBook book: db){
    		newList.add(list.get(book.getRef()));
    	}

    	return newList;
    }

    
}