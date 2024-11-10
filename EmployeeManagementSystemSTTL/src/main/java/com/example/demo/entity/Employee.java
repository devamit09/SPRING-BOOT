package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.type.YesNoType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name = "tblEmployeeMaster")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
    @JoinColumn(name = "personal_id")
    private Personal personal;

    @Column(name = "JoiningDate", nullable = false)
    private LocalDate joiningDate;

    @Column(name = "Salary", nullable = false)
    private BigDecimal salary;

    @ManyToOne
    @JoinColumn(name = "qualification_id")
    private Qualification qualification;

    @Column(name = "isfresher_employee", nullable = false)
    @Enumerated(EnumType.STRING)
    private FresherStatus isFresherEmployee;

}
