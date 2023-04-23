package chen.security.cache;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import chen.common.cache.RedisCache;
import chen.common.cache.RedisKeys;
import chen.security.user.UserDetail;

/**
 * 登录用户的缓存操作
 *
 * @author chen
 */
@Component
@AllArgsConstructor
public class TokenStoreCache {

    private final RedisCache redisCache;

    public void saveUser(String accessToken, UserDetail user) {
        String key = RedisKeys.getAccessTokenKey(accessToken);
        redisCache.set(key, user);
    }

    public UserDetail getUser(String accessToken) {
        String key = RedisKeys.getAccessTokenKey(accessToken);
        return (UserDetail) redisCache.get(key);
    }

    public void deleteUser(String accessToken) {
        String key = RedisKeys.getAccessTokenKey(accessToken);
        redisCache.delete(key);
    }
}
