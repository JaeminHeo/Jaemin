package newstudy;

public class ClassTestMain {

	public static void main(String[] args) {
		Cat cat01 = new Cat();
		Cat cat02 = new Cat("具克", "蹲");
		
		System.out.println(cat02);
		
		String cc = "局克";
		String bb;
		
		cat01.setSound("弊福釜");
		cat01.catSound();
		cat01.setSound(cc);
		
		bb = cat01.getSound();
		System.out.println(bb);
		
		cat01.setSound("成成", "蹲捞");
		System.out.println(cat01);
	}
	
}
