package chen.rbac.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import chen.rbac.entity.SysLogLoginEntity;
import chen.rbac.vo.SysLogLoginVO;

import java.util.List;

/**
 * 登录日志实体转换
 *
 * @author moqi
 */
@Mapper
public interface SysLogLoginConvert {
    SysLogLoginConvert INSTANCE = Mappers.getMapper(SysLogLoginConvert.class);

    SysLogLoginEntity convert(SysLogLoginVO vo);

    SysLogLoginVO convert(SysLogLoginEntity entity);

    List<SysLogLoginVO> converList(List<SysLogLoginEntity> list);

}
