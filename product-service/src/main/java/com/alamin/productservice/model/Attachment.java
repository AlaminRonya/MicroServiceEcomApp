package com.alamin.productservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tbl_attachment")
@Data
public class Attachment {
    @SequenceGenerator(
            name = "attachment_sequence",
            sequenceName = "attachment_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "attachment_sequence"
    )
    @Column(name = "id")
    private Long id;

    @Column(name = "attachment_name")
    private String attachmentName;

    @Column(name = "attachment_path")
    private String attachmentPath;

    @Column(name = "attachment_type")
    private String attachmentType;

}
