package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public static void printTable(int numberTableToPrint) {
        for (int tableNum = 1; tableNum < 11; tableNum++) {
            int multiplicationTable = numberTableToPrint * tableNum;
            System.out.println(tableNum + " x " + numberTableToPrint + " = " + multiplicationTable);
        }
    }

    public static void main(String[] args) {
        printTable(5);
    }
}
