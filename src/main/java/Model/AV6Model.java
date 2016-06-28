package Model;

import java.util.Date;

public class AV6Model {
    private int id;
    private Date date;
    private String windDirectionName;
    private Integer windSpeed;
    private Integer windRush;
    private Integer visibility;
    private Integer octantsNumerator;
    private Integer octantsDenominator;
    private String cloudForm;
    private Integer cloudiness;
    private Double temperature;
    private Double dewPointTemperature;
    private Integer relativityHumidity;
    private Double absoluteHumidity;
    private Double atmospherePressure;
    private Double barometricTrend;
    private Double qnhGPa;
    private Double qnhMm;
    private Double qfe;

    public AV6Model(int id, Date date, String windDirectionName, Integer windSpeed, Integer windRush, Integer visibility, Integer octantsNumerator, Integer octantsDenominator, String cloudForm, Integer cloudiness, Double temperature, Double dewPointTemperature, Integer relativityHumidity, Double absoluteHumidity, Double atmospherePressure, Double barometricTrend, Double qnhGPa, Double qnhMm, Double qfe) {
        this.id = id;
        this.date = date;
        this.windDirectionName = windDirectionName;
        this.windSpeed = windSpeed;
        this.windRush = windRush;
        this.visibility = visibility;
        this.octantsNumerator = octantsNumerator;
        this.octantsDenominator = octantsDenominator;
        this.cloudForm = cloudForm;
        this.cloudiness = cloudiness;
        this.temperature = temperature;
        this.dewPointTemperature = dewPointTemperature;
        this.relativityHumidity = relativityHumidity;
        this.absoluteHumidity = absoluteHumidity;
        this.atmospherePressure = atmospherePressure;
        this.barometricTrend = barometricTrend;
        this.qnhGPa = qnhGPa;
        this.qnhMm = qnhMm;
        this.qfe = qfe;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getWindDirectionName() {
        return windDirectionName;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public Integer getWindRush() {
        return windRush;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public Integer getOctantsNumerator() {
        return octantsNumerator;
    }

    public Integer getOctantsDenominator() {
        return octantsDenominator;
    }

    public String getCloudForm() {
        return cloudForm;
    }

    public Integer getCloudiness() {
        return cloudiness;
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getDewPointTemperature() {
        return dewPointTemperature;
    }

    public Integer getRelativityHumidity() {
        return relativityHumidity;
    }

    public Double getAbsoluteHumidity() {
        return absoluteHumidity;
    }

    public Double getAtmospherePressure() {
        return atmospherePressure;
    }

    public Double getBarometricTrend() {
        return barometricTrend;
    }

    public Double getQnhGPa() {
        return qnhGPa;
    }

    public Double getQnhMm() {
        return qnhMm;
    }

    public Double getQfe() {
        return qfe;
    }

    @Override
    public String toString() {
        return "AV6Model{" +
                "id=" + id +
                ", date=" + date +
                ", windDirectionName='" + windDirectionName + '\'' +
                ", windSpeed=" + windSpeed +
                ", windRush=" + windRush +
                ", visibility=" + visibility +
                ", octantsNumerator=" + octantsNumerator +
                ", octantsDenominator=" + octantsDenominator +
                ", cloudForm='" + cloudForm + '\'' +
                ", cloudiness=" + cloudiness +
                ", temperature=" + temperature +
                ", dewPointTemperature=" + dewPointTemperature +
                ", relativityHumidity=" + relativityHumidity +
                ", absoluteHumidity=" + absoluteHumidity +
                ", atmospherePressure=" + atmospherePressure +
                ", barometricTrend=" + barometricTrend +
                ", qnhGPa=" + qnhGPa +
                ", qnhMm=" + qnhMm +
                ", qfe=" + qfe +
                '}';
    }
}
