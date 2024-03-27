public class TVSeries {
    private String seriesName;
    private String producer;

    public TVSeries(String seriesName, String producer)
    {
        this.seriesName = seriesName;
        this.producer = producer;
    }

    public String getSeriesName()
    {
        return seriesName;
    }

    public String getProducer()
    {
        return producer;
    }
}