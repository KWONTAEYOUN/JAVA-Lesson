package object.자습;

public class CopyMain {
    public static void main(String[] args) {
        Copy ta = new Copy();
        ta.setGrade(3);
        ta.setName("권태윤");
        ta.setNum(new int[3]);
        int[] Array = {75, 67, 65};
        ta.setNum(Array);
        ta.printData();

    }
}
