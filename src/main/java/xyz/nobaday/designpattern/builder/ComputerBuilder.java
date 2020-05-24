package xyz.nobaday.designpattern.builder;

public interface ComputerBuilder {

    public void setCpu();

    public void setGpu();

    public void setMotherboard();

    public void setMemory();

    public void setHarddisk();

    public void setPower();

    public Computer build();

}
