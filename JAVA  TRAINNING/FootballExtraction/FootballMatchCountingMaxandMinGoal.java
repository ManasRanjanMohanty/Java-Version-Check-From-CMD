

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FootballMatchCountingMaxandMinGoal 
                  {

	public static void main(String[] args) {
		
		try {
			int GoalFor = 0;
			int GoalAgnaist = 0;
			int maxgoal = 0;
			int mingoal = 0;
			String MaximumscorerName = "";
			String MinimumscorerName = "";
			String TeamName="";
			Scanner scanner = new Scanner(new File("D:/Nthdimenzio/workspace/WEEK3/football.dat"));

			while (scanner.hasNext()) {

				String string = scanner.nextLine();


				Matcher matcherName = Pattern.compile("[A-Z][aA-zZ]+").matcher(string);
  

				while (matcherName.find()) 
				          {

					TeamName = matcherName.group();

			            }

				Matcher matcher = Pattern.compile("\\d[0-9]+\\s\\s-").matcher(string);
  


				while (matcher.find()) {

					GoalFor = new Integer(matcher.group().replace("-", " ").trim());

				}

				Matcher matchermin = Pattern.compile("\\-\\s\\s[0-9]+").matcher(string);

				while (matchermin.find()) {

					GoalAgnaist = new Integer(matchermin.group().replace("-", "").trim());

				}

				
				
				if((GoalFor - GoalAgnaist)>maxgoal)
				         {
					
					maxgoal=GoalFor-GoalAgnaist;
					GoalFor=maxgoal;
					MaximumscorerName = TeamName;
					      }
				
				
				else if((GoalFor - GoalAgnaist)<mingoal)
				          {
					mingoal=GoalFor-GoalAgnaist;
					MinimumscorerName = TeamName;
					
				         }
                                   }
			
		                      
				 System.out.println("Team"+MaximumscorerName +" With maxgoal:"+   maxgoal);
			
			     System.out.println("Team " +MinimumscorerName  +" With minimumgoal:"+mingoal);
	                     }
		  catch (FileNotFoundException e) 
		                      {
			
			        e.printStackTrace();
		                      }

	                      }
                      }

