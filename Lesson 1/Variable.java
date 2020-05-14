public class Variable {

    public static void main(String[] args) {
        // RAM in GB
        byte ram = 16;
        // Intel(R) Core(TM) i7-4790 3.60 GHz
        char cpuSeries = 'i';
        short cpuSeriesNumber = 7;
        long cpuModel = 4790;
        float cpuFrequency = 3.60f;
        // Form factor hdd 2.5"
        double hddType = 2.5d;
        // CPU 64 bit
        int cpuType = 64;
        boolean osWin10 = true;

        System.out.println("CPU: " + cpuSeries + cpuSeriesNumber + "-" + cpuModel);
        System.out.println("Frequency: " + cpuFrequency + " GHz");
        System.out.println("CPU architecture: " + cpuType + "-bit");
        System.out.println("RAM: " + ram + " GB");
        System.out.println("HDD form factor: " + hddType + "\"");
        System.out.println("My OS is Windows 10: " + osWin10);
    }
}