package module8;

public class Passport {
    private String series;
    private Integer number;

    public Passport(String series, Integer number) {
        this.series = series;
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        Passport passport = (Passport) o;
        return number.equals(passport.number) &&
                series.equals(passport.series);
    }

    @Override
    public int hashCode() {
        return series.hashCode() + number.hashCode();
    }

}
