class Ladder{
	
	public static void fold(int stepCount)
	{
		System.out.println(stepCount);
	}
	
	public static void extend(double height)
	{
		System.out.println(height);
	}
	
	public static void is_foldable(boolean yesorno)
	{
		System.out.println(yesorno);
	}
	
	public static void climb(char condition, String name)
	{
		System.out.println(condition);
		System.out.println(name);
	}
	
	public static void extend(int steps, boolean is_locked)
	{
		System.out.println(steps);
		System.out.println(is_locked);
	}
	
	public static void moveLadder(String position, int distance, String direction){
		System.out.println(position);
		System.out.println(distance);
		System.out.println(direction);
	}
	
	public static void setupLadder(int angle,String material,boolean isStable)
	{
		System.out.println(angle);
		System.out.println(material);
		System.out.println(isStable);
	}
}