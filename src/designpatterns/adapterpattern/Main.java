package designpatterns.adapterpattern;

public class Main {
    public static void main(String[] args) {
        MemoryCard memoryCard = new MemoryCard();
        USB adapter = new MemorycardToUSB(memoryCard);

        Computer computer = new Computer();
        computer.readDataFromUSB(adapter);
    }
}
