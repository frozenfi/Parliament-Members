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
        this.bornYear.setTag(null);
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
                return onChangeMemberDetailsViewModelSelectedMember((androidx.lifecycle.LiveData<androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>>) object, fieldId);
            case 1 :
                return onChangeMemberDetailsViewModelSelectedMemberGetValue((androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMemberDetailsViewModelSelectedMember(androidx.lifecycle.LiveData<androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>> MemberDetailsViewModelSelectedMember, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMemberDetailsViewModelSelectedMemberGetValue(androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers> MemberDetailsViewModelSelectedMemberGetValue, int fieldId) {
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
        java.lang.String memberDetailsViewModelSelectedMemberMinisterJavaLangStringMinisterJavaLangStringParliamentMember = null;
        java.lang.String javaLangStringBornYearIntegerToStringMemberDetailsViewModelSelectedMemberBornYear = null;
        java.lang.String integerToStringMemberDetailsViewModelSelectedMemberBornYear = null;
        java.lang.String memberDetailsViewModelSelectedMemberPartyToUpperCase = null;
        java.lang.String memberDetailsViewModelSelectedMemberFullName = null;
        com.example.parliamentapplication.ParliamentMembers memberDetailsViewModelSelectedMemberGetValueGetValue = null;
        com.example.parliamentapplication.viewmodel.MemberDetailsViewModel memberDetailsViewModel = mMemberDetailsViewModel;
        boolean memberDetailsViewModelSelectedMemberMinister = false;
        java.lang.String memberDetailsViewModelSelectedMemberParty = null;
        java.lang.String memberDetailsViewModelSelectedMemberPicture = null;
        int memberDetailsViewModelSelectedMemberBornYear = 0;
        java.lang.String javaLangStringPartyMemberDetailsViewModelSelectedMemberPartyToUpperCase = null;
        androidx.lifecycle.LiveData<androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers>> memberDetailsViewModelSelectedMember = null;
        java.lang.String javaLangStringConstituencyMemberDetailsViewModelSelectedMemberConstituency = null;
        java.lang.String memberDetailsViewModelSelectedMemberConstituency = null;
        androidx.lifecycle.LiveData<com.example.parliamentapplication.ParliamentMembers> memberDetailsViewModelSelectedMemberGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (memberDetailsViewModel != null) {
                    // read memberDetailsViewModel.selectedMember
                    memberDetailsViewModelSelectedMember = memberDetailsViewModel.getSelectedMember();
                }
                updateLiveDataRegistration(0, memberDetailsViewModelSelectedMember);


                if (memberDetailsViewModelSelectedMember != null) {
                    // read memberDetailsViewModel.selectedMember.getValue()
                    memberDetailsViewModelSelectedMemberGetValue = memberDetailsViewModelSelectedMember.getValue();
                }
                updateLiveDataRegistration(1, memberDetailsViewModelSelectedMemberGetValue);


                if (memberDetailsViewModelSelectedMemberGetValue != null) {
                    // read memberDetailsViewModel.selectedMember.getValue().getValue()
                    memberDetailsViewModelSelectedMemberGetValueGetValue = memberDetailsViewModelSelectedMemberGetValue.getValue();
                }


                if (memberDetailsViewModelSelectedMemberGetValueGetValue != null) {
                    // read memberDetailsViewModel.selectedMember.getValue().getValue().fullName
                    memberDetailsViewModelSelectedMemberFullName = memberDetailsViewModelSelectedMemberGetValueGetValue.getFullName();
                    // read memberDetailsViewModel.selectedMember.getValue().getValue().minister
                    memberDetailsViewModelSelectedMemberMinister = memberDetailsViewModelSelectedMemberGetValueGetValue.getMinister();
                    // read memberDetailsViewModel.selectedMember.getValue().getValue().party
                    memberDetailsViewModelSelectedMemberParty = memberDetailsViewModelSelectedMemberGetValueGetValue.getParty();
                    // read memberDetailsViewModel.selectedMember.getValue().getValue().picture
                    memberDetailsViewModelSelectedMemberPicture = memberDetailsViewModelSelectedMemberGetValueGetValue.getPicture();
                    // read memberDetailsViewModel.selectedMember.getValue().getValue().bornYear
                    memberDetailsViewModelSelectedMemberBornYear = memberDetailsViewModelSelectedMemberGetValueGetValue.getBornYear();
                    // read memberDetailsViewModel.selectedMember.getValue().getValue().constituency
                    memberDetailsViewModelSelectedMemberConstituency = memberDetailsViewModelSelectedMemberGetValueGetValue.getConstituency();
                }
            if((dirtyFlags & 0xfL) != 0) {
                if(memberDetailsViewModelSelectedMemberMinister) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read memberDetailsViewModel.selectedMember.getValue().getValue().minister ? "Minister" : "Parliament Member"
                memberDetailsViewModelSelectedMemberMinisterJavaLangStringMinisterJavaLangStringParliamentMember = ((memberDetailsViewModelSelectedMemberMinister) ? ("Minister") : ("Parliament Member"));
                // read Integer.toString(memberDetailsViewModel.selectedMember.getValue().getValue().bornYear)
                integerToStringMemberDetailsViewModelSelectedMemberBornYear = java.lang.Integer.toString(memberDetailsViewModelSelectedMemberBornYear);
                // read ("Constituency: ") + (memberDetailsViewModel.selectedMember.getValue().getValue().constituency)
                javaLangStringConstituencyMemberDetailsViewModelSelectedMemberConstituency = ("Constituency: ") + (memberDetailsViewModelSelectedMemberConstituency);
                if (memberDetailsViewModelSelectedMemberParty != null) {
                    // read memberDetailsViewModel.selectedMember.getValue().getValue().party.toUpperCase()
                    memberDetailsViewModelSelectedMemberPartyToUpperCase = memberDetailsViewModelSelectedMemberParty.toUpperCase();
                }


                // read ("Born Year: ") + (Integer.toString(memberDetailsViewModel.selectedMember.getValue().getValue().bornYear))
                javaLangStringBornYearIntegerToStringMemberDetailsViewModelSelectedMemberBornYear = ("Born Year: ") + (integerToStringMemberDetailsViewModelSelectedMemberBornYear);
                // read ("Party: ") + (memberDetailsViewModel.selectedMember.getValue().getValue().party.toUpperCase())
                javaLangStringPartyMemberDetailsViewModelSelectedMemberPartyToUpperCase = ("Party: ") + (memberDetailsViewModelSelectedMemberPartyToUpperCase);
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.bornYear, javaLangStringBornYearIntegerToStringMemberDetailsViewModelSelectedMemberBornYear);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.constituency, javaLangStringConstituencyMemberDetailsViewModelSelectedMemberConstituency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.designation, memberDetailsViewModelSelectedMemberMinisterJavaLangStringMinisterJavaLangStringParliamentMember);
            com.example.parliamentapplication.utils.UtilitiesKt.bindImage(this.memberImage, memberDetailsViewModelSelectedMemberPicture);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, memberDetailsViewModelSelectedMemberFullName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.party, javaLangStringPartyMemberDetailsViewModelSelectedMemberPartyToUpperCase);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): memberDetailsViewModel.selectedMember
        flag 1 (0x2L): memberDetailsViewModel.selectedMember.getValue()
        flag 2 (0x3L): memberDetailsViewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): memberDetailsViewModel.selectedMember.getValue().getValue().minister ? "Minister" : "Parliament Member"
        flag 5 (0x6L): memberDetailsViewModel.selectedMember.getValue().getValue().minister ? "Minister" : "Parliament Member"
    flag mapping end*/
    //end
}