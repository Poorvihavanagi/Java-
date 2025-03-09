class VariableBoolean{
	public static void main(String[] args){
		boolean eligible=true;
			System.out.println(eligible);
		boolean dark_mode=true;	//enabled dark mode
			System.out.println(dark_mode);
		boolean del_status=false;	//order status
			System.out.println(del_status);
		boolean is_present=false;
			System.out.println(is_present);
		boolean available=false;
			System.out.println(available);
		System.out.println("After re-assigning");
		del_status=true;
			System.out.println(del_status);
		eligible=false;
			System.out.println(eligible);
		is_present=true;
			System.out.println(is_present);
		dark_mode=false;
			System.out.println(dark_mode);
		available=true;
			System.out.println(available);
		
	}
}