package me.janeve.refactoring.b_moving_features.c_extract_inline_class;

import java.time.Duration;
import java.util.*;

public class Estimator {

    private Duration defaultEstimate;
    private ArrayList<Duration> durations;
    private Duration average;
    private Duration standardDeviation;

    public Estimator(Duration defaultEstimate) {
        this.defaultEstimate = defaultEstimate;
    }

    public Duration CalculateEstimate(ArrayList<Duration> durations) {
        if (durations == null)
            throw new NullPointerException("Durations shouldn't be null");

        if (durations.size() == 0)
            return this.defaultEstimate;

        this.durations = durations;
        this.CalculateAverage();
        this.CalculateStandardDeviation();

        long margin = this.standardDeviation.toMillis() * 3;
        return Duration.ofMillis(this.average.toMillis() + margin);
    }

    private void CalculateAverage() {
        LongSummaryStatistics stats = this.durations.stream().mapToLong(Duration::toMillis).summaryStatistics();
        this.average = Duration.ofMillis((long)stats.getAverage());
    }

    private void CalculateStandardDeviation() {
        LongSummaryStatistics stats = this.durations.stream().mapToLong((x) -> {return (long)Math.pow(x.toMillis() - this.average.toMillis(), 2);}).summaryStatistics();
        double variance =stats.getAverage();
        this.standardDeviation = Duration.ofMillis((long) Math.sqrt(variance));
    }

}