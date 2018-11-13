package practice;

enum Day  {    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY };
    
class EnumTest
{
	Day d;
	void setDay(Day d)
	{
		this.d = d;
	}
	Day getDay()
	{
		return d;
	}
}

public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumTest t = new EnumTest();
		t.setDay(Day.FRIDAY);
		System.out.println(t.getDay());
	}

}
