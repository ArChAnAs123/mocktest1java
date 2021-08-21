package mocktest;
import java.util.*; 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Animals implements Comparable<Fish>{
   

   
	public static <T> void main(String[] args) throws IOException {
	
		Animal duck = new Duck();
		
		Animal zebra = new Zebra();
		zebra.getAge();
		duck.isMammal();
		
		//Task2
		String Line ;
		String[] duckfish=null;
		String[][]listanimal = null;
		List<List<String>> animalist= new ArrayList<List<String>>(); 
		List<List<String>> ducklist= new ArrayList<List<String>>(); 
		List<List<String>> fishlist= new ArrayList<List<String>>(); 
		
		 BufferedReader br = new BufferedReader(new FileReader("duckdata.txt"));
		 String header = br.readLine();
		 String[] headerNames = header.split(","); 
		 while((Line = br.readLine())!= null) {
			duckfish = Line.split(",");
			
			animalist.add(Arrays.asList(duckfish));
			
			
		 
		
		} 
		br.close();
	
		 for(int i=0; i<10; i++) {
		 if((animalist.get(i).get(4)).contains("duck")) {
			    ducklist.add(animalist.get(i));
			   }
		 else{ fishlist.add(animalist.get(i));}
		 
		 }
		 System.out.println("list of duck objects"+ducklist);
		 System.out.println("list of fish objects"+fishlist);
		
		
		 //Task3
		 
		 ArrayList<Fish> list = new ArrayList<Fish>(); 
		 Fish g= new Fish(true,9);
		Fish j= new Fish(true,6);
		list.add(g);
		list.add(j);
		
		 
	
		
		 Collections.sort(list);
		 System.out.println("Sorted fish list: " + list);
            
		 Collections.sort(list,  Collections.reverseOrder());
		 System.out.println(" Reverse sorted fish list: " + list);
		 
	//Task4
	     
		 ArrayList<String> listduck = new ArrayList<String>();
		 for(int i=0; i<ducklist.size(); i++) {
		 boolean strings = (ducklist.get(i).get(0)).equals("brown");
	   if(strings) {
		   String val= ducklist.get(i).toString();
		   listduck.add(val);
		   
		   Collections.sort(listduck);
		
		 }
		 }   System.out.println("Sorted duck list: " + listduck );
		
	   
 

       
		
	
	}
	


}