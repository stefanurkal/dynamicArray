public class DynamicStringList implements StringList {
    private String[] myArray;
    
    private int size

    public DynamicStringList (){
        myArray = New String[20];
        size = 0; 
        
    }

    public String get(int numIndex){
        return myString[numIndex];
    }

    public void set(int index, String value){
        myString[index] = value;
    }

    public void add( String value ){
        myString[myString.length+1] = value;  
    }

    public int size() {
        return size;
    }
    
}


    
