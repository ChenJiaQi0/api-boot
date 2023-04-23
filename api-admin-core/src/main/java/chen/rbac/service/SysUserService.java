package chen.rbac.service;

import chen.mybatis.service.BaseService;
import chen.rbac.entity.SysUserEntity;

/**
 * 系统用户业务接口
 *
 * @author chen
 */
public interface SysUserService extends BaseService<SysUserEntity> {
    /**
     * 修改密码
     *
     * @param id          用户ID
     * @param newPassword 新密码
     */
    void updatePassword(Long id, String newPassword);

}
