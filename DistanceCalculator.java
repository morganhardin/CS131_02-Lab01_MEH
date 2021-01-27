public class DistanceCalculator 
{
	private DistanceCalculator()
	{
		int x = 1;
		int y = 1;
		int a = 1;
		int b = 1;
	}
	public static double calculateDistance(int x, int y, int a, int b)
	{
		double distance = Math.sqrt(Math.pow((a-x),2)+Math.pow((b-y),2));
		return distance;
	}
}
