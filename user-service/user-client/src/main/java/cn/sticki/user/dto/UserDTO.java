package cn.sticki.user.dto;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author 阿杆
 */
@Data
public class UserDTO {

	/**
	 * 用户id
	 */
	Integer id;

	/**
	 * 用户名
	 */
	String username;

	/**
	 * 用户昵称
	 */
	String nickname;

	/**
	 * 院校代码
	 */
	Integer schoolCode;

	/**
	 * 头像链接
	 */
	String avatarUrl;

	/**
	 * 注册时间
	 */
	Timestamp registerTime;

}
