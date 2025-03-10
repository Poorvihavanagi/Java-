class Nurse{
	public static void assist(String patientName)
	{
		System.out.println("Nurse is asking patient's Name");
	}
}

class Doctor{
	public static void treatment(String patientName, int age)
	{
		System.out.println("Doctor is diagnosing");
		Nurse.assist(patientName);
	}
}

class Hospital{
	public static void checkUp(String patientName, int age, long mobileNo, String email, String sickness)
	{
		System.out.println("Hospital conducting checkup for: " + patientName);
        System.out.println("Age: " + age + ", Mobile No: " + mobileNo + ", Email: " + email + ", Sickness: " + sickness);
		Doctor.treatment(patientName, age);
	}
}

class HospitalRunner{
	public static void main(String[] args)
	{
		//String customerName="Meghana";
		String patientName="Rashmi";
		int age=21;
		String email="rashmi24@gmail.com";
		long mobileNo=9456871236l;
		String sickness="Cold";
		Hospital.checkUp(patientName,age,mobileNo,email,sickness);
	}
}
