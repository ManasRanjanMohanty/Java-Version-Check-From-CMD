import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Weather1 {

	

	public static void main(String[] args) {
		BufferedReader br = null;
		String[] dayMaxMinArray=null;
		int day=0;
		int max=0;
		int maxTempDay=0;
		int min=0;
		int minTempDay=0;
		int diffInTemp=0;
		int maxDiff=0;
		int minDiff=5;
		try {
			
			String currentLine;
			FileReader filereader=new FileReader(("D:/Nthdimenzio/workspace/WEEK3/weather.dat"));
			
			br = new BufferedReader(filereader);
			
			
			while ((currentLine = br.readLine()) != null ) {
				currentLine = currentLine.trim();
				currentLine = currentLine.replaceAll("\\*", "");
				Pattern pattern = Pattern.compile("^[\\d]{1,2}[\\s]*[\\d]{2}[\\s]*[\\d]{2}");
				Matcher matcher = pattern.matcher(currentLine);
				if(matcher.find()){
					String singleRowData=matcher.group().trim();
					
					singleRowData=singleRowData.replaceAll("[\\s]{2,}", " ");
					
					dayMaxMinArray=singleRowData.split("[\\s]");
					
					day=Integer.valueOf(dayMaxMinArray[0].trim());
					
					max=Integer.valueOf(dayMaxMinArray[1].trim());
					
					min=Integer.valueOf(dayMaxMinArray[2].trim());
					
					diffInTemp=max-min;
					
					if(maxDiff<diffInTemp){
						maxDiff=diffInTemp;
						maxTempDay=day;
					}else if(minDiff>diffInTemp){
						minDiff=diffInTemp;
						minTempDay=day;
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 

		System.out.print("Maximum temprature"+maxDiff);
		System.out.println(" is on the" + maxTempDay + "th day");

		System.out.print("Minimum temprature"+minDiff);
		System.out.println(" is on the" + minTempDay + "th day");
	}
}