package newstudy;

public class ClassTestMain {

	public static void main(String[] args) {
		Cat cat01 = new Cat();
		Cat cat02 = new Cat("�߿�", "��");
		
		System.out.println(cat02);
		
		String cc = "�ֿ�";
		String bb;
		
		cat01.setSound("�׸���");
		cat01.catSound();
		cat01.setSound(cc);
		
		bb = cat01.getSound();
		System.out.println(bb);
		
		cat01.setSound("�ɳ�", "����");
		System.out.println(cat01);
	}
	
}
