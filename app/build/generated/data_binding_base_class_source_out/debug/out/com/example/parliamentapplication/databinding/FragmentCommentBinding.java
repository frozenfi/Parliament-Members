// Generated by data binding compiler. Do not edit!
package com.example.parliamentapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.parliamentapplication.R;
import com.example.parliamentapplication.viewmodel.CommentViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCommentBinding extends ViewDataBinding {
  @NonNull
  public final Button addCommentBtn;

  @NonNull
  public final RecyclerView commentList;

  @NonNull
  public final LinearLayout commentListContainer;

  @NonNull
  public final EditText editComment;

  @Bindable
  protected CommentViewModel mCommentViewModel;

  protected FragmentCommentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button addCommentBtn, RecyclerView commentList, LinearLayout commentListContainer,
      EditText editComment) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addCommentBtn = addCommentBtn;
    this.commentList = commentList;
    this.commentListContainer = commentListContainer;
    this.editComment = editComment;
  }

  public abstract void setCommentViewModel(@Nullable CommentViewModel commentViewModel);

  @Nullable
  public CommentViewModel getCommentViewModel() {
    return mCommentViewModel;
  }

  @NonNull
  public static FragmentCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_comment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCommentBinding>inflateInternal(inflater, R.layout.fragment_comment, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCommentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_comment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCommentBinding>inflateInternal(inflater, R.layout.fragment_comment, null, false, component);
  }

  public static FragmentCommentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentCommentBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCommentBinding)bind(component, view, R.layout.fragment_comment);
  }
}
