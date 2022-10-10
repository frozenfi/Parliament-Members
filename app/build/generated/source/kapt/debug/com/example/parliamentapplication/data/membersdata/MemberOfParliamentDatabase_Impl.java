package com.example.parliamentapplication.data.membersdata;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MemberOfParliamentDatabase_Impl extends MemberOfParliamentDatabase {
  private volatile MemberOfParliamentDao _memberOfParliamentDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(4) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `parliament_database` (`personNumber` INTEGER NOT NULL, `constituency` TEXT NOT NULL, `last_name` TEXT NOT NULL, `first_name` TEXT NOT NULL, `full_name` TEXT NOT NULL, `party` TEXT NOT NULL, `born_year` INTEGER NOT NULL, `minister` INTEGER NOT NULL, `picture_url` TEXT NOT NULL, `twitter_account` TEXT NOT NULL, PRIMARY KEY(`personNumber`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '559e61170d77dffd5b4742a9fc282d3b')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `parliament_database`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsParliamentDatabase = new HashMap<String, TableInfo.Column>(10);
        _columnsParliamentDatabase.put("personNumber", new TableInfo.Column("personNumber", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParliamentDatabase.put("constituency", new TableInfo.Column("constituency", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParliamentDatabase.put("last_name", new TableInfo.Column("last_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParliamentDatabase.put("first_name", new TableInfo.Column("first_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParliamentDatabase.put("full_name", new TableInfo.Column("full_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParliamentDatabase.put("party", new TableInfo.Column("party", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParliamentDatabase.put("born_year", new TableInfo.Column("born_year", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParliamentDatabase.put("minister", new TableInfo.Column("minister", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParliamentDatabase.put("picture_url", new TableInfo.Column("picture_url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParliamentDatabase.put("twitter_account", new TableInfo.Column("twitter_account", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysParliamentDatabase = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesParliamentDatabase = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoParliamentDatabase = new TableInfo("parliament_database", _columnsParliamentDatabase, _foreignKeysParliamentDatabase, _indicesParliamentDatabase);
        final TableInfo _existingParliamentDatabase = TableInfo.read(_db, "parliament_database");
        if (! _infoParliamentDatabase.equals(_existingParliamentDatabase)) {
          return new RoomOpenHelper.ValidationResult(false, "parliament_database(com.example.parliamentapplication.ParliamentMembers).\n"
                  + " Expected:\n" + _infoParliamentDatabase + "\n"
                  + " Found:\n" + _existingParliamentDatabase);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "559e61170d77dffd5b4742a9fc282d3b", "90ecdb68fe01b4b462d3bf63756d24cf");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "parliament_database");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `parliament_database`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(MemberOfParliamentDao.class, MemberOfParliamentDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public MemberOfParliamentDao getMemberOfParliamentDAO() {
    if (_memberOfParliamentDao != null) {
      return _memberOfParliamentDao;
    } else {
      synchronized(this) {
        if(_memberOfParliamentDao == null) {
          _memberOfParliamentDao = new MemberOfParliamentDao_Impl(this);
        }
        return _memberOfParliamentDao;
      }
    }
  }
}
