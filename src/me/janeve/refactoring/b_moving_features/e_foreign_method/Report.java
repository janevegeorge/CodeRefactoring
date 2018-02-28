package me.janeve.refactoring.b_moving_features.e_foreign_method;

import java.util.Calendar;
import java.util.Date;

public class Report {

    void sendReport(Calendar previousEnd) {

        // Some other code

        Date nextDay = new Date(previousEnd.get(Calendar.YEAR),
                                previousEnd.get(Calendar.MONTH),
                                previousEnd.get(Calendar.YEAR) + 1);

        // Some other code
    }

}