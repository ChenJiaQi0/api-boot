package chen.rbac.service.impl;

import org.springframework.stereotype.Service;
import chen.mybatis.service.impl.BaseServiceImpl;
import chen.rbac.dao.SysLogLoginDao;
import chen.rbac.entity.SysLogLoginEntity;
import chen.rbac.service.SysLogLoginService;

/**
 * 登录日志业务实现类
 *
 * @author chen
 **/
@Service
public class SysLogLoginServiceImpl extends BaseServiceImpl<SysLogLoginDao, SysLogLoginEntity> implements SysLogLoginService {

}
