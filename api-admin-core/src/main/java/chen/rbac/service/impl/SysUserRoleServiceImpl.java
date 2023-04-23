package chen.rbac.service.impl;

import org.springframework.stereotype.Service;
import chen.mybatis.service.impl.BaseServiceImpl;
import chen.rbac.dao.SysUserRoleDao;
import chen.rbac.entity.SysUserRoleEntity;
import chen.rbac.service.SysUserRoleService;

/**
 * 用户角色关系业务实现类
 *
 * @author chen
 */
@Service
public class SysUserRoleServiceImpl extends BaseServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {
}
