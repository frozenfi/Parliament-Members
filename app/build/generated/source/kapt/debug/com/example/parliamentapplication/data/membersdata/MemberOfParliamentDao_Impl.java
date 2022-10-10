package com.example.parliamentapplication.data.membersdata;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.parliamentapplication.ParliamentMembers;
import com.example.parliamentapplication.Party;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MemberOfParliamentDao_Impl implements MemberOfParliamentDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ParliamentMembers> __insertionAdapterOfParliamentMembers;

  private final EntityDeletionOrUpdateAdapter<ParliamentMembers> __updateAdapterOfParliamentMembers;

  public MemberOfParliamentDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfParliamentMembers = new EntityInsertionAdapter<ParliamentMembers>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `parliament_database` (`personNumber`,`seat_number`,`constituency`,`last_name`,`first_name`,`full_name`,`party`,`born_year`,`minister`,`picture_url`,`twitter_account`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ParliamentMembers value) {
        stmt.bindLong(1, value.getPersonNumber());
        stmt.bindLong(2, value.getSeatNumber());
        if (value.getConstituency() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getConstituency());
        }
        if (value.getLast() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLast());
        }
        if (value.getFirst() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFirst());
        }
        if (value.getFullName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getFullName());
        }
        if (value.getParty() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getParty());
        }
        stmt.bindLong(8, value.getBornYear());
        final int _tmp = value.getMinister() ? 1 : 0;
        stmt.bindLong(9, _tmp);
        if (value.getPicture() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPicture());
        }
        if (value.getTwitter() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getTwitter());
        }
      }
    };
    this.__updateAdapterOfParliamentMembers = new EntityDeletionOrUpdateAdapter<ParliamentMembers>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `parliament_database` SET `personNumber` = ?,`seat_number` = ?,`constituency` = ?,`last_name` = ?,`first_name` = ?,`full_name` = ?,`party` = ?,`born_year` = ?,`minister` = ?,`picture_url` = ?,`twitter_account` = ? WHERE `personNumber` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ParliamentMembers value) {
        stmt.bindLong(1, value.getPersonNumber());
        stmt.bindLong(2, value.getSeatNumber());
        if (value.getConstituency() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getConstituency());
        }
        if (value.getLast() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLast());
        }
        if (value.getFirst() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFirst());
        }
        if (value.getFullName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getFullName());
        }
        if (value.getParty() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getParty());
        }
        stmt.bindLong(8, value.getBornYear());
        final int _tmp = value.getMinister() ? 1 : 0;
        stmt.bindLong(9, _tmp);
        if (value.getPicture() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPicture());
        }
        if (value.getTwitter() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getTwitter());
        }
        stmt.bindLong(12, value.getPersonNumber());
      }
    };
  }

  @Override
  public Object insertAll(final List<ParliamentMembers> list,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfParliamentMembers.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final ParliamentMembers member,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfParliamentMembers.handle(member);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<ParliamentMembers>> getParliamentMembers() {
    final String _sql = "SELECT * FROM parliament_database";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"parliament_database"}, false, new Callable<List<ParliamentMembers>>() {
      @Override
      public List<ParliamentMembers> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPersonNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "personNumber");
          final int _cursorIndexOfSeatNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "seat_number");
          final int _cursorIndexOfConstituency = CursorUtil.getColumnIndexOrThrow(_cursor, "constituency");
          final int _cursorIndexOfLast = CursorUtil.getColumnIndexOrThrow(_cursor, "last_name");
          final int _cursorIndexOfFirst = CursorUtil.getColumnIndexOrThrow(_cursor, "first_name");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfParty = CursorUtil.getColumnIndexOrThrow(_cursor, "party");
          final int _cursorIndexOfBornYear = CursorUtil.getColumnIndexOrThrow(_cursor, "born_year");
          final int _cursorIndexOfMinister = CursorUtil.getColumnIndexOrThrow(_cursor, "minister");
          final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture_url");
          final int _cursorIndexOfTwitter = CursorUtil.getColumnIndexOrThrow(_cursor, "twitter_account");
          final List<ParliamentMembers> _result = new ArrayList<ParliamentMembers>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ParliamentMembers _item;
            final int _tmpPersonNumber;
            _tmpPersonNumber = _cursor.getInt(_cursorIndexOfPersonNumber);
            final int _tmpSeatNumber;
            _tmpSeatNumber = _cursor.getInt(_cursorIndexOfSeatNumber);
            final String _tmpConstituency;
            if (_cursor.isNull(_cursorIndexOfConstituency)) {
              _tmpConstituency = null;
            } else {
              _tmpConstituency = _cursor.getString(_cursorIndexOfConstituency);
            }
            final String _tmpLast;
            if (_cursor.isNull(_cursorIndexOfLast)) {
              _tmpLast = null;
            } else {
              _tmpLast = _cursor.getString(_cursorIndexOfLast);
            }
            final String _tmpFirst;
            if (_cursor.isNull(_cursorIndexOfFirst)) {
              _tmpFirst = null;
            } else {
              _tmpFirst = _cursor.getString(_cursorIndexOfFirst);
            }
            final String _tmpFullName;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFullName = null;
            } else {
              _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpParty;
            if (_cursor.isNull(_cursorIndexOfParty)) {
              _tmpParty = null;
            } else {
              _tmpParty = _cursor.getString(_cursorIndexOfParty);
            }
            final int _tmpBornYear;
            _tmpBornYear = _cursor.getInt(_cursorIndexOfBornYear);
            final boolean _tmpMinister;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfMinister);
            _tmpMinister = _tmp != 0;
            final String _tmpPicture;
            if (_cursor.isNull(_cursorIndexOfPicture)) {
              _tmpPicture = null;
            } else {
              _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
            }
            final String _tmpTwitter;
            if (_cursor.isNull(_cursorIndexOfTwitter)) {
              _tmpTwitter = null;
            } else {
              _tmpTwitter = _cursor.getString(_cursorIndexOfTwitter);
            }
            _item = new ParliamentMembers(_tmpPersonNumber,_tmpSeatNumber,_tmpConstituency,_tmpLast,_tmpFirst,_tmpFullName,_tmpParty,_tmpBornYear,_tmpMinister,_tmpPicture,_tmpTwitter);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<String>> getParties() {
    final String _sql = "SELECT DISTINCT party FROM parliament_database ORDER BY party";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"parliament_database"}, false, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getString(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<ParliamentMembers> getMemberById(final int personNumber) {
    final String _sql = "SELECT * FROM parliament_database WHERE personNumber = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, personNumber);
    return __db.getInvalidationTracker().createLiveData(new String[]{"parliament_database"}, false, new Callable<ParliamentMembers>() {
      @Override
      public ParliamentMembers call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPersonNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "personNumber");
          final int _cursorIndexOfSeatNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "seat_number");
          final int _cursorIndexOfConstituency = CursorUtil.getColumnIndexOrThrow(_cursor, "constituency");
          final int _cursorIndexOfLast = CursorUtil.getColumnIndexOrThrow(_cursor, "last_name");
          final int _cursorIndexOfFirst = CursorUtil.getColumnIndexOrThrow(_cursor, "first_name");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfParty = CursorUtil.getColumnIndexOrThrow(_cursor, "party");
          final int _cursorIndexOfBornYear = CursorUtil.getColumnIndexOrThrow(_cursor, "born_year");
          final int _cursorIndexOfMinister = CursorUtil.getColumnIndexOrThrow(_cursor, "minister");
          final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture_url");
          final int _cursorIndexOfTwitter = CursorUtil.getColumnIndexOrThrow(_cursor, "twitter_account");
          final ParliamentMembers _result;
          if(_cursor.moveToFirst()) {
            final int _tmpPersonNumber;
            _tmpPersonNumber = _cursor.getInt(_cursorIndexOfPersonNumber);
            final int _tmpSeatNumber;
            _tmpSeatNumber = _cursor.getInt(_cursorIndexOfSeatNumber);
            final String _tmpConstituency;
            if (_cursor.isNull(_cursorIndexOfConstituency)) {
              _tmpConstituency = null;
            } else {
              _tmpConstituency = _cursor.getString(_cursorIndexOfConstituency);
            }
            final String _tmpLast;
            if (_cursor.isNull(_cursorIndexOfLast)) {
              _tmpLast = null;
            } else {
              _tmpLast = _cursor.getString(_cursorIndexOfLast);
            }
            final String _tmpFirst;
            if (_cursor.isNull(_cursorIndexOfFirst)) {
              _tmpFirst = null;
            } else {
              _tmpFirst = _cursor.getString(_cursorIndexOfFirst);
            }
            final String _tmpFullName;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFullName = null;
            } else {
              _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpParty;
            if (_cursor.isNull(_cursorIndexOfParty)) {
              _tmpParty = null;
            } else {
              _tmpParty = _cursor.getString(_cursorIndexOfParty);
            }
            final int _tmpBornYear;
            _tmpBornYear = _cursor.getInt(_cursorIndexOfBornYear);
            final boolean _tmpMinister;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfMinister);
            _tmpMinister = _tmp != 0;
            final String _tmpPicture;
            if (_cursor.isNull(_cursorIndexOfPicture)) {
              _tmpPicture = null;
            } else {
              _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
            }
            final String _tmpTwitter;
            if (_cursor.isNull(_cursorIndexOfTwitter)) {
              _tmpTwitter = null;
            } else {
              _tmpTwitter = _cursor.getString(_cursorIndexOfTwitter);
            }
            _result = new ParliamentMembers(_tmpPersonNumber,_tmpSeatNumber,_tmpConstituency,_tmpLast,_tmpFirst,_tmpFullName,_tmpParty,_tmpBornYear,_tmpMinister,_tmpPicture,_tmpTwitter);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<ParliamentMembers>> getMembersByParty(final String party) {
    final String _sql = "SELECT * FROM parliament_database WHERE party = ? ORDER BY full_name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (party == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, party);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"parliament_database"}, false, new Callable<List<ParliamentMembers>>() {
      @Override
      public List<ParliamentMembers> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPersonNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "personNumber");
          final int _cursorIndexOfSeatNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "seat_number");
          final int _cursorIndexOfConstituency = CursorUtil.getColumnIndexOrThrow(_cursor, "constituency");
          final int _cursorIndexOfLast = CursorUtil.getColumnIndexOrThrow(_cursor, "last_name");
          final int _cursorIndexOfFirst = CursorUtil.getColumnIndexOrThrow(_cursor, "first_name");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfParty = CursorUtil.getColumnIndexOrThrow(_cursor, "party");
          final int _cursorIndexOfBornYear = CursorUtil.getColumnIndexOrThrow(_cursor, "born_year");
          final int _cursorIndexOfMinister = CursorUtil.getColumnIndexOrThrow(_cursor, "minister");
          final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture_url");
          final int _cursorIndexOfTwitter = CursorUtil.getColumnIndexOrThrow(_cursor, "twitter_account");
          final List<ParliamentMembers> _result = new ArrayList<ParliamentMembers>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ParliamentMembers _item;
            final int _tmpPersonNumber;
            _tmpPersonNumber = _cursor.getInt(_cursorIndexOfPersonNumber);
            final int _tmpSeatNumber;
            _tmpSeatNumber = _cursor.getInt(_cursorIndexOfSeatNumber);
            final String _tmpConstituency;
            if (_cursor.isNull(_cursorIndexOfConstituency)) {
              _tmpConstituency = null;
            } else {
              _tmpConstituency = _cursor.getString(_cursorIndexOfConstituency);
            }
            final String _tmpLast;
            if (_cursor.isNull(_cursorIndexOfLast)) {
              _tmpLast = null;
            } else {
              _tmpLast = _cursor.getString(_cursorIndexOfLast);
            }
            final String _tmpFirst;
            if (_cursor.isNull(_cursorIndexOfFirst)) {
              _tmpFirst = null;
            } else {
              _tmpFirst = _cursor.getString(_cursorIndexOfFirst);
            }
            final String _tmpFullName;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFullName = null;
            } else {
              _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpParty;
            if (_cursor.isNull(_cursorIndexOfParty)) {
              _tmpParty = null;
            } else {
              _tmpParty = _cursor.getString(_cursorIndexOfParty);
            }
            final int _tmpBornYear;
            _tmpBornYear = _cursor.getInt(_cursorIndexOfBornYear);
            final boolean _tmpMinister;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfMinister);
            _tmpMinister = _tmp != 0;
            final String _tmpPicture;
            if (_cursor.isNull(_cursorIndexOfPicture)) {
              _tmpPicture = null;
            } else {
              _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
            }
            final String _tmpTwitter;
            if (_cursor.isNull(_cursorIndexOfTwitter)) {
              _tmpTwitter = null;
            } else {
              _tmpTwitter = _cursor.getString(_cursorIndexOfTwitter);
            }
            _item = new ParliamentMembers(_tmpPersonNumber,_tmpSeatNumber,_tmpConstituency,_tmpLast,_tmpFirst,_tmpFullName,_tmpParty,_tmpBornYear,_tmpMinister,_tmpPicture,_tmpTwitter);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Party>> getPartiesList() {
    final String _sql = "SELECT * FROM parliament_database GROUP BY party ORDER BY party ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"parliament_database"}, false, new Callable<List<Party>>() {
      @Override
      public List<Party> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfParty = CursorUtil.getColumnIndexOrThrow(_cursor, "party");
          final List<Party> _result = new ArrayList<Party>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Party _item;
            final String _tmpParty;
            if (_cursor.isNull(_cursorIndexOfParty)) {
              _tmpParty = null;
            } else {
              _tmpParty = _cursor.getString(_cursorIndexOfParty);
            }
            _item = new Party(_tmpParty);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
