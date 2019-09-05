class Board {
    private final int col_num ;
    private final int row_num;
    private String name;
    private Box[] boxes;

    Board() {
        this(3,3, "3*3Board");
    }

    Board(int rowSet, int colSet, String name)
    {
        this.col_num = colSet;
        this.row_num = rowSet;
        this.name = name;
        boxes = new Box[row_num * col_num];
        init();
    }

    private void init()
    {
        for(int i = 0; i < boxes.length; i++)
        {
            Box b = new Box(i/row_num, i%col_num);
            boxes[i] = b;
        }
    }

    public void printTest()
    {
        System.out.println("Printing the Board info");
        for(int i = 0; i < boxes.length; i++)
        {
            boxes[i].printTest();
        }
        System.out.println();
    }

    public static void main(String args[])
    {

    }
}