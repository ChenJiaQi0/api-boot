package chen.rbac.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import chen.mybatis.dao.BaseDao;
import chen.rbac.entity.SysMenuEntity;

import java.util.List;


/**
 * 菜单管理 dao
 *
 * @author chen
 */
@Mapper
public interface SysMenuDao extends BaseDao<SysMenuEntity> {

}
