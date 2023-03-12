package com.logomaster.logomaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.p131vm.LogoShapeVM;

/* loaded from: classes3.dex */
public abstract class ActivityLogoShapeBinding extends ViewDataBinding {
    @Bindable
    public LogoShapeVM mViewModel;
    @NonNull
    public final RelativeLayout rlBack;
    @NonNull
    public final RelativeLayout rlSelectItem;
    @NonNull
    public final TabLayout tablayout;
    @NonNull
    public final Toolbar toolbar;
    @NonNull
    public final ViewPager2 vp2Fragment;

    public ActivityLogoShapeBinding(Object obj, View view, int i, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TabLayout tabLayout, Toolbar toolbar, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.rlBack = relativeLayout;
        this.rlSelectItem = relativeLayout2;
        this.tablayout = tabLayout;
        this.toolbar = toolbar;
        this.vp2Fragment = viewPager2;
    }

    public static ActivityLogoShapeBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ActivityLogoShapeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public LogoShapeVM getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable LogoShapeVM logoShapeVM);

    @Deprecated
    public static ActivityLogoShapeBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ActivityLogoShapeBinding) ViewDataBinding.bind(obj, view, R.layout.activity_logo_shape);
    }

    @NonNull
    @Deprecated
    public static ActivityLogoShapeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ActivityLogoShapeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_logo_shape, viewGroup, z, obj);
    }

    @NonNull
    public static ActivityLogoShapeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityLogoShapeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityLogoShapeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_logo_shape, null, false, obj);
    }
}
