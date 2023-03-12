package com.logomaster.logomaker.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.logomaster.logomaker.R;

/* loaded from: classes3.dex */
public class ActivityLogoMyLogoBindingImpl extends ActivityLogoMyLogoBinding {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    @NonNull
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.status_view, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.rl_back, 3);
        sparseIntArray.put(R.id.rl_selectItem, 4);
        sparseIntArray.put(R.id.rl_delete, 5);
        sparseIntArray.put(R.id.iv_delete, 6);
        sparseIntArray.put(R.id.rl_select_all, 7);
        sparseIntArray.put(R.id.iv_select, 8);
        sparseIntArray.put(R.id.rv_my_logo, 9);
        sparseIntArray.put(R.id.iv_no_data, 10);
        sparseIntArray.put(R.id.rl_fragment, 11);
    }

    public ActivityLogoMyLogoBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
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
            this.mDirtyFlags = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    private ActivityLogoMyLogoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[6], (ImageView) objArr[10], (ImageView) objArr[8], (RelativeLayout) objArr[3], (RelativeLayout) objArr[5], (RelativeLayout) objArr[11], (RelativeLayout) objArr[7], (RelativeLayout) objArr[4], (RecyclerView) objArr[9], (View) objArr[1], (Toolbar) objArr[2]);
        this.mDirtyFlags = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
