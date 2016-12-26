import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Isort {
	
		public static void main(String[] args)
		{
			try {
				String contents;
				int j;
				//C:/Users/Vishal/workspace/InsertionSort/src/test.txt
				ArrayList<Double> numList=new ArrayList<Double>();
				BufferedReader br=new BufferedReader(new FileReader(args[0]));
				PrintWriter pw=new PrintWriter("C:/Users/Vishal/workspace/InsertionSort/src/answer.txt","UTF-8");
				Double[] nums = null;
				while((contents=br.readLine())!=null)
				{
					//Splitting the numbers by ';'
					String[] num=contents.split(";");
					nums=new Double[num.length];
					for(int i=0;i<num.length;i++)
					{
						//nums[i]=Double.parseDouble(num[i]);
						numList.add(Double.parseDouble(num[i]));
						System.out.println(numList);
					}
					
				}
					//Sorting the arraylist values
					for(int i=1;i<numList.size();i++)
					{
						j=i-1;
						while(j>=0 && numList.get(j)>numList.get(i))
						{
							Double temp;
							temp=numList.get(j);
							numList.remove(j);
							numList.add(j, numList.get(i));
							numList.remove(i);
							numList.add(i,temp);
							j--;
						}
					}
					System.out.println("The sorted array is=");
					/*for(int i=0;i<nums.length;i++)
					{
						System.out.println(nums[i]);
						pw.write(""+nums[i]);
						pw.write(";");
					}*/
					for(int i=0;i<numList.size();i++)
					{
						System.out.println(numList);
						pw.write(""+numList.get(i));
						pw.write(";");
					}
				

				pw.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

}
