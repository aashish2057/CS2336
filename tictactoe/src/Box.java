class Box {
    private int row = 0;
    private int col = 0;
    private String placeholder = "-";

    Box(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    void printTest()
    {
        System.out.println("row: " + row + "col: " + col + "placeholder: " + placeholder);
    }




}