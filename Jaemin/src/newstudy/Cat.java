package newstudy;

public class Cat {

	private String sound;
	private String name;

	public Cat() {}
	
	public Cat(String sound, String name) {
		super();
		this.sound = sound;
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String aa) {
		this.sound = aa;
	}
	
	public void setSound(String aa, String bb) {
		this.sound = aa;
		this.name = bb;
	}
	
	public void catSound() {
		System.out.println(sound);
	}

	@Override
	public String toString() {
		return "소리 " + this.sound + " 이름 " + this.name;
	}

	
	
	
	
}
