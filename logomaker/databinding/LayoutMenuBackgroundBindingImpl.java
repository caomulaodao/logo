package com.logomaster.logomaker.databinding;

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
public class LayoutMenuBackgroundBindingImpl extends LayoutMenuBackgroundBinding implements OnClickListener.InterfaceC12444a {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    @Nullable
    private static final SparseIntArray sViewsWithIds;
    @Nullable
    private final View.OnClickListener mCallback3;
    @Nullable
    private final View.OnClickListener mCallback4;
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
        sparseIntArray.put(R.id.iv_cancel, 5);
        sparseIntArray.put(R.id.iv_done, 6);
        sparseIntArray.put(R.id.rv_background_image, 7);
        sparseIntArray.put(R.id.rv_background_color, 8);
    }

    public LayoutMenuBackgroundBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, sIncludes, sViewsWithIds));
    }

    private boolean onChangeViewModelBackgroundTabIndex(MutableLiveData<Integer> mutableLiveData, int i) {
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
                logoCreateVM.changeBackgroundTabIndex(0);
            }
        } else if (i != 2) {
        } else {
            LogoCreateVM logoCreateVM2 = this.mViewModel;
            if (logoCreateVM2 != null) {
                logoCreateVM2.changeBackgroundTabIndex(1);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        Drawable drawable;
        int i;
        int i2;
        int i3;
        boolean z;
        Drawable drawable2;
        int i4;
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
        if (i6 != 0) {
            MutableLiveData<Integer> backgroundTabIndex = logoCreateVM != null ? logoCreateVM.getBackgroundTabIndex() : null;
            updateLiveDataRegistration(0, backgroundTabIndex);
            Integer value = backgroundTabIndex != null ? backgroundTabIndex.getValue() : null;
            z = value == null;
            i = ViewDataBinding.safeUnbox(value);
            if (i6 != 0) {
                j = z ? j | PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID : j | 512;
            }
            boolean z2 = i == 1;
            if ((j & 7) != 0) {
                if (z2) {
                    j4 = j | 256 | PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                    j5 = 65536;
                } else {
                    j4 = j | 128 | PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                    j5 = PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                }
                j = j4 | j5;
            }
            int i7 = z2 ? 0 : 8;
            TextView textView = this.mboundView2;
            i2 = z2 ? ViewDataBinding.getColorFromResource(textView, R.color.menu_selected_color) : ViewDataBinding.getColorFromResource(textView, R.color.menu_default_color);
            drawable = z2 ? AppCompatResources.getDrawable(this.mboundView2.getContext(), R.drawable.shape_bottom_line_menu) : AppCompatResources.getDrawable(this.mboundView2.getContext(), R.drawable.shape_white_menu);
            i3 = i7;
        } else {
            drawable = null;
            i = 0;
            i2 = 0;
            i3 = 0;
            z = false;
        }
        boolean z3 = (512 & j) != 0 && i == 0;
        int i8 = ((j & 7) > 0L ? 1 : ((j & 7) == 0L ? 0 : -1));
        if (i8 != 0) {
            if (z) {
                z3 = true;
            }
            if (i8 != 0) {
                if (z3) {
                    j2 = j | 16 | 64;
                    j3 = PlaybackStateCompat.ACTION_PREPARE;
                } else {
                    j2 = j | 8 | 32;
                    j3 = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                }
                j = j2 | j3;
            }
            Drawable drawable3 = z3 ? AppCompatResources.getDrawable(this.mboundView1.getContext(), R.drawable.shape_bottom_line_menu) : AppCompatResources.getDrawable(this.mboundView1.getContext(), R.drawable.shape_white_menu);
            int i9 = z3 ? 0 : 8;
            i4 = z3 ? ViewDataBinding.getColorFromResource(this.mboundView1, R.color.menu_selected_color) : ViewDataBinding.getColorFromResource(this.mboundView1, R.color.menu_default_color);
            drawable2 = drawable3;
            i5 = i9;
        } else {
            drawable2 = null;
            i4 = 0;
            i5 = 0;
        }
        if ((7 & j) != 0) {
            ViewBindingAdapter.setBackground(this.mboundView1, drawable2);
            this.mboundView1.setTextColor(i4);
            ViewBindingAdapter.setBackground(this.mboundView2, drawable);
            this.mboundView2.setTextColor(i2);
            this.mboundView3.setVisibility(i5);
            this.mboundView4.setVisibility(i3);
        }
        if ((j & 4) != 0) {
            this.mboundView1.setOnClickListener(this.mCallback3);
            this.mboundView2.setOnClickListener(this.mCallback4);
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
        return onChangeViewModelBackgroundTabIndex((MutableLiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        if (2 == i) {
            setViewModel((LogoCreateVM) obj);
            return true;
        }
        return false;
    }

    @Override // com.logomaster.logomaker.databinding.LayoutMenuBackgroundBinding
    public void setViewModel(@Nullable LogoCreateVM logoCreateVM) {
        this.mViewModel = logoCreateVM;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    private LayoutMenuBackgroundBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (CardView) objArr[0], (ImageView) objArr[5], (ImageView) objArr[6], (RecyclerView) objArr[8], (RecyclerView) objArr[7]);
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
        this.mCallback4 = new OnClickListener(this, 2);
        this.mCallback3 = new OnClickListener(this, 1);
        invalidateAll();
    }
}
