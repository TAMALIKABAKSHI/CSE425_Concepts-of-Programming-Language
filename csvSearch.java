package csvProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io. *;

public class csvSearch {

	static Scanner input = new Scanner(System.in);
	
	public static String[] bypass(String array)
	{
		String qm = "\"";
		String[] xx = (array).split(qm);
		String[] tmpArr = new String[15];
		tmpArr[0] = xx[0].replace("[", "").replace(",", "");
		tmpArr[1] = xx[1].replace(" ", "");
		String[] sp1 = xx[2].split(",");
	
		
		for(int i = 1; i < sp1.length; i++)
		{
			tmpArr[i+1] = sp1[i].replace("]", "");
		}
		return tmpArr;
		
	}
	public static void searchByAge(String[][] array)
	{
		System.out.print("Enter Age: ");
		String s = input.nextLine();
		for (int i=0; i<array.length; i++)
		{
			if(array[i][0].equals(s))
			{
				System.out.println(Arrays.toString(array[i]));
			}
		
		}
	}
	
	public static void searchBySex(String[][] array)
	{
		System.out.print("Enter Gender: ");
		String s = input.nextLine();
		for (int i=0; i<array.length; i++)
		{
			if(array[i][1].equals(s))
			{
				System.out.println(Arrays.toString(array[i]));
			}
		
		}
	}
	
	public static void searchByCP(String[][] array)
	{
		System.out.print("Enter Cp: ");
		String s = input.nextLine();
		for (int i=0; i<array.length; i++)
		{
			if(array[i][2].equals(s))
			{
				System.out.println(Arrays.toString(array[i]));
			}
	
		}
		System.out.println();
	}
	
	public static void searchByTRTBPS(String[][] array)
	{
		System.out.print("Enter Trtbps: ");
		String s = input.nextLine();
		for (int i=0; i<array.length; i++)
		{
			if(array[i][3].equals(s))
			{
				System.out.println(Arrays.toString(array[i]));
			}
		
		}
	}
	public static void searchByCHOL(String[][] array)
	{
		System.out.print("Enter Chol: ");
		String s = input.nextLine();
		for (int i=0; i<array.length; i++)
		{
			if(array[i][4].equals(s))
			{
				System.out.println(Arrays.toString(array[i]));
			}
		}
	}
	public static void searchByFBS(String[][] array)
	{
		System.out.print("Enter Fbs: ");
		String s = input.nextLine();
		for (int i=0; i<array.length; i++)
		{
			if(array[i][5].equals(s))
			{
				System.out.println(Arrays.toString(array[i]));
			}
	
		}
	}
	public static void searchByRESTECG(String[][] array)
	{
		System.out.print("Enter Restecg: ");
		String s = input.nextLine();
		for (int i=0; i<array.length; i++)
		{
			if(array[i][6].equals(s))
			{
				System.out.println(Arrays.toString(array[i]));
			}
	
		}
	}
	public static void searchByTHALACHH(String[][] array)
	{
		System.out.print("Enter Thalachh: ");
		String s = input.nextLine();
		for (int i=0; i<array.length; i++)
		{
			if(array[i][7].equals(s))
			{
				System.out.println(Arrays.toString(array[i]));
			}
			
		}
	}
	public static void searchByEXNG(String[][] array)
	{
		System.out.print("Enter Exng: ");
		String s = input.nextLine();
		for (int i=0; i<array.length; i++)
		{
			if(array[i][8].equals(s))
			{
				System.out.println(Arrays.toString(array[i]));
			}
		
		}
	}
	public static void searchByOLDPEAK(String[][] array)
	{
		System.out.print("Enter OldPeak: ");
		String s = input.nextLine();
		for (int i=0; i<array.length; i++)
		{
			if(array[i][9].equals(s))
			{
				System.out.println(Arrays.toString(array[i]));
			}
		
		}
	}
	public static void searchBySLP(String[][] array)
	{
		System.out.print("Enter Slp: ");
		String s = input.nextLine();
		for (int i=0; i<array.length; i++)
		{
			if(array[i][10].equals(s))
			{
				System.out.println(Arrays.toString(array[i]));
			}
			
		}
	}
	public static void searchByCAA(String[][] array)
	{
		System.out.print("Enter Caa: ");
		String s = input.nextLine();
		for (int i=0; i<array.length; i++)
		{
			if(array[i][11].equals(s))
			{
				System.out.println(Arrays.toString(array[i]));
			}
		
		}
	}
	public static void searchByTHALL(String[][] array)
	{
		System.out.print("Enter Thall: ");
		String s = input.nextLine();
		for (int i=0; i<array.length; i++)
		{
			if(array[i][12].equals(s))
			{
				System.out.println(Arrays.toString(array[i]));
			}
	
		}
	}
	public static void searchByOUTPUT(String[][] array)
	{
		System.out.print("Enter Output: ");
		String s = input.nextLine();
		for (int i=0; i<array.length; i++)
		{
			if(array[i][13].equals(s))
			{
				System.out.println(Arrays.toString(array[i]));
			}
		
		}
	}
	public static void totalOUTPUTByAge(String[][]array){
		System.out.print("Enter The Value: ");
		String s = input.nextLine();
		int value=0;
		for(int i=0; i< array.length; i++){
			if(array[i][0].equals(s)){
				value=value+ Integer.parseInt(array[i][15]);
				
			} 
		}
		System.out.println(value);
		
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		String file = "src\\heart - heart.csv";
		  String temp;
		  FileInputStream reader = null;
		  
		  try 
		  {
		  reader = new FileInputStream(file);
		  }
		   
		  catch(FileNotFoundException e) 
		  {
		   e.printStackTrace();
		  }
		  DataInputStream myInput = new DataInputStream(reader);
		  List<String[]> lines = new ArrayList<String[]>();
		  
		   try {
		   while ((temp = myInput.readLine()) != null)
		   {
			   if (temp.split(",").length>14){
				   lines.add(bypass(temp));
			   }
			   else
				   lines.add(temp.split(","));
		   }
		 
	}   
		   catch (IOException e) 
		   {
		    e.printStackTrace();
		   }

		String[][] array = new String[lines.size()][0];
		  lines.toArray(array);
	System.out.print("1.  Search By Age\n" + "2.  Search By Gender\n" 
     + "3.  Search By Chest Pain (cp)\n"+ "4.  Search By Resting Blood Pressure (trtbps)\n"+
	"5.  Search By Cholesterol (chol)\n"+ "6.  Search By Fasting Blood Sugar (fbs)\n"
     + "7.  Search By Resting ECG (restecg)\n"+ 
	"8.  Search By Heart Rate (thalachh)\n"+ "9.  Search By Exercise Induced Angina (exng)\n"+
	"10. Search By Previous Peak (oldPeak)\n"+ "11. Search By Slope (slp)\n"
	+ "12. Search By Number of Major Vessels (caa)\n"
	+ "13. Search By Thal Rate (thall)\n"
	+ "14. Search By Output\n" + "\nChoose An Option: ");
	
	String x = input.nextLine();
	if (x.equals("1"))
		searchByAge(array);
	else if (x.equals("2"))
	searchBySex(array);
	else if (x.equals("3"))
		searchByCP(array);
	else if (x.equals("4"))
		searchByTRTBPS(array);
	else if (x.equals("5"))
		searchByCHOL(array);
	else if (x.equals("6"))
		searchByFBS(array);
	else if (x.equals("7"))
		searchByRESTECG(array);
	else if (x.equals("8"))
		searchByTHALACHH(array);
	else if (x.equals("9"))
		searchByEXNG(array);
	else if (x.equals("10"))
		searchByOLDPEAK(array);
	else if (x.equals("11"))
		searchBySLP(array);
	else if (x.equals("12"))
		searchByCAA(array);
	else if (x.equals("13"))
		searchByTHALL(array);
	else if (x.equals("14"))
		searchByOUTPUT(array);
	else
		System.out.print("Invalid Input!");

		long stopTime = System.nanoTime();
		long executionTime = stopTime - startTime;
		System.out.println("Execution Time In NanoSeconds: " + executionTime + "ns");
	
	}
	
	}