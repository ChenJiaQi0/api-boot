package chen.rbac.service;

import chen.rbac.vo.SysCaptchaVO;

/**
 * 验证码接口
 *
 * @author chen
 */
public interface SysCaptchaService {
    /**
     * 生成验证码
     */
    SysCaptchaVO generate();

    /**
     * 验证码效验
     *
     * @param key  key
     * @param code 验证码
     * @return true：成功  false：失败
     */
    boolean validate(String key, String code);
}
