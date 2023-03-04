package com.sinchan.mybookaccounting.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    long id;
    @OneToOne
    WorkingTask workingTask;

}
