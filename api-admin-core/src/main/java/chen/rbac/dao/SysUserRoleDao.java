package chen.rbac.dao;

import org.apache.ibatis.annotations.Mapper;
import chen.mybatis.dao.BaseDao;
import chen.rbac.entity.SysUserRoleEntity;


/**
 * 用户角色关系 dao
 *
 * @author chen
 */
@Mapper
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {

}