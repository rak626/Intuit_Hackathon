package com.sinchan.mybookaccounting.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    long id;
    int deadline;
    int duration;
}
