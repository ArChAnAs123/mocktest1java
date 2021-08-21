package mocktest;
import java.util.Collections;
import java.util.Comparator;
public  class Fish extends Animal implements Comparable{
	
	private Integer sizeInFt;
	
	public int getSizeInFt() {
		return sizeInFt;
	}

	public void setSizeInFt(int sizeInFt) {
		this.sizeInFt = sizeInFt;
	}

	public boolean isCanEat() {
		return canEat;
	}

	public void setCanEat(boolean canEat) {
		this.canEat = canEat;
	}

	private boolean canEat;
	
	public Fish(boolean string, int i) {
		// TODO Auto-generated constructor stub
		this.sizeInFt= i;
		this.canEat= string;
	}

	private String swim() {return "Fish can swim";}
	
	@Override
	 public int compareTo(Object o) {
	    return  (this.getSizeInFt() < ((Fish) o).getSizeInFt() ? -1 : (this.getSizeInFt() == ((Fish) o).getSizeInFt() ? 0 : 1));
	}
	
	 @Override
	    public String toString() {
	        return "Fish{" +
	                "canEat='" + canEat+ '\'' +
	                ", sizeInFt=" + sizeInFt +'}';
	    }

}
