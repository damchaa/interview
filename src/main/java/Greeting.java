public class Greeting {

    private final long id;
    private final Double temp;
    private final Long pressure;
    private final Long humidity;
    private final Double tempMin;
    private final Double tempMax;



    public Greeting(long id, Double temp,Long pressure,Long humidity,Double tempMin,Double tempMax) {
        this.id = id;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    public long getId() {
        return id;
    }

    public  Double getTemp() {
        return temp;
    }

    public Long getPressure() {
        return pressure;
    }

    public Long getHumidity() {
        return humidity;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    /*
    @JsonProperty("temp")
  public ;
  @JsonProperty("pressure")
  public ;
  @JsonProperty("humidity")
  public ;
  @JsonProperty("temp_min")
  public Double tempMin;
  @JsonProperty("temp_max")
  public Double tempMax;
     */
}