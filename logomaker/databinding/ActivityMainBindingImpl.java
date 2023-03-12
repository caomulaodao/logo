package com.logomaster.logomaker.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.MutableLiveData;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.p131vm.LogoMainVM;
import p000.OnClickListener;

/* loaded from: classes3.dex */
public class ActivityMainBindingImpl extends ActivityMainBinding implements OnClickListener.InterfaceC12444a {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    @Nullable
    private static final SparseIntArray sViewsWithIds;
    @Nullable
    private final View.OnClickListener mCallback1;
    @Nullable
    private final View.OnClickListener mCallback2;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.status_view, 4);
        sparseIntArray.put(R.id.toolbar, 5);
        sparseIntArray.put(R.id.rl_more, 6);
        sparseIntArray.put(R.id.rl_selectItem, 7);
        sparseIntArray.put(R.id.iv_create, 8);
        sparseIntArray.put(R.id.iv_design, 9);
        sparseIntArray.put(R.id.iv_my_logo, 10);
        sparseIntArray.put(R.id.ll_privacy_policy, 11);
    }

    public ActivityMainBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    private boolean onChangeLogoMainVMVersionName(MutableLiveData<String> mutableLiveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // p000.OnClickListener.InterfaceC12444a
    public final void _internalCallbackOnClick(int i, View view) {
        if (i == 1) {
            LogoMainVM logoMainVM = this.mLogoMainVM;
            if (logoMainVM != null) {
                logoMainVM.ShowRateUsDialog();
            }
        } else if (i != 2) {
        } else {
            LogoMainVM logoMainVM2 = this.mLogoMainVM;
            if (logoMainVM2 != null) {
                logoMainVM2.shareApp();
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        LogoMainVM logoMainVM = this.mLogoMainVM;
        int i = ((7 & j) > 0L ? 1 : ((7 & j) == 0L ? 0 : -1));
        String str = null;
        if (i != 0) {
            MutableLiveData<String> versionName = logoMainVM != null ? logoMainVM.getVersionName() : null;
            updateLiveDataRegistration(0, versionName);
            if (versionName != null) {
                str = versionName.getValue();
            }
        }
        if ((j & 4) != 0) {
            this.llRateUs.setOnClickListener(this.mCallback1);
            this.llShareApp.setOnClickListener(this.mCallback2);
        }
        if (i != 0) {
            TextViewBindingAdapter.setText(this.tvVersion, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return onChangeLogoMainVMVersionName((MutableLiveData) obj, i2);
    }

    @Override // com.logomaster.logomaker.databinding.ActivityMainBinding
    public void setLogoMainVM(@Nullable LogoMainVM logoMainVM) {
        this.mLogoMainVM = logoMainVM;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        if (1 == i) {
            setLogoMainVM((LogoMainVM) obj);
            return true;
        }
        return false;
    }

    private ActivityMainBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (DrawerLayout) objArr[0], (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[9], (AppCompatImageView) objArr[10], (LinearLayout) objArr[11], (LinearLayout) objArr[1], (LinearLayout) objArr[2], (RelativeLayout) objArr[6], (RelativeLayout) objArr[7], (View) objArr[4], (Toolbar) objArr[5], (TextView) objArr[3]);
        this.mDirtyFlags = -1L;
        this.drawerLayout.setTag(null);
        this.llRateUs.setTag(null);
        this.llShareApp.setTag(null);
        this.tvVersion.setTag(null);
        setRootTag(view);
        this.mCallback1 = new OnClickListener(this, 1);
        this.mCallback2 = new OnClickListener(this, 2);
        invalidateAll();
    }
}
