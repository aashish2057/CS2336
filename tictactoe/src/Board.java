/*
    Aashish Sharma
    CS2336.006
    Analysis - Setup board for game
    Design - allow variable board size, and have default board size in case user doesn't enter rows and columns
           - the default case is done in default constructor and the variable is in the other constructor
           - init() method goes through every part of board, and calls box class to fill in all boxes
           - printTest() method is if user wants to know what value is stored in every specific box
           - print() method prints out entire board
 */

import java.util.Arrays;

// Class to setup Board in game
class Board {
    private int col_num ;
    private int row_num;
    private String name;
    private Box[] boxes;

    // Default constructor if user doesnt specify board size and name
    Board() {
        this(3,3, "3*3Board");
    }

    // Constructor when user defined rows, cols and board name
    Board(int rowSet, int colSet, String name)
    {
        this.col_num = colSet;
        this.row_num = rowSet;
        this.name = name;
        boxes = new Box[row_num * col_num]; // setup board with given size
        init(); // go to init method to parse through the board
    }

    // Parses through the board
    private void init()
    {
        // For loop that runs through the length of the board
        for(int i = 0; i < boxes.length; i++)
        {
            // calls box class located in Box.java to fill in the specific boxes in the board
            Box b = new Box(i/row_num, i%col_num);
            boxes[i] = b;
        }
    }

    // Method for testing print
    public void printTest()
    {
        System.out.println("Printing the Board info");
        // increment through board and go to box class for every slot in board
        for(int i = 0; i < boxes.length; i++)
        {
            boxes[i].printTest();
        }
        System.out.println();
    }

    // Method for printing out board in playable format
    public void print()
    {
        System.out.println("Printing the Board info");
        // count variable to keep track of number of columns printed
        int count = 1;
        for(int i = 0; i < boxes.length; i++)
        {
            boxes[i].print();
            // if count reaches column limit, go to next line
            if(count == col_num)
            {
                System.out.println();
                count = 1;
            }
            else // if not increment count until it hits column limit
            {
                count++;
            }
        }
        System.out.println();
    }
}