package BibleAssignment2Driver;

public class BibleAssignment2 {

	public static void main(String[] args) {
		long gens[] = {7700000000L, 0, 0, 0, 0};
		int gensAge[] = {18, 0, 0, 0, 0};
		long disp[] = {13, 0, 0, 0, 0};
		long allDisp = 13L;
		int years = 0;
		while (disp[0] + disp[1] + disp[2] + disp[3] + disp[4] < gens[0] + gens[1] + gens[2] + gens[3] + gens[4])
		{			
			if (gensAge[0] == 72)
			{
				gens[0] = gens[1];
				gensAge[0] = gensAge[1];
				disp[0] = disp[1];
				gens[1] = gens[2];
				gensAge[1] = gensAge[2];
				disp[1] = disp[2];
				gens[2] = gens[3];
				gensAge[2] = gensAge[3];
				disp[2] = disp[3];
				gens[3] = gens[4];
				gensAge[3] = gensAge[4];
				disp[3] = disp[4];
 				gens[4] = 0L;
				gensAge[4] = 0;
				disp[4] = 0;
			}
			if(years%3 == 0)
			{
				allDisp = allDisp*2;
			}		
			int numEligible = 0;
			for(int j = 0; j < gens.length-1; j++)
			{

				if(gensAge[j] == 30)
				{
					gens[j+1] = gens[j] / 2;
				}
				if(gensAge[j] > 18)
				{
					numEligible++;
				}
			for (int i = 0; i< numEligible; i++)
			{
				disp[i] = allDisp/numEligible;
			}
			}
			for (int i = 0; i < gensAge.length; i++)
			{
				if(gens[i] != 0)
				{
					gensAge[i]++;
				}
			}
			years++;			
			System.out.println(gens[0] +  " " + gens[1] +  " " +  gens[2] + " " +  gens[3] +  " " +  gens[4]);
			System.out.println(disp[0] +  " " + disp[1] +  " " +  disp[2] + " " +  disp[3] +  " " +  disp[4]);
		}

		System.out.println(years);

		
	}

}
