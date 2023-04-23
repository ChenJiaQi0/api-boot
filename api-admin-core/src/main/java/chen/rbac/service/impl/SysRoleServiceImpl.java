package chen.rbac.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import chen.mybatis.service.impl.BaseServiceImpl;
import chen.rbac.dao.SysRoleDao;
import chen.rbac.entity.SysRoleEntity;
import chen.rbac.service.SysRoleService;

/**
 * 系统角色业务实现类
 *
 * @author chen
 */
@Service
@AllArgsConstructor
public class SysRoleServiceImpl extends BaseServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {

}
