package com.sinchan.mybookaccounting.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "experts")
public class Expert {

    @Id
    long id;
    boolean isAvailable;
    int hoursWorked;
    LocalDateTime nextAvailability;
    @OneToOne
    WorkingTask workingTask;

}
