class Add
{
	public static void main(String[] ar)
	{
		System.out.println(add(10));
		System.out.println(add(101));
		System.out.println(add(1011));
	}
	public static int add(int num)
	{
		while (num / 10 != 0)
		{
			num = num % 10 + num / 10;
		}
		return num;
	}
}