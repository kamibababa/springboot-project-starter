package org.example.mapper;

import org.example.entity.UsersEntity;

public interface UsersMapper {
    UsersEntity loginUser(UsersEntity usersEntity);
    UsersEntity getUserById(long uid);
}
