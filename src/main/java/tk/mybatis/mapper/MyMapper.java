package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ProjectName: tk-mybatis
 * @Package: tk.mybatis.mapper
 * @ClassName: MyMapper
 * @Author: HuRonghua
 * @Description: 父类接口Mapper
 * @Date: 2020/3/18 18:29
 * @Version: 1.0
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
