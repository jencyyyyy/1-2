package p4;

class Cat {
    int count;
    
    Cat(int c){
        count=c;
    }
    void getCount(){
        System.out.println(count);
    }
    public void makeSound() {
        System.out.println("Meow");
    }
}
