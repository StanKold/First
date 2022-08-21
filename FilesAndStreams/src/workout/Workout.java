package workout;

import java.util.ArrayList;
import java.util.List;

public class Workout {
    private List<Exercise> data;
    public String type;
    public int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.data = new ArrayList<Exercise>();
    }

    public void addExercise(Exercise exercise) {
        if (this.data.size() < exerciseCount) {
            this.data.add(exercise);
        }

    }

    public boolean removeExercise(String name, String muscle) {
        for (Exercise exercise : this.data) {
            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)) {
                this.data.remove(exercise);
                return true;

            }

        }
        return false;
    }

    public Exercise getExercise(String name, String muscle) {
        for (Exercise exercise : this.data) {
            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)) {
                return exercise;
            }

        }
        return null;
    }

    public Exercise getMostBurnedCaloriesExercise() {
        int most = -1;
        Exercise best;
        if (this.data.size() >= 0) {
            for (Exercise exercise : this.data) {
                if (exercise.getBurnedCalories() > most) {
                    most = exercise.getBurnedCalories();
                    best = exercise;
                }
            }


        }
        return null;
    }

    public StringBuilder getStatistics() {
        StringBuilder statistics = new StringBuilder();

        statistics.append(String.format("Workout type: %s%n", this.type));
        for (Exercise e : this.data) {
            statistics.append(String.format("Exercise: %s%n", e.toString()));
        }


        return statistics;
    }

    public int getExerciseCount() {
        return this.exerciseCount;
    }
}









