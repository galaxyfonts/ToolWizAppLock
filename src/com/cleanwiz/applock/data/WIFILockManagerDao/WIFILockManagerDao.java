/*******************************************************************************
 * Copyright (c) 2015 btows.com.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.cleanwiz.applock.data.WIFILockManagerDao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.cleanwiz.applock.data.WIFILockManager;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table WIFILOCK_MANAGER.
*/
public class WIFILockManagerDao extends AbstractDao<WIFILockManager, Long> {

    public static final String TABLENAME = "WIFILOCK_MANAGER";

    /**
     * Properties of entity WIFILockManager.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property SsidName = new Property(1, String.class, "ssidName", false, "SSID_NAME");
        public final static Property LockName = new Property(2, String.class, "lockName", false, "LOCK_NAME");
        public final static Property IsOn = new Property(3, Boolean.class, "isOn", false, "IS_ON");
    };


    public WIFILockManagerDao(DaoConfig config) {
        super(config);
    }
    
    public WIFILockManagerDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'WIFILOCK_MANAGER' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'SSID_NAME' TEXT," + // 1: ssidName
                "'LOCK_NAME' TEXT," + // 2: lockName
                "'IS_ON' INTEGER);"); // 3: isOn
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'WIFILOCK_MANAGER'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, WIFILockManager entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String ssidName = entity.getSsidName();
        if (ssidName != null) {
            stmt.bindString(2, ssidName);
        }
 
        String lockName = entity.getLockName();
        if (lockName != null) {
            stmt.bindString(3, lockName);
        }
 
        Boolean isOn = entity.getIsOn();
        if (isOn != null) {
            stmt.bindLong(4, isOn ? 1l: 0l);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public WIFILockManager readEntity(Cursor cursor, int offset) {
        WIFILockManager entity = new WIFILockManager( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // ssidName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // lockName
            cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0 // isOn
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, WIFILockManager entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSsidName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLockName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setIsOn(cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(WIFILockManager entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(WIFILockManager entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}