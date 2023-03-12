package com.logomaster.logomaker.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.p131vm.LogoCreateVM;
import p000.OnClickListener;

/* loaded from: classes3.dex */
public class LayoutMenuFontBindingImpl extends LayoutMenuFontBinding implements OnClickListener.InterfaceC12444a {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    @Nullable
    private static final SparseIntArray sViewsWithIds;
    @Nullable
    private final View.OnClickListener mCallback7;
    @Nullable
    private final View.OnClickListener mCallback8;
    private long mDirtyFlags;
    @NonNull
    private final TextView mboundView1;
    @NonNull
    private final TextView mboundView2;
    @NonNull
    private final LinearLayout mboundView3;
    @NonNull
    private final LinearLayout mboundView4;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.iv_up, 5);
        sparseIntArray.put(R.id.iv_left, 6);
        sparseIntArray.put(R.id.iv_right, 7);
        sparseIntArray.put(R.id.iv_bottom, 8);
        sparseIntArray.put(R.id.iv_italic, 9);
        sparseIntArray.put(R.id.iv_copy, 10);
        sparseIntArray.put(R.id.iv_bold, 11);
        sparseIntArray.put(R.id.iv_revise, 12);
        sparseIntArray.put(R.id.iv_underscore, 13);
        sparseIntArray.put(R.id.iv_delete, 14);
        sparseIntArray.put(R.id.rv_color, 15);
        sparseIntArray.put(R.id.rv_font, 16);
    }

    public LayoutMenuFontBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, sIncludes, sViewsWithIds));
    }

    private boolean onChangeViewModelFontTabIndex(MutableLiveData<Integer> mutableLiveData, int i) {
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
            LogoCreateVM logoCreateVM = this.mViewModel;
            if (logoCreateVM != null) {
                logoCreateVM.changeFontTabIndex(0);
            }
        } else if (i != 2) {
        } else {
            LogoCreateVM logoCreateVM2 = this.mViewModel;
            if (logoCreateVM2 != null) {
                logoCreateVM2.changeFontTabIndex(1);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        Drawable drawable;
        Drawable drawable2;
        int i5;
        long j2;
        long j3;
        long j4;
        long j5;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        LogoCreateVM logoCreateVM = this.mViewModel;
        int i6 = ((j & 7) > 0L ? 1 : ((j & 7) == 0L ? 0 : -1));
        int i7 = R.color.menu_selected_color;
        if (i6 != 0) {
            MutableLiveData<Integer> fontTabIndex = logoCreateVM != null ? logoCreateVM.getFontTabIndex() : null;
            updateLiveDataRegistration(0, fontTabIndex);
            Integer value = fontTabIndex != null ? fontTabIndex.getValue() : null;
            i3 = ViewDataBinding.safeUnbox(value);
            z = value == null;
            if (i6 != 0) {
                j = z ? j | 65536 : j | PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            boolean z2 = i3 == 1;
            if ((j & 7) != 0) {
                if (z2) {
                    j4 = j | 64 | 256 | PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                    j5 = PlaybackStateCompat.ACTION_PREPARE;
                } else {
                    j4 = j | 32 | 128 | 512;
                    j5 = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                }
                j = j4 | j5;
            }
            Context context = this.mboundView2.getContext();
            drawable = z2 ? AppCompatResources.getDrawable(context, R.drawable.shape_bottom_line_menu) : AppCompatResources.getDrawable(context, R.drawable.shape_white_menu);
            TextView textView = this.mboundView2;
            if (!z2) {
                i7 = R.color.menu_default_color;
            }
            i4 = ViewDataBinding.getColorFromResource(textView, i7);
            int i8 = z2 ? 8 : 0;
            i2 = z2 ? 0 : 8;
            i = i8;
        } else {
            z = false;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            drawable = null;
        }
        boolean z3 = (PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID & j) != 0 && i3 == 0;
        int i9 = ((j & 7) > 0L ? 1 : ((j & 7) == 0L ? 0 : -1));
        if (i9 != 0) {
            boolean z4 = z ? true : z3;
            if (i9 != 0) {
                if (z4) {
                    j2 = j | 16;
                    j3 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                } else {
                    j2 = j | 8;
                    j3 = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                }
                j = j2 | j3;
            }
            Context context2 = this.mboundView1.getContext();
            drawable2 = z4 ? AppCompatResources.getDrawable(context2, R.drawable.shape_bottom_line_menu) : AppCompatResources.getDrawable(context2, R.drawable.shape_white_menu);
            i5 = ViewDataBinding.getColorFromResource(this.mboundView1, z4 ? R.color.menu_selected_color : R.color.menu_default_color);
        } else {
            drawable2 = null;
            i5 = 0;
        }
        if ((7 & j) != 0) {
            ViewBindingAdapter.setBackground(this.mboundView1, drawable2);
            this.mboundView1.setTextColor(i5);
            ViewBindingAdapter.setBackground(this.mboundView2, drawable);
            this.mboundView2.setTextColor(i4);
            this.mboundView3.setVisibility(i);
            this.mboundView4.setVisibility(i2);
        }
        if ((j & 4) != 0) {
            this.mboundView1.setOnClickListener(this.mCallback7);
            this.mboundView2.setOnClickListener(this.mCallback8);
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
        return onChangeViewModelFontTabIndex((MutableLiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        if (2 == i) {
            setViewModel((LogoCreateVM) obj);
            return true;
        }
        return false;
    }

    @Override // com.logomaster.logomaker.databinding.LayoutMenuFontBinding
    public void setViewModel(@Nullable LogoCreateVM logoCreateVM) {
        this.mViewModel = logoCreateVM;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    private LayoutMenuFontBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (CardView) objArr[0], (ImageView) objArr[11], (ImageView) objArr[8], (ImageView) objArr[10], (ImageView) objArr[14], (ImageView) objArr[9], (ImageView) objArr[6], (ImageView) objArr[12], (ImageView) objArr[7], (ImageView) objArr[13], (ImageView) objArr[5], (RecyclerView) objArr[15], (RecyclerView) objArr[16]);
        this.mDirtyFlags = -1L;
        this.cvImage.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.mboundView1 = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.mboundView2 = textView2;
        textView2.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[3];
        this.mboundView3 = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[4];
        this.mboundView4 = linearLayout2;
        linearLayout2.setTag(null);
        setRootTag(view);
        this.mCallback8 = new OnClickListener(this, 2);
        this.mCallback7 = new OnClickListener(this, 1);
        invalidateAll();
    }
}
