package com.sinchan.mybookaccounting.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "working_tasks")
public class WorkingTask {
    @Id
    long id;
    @ElementCollection
    List<Long> taskId;
    @OneToOne
    Customer customer;
    @OneToOne
    Expert expert;

}
