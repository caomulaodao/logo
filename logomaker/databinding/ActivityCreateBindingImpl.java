package com.logomaster.logomaker.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.p131vm.LogoCreateVM;
import com.logomaster.logomaker.view.LogoDrawView;

/* loaded from: classes3.dex */
public class ActivityCreateBindingImpl extends ActivityCreateBinding {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(27);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_menu_image", "layout_menu_color_finder", "layout_menu_color_rainbow", "layout_menu_font", "layout_menu_background", "layout_menu_clipping"}, new int[]{1, 2, 3, 4, 5, 6}, new int[]{R.layout.layout_menu_image, R.layout.layout_menu_color_finder, R.layout.layout_menu_color_rainbow, R.layout.layout_menu_font, R.layout.layout_menu_background, R.layout.layout_menu_clipping});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 7);
        sparseIntArray.put(R.id.rl_back, 8);
        sparseIntArray.put(R.id.iv_back, 9);
        sparseIntArray.put(R.id.iv_next, 10);
        sparseIntArray.put(R.id.rl_selectItem, 11);
        sparseIntArray.put(R.id.tv_save, 12);
        sparseIntArray.put(R.id.et_input, 13);
        sparseIntArray.put(R.id.iv_canvas_bg, 14);
        sparseIntArray.put(R.id.drawview, 15);
        sparseIntArray.put(R.id.ll_layer, 16);
        sparseIntArray.put(R.id.rv_layer, 17);
        sparseIntArray.put(R.id.iv_layer, 18);
        sparseIntArray.put(R.id.ll_logo, 19);
        sparseIntArray.put(R.id.ll_text, 20);
        sparseIntArray.put(R.id.ll_bgs, 21);
        sparseIntArray.put(R.id.ll_crop, 22);
        sparseIntArray.put(R.id.iv_cancel, 23);
        sparseIntArray.put(R.id.tablayout_menu, 24);
        sparseIntArray.put(R.id.iv_done, 25);
        sparseIntArray.put(R.id.vp2_menu, 26);
    }

    public ActivityCreateBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 27, sIncludes, sViewsWithIds));
    }

    private boolean onChangeIncludeBackground(LayoutMenuBackgroundBinding layoutMenuBackgroundBinding, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeIncludeClipping(LayoutMenuClippingBinding layoutMenuClippingBinding, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 32;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeIncludeColorFinder(LayoutMenuColorFinderBinding layoutMenuColorFinderBinding, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeIncludeColorRainbow(LayoutMenuColorRainbowBinding layoutMenuColorRainbowBinding, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeIncludeFont(LayoutMenuFontBinding layoutMenuFontBinding, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeIncludeImage(LayoutMenuImageBinding layoutMenuImageBinding, int i) {
        if (i == 0) {
            synchronized (this) {
                this.mDirtyFlags |= 16;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        LogoCreateVM logoCreateVM = this.mViewModel;
        if ((j & 192) != 0) {
            this.includeBackground.setViewModel(logoCreateVM);
            this.includeClipping.setViewModel(logoCreateVM);
            this.includeColorFinder.setViewModel(logoCreateVM);
            this.includeColorRainbow.setViewModel(logoCreateVM);
            this.includeFont.setViewModel(logoCreateVM);
            this.includeImage.setViewModel(logoCreateVM);
        }
        ViewDataBinding.executeBindingsOn(this.includeImage);
        ViewDataBinding.executeBindingsOn(this.includeColorFinder);
        ViewDataBinding.executeBindingsOn(this.includeColorRainbow);
        ViewDataBinding.executeBindingsOn(this.includeFont);
        ViewDataBinding.executeBindingsOn(this.includeBackground);
        ViewDataBinding.executeBindingsOn(this.includeClipping);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return this.includeImage.hasPendingBindings() || this.includeColorFinder.hasPendingBindings() || this.includeColorRainbow.hasPendingBindings() || this.includeFont.hasPendingBindings() || this.includeBackground.hasPendingBindings() || this.includeClipping.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 128L;
        }
        this.includeImage.invalidateAll();
        this.includeColorFinder.invalidateAll();
        this.includeColorRainbow.invalidateAll();
        this.includeFont.invalidateAll();
        this.includeBackground.invalidateAll();
        this.includeClipping.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return false;
                            }
                            return onChangeIncludeClipping((LayoutMenuClippingBinding) obj, i2);
                        }
                        return onChangeIncludeImage((LayoutMenuImageBinding) obj, i2);
                    }
                    return onChangeIncludeColorFinder((LayoutMenuColorFinderBinding) obj, i2);
                }
                return onChangeIncludeBackground((LayoutMenuBackgroundBinding) obj, i2);
            }
            return onChangeIncludeFont((LayoutMenuFontBinding) obj, i2);
        }
        return onChangeIncludeColorRainbow((LayoutMenuColorRainbowBinding) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.includeImage.setLifecycleOwner(lifecycleOwner);
        this.includeColorFinder.setLifecycleOwner(lifecycleOwner);
        this.includeColorRainbow.setLifecycleOwner(lifecycleOwner);
        this.includeFont.setLifecycleOwner(lifecycleOwner);
        this.includeBackground.setLifecycleOwner(lifecycleOwner);
        this.includeClipping.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        if (2 == i) {
            setViewModel((LogoCreateVM) obj);
            return true;
        }
        return false;
    }

    @Override // com.logomaster.logomaker.databinding.ActivityCreateBinding
    public void setViewModel(@Nullable LogoCreateVM logoCreateVM) {
        this.mViewModel = logoCreateVM;
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    private ActivityCreateBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (LogoDrawView) objArr[15], (EditText) objArr[13], (LayoutMenuBackgroundBinding) objArr[5], (LayoutMenuClippingBinding) objArr[6], (LayoutMenuColorFinderBinding) objArr[2], (LayoutMenuColorRainbowBinding) objArr[3], (LayoutMenuFontBinding) objArr[4], (LayoutMenuImageBinding) objArr[1], (ImageView) objArr[9], (ImageView) objArr[23], (ImageView) objArr[14], (ImageView) objArr[25], (ImageView) objArr[18], (ImageView) objArr[10], (LinearLayout) objArr[21], (LinearLayout) objArr[22], (LinearLayout) objArr[16], (LinearLayout) objArr[19], (LinearLayout) objArr[20], (RelativeLayout) objArr[8], (RelativeLayout) objArr[0], (RelativeLayout) objArr[11], (RecyclerView) objArr[17], (TabLayout) objArr[24], (Toolbar) objArr[7], (TextView) objArr[12], (ViewPager2) objArr[26]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.includeBackground);
        setContainedBinding(this.includeClipping);
        setContainedBinding(this.includeColorFinder);
        setContainedBinding(this.includeColorRainbow);
        setContainedBinding(this.includeFont);
        setContainedBinding(this.includeImage);
        this.rlMain.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
