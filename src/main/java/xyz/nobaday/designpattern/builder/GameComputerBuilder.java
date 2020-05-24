package xyz.nobaday.designpattern.builder;

public class GameComputerBuilder implements ComputerBuilder {

    private Computer computer = new Computer();

    public void setCpu() {
        computer.setCpu("ADM线程撕裂者3990x");
    }

    public void setGpu() {
        computer.setGpu("ROG-STRIX-GeForce RTX2080 TI-O11G-GAMING");
    }

    public void setMotherboard() {
        computer.setMotherboard("ROG ZENITH II EXTREME");
    }

    public void setPower() {
        computer.setPower("美商海盗船 AX1600i 钛金牌 1600W");
    }

    public void setMemory() {
        computer.setMemory("芝奇（G.SKILL）256GB(32Gx8)套装 3600频率 DDR4 ");
    }

    public void setHarddisk() {
        computer.setHarddisk("三星(SAMSUNG) 970 EVO PLUS 250G M.2 NVMe 固态硬盘（MZ-V7S250BW）");
    }

    public Computer build() {
        return computer;
    }
}
