package com.siam.siamapi.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "tbl_faculty")
public class Faculty implements Serializable{

    @Id
    @GeneratedValue(generator = "faculty_seq")
    @GenericGenerator(
        name = "faculty_seq",
        parameters = @Parameter (name = "prefix", value = "FAK"),
        strategy = "com.siam.siamapi.utils.DataIdGenerator"
    )
    @Column (name = "faculty_id")
    private String id;

    @Column (name = "faculty_name", nullable = false, unique = true)
    private String name;

    @Column (name = "faculty_code", nullable = false, unique = true)
    private String code;

}
