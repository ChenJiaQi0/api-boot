package chen.dao;

import org.apache.ibatis.annotations.Mapper;
import chen.entity.NoticeEntity;
import chen.mybatis.dao.BaseDao;

/**
 * NoticeDao
 *
 * @author mqxu
 **/
@Mapper
public interface NoticeDao extends BaseDao<NoticeEntity> {
}
