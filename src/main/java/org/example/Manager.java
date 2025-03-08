package org.example;

public class Manager extends Employee {
    String benfit;

    public String getBenfit() {
        return benfit;
    }

    public void setBenfit(String benfit) {
        this.benfit = benfit;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "benfit='" + benfit + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
