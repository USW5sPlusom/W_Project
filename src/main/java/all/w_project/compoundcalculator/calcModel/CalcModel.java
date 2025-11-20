package all.w_project.compoundcalculator.calcModel;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "calc_models")
public class CalcModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String tag;
    private BigDecimal principal;
    private BigDecimal rate;
    private int period;
    private BigDecimal rezult;

    public CalcModel() {
    }
    public CalcModel(String id, String tag, BigDecimal principal, BigDecimal rate, int period, BigDecimal rezult) {
        this.id = id;
        this.tag = tag;
        this.principal = principal;
        this.rate = rate;
        this.period = period;
        this.rezult = rezult;
    }

    public String getId() {
        return id;
    }

    public String getTag() {
        return tag;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public int getPeriod() {
        return period;
    }

    public BigDecimal getRezult() {
        return rezult;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setRezult(BigDecimal rezult) {
        this.rezult = rezult;
    }

    public String minToString() {
        return "CalcModel [id=" + id + ", tag=" + tag + "]";
    }
    public String toString() {
        return "CalcModel [id=" + id + ", tag=" + tag + ", principal=" + principal + ", rate=" + rate + ", period=" + period + ", rezult=" + rezult + "]";
    }
}
