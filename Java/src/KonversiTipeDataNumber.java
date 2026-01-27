public class KonversiTipeDataNumber {
    static void main() {
        byte iniByte = 100;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;

        long iniLong = 1000000000;
        long iniLong2 = 10000000000L;

        float iniFloat = 10.10F;
        double iniDouble = 10.10;

        int decimalInt = 34;
        int hexDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        int amount = 1_000_000_000;
    }
}
