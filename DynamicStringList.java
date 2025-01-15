public class DynamicStringList implements StringList {
    private String[] myArray;
    private int size;

    public DynamicStringList (){
        myArray = new String[10];
        size = 0; 
        
    }

    public String get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return myArray[index];
    }

    public void set(int index, String value){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        myArray[index] = value;
    }

    public void add( String value ){

        if (myArray.length >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        myArray[size] = value;
        size++;  
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return myArray.length;
    }
    
}


    
