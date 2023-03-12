package com.logomaster.logomaker.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.p131vm.LogoCreateVM;

/* loaded from: classes3.dex */
public class LayoutMenuColorFinderBindingImpl extends LayoutMenuColorFinderBinding {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.iv_cancel, 1);
        sparseIntArray.put(R.id.iv_done, 2);
        sparseIntArray.put(R.id.view_show_color, 3);
    }

    public LayoutMenuColorFinderBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, sIncludes, sViewsWithIds));
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
            this.mDirtyFlags = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        if (2 == i) {
            setViewModel((LogoCreateVM) obj);
            return true;
        }
        return false;
    }

    @Override // com.logomaster.logomaker.databinding.LayoutMenuColorFinderBinding
    public void setViewModel(@Nullable LogoCreateVM logoCreateVM) {
        this.mViewModel = logoCreateVM;
    }

    private LayoutMenuColorFinderBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[0], (ImageView) objArr[1], (ImageView) objArr[2], (CardView) objArr[3]);
        this.mDirtyFlags = -1L;
        this.cvImage.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
