package bk.partinin.trainingdiary.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {

    @Id
    // IDENTITY способ заполнения таблиц в некоторых БД, если его нет, то будет использована сиквенс
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exerciseId;
    private String exerciseName;
    private Instant createdDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workoutWorkoutId", referencedColumnName = "workoutId")
    private Workout workout;
}
