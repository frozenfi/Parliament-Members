package com.example.parliamentapplication.databinding;
import com.example.parliamentapplication.R;
import com.example.parliamentapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMemberDetailsBindingImpl extends FragmentMemberDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.like_btn, 7);
        sViewsWithIds.put(R.id.dislike_btn, 8);
        sViewsWithIds.put(R.id.rating_score, 9);
        sViewsWithIds.put(R.id.add_comment, 10);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMemberDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentMemberDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[10]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageButton) bindings[8]
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            );
        this.age.setTag(null);
        this.constituency.setTag(null);
        this.designation.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.memberImage.setTag(null);
        this.name.setTag(null);
        this.party.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.memberDetailsViewModel == variableId) {
            setMemberDetailsViewModel((com.example.parliamentapplication.viewmodel.MemberDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMemberDetailsViewModel(@Nullable com.example.parliamentapplication.viewmodel.MemberDetailsViewModel MemberDetailsViewModel) {
        this.mMemberDetailsViewModel = MemberDetailsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.memberDetailsViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMemberDetailsViewModelMemberGetValue((androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>) object, fieldId);
            case 1 :
                return onChangeMemberDetailsViewModelMember((androidx.lifecycle.LiveData<androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMemberDetailsViewModelMemberGetValue(androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers> MemberDetailsViewModelMemberGetValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMemberDetailsViewModelMember(androidx.lifecycle.LiveData<androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>> MemberDetailsViewModelMember, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean memberDetailsViewModelMemberMinister = false;
        int memberDetailsViewModelMemberBornYear = 0;
        com.example.parliamentapplication.viewmodel.MemberDetailsViewModel memberDetailsViewModel = mMemberDetailsViewModel;
        java.lang.String memberDetailsViewModelMemberFullName = null;
        com.example.parliamentapplication.ParliamentMembers memberDetailsViewModelMemberGetValueGetValue = null;
        java.lang.String memberDetailsViewModelMemberMinisterJavaLangStringMinisterJavaLangStringParliamentMember = null;
        androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers> memberDetailsViewModelMemberGetValue = null;
        androidx.lifecycle.LiveData<androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>> memberDetailsViewModelMember = null;
        java.lang.String integerToStringMemberDetailsViewModelMemberBornYear = null;
        java.lang.String memberDetailsViewModelMemberPicture = null;
        java.lang.String javaLangStringBornYearIntegerToStringMemberDetailsViewModelMemberBornYear = null;
        java.lang.String memberDetailsViewModelMemberParty = null;
        java.lang.String javaLangStringPartyMemberDetailsViewModelMemberParty = null;
        java.lang.String memberDetailsViewModelMemberConstituency = null;
        java.lang.String javaLangStringConstituencyMemberDetailsViewModelMemberConstituency = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (memberDetailsViewModel != null) {
                    // read memberDetailsViewModel.member
                    memberDetailsViewModelMember = memberDetailsViewModel.getMember();
                }
                updateLiveDataRegistration(1, memberDetailsViewModelMember);


                if (memberDetailsViewModelMember != null) {
                    // read memberDetailsViewModel.member.getValue()
                    memberDetailsViewModelMemberGetValue = memberDetailsViewModelMember.getValue();
                }
                updateLiveDataRegistration(0, memberDetailsViewModelMemberGetValue);


                if (memberDetailsViewModelMemberGetValue != null) {
                    // read memberDetailsViewModel.member.getValue().getValue()
                    memberDetailsViewModelMemberGetValueGetValue = memberDetailsViewModelMemberGetValue.getValue();
                }


                if (memberDetailsViewModelMemberGetValueGetValue != null) {
                    // read memberDetailsViewModel.member.getValue().getValue().minister
                    memberDetailsViewModelMemberMinister = memberDetailsViewModelMemberGetValueGetValue.getMinister();
                    // read memberDetailsViewModel.member.getValue().getValue().bornYear
                    memberDetailsViewModelMemberBornYear = memberDetailsViewModelMemberGetValueGetValue.getBornYear();
                    // read memberDetailsViewModel.member.getValue().getValue().fullName
                    memberDetailsViewModelMemberFullName = memberDetailsViewModelMemberGetValueGetValue.getFullName();
                    // read memberDetailsViewModel.member.getValue().getValue().picture
                    memberDetailsViewModelMemberPicture = memberDetailsViewModelMemberGetValueGetValue.getPicture();
                    // read memberDetailsViewModel.member.getValue().getValue().party
                    memberDetailsViewModelMemberParty = memberDetailsViewModelMemberGetValueGetValue.getParty();
                    // read memberDetailsViewModel.member.getValue().getValue().constituency
                    memberDetailsViewModelMemberConstituency = memberDetailsViewModelMemberGetValueGetValue.getConstituency();
                }
            if((dirtyFlags & 0xfL) != 0) {
                if(memberDetailsViewModelMemberMinister) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read memberDetailsViewModel.member.getValue().getValue().minister ? "Minister" : "Parliament Member"
                memberDetailsViewModelMemberMinisterJavaLangStringMinisterJavaLangStringParliamentMember = ((memberDetailsViewModelMemberMinister) ? ("Minister") : ("Parliament Member"));
                // read Integer.toString(memberDetailsViewModel.member.getValue().getValue().bornYear)
                integerToStringMemberDetailsViewModelMemberBornYear = java.lang.Integer.toString(memberDetailsViewModelMemberBornYear);
                // read ("Party: ") + (memberDetailsViewModel.member.getValue().getValue().party)
                javaLangStringPartyMemberDetailsViewModelMemberParty = ("Party: ") + (memberDetailsViewModelMemberParty);
                // read ("Constituency: ") + (memberDetailsViewModel.member.getValue().getValue().constituency)
                javaLangStringConstituencyMemberDetailsViewModelMemberConstituency = ("Constituency: ") + (memberDetailsViewModelMemberConstituency);


                // read ("Born Year: ") + (Integer.toString(memberDetailsViewModel.member.getValue().getValue().bornYear))
                javaLangStringBornYearIntegerToStringMemberDetailsViewModelMemberBornYear = ("Born Year: ") + (integerToStringMemberDetailsViewModelMemberBornYear);
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.age, javaLangStringBornYearIntegerToStringMemberDetailsViewModelMemberBornYear);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.constituency, javaLangStringConstituencyMemberDetailsViewModelMemberConstituency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.designation, memberDetailsViewModelMemberMinisterJavaLangStringMinisterJavaLangStringParliamentMember);
            com.example.parliamentapplication.utils.UtilitiesKt.bindImage(this.memberImage, memberDetailsViewModelMemberPicture);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, memberDetailsViewModelMemberFullName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.party, javaLangStringPartyMemberDetailsViewModelMemberParty);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): memberDetailsViewModel.member.getValue()
        flag 1 (0x2L): memberDetailsViewModel.member
        flag 2 (0x3L): memberDetailsViewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): memberDetailsViewModel.member.getValue().getValue().minister ? "Minister" : "Parliament Member"
        flag 5 (0x6L): memberDetailsViewModel.member.getValue().getValue().minister ? "Minister" : "Parliament Member"
    flag mapping end*/
    //end
}