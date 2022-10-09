package com.example.parliamentapplication.data;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FeedbackDao_Impl implements FeedbackDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Feedback> __insertionAdapterOfFeedback;

  private final TypeConverter __typeConverter = new TypeConverter();

  private final EntityDeletionOrUpdateAdapter<Feedback> __updateAdapterOfFeedback;

  public FeedbackDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFeedback = new EntityInsertionAdapter<Feedback>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `feedback_database` (`personNumber`,`rating`,`comment`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Feedback value) {
        stmt.bindLong(1, value.getPersonNumber());
        stmt.bindLong(2, value.getRating());
        final String _tmp = __typeConverter.convertCommentsToString(value.getComment());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
      }
    };
    this.__updateAdapterOfFeedback = new EntityDeletionOrUpdateAdapter<Feedback>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `feedback_database` SET `personNumber` = ?,`rating` = ?,`comment` = ? WHERE `personNumber` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Feedback value) {
        stmt.bindLong(1, value.getPersonNumber());
        stmt.bindLong(2, value.getRating());
        final String _tmp = __typeConverter.convertCommentsToString(value.getComment());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        stmt.bindLong(4, value.getPersonNumber());
      }
    };
  }

  @Override
  public Object insert(final Feedback commentFeedback,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFeedback.insert(commentFeedback);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final Feedback commentFeedback,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfFeedback.handle(commentFeedback);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getComment(final int personNumber,
      final Continuation<? super Feedback> continuation) {
    final String _sql = "SELECT * FROM feedback_database WHERE personNumber = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, personNumber);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Feedback>() {
      @Override
      public Feedback call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPersonNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "personNumber");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfComment = CursorUtil.getColumnIndexOrThrow(_cursor, "comment");
          final Feedback _result;
          if(_cursor.moveToFirst()) {
            final int _tmpPersonNumber;
            _tmpPersonNumber = _cursor.getInt(_cursorIndexOfPersonNumber);
            final int _tmpRating;
            _tmpRating = _cursor.getInt(_cursorIndexOfRating);
            final List<String> _tmpComment;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfComment)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfComment);
            }
            _tmpComment = __typeConverter.convertStringToComment(_tmp);
            _result = new Feedback(_tmpPersonNumber,_tmpRating,_tmpComment);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
