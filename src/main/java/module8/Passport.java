package module8;

import java.util.Objects;

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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(series, passport.series) &&
                Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, number);
    }

}
