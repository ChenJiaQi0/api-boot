package chen.rbac.service.impl;

import org.springframework.stereotype.Service;
import chen.mybatis.service.impl.BaseServiceImpl;
import chen.rbac.dao.SysRoleMenuDao;
import chen.rbac.entity.SysRoleMenuEntity;
import chen.rbac.service.SysRoleMenuService;


/**
 * 角色与菜单对应业务实现类
 *
 * @author chen
 */
@Service
public class SysRoleMenuServiceImpl extends BaseServiceImpl<SysRoleMenuDao, SysRoleMenuEntity> implements SysRoleMenuService {

}
