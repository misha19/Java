package headFirstJava0;

public class phraseomatic {

	public static void main(String[] args) {
		//make three sets of word to choose from . Add your own!
		
		String[] wordListOne = { "24/7" , "multi-Tier" , "30,000 meters" , "B-to-B" , "win-win", "obstacle" , "fantastic", 
				"great" , "solution" , "astonished" , " halt" , "manager" , "pathetic", "mindfull", "target" };
		String[] wordListTwo = { "cluster" , "jammed" , "nevertheless" ,"flash" , "trees",  "all",
				"reading" , "birds" , " are" , " happy" , " mission" , "fishing" } ; 
        String[] wordListThree = { "now" , "there" , "other" , " strategy" , " solution" , " space"
        		, "cooperative" , " sticky" };
        
        //find out how many words are in each list
        int oneLength = wordListOne.length; 
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        //generate three random numbers 
        int rand1 = (int)(Math.random()*oneLength); 
        int rand2 = (int)(Math.random()*twoLength);
        int rand3 = (int)(Math.random()*threeLength);
        
        //now build a phrase 
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree [rand3]; 
        
        //print out the phrase 
        System.out.println("What we need is a/an " + phrase ) ; 
        
        }
		
		}

	

  