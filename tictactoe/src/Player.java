public class Player {
    private String name;
    private String Mark;

    public Player(String name, String mark)
    {
        this.setName(name);
        this.setMark(mark);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getMark()
    {
        return Mark;
    }

    public void setMark(String mark)
    {
        Mark = mark;
    }
}
