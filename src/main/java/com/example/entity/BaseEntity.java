package com.example.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @Author 雷超
 * @Date on 2017/8/14 0014.
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    public String id;

    private Date createTime;

    @Column(name = "createAt")
    @javax.persistence.Temporal(TemporalType.DATE)
    public Date getCreateTime() {
        return createTime;
    }
}
