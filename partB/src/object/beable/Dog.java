package object.beable;

public class Dog implements Runnable{

@Override
public String beAble() {
    return "달리기";
}
@Override
public String run(int speed) {
    // TODO Auto-generated method stub
    return "Dog 는" + speed + "km/h 로 달립니다\n 최대속도 50km/h...";
}

    
}
