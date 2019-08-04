
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in ); 
		System.out.print("Enter first number: ");
	    int nValue = sc.nextInt();
		int[] intArray = new int[nValue];
	
		System.out.println("Enter all the elements: \n ");
        for(int i = 0; i < nValue; i++)
        {
            intArray[i] = sc.nextInt();
        }
        sc.close();
        List<Integer> x = new ArrayList<Integer>();
      
        for (int i = 0; i < intArray.length; i++) {            
            int forRound = intArray[i]%10;
            	int pushValue =0;
    		if(intArray[i]>35) {
    			switch(forRound) {
        		case 3:
        			pushValue = intArray[i]+2;
        			break;
        		case 4:
        			pushValue = intArray[i]+1;
        			break;
        		case 5:
        			pushValue = intArray[i]+0;
        			break;
        		case 6:
        			pushValue = intArray[i]+4;
        			break;
        		case 7:
        			pushValue = intArray[i]+3;
        			break;
        		case 8:
        			pushValue = intArray[i]+2;
        			break;
        		case 9:
        			pushValue = intArray[i]+1;
        			break;
        		}
    			if(pushValue>=40) {
    				x.add(pushValue);
    			}else {
    				x.add(intArray[i]);
    			}
    			
            }else {
            	x.add(intArray[i]);
            }
		}
        
        for (int i = 0; i < x.size(); i++)  
            System.out.print(x.get(i) + " ");
        
	}

}
