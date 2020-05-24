package xyz.nobaday.designpattern.builder;

public class GeneralComputerBuilder implements ComputerBuilder {

    Computer computer = new Computer();

    public void setCpu() {
        computer.setCpu("AMD 3600x");
    }

    public void setGpu() {
        computer.setGpu("msi RTX2060 万图师");
    }

    public void setMotherboard() {
        computer.setMotherboard("B450M 迫击炮");
    }

    public void setMemory() {
        computer.setMemory("金士顿 2666 8G*2 普条");
    }

    public void setHarddisk() {
        computer.setHarddisk("西数蓝盘500G");
    }

    public void setPower() {
        computer.setPower("酷能至尊GX550铜牌");
    }

    public Computer build() {
        return computer;
    }
}
