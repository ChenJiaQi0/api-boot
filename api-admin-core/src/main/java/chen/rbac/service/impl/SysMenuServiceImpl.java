package chen.rbac.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import chen.mybatis.service.impl.BaseServiceImpl;
import chen.rbac.dao.SysMenuDao;
import chen.rbac.entity.SysMenuEntity;
import chen.rbac.service.SysMenuService;


/**
 * 系统菜单业务实现类
 *
 * @author chen
 */
@Service
@AllArgsConstructor
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {

}
