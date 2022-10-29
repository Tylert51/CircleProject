public class BitShiftingTest {
    public static void main(String[] args) {

        int num = 5;  // 0 1 0 1
        int bitMask = 1 << 2;
        int notBitMask = ~(bitMask);
        int newNum = notBitMask & num;
        System.out.println(newNum);
    }
}
