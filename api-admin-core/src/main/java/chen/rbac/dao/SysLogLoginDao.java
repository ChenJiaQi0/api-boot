package chen.rbac.dao;

import org.apache.ibatis.annotations.Mapper;
import chen.mybatis.dao.BaseDao;
import chen.rbac.entity.SysLogLoginEntity;

/**
 * 登录日志 dao
 *
 * @author chen
 **/
@Mapper
public interface SysLogLoginDao extends BaseDao<SysLogLoginEntity> {

}
