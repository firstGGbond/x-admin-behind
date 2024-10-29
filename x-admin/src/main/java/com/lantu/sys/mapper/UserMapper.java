package com.lantu.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lantu.sys.entity.User;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author laocai
 * @since 2024-10-26
 */
public interface UserMapper extends BaseMapper<User> {

    public List<String> getRoleNameByUserId(Integer userId);
}
