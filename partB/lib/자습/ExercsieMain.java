package object.day6;

public class ExercsieMain {
    public static void main(String[] args) {
        Exercise soccer = new Exercise("축구선수", 30, 174, new String[2]);
        Exercise baseball = new Exercise("야구선수", 21, 177, new String[2]);
        Exercise basketball = new Exercise("농구선수", 27, 189, new String[2]);
        Exercise swim = new Exercise("수영선수", 19, 193, new String[2]);
        Exercise volleyball = new Exercise("배구선수", 25, 201, new String[2]);

        System.out.println(soccer.getData());
        System.out.println(baseball.getData());
        System.out.println(basketball.getData());
        System.out.println(swim.getData());
        System.out.println(volleyball.getData());

        String[] temp = soccer.getAbility();
        temp[0] = "달리기가 빠름";
        temp[1] = "발기술이 좋음";




    }
}
