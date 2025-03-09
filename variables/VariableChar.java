class VariableChar{
	public static void main(String[] args){
		char gender='M';
			System.out.println(gender);
		char blood_group='O';	//A,B
			System.out.println(blood_group);
		char gear='D';	//vehical gear D-drive R-reverse N-neutral
			System.out.println(gear);
		char seat_row='E';	//seat row in theater
			System.out.println(seat_row);
		char answer='B';	//mcq options A,B,C,D-drive
			System.out.println(answer);
		System.out.println("After re-assigning");
		gender='F';
			System.out.println(gender);
		blood_group='A';
			System.out.println(blood_group);
		gear='R';
			System.out.println(gear);
		answer='D';
			System.out.println(answer);
		seat_row='D';
			System.out.println(seat_row);
	}
}