package Question1;

public class Sequence {
    private int[] values;
    
    public Sequence(int size){
        values = new int[size];       
    }    
    public void set(int i, int n){
        values[i]=n;
    }    
    public int get(int i){
        return values[i];
    }   
    public int size(){
        return values.length;
    }
    public int[] getValues() {
        return values;
    }
    public void setValues(int[] values) {
        this.values = values;
    }    
    public boolean equals(Sequence other){
        int[] first = this.getValues();
        int[] second = other.getValues();
        boolean same = true;
        if(first.length != second.length){
               return false;
        }
        for(int i = 0; i < first.length; i++){
            if(first[i] != second[i]){
               return false;
            }
         }
        return same;
    }
    
    public static void main(String[] args) {
          Sequence s = new Sequence(5);
          Sequence s2 = new Sequence(4);// new Sequence(4) //return false
          s.set(0, 1);
          s2.set(0, 1);
          System.out.println(s.equals(s2));//will print true      
          }
    
    }

