package designpatterns.adapterpattern;

public class MemorycardToUSB implements USB {
    private MemoryCard memoryCard;

    public MemorycardToUSB(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    public String connectWithUSB(){
        return memoryCard.data();
    }

    @Override
    public String connectWithUsb() {
        return connectWithUSB();
    }
}
