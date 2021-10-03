package csvProject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class program {

	static void read(){
		try{
			List<String>lines = Files.readAllLines(Paths.get("src\\heart - heart.csv"));
		for(String line : lines){
			line= line.replace("\"", "");
			String []result = line.split(",");
			
			System.out.println(line);
		}
	}
		catch(Exception e){
			System.out.println(e.getMessage());	
	}
	}
	

	static void sort() throws Exception{
		Scanner sc= new Scanner(System.in);
		System.out.println("\nEnter 0,  For Age" 
		+ "\nEnter 1,  For Gender (Sex)" 
		+ "\nEnter 2,  For Chest Pain (cp)" 
		+ "\nEnter 3,  For Resting Blood Pressure (trtbps)" 
		+ " \nEnter 4,  For Cholesterol (chol)" 
		+ " \nEnter 5,  For Fasting Blood Sugar (fbs)" 
		+ "\nEnter 6,  For Resting ECG (restecg)" 
		+ "\nEnter 7,  For Heart Rate (thalachh)" 
		+ "\nEnter 8,  For Exercise Induced Angina (exng)" 
		+ "\nEnter 9,  For Previous Peak (oldPeak)" 
		+ "\nEnter 10, For Slope (slp)" 
		+ "\nEnter 11, For Number of Major Vessels (caa)" 
		+ "\nEnter 12, For Thal Rate (thall)" 
		+ "\nEnter 13, For Output\n" + "\nEnter Your Choice: \n");
	int c=sc.nextInt();
	BufferedReader reader= new BufferedReader(new FileReader("src\\heart - heart.csv"));
	Map<String, List<String>> map = new TreeMap<String, List<String>>();
	String line= reader.readLine();
	while((line = reader.readLine()) != null){
		String key = getField(line, c);
		List<String> l =map.get(key);
		if(l==null){
			l = new LinkedList<String>();
			map.put(key, l);
		}
		l.add(line);
		
	}
	reader.close();
	
	FileWriter writer = new FileWriter("src\\heart - heart.csv");
	writer.write("age, sex, cp, trtbps, chol, fbs, restecg, thalachh, "
			+ "exng, oldpeak, slp, caa, thall, output\n");
	for(List<String> list : map.values()){
		for (String val : list){
			writer.write(val);
			writer.write("\n");
		}
	}
	writer.close();
	List<String> lines = Files.readAllLines(Paths.get("src\\heart - heart.csv"));
	for(String line1 : lines){
		line1 = line1.replace("\"", "");
		String []result = line1.split(",");
		System.out.println(line1);
	}
	}
	private static String getField(String line, int c){
		return line.split(",")[c];
		
	}
		public static void main(String[] args) throws Exception{
			
			long startTime = System.nanoTime();
			
			Scanner sc= new Scanner(System.in);
			System.out.println("1. To Read \n2. To Sort \nChoose An Option: ");
	int a= sc.nextInt();
	if(a==1){
		read();
	}

	else if (a==2){
		sort();
	}
	else {
		System.out.println("Invalid Input!!");
	}

	
	long stopTime = System.nanoTime();
	
	long executionTime = stopTime - startTime;
	
	System.out.println("Execution Time In NanoSeconds: " + executionTime + "ns");

		}
	}

