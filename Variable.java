public class Variable {
    // RAM in GB
    static final byte RAM = 16;

    // Intel(R) Core(TM) i7-4790 3.60 GHz
    static final char CPU_SERIES = 'i';
    static final short CPU_SERIES_NUMBER = 7;
    static final long CPU_MODEL = 4790;
    static final float CPU_FREQUENCY = 3.60f;

    // Form factor hdd 2.5"
    static final double HDD_TYPE = 2.5d;
    // CPU 64 bit
    static final int CPU_TYPE = 64;

    static final boolean OS_WIN10 = true;

    public static void main(String[] args) {
        System.out.println("CPU: " + CPU_SERIES + CPU_SERIES_NUMBER + "-" + CPU_MODEL);
        System.out.println("Frequency: " + CPU_FREQUENCY + " GHz");
        System.out.println("CPU architecture: " + CPU_TYPE + "-bit");
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("HDD form factor: " + HDD_TYPE + "\"");
        System.out.println("My OS is Windows 10: " + OS_WIN10);
    }
}