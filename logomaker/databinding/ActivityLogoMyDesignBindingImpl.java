package com.logomaster.logomaker.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.logomaster.logomaker.R;

/* loaded from: classes3.dex */
public class ActivityLogoMyDesignBindingImpl extends ActivityLogoMyDesignBinding {
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
        sparseIntArray.put(R.id.rv_my_design, 9);
        sparseIntArray.put(R.id.ll_blank, 10);
        sparseIntArray.put(R.id.iv_no_data, 11);
        sparseIntArray.put(R.id.ll_menu, 12);
        sparseIntArray.put(R.id.cv_menu, 13);
        sparseIntArray.put(R.id.ll_edit, 14);
        sparseIntArray.put(R.id.ll_rename, 15);
        sparseIntArray.put(R.id.ll_duplicate, 16);
        sparseIntArray.put(R.id.ll_delete, 17);
    }

    public ActivityLogoMyDesignBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, sIncludes, sViewsWithIds));
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

    private ActivityLogoMyDesignBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[13], (ImageView) objArr[6], (ImageView) objArr[11], (ImageView) objArr[8], (LinearLayout) objArr[10], (LinearLayout) objArr[17], (LinearLayout) objArr[16], (LinearLayout) objArr[14], (LinearLayout) objArr[12], (LinearLayout) objArr[15], (RelativeLayout) objArr[3], (RelativeLayout) objArr[5], (RelativeLayout) objArr[7], (RelativeLayout) objArr[4], (RecyclerView) objArr[9], (View) objArr[1], (Toolbar) objArr[2]);
        this.mDirtyFlags = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
