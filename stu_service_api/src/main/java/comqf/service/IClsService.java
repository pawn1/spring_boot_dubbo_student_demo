package comqf.service;

import com.qf.entity.Classes;

import java.util.List;

/**
 * 功能说明
 *
 * @author xwgg
 * @date 2020-12-06 18:33:38
 */
public interface IClsService {
    List<Classes> list();

    Classes queryById(Integer id);
}
