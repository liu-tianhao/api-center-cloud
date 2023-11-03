package cn.zealon.readingcloud.account.dao;

import cn.zealon.readingcloud.common.pojo.account.User;
import cn.zealon.readingcloud.common.pojo.account.UserBookshelf;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * 用户
 * @author: zealon
 * @since: 2020/4/10
 */
public interface UserMapper extends BaseMapper<User> {

//    int insert(User user);

    int updateByLoginName(User user);

    User selectByLoginName(String loginName);

}
