package lesson;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Auto {
    private String mark;
    private int maxSpeed;
    private int year;
    private String number;

    public Auto() {
    }

    public Auto(String mark, int maxSpeed, int year, String number) {
        this.mark = mark;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auto auto = (Auto) o;

        if (maxSpeed != auto.maxSpeed) return false;
        if (year != auto.year) return false;
        if (mark != null ? !mark.equals(auto.mark) : auto.mark != null) return false;
        return number != null ? number.equals(auto.number) : auto.number == null;
    }

    @Override
    public int hashCode() {
        int result = mark != null ? mark.hashCode() : 0;
        result = 31 * result + maxSpeed;
        result = 31 * result + year;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "mark='" + mark + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", year=" + year +
                ", number='" + number + '\'' +
                '}';
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
