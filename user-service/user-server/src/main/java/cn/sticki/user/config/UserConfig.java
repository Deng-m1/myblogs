package cn.sticki.user.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 阿杆
 */
@Configuration
@ConfigurationProperties("user")
public class UserConfig {

	public static String DefaultAvatar;

	public void setDefaultAvatar(String defaultAvatar) {
		DefaultAvatar = defaultAvatar;
	}

}
