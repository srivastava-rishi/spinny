package com.rsstudio.spinny.data.local.db.database;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.rsstudio.spinny.data.local.db.entity.UserEntity;

@Database(entities = {UserEntity.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {


}
