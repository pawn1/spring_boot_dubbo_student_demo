package com.qf.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 功能说明
 *
 * @author xwgg
 * @date 2020-12-06 18:25:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Student extends BaseEntity implements Serializable {

    private String sname;
    private Integer age;
    private Integer cid;

    @TableField(exist = false)
    private Classes cls;
}
