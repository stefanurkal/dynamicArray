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

        String myString = myArray[index];
        return myString;
    }

    public void set(int index, String value){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        myArray[index] = value;
    }

    public void add( String value ){

        if (myArray.length >= size) {
            int newCapacity = myArray.length * 2;
            String[] newArray = new String[newCapacity];
            
        
            for (int i = 0; i < size; i++) {
                newArray[i] = myArray[i];
            }
            
            myArray = newArray;
        }
        
        myArray[size] = value;
        size++;  
    }

    public String remove(int index){
        String removedIndex = myArray[index];
        int count = 0;
        for(int i = 0; i < myArray.length; i++){
             if (myArray[i] != myArray[index]) {
                myArray[count] = myArray[i];
                count++;
            } else {
                size --;
            }
        }
        return removedIndex;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return myArray.length;
    }
    
}


    
