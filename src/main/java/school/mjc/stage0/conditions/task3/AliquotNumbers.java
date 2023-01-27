package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        int aliquotResult = second % first;

        if (aliquotResult == 0 ) {
            System.out.println("Aliquot");
        } else System.out.println("Not aliquot");
    }
}
