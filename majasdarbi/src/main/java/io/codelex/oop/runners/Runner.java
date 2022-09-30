package io.codelex.oop.runners;

public enum Runner {

    BEGINNER(220, 280),
    INTERMEDIATE(160, 219),
    ADVANCED(110, 159);

    final int minRunningTimeInMin;
    final int maxRunningTimeInMin;

    Runner(int minRunningTimeInMin, int maxRunningTimeInMin) {
        this.minRunningTimeInMin = minRunningTimeInMin;
        this.maxRunningTimeInMin = maxRunningTimeInMin;
    }

    public static Runner getFitnessLevel(int marathonFinishTimeInMin) {
        if (marathonFinishTimeInMin < BEGINNER.maxRunningTimeInMin
                && marathonFinishTimeInMin > BEGINNER.minRunningTimeInMin) {
            return BEGINNER;
        }
        if (marathonFinishTimeInMin < INTERMEDIATE.maxRunningTimeInMin
                && marathonFinishTimeInMin > INTERMEDIATE.minRunningTimeInMin) {
            return INTERMEDIATE;
        }
        if (marathonFinishTimeInMin < ADVANCED.maxRunningTimeInMin
                && marathonFinishTimeInMin > ADVANCED.minRunningTimeInMin) {
            return ADVANCED;
        }
        return null;
    }


}
