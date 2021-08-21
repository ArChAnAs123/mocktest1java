package mocktest;

import java.util.stream.Stream;

public  class Duck extends Animal implements Comparable{
     
	String beakColor = "yellow";
	
	public String getBeakColor() {
		return beakColor;
	}
	public void setBeakColor(String beakColor) {
		this.beakColor = beakColor;
	}
	public String swim() {return "duck can swim";}
	public String quack() {return "duck can quack";}

	public static Stream<String> stream() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	 public int compareTo(Object o) {
	    return  (this.getAge() < ((Duck) o).getAge()? -1 : (this.getAge() == ((Duck) o).getAge()? 0 : 1));
	}
	
	
}
