package object.day7;

// Shape 클래스 상속 예시2
public class Diamond extends Shape {

    // 생성자 정의가 명시적을 없으면 기본생성자를 실행합니다.
    // 자식클래스는 부모클래스 기본생성자를 먼저 실행합니다.

    // 자식이지만 부모가 private으로 했으므로 오류
    // public void setShapeName(String shapeName) {
        // this.shapeName = shapeName;
    // }

    // 부모가 protected로 선언한 필드는 자식은 자유롭게 접근 가능함.
    public void setEtc(String etc) {
        this.etc = etc;
    }

    public void setRound(int round) {
        this.round = round;
    }

    @Override
    public void draw() {
        System.out.println("다이아몬드 " + this.getShapeName() + "를 그립니다.");
    }

    // 자식클래스가 정의한 인스턴스 메소드 - Diamone 타입으로 선언한 참조변수만 실행할 수 있음.
    public void iAmDiamod(){
        System.out.println("나는 다이아몬드 ~반짝반짝!!");
    }

    // day 8 : Object 클래스의 toString 메소드를 오버라이드
    //                  ㄴ object.day7.Diamond@1c20c684 가 기본인 것을 다른 문자열을 바꿈.
    @Override
    public String toString() {
        return "Diamond []";
    }

}
// 접근 한정자
// public : 모두에게 공개
// private : 모두에게 숨기기
// protected : 같은 패키지 클래스와 다른 패키지인 경우는 자식에게만 공개
// ㄴ Shape의 etc는 자식인 Triangle, Diamond에게는 공개 / 같은 패키지 B10DiamondTest에게도 공개
// ㄴ 그 외의 경우는 비공개. 다른 패키지이지만 자식 클래스라면 공개
// 아무것도 안 씀 : 거의 사용하지 않는다. 같은 패키지 클래스에게만 공개
// ㄴ object.day7 패키지 클래스에게는 모두 공개 / 그 외에는 숨기기
