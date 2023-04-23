package chen.rbac.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import chen.rbac.entity.SysUserEntity;
import chen.rbac.vo.SysUserVO;
import chen.security.user.UserDetail;


/**
 * 系统用户实体转换
 *
 * @author chen
 */
@Mapper
public interface SysUserConvert {
    SysUserConvert INSTANCE = Mappers.getMapper(SysUserConvert.class);

    SysUserVO convert(UserDetail userDetail);

    UserDetail convertDetail(SysUserEntity entity);

}
