package chen.rbac.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import chen.mybatis.service.impl.BaseServiceImpl;
import chen.rbac.dao.SysUserDao;
import chen.rbac.entity.SysUserEntity;
import chen.rbac.service.SysUserService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 系统用户业务实现类
 *
 * @author chen
 */
@Service
@AllArgsConstructor
public class SysUserServiceImpl extends BaseServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updatePassword(Long id, String newPassword) {
        // 修改密码
        SysUserEntity user = getById(id);
        user.setPassword(newPassword);
        updateById(user);
    }
}
