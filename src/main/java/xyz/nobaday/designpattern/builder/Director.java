package xyz.nobaday.designpattern.builder;

public class Director {

    public Computer build(ComputerBuilder computerBuilder) {
        computerBuilder.setCpu();
        computerBuilder.setGpu();
        computerBuilder.setMotherboard();
        computerBuilder.setMemory();
        computerBuilder.setHarddisk();
        computerBuilder.setPower();
        return computerBuilder.build();
    }

}
