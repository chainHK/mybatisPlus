package com.yrsoft.common.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xk
 * @since 2018-12-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Course extends Model<Course> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String course;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
