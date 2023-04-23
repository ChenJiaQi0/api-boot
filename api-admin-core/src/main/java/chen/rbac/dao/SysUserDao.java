package chen.rbac.dao;

import chen.mybatis.dao.BaseDao;
import chen.rbac.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户管理 dao
 *
 * @author chen
 */
@Mapper
public interface SysUserDao extends BaseDao<SysUserEntity> {

}
