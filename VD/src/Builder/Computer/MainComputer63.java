package Builder.Computer;

public class MainComputer63 {
    public static void main(String[] args) {
        Computer63 computer = new Computer63.Builder()
                .addCPU("Ultra core 1500")
                .addRAM("DDR5 6400 Mhz")
                .addStorage("2TB NVM5 Evo Samsung")
                .addScreen("24 inch 100% RGB 360Hz")
                .build();
        System.out.println(computer.toString());
    }
}
