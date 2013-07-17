
public class CountfromDataset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


	int array[]={13,4562,15,-8,9,87,6,4,3};
	int count = 0;
	for(int i=0;i<array.length;i++)
	{
		if(array[i]<0)
		{
			break;
		}
		count++;
	}
	System.out.println("The first set +ve number: "+count);
	System.out.print("The second set +ve numbers ");
	System.out.println((array.length)-count-1);
}
             
	}


