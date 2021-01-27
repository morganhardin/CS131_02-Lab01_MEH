public class DateManipulator 
{
	public DateManipulator()
	{
		int year = 1;
	}
	public boolean isLeapYear(int year)
	{
		if (year > 1581)
		{
			if (year%4==0)
			{
				if (year%400==0)
				{
				return true;
				}
				else if (year%100==0)
				{
					return false;
				}
				else if (year%4==0)
				{
					return true;
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}
}
