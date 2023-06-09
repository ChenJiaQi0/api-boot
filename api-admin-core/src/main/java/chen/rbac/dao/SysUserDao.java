package chen.rbac.dao;

import chen.mybatis.dao.BaseDao;
import chen.rbac.entity.SysUserEntity;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户管理 dao
 *
 * @author chen
 */
@Mapper
public interface SysUserDao extends BaseDao<SysUserEntity> {
    default SysUserEntity getByUsername(String username){
        return this.selectOne(new QueryWrapper<SysUserEntity>().eq("username", username));
    }
}
