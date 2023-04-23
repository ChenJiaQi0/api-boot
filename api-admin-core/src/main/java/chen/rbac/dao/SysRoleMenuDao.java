package chen.rbac.dao;

import org.apache.ibatis.annotations.Mapper;
import chen.mybatis.dao.BaseDao;
import chen.rbac.entity.SysRoleMenuEntity;


/**
 * 角色与菜单对应关系 dao
 *
 * @author chen
 */
@Mapper
public interface SysRoleMenuDao extends BaseDao<SysRoleMenuEntity> {
}

