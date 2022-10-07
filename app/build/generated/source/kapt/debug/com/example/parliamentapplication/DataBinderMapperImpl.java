package com.example.parliamentapplication;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.parliamentapplication.databinding.ActivityMainBindingImpl;
import com.example.parliamentapplication.databinding.CardItemBindingImpl;
import com.example.parliamentapplication.databinding.FragmentMainBindingImpl;
import com.example.parliamentapplication.databinding.FragmentMemberDetailsBindingImpl;
import com.example.parliamentapplication.databinding.FragmentMemberListBindingImpl;
import com.example.parliamentapplication.databinding.FragmentPartyListBindingImpl;
import com.example.parliamentapplication.databinding.MemberListItemBindingImpl;
import com.example.parliamentapplication.databinding.PartyListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_CARDITEM = 2;

  private static final int LAYOUT_FRAGMENTMAIN = 3;

  private static final int LAYOUT_FRAGMENTMEMBERDETAILS = 4;

  private static final int LAYOUT_FRAGMENTMEMBERLIST = 5;

  private static final int LAYOUT_FRAGMENTPARTYLIST = 6;

  private static final int LAYOUT_MEMBERLISTITEM = 7;

  private static final int LAYOUT_PARTYLISTITEM = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.parliamentapplication.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.parliamentapplication.R.layout.card_item, LAYOUT_CARDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.parliamentapplication.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.parliamentapplication.R.layout.fragment_member_details, LAYOUT_FRAGMENTMEMBERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.parliamentapplication.R.layout.fragment_member_list, LAYOUT_FRAGMENTMEMBERLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.parliamentapplication.R.layout.fragment_party_list, LAYOUT_FRAGMENTPARTYLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.parliamentapplication.R.layout.member_list_item, LAYOUT_MEMBERLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.parliamentapplication.R.layout.party_list_item, LAYOUT_PARTYLISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CARDITEM: {
          if ("layout/card_item_0".equals(tag)) {
            return new CardItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for card_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMEMBERDETAILS: {
          if ("layout/fragment_member_details_0".equals(tag)) {
            return new FragmentMemberDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_member_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMEMBERLIST: {
          if ("layout/fragment_member_list_0".equals(tag)) {
            return new FragmentMemberListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_member_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPARTYLIST: {
          if ("layout/fragment_party_list_0".equals(tag)) {
            return new FragmentPartyListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_party_list is invalid. Received: " + tag);
        }
        case  LAYOUT_MEMBERLISTITEM: {
          if ("layout/member_list_item_0".equals(tag)) {
            return new MemberListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for member_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_PARTYLISTITEM: {
          if ("layout/party_list_item_0".equals(tag)) {
            return new PartyListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for party_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "clickListener");
      sKeys.put(2, "member");
      sKeys.put(3, "memberDetailsViewModel");
      sKeys.put(4, "memberViewModel");
      sKeys.put(5, "party");
      sKeys.put(6, "partyViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", com.example.parliamentapplication.R.layout.activity_main);
      sKeys.put("layout/card_item_0", com.example.parliamentapplication.R.layout.card_item);
      sKeys.put("layout/fragment_main_0", com.example.parliamentapplication.R.layout.fragment_main);
      sKeys.put("layout/fragment_member_details_0", com.example.parliamentapplication.R.layout.fragment_member_details);
      sKeys.put("layout/fragment_member_list_0", com.example.parliamentapplication.R.layout.fragment_member_list);
      sKeys.put("layout/fragment_party_list_0", com.example.parliamentapplication.R.layout.fragment_party_list);
      sKeys.put("layout/member_list_item_0", com.example.parliamentapplication.R.layout.member_list_item);
      sKeys.put("layout/party_list_item_0", com.example.parliamentapplication.R.layout.party_list_item);
    }
  }
}
