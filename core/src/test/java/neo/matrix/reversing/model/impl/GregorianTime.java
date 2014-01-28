package neo.matrix.reversing.model.impl;

import neo.matrix.reversing.model.Time;

import java.math.BigDecimal;
import java.util.Date;

public class GregorianTime implements Time {

    private Date date;

    public GregorianTime() {
    }

    public GregorianTime(Date date) {
        this.date = date;
    }

    public GregorianTime(long date) {
        this.date = new Date(date);
    }

    @Override
    public BigDecimal getPosition() {
        return date == null ? new BigDecimal(0) : new BigDecimal(date.getTime());
    }
}
