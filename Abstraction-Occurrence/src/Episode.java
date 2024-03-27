public class Episode extends TVSeries
{
    private int number;
    private String title;
    private String storySynopsis;

    public Episode(String seriesName, String producer, int number, String title, String storySynopsis)
    {
        super(seriesName, producer);
        this.number = number;
        this.title = title;
        this.storySynopsis = storySynopsis;
    }

    public int getNumber()
    {
        return number;
    }

    public String getTitle()
    {
        return title;
    }

    public String getStorySynopsis()
    {
        return storySynopsis;
    }
}