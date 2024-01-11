package object.day8;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age){
        this.name = name;
        this.age = age;   
    } 
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    // 다형성 예시 : 메소드 인자가 부모 타입일 때, 실제 객체는 여러 자식 객체가 될 수 있습니다.
    boolean isAdopt(Animal animal){
        // 강아지는 15세이상, 고양이는 18세이상, 토끼는 13세 이상 분양받을 수 있습니다.
        // 그 외에는 무조건 나이가 20세 이상일 때만 분양받을 수 있습니다.
        // AND 연산 특징 : 참 && 참 = 참, 참 && 거짓 = 거짓, 거짓 && 참 = 거짓, 거짓 && 거짓 = 거짓
        // OR 연산 특징 : 참 || 참 = 참, 참 || 거짓 = 참, 거짓 || 참 = 참, 거짓, 거짓 || 거짓 = 거짓
        if (animal instanceof Puppy && age >=15) 
                return true;
            else if(animal instanceof Cat && age >=18)
                return true;
            else if(animal instanceof Rabbit && age >=13)
                return true;
            else if(age >=20)
                return true;
            else
                return false;
    
            
        
    }
}
