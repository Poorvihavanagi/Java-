class LadderRunner{
	public static void main(String[] args){
		
		int count=10;
		Ladder.fold(count);
		
		double height=5;
		Ladder.extend(height);
		
		boolean yesorno=true;
		Ladder.is_foldable(yesorno);
		
		char cond='N';
		String name="Poorvi";
		Ladder.climb(cond,name);
		
		int steps=5;
		boolean locked=false;
		Ladder.extend(steps,locked);
		
		String location="Backward";
		int range=6;
		String path="Left";
		Ladder.moveLadder(location,range,path);
		
		int degree=60;
		String texture="Aluminum";
		boolean stable = true;
		Ladder.setupLadder(degree,texture,stable);
	}
}