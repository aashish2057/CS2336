/*
    Aashish Sharma
    CS2336.006
    Analysis - Setup the boxes within the board
    Design - Box constructor determines which the location of the specific box given row and col (ex: 2,1)
           - printTest() method used if user wants to see values in each row and col with specific location printed
           - print() method just prints the board
 */

// class to setup boxes within the board
class Box {
    private int row = 0;
    private int col = 0;
    private String placeholder = "-";

    Box(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    // this method prints the values in each row and col so for test purposes
    void printTest()
    {
        System.out.println("row: " + row + "col: " + col + "placeholder: " + placeholder);
    }

    // prints values inside boxes in board
    void print()
    {
        System.out.print(placeholder);
    }
}