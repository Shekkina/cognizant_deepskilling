public class Computer {
    private String CPU, RAM, Storage;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
    }

    public static class Builder {
        private String CPU, RAM, Storage;

        public Builder setCPU(String cpu) {
            this.CPU = cpu;
            return this;
        }

        public Builder setRAM(String ram) {
            this.RAM = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.Storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void display() {
        System.out.println("CPU: " + CPU + ", RAM: " + RAM + ", Storage: " + Storage);
    }
}