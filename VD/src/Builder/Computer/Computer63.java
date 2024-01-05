package Builder.Computer;

public class Computer63 {
    String CPU,RAM,storage,screen;


    public Computer63(Builder builder) {
        this.CPU=builder.CPU;
        this.RAM=builder.RAM;
        this.storage=builder.storage;
        this.screen=builder.screen;
    }

    @Override
    public String toString() {
        return "CPU:"+this.CPU+
                "\nRAM:"+this.RAM+
                "\nStorage:"+this.storage+
                "\nScreen:"+this.screen;
    }

    public static  class  Builder{
        String CPU,RAM,storage,screen;
        public Builder addCPU(String cpu){
            this.CPU=cpu;
            return this;
        }
        public Builder addRAM(String ram){
            this.RAM=ram;
            return this;
        }
        public Builder addStorage(String storage){
            this.storage=storage;
            return this;
        }
        public Builder addScreen(String screen){
            this.screen=screen;
            return this;
        }

        public Computer63 build(){return new Computer63(this);
        }
    }
}
