package p5;

public abstract class Fruit {
    
        int count;
	public String name;

	private String place;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

	public Fruit(String name) {
		this.name = name;
	}

	public abstract void getInfo();
}