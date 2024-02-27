// Farjana Aktar (1912276145)

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public String update() {
        return Integer.toHexString(subject.getState()).toUpperCase();
    }
}
