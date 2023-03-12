package com.logomaster.logomaker.databinding;

import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.p131vm.LogoCreateVM;
import com.logomaster.logomaker.view.LogoSquareRelativeLayout;

/* loaded from: classes3.dex */
public class LayoutMenuClippingBindingImpl extends LayoutMenuClippingBinding {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    @NonNull
    private final MaterialCardView mboundView1;
    @NonNull
    private final MaterialCardView mboundView2;
    @NonNull
    private final MaterialCardView mboundView3;
    @NonNull
    private final MaterialCardView mboundView4;
    @NonNull
    private final MaterialCardView mboundView5;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.iv_cancel, 6);
        sparseIntArray.put(R.id.iv_done, 7);
        sparseIntArray.put(R.id.tv_tips_radius, 8);
        sparseIntArray.put(R.id.sb_clippling, 9);
        sparseIntArray.put(R.id.rl_none, 10);
        sparseIntArray.put(R.id.rl_rect, 11);
        sparseIntArray.put(R.id.rl_square, 12);
        sparseIntArray.put(R.id.rl_round, 13);
        sparseIntArray.put(R.id.rl_circle, 14);
        sparseIntArray.put(R.id.rv_clipping_type, 15);
    }

    public LayoutMenuClippingBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, sIncludes, sViewsWithIds));
    }

    private boolean onChangeViewModelClippingSelectedIndex(MutableLiveData<Integer> mutableLiveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        LogoCreateVM logoCreateVM = this.mViewModel;
        int i5 = ((j & 7) > 0L ? 1 : ((j & 7) == 0L ? 0 : -1));
        if (i5 != 0) {
            MutableLiveData<Integer> clippingSelectedIndex = logoCreateVM != null ? logoCreateVM.getClippingSelectedIndex() : null;
            updateLiveDataRegistration(0, clippingSelectedIndex);
            int safeUnbox = ViewDataBinding.safeUnbox(clippingSelectedIndex != null ? clippingSelectedIndex.getValue() : null);
            boolean z = safeUnbox == 3;
            boolean z2 = safeUnbox == 1;
            boolean z3 = safeUnbox == 4;
            boolean z4 = safeUnbox == 2;
            r9 = safeUnbox == 0 ? 1 : 0;
            if (i5 != 0) {
                j |= z ? 64L : 32L;
            }
            if ((j & 7) != 0) {
                j |= z2 ? 16L : 8L;
            }
            if ((j & 7) != 0) {
                j |= z3 ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            if ((j & 7) != 0) {
                j |= z4 ? PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID : 512L;
            }
            if ((j & 7) != 0) {
                j |= r9 != 0 ? 256L : 128L;
            }
            i = z ? ViewDataBinding.getColorFromResource(this.mboundView4, R.color.stroke_select) : ViewDataBinding.getColorFromResource(this.mboundView4, R.color.stroke_default);
            MaterialCardView materialCardView = this.mboundView2;
            i2 = z2 ? ViewDataBinding.getColorFromResource(materialCardView, R.color.stroke_select) : ViewDataBinding.getColorFromResource(materialCardView, R.color.stroke_default);
            MaterialCardView materialCardView2 = this.mboundView5;
            i3 = z3 ? ViewDataBinding.getColorFromResource(materialCardView2, R.color.stroke_select) : ViewDataBinding.getColorFromResource(materialCardView2, R.color.stroke_default);
            MaterialCardView materialCardView3 = this.mboundView3;
            i4 = z4 ? ViewDataBinding.getColorFromResource(materialCardView3, R.color.stroke_select) : ViewDataBinding.getColorFromResource(materialCardView3, R.color.stroke_default);
            r9 = r9 != 0 ? ViewDataBinding.getColorFromResource(this.mboundView1, R.color.stroke_select) : ViewDataBinding.getColorFromResource(this.mboundView1, R.color.stroke_default);
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if ((j & 7) != 0) {
            this.mboundView1.setStrokeColor(r9);
            this.mboundView2.setStrokeColor(i2);
            this.mboundView3.setStrokeColor(i4);
            this.mboundView4.setStrokeColor(i);
            this.mboundView5.setStrokeColor(i3);
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
        return onChangeViewModelClippingSelectedIndex((MutableLiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        if (2 == i) {
            setViewModel((LogoCreateVM) obj);
            return true;
        }
        return false;
    }

    @Override // com.logomaster.logomaker.databinding.LayoutMenuClippingBinding
    public void setViewModel(@Nullable LogoCreateVM logoCreateVM) {
        this.mViewModel = logoCreateVM;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    private LayoutMenuClippingBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (CardView) objArr[0], (ImageView) objArr[6], (ImageView) objArr[7], (LogoSquareRelativeLayout) objArr[14], (LogoSquareRelativeLayout) objArr[10], (LogoSquareRelativeLayout) objArr[11], (LogoSquareRelativeLayout) objArr[13], (LogoSquareRelativeLayout) objArr[12], (RecyclerView) objArr[15], (SeekBar) objArr[9], (TextView) objArr[8]);
        this.mDirtyFlags = -1L;
        this.cvImage.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[1];
        this.mboundView1 = materialCardView;
        materialCardView.setTag(null);
        MaterialCardView materialCardView2 = (MaterialCardView) objArr[2];
        this.mboundView2 = materialCardView2;
        materialCardView2.setTag(null);
        MaterialCardView materialCardView3 = (MaterialCardView) objArr[3];
        this.mboundView3 = materialCardView3;
        materialCardView3.setTag(null);
        MaterialCardView materialCardView4 = (MaterialCardView) objArr[4];
        this.mboundView4 = materialCardView4;
        materialCardView4.setTag(null);
        MaterialCardView materialCardView5 = (MaterialCardView) objArr[5];
        this.mboundView5 = materialCardView5;
        materialCardView5.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
