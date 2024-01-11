package object.day8;

public class Cat extends Animal {
    public static final String TYPE ="고양이 ";
    public Cat(){
    }
    public Cat(String name, String color){
        super(name,color);      
    }  // ㄴ 생략 가능. 
    @Override
	public void sound() {
		System.out.println(this.color +" 고양이는 야옹 😽하고 소리를 냅니다. ");
	}
    @Override
	public String toString() {
		return TYPE+"[color=" + color + ", name=" + name + "]";
	}
}
