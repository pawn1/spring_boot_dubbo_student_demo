package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 功能说明
 *
 * @author xwgg
 * @date 2020-12-06 18:29:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Classes extends BaseEntity {

    private String cname;
    private Integer cnum;
}
