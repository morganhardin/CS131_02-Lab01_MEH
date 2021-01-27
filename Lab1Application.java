public class Lab1Application 
{

	public static void main(String[] args) 
	{
		//Question 1
		Rectangle myRectangle = new Rectangle(3,8);
		int l = myRectangle.getLength();
		int w = myRectangle.getWidth();
		int area = myRectangle.calculateArea();
		int perimeter = myRectangle.calculatePerimeter();
		System.out.println("The length is " + l + " and the width is " + w + ".");
		System.out.println("The area is " + area + " and the perimeter is " + perimeter + ".");
				
		//Question 2
		double distance = DistanceCalculator.calculateDistance(3,2,6,4);
		System.out.println("The distance is " + distance + ".");
				
		//Question 3
		BasicMath myBasicMath = new BasicMath();
		int sum = myBasicMath.add(10,2);
		int difference = myBasicMath.subtract(10,2);
		int product = myBasicMath.multiply(10,2);
		int quotient = myBasicMath.subtract(10,2);
		System.out.println("The sum is " + sum + " and the difference is " + difference + ".");
		System.out.println("The product is " + product + " and the quotient is " + quotient + ".");
				
		//Question 4
		DateManipulator myDateManipulator = new DateManipulator();
		boolean answer = myDateManipulator.isLeapYear(1900);
		boolean answer1 = myDateManipulator.isLeapYear(1600);
		System.out.println(answer + ", " + answer1);

	}

}
