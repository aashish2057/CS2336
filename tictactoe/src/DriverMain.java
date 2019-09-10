/*
    Aashish Sharma
    CS2336.006
    This file is the driver of the program I have included both test
    cases from elearning
 */


public class DriverMain {
    public static void main(String[] args)
    {
        // Test 1
        Board board1 = new Board();
        board1.print();
        // Test 2
        Board board2 = new Board(2,4, "2*4 board");
        board2.printTest();
    }

}