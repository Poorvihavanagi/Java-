class FaceRunner{
	
	public static void main(String[] args)
	{
		
		String shape="Oval";
		String skinTone="Fair";
		String eyeColor="Brown";
		Face face=new Face(shape,skinTone,eyeColor);
		System.out.println("Face description: "+shape);
		System.out.println("Face description: "+skinTone);
		System.out.println("Face description: "+eyeColor+"\n");
		
		String shape2 = "Round";
        String skinTone2 = "Wheatish";
        String eyeColor2 = "Black";
        Face face2 = new Face(shape2, skinTone2, eyeColor2);
        System.out.println("Face shape: " + shape2);
        System.out.println("Skin tone: " + skinTone2);
        System.out.println("Eye color: " + eyeColor2 + "\n");

        String shape3 = "Square";
        String skinTone3 = "Dark";
        String eyeColor3 = "Green";
        Face face3 = new Face(shape3, skinTone3, eyeColor3);
        System.out.println("Face shape: " + shape3);
        System.out.println("Skin tone: " + skinTone3);
        System.out.println("Eye color: " + eyeColor3 + "\n");

        String shape4 = "Heart";
        String skinTone4 = "Pale";
        String eyeColor4 = "Blue";
        Face face4 = new Face(shape4, skinTone4, eyeColor4);
        System.out.println("Face shape: " + shape4);
        System.out.println("Skin tone: " + skinTone4);
        System.out.println("Eye color: " + eyeColor4 + "\n");

        String shape5 = "Diamond";
        String skinTone5 = "Tan";
        String eyeColor5 = "Hazel";
        Face face5 = new Face(shape5, skinTone5, eyeColor5);
        System.out.println("Face shape: " + shape5);
        System.out.println("Skin tone: " + skinTone5);
        System.out.println("Eye color: " + eyeColor5 + "\n");
	}
}