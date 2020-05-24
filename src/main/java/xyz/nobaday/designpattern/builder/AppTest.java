package xyz.nobaday.designpattern.builder;

public class AppTest {

    public static void main(String[] args) {
        ComputerBuilder gameComputerBuilder = new GameComputerBuilder();
        Director director = new Director();

        Computer gameComputer = director.build(gameComputerBuilder);
        System.out.println(gameComputer.toString());

        GeneralComputerBuilder generalComputerBuilder = new GeneralComputerBuilder();
        Computer generalComputer = director.build(generalComputerBuilder);
        System.out.println(generalComputer);
    }

}
