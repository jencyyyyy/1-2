// Farjana Aktar (1912276145)
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public String update() {
        return Integer.toBinaryString( subject.getState() );
    }
}
