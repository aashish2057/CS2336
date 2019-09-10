public class TTTGame {

    private Player[] players = new Player[2];
    private Board board;
    private int row = 3;
    private int col = 3;
    private int scoreToWin = 3;
    private String[] marks = {"X", "O"};
    private String name = "TicTacToe";

    public TTTGame()
    {
        setPlayers();
        setBoard();
        start();
    }

    private void start()
    {
        int indxcurrentPlayer = 0;

    }

    private void setPlayers(Player[] players)
    {
        for(int i = 0; i < players.length; i++)
        {
            Player p = new Player("player" + i, marks[i]);
            players[i] = p;
        }
    }

    private void setBoard()
    {
        this.board = new Board(row, col, "TTTGame");
    }
}
