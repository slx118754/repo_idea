package s_lix.dao;

import org.apache.ibatis.annotations.Select;
import s_lix.domain.Items;

public interface ItemsDao {
    @Select("select * from items where id = #{id} ")
    Items findOneById(int id);
}
