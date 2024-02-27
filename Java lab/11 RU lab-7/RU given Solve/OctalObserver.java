// Farjana Aktar (1912276145)

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public String update() {
        return Integer.toOctalString(subject.getState());

    }
}
