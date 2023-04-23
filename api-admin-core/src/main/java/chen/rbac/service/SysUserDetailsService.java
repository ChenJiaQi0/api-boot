package chen.rbac.service;

import chen.rbac.entity.SysUserEntity;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 用户详细信息接口
 * @author chen
 */
public interface SysUserDetailsService {
    /**
     * 获取 UserDetails 对象
     */
    UserDetails getUserDetails(SysUserEntity userEntity);
}
