package chen.rbac.dao;

import org.apache.ibatis.annotations.Mapper;
import chen.mybatis.dao.BaseDao;
import chen.rbac.entity.SysRoleEntity;

/**
 * 角色管理 dao
 *
 * @author chen
 */
@Mapper
public interface SysRoleDao extends BaseDao<SysRoleEntity> {

}
