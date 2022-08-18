package com.rsstudio.spinny.data.local.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.rsstudio.spinny.data.local.db.entity.UserEntity;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    void insert(UserEntity userEntity);

    @Query("SELECT * FROM savedUserData")
    List<UserEntity> getAllSavedUser();
}
