package wk.dao;

import wk.model.LoginUser;

/**
 * 用户登陆dao
 * @author WangKun
 *
 */
public interface LoginUserDao {
	/**
	 * 获取登陆用户的用户名和密码
	 * @param username
	 * @param password
	 * @return
	 */
	public LoginUser getLoginUser(String username,String password);

}