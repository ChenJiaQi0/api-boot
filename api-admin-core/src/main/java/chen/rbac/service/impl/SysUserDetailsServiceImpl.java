package chen.rbac.service.impl;

import chen.rbac.convert.SysUserConvert;
import chen.rbac.entity.SysUserEntity;
import chen.rbac.enums.UserStatusEnum;
import chen.security.user.UserDetail;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import chen.rbac.service.SysUserDetailsService;

import java.util.HashSet;
import java.util.Set;

/**
 * 用户详细信息接口实现类
 *
 * @author chen
 */
@Service
@AllArgsConstructor
public class SysUserDetailsServiceImpl implements SysUserDetailsService {

    @Override
    public UserDetails getUserDetails(SysUserEntity userEntity) {
        // 转换成UserDetail对象
        UserDetail userDetail = SysUserConvert.INSTANCE.convertDetail(userEntity);

        // 账号不可用
        if (userEntity.getStatus() == UserStatusEnum.DISABLE.getValue()) {
            userDetail.setEnabled(false);
        }

        // 用户权限列表
        Set<String> authoritySet = new HashSet<>();
        userDetail.setAuthoritySet(authoritySet);

        return userDetail;
    }

}
