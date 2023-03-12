package com.logomaster.logomaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.p131vm.LogoMainVM;

/* loaded from: classes3.dex */
public abstract class ActivityMainBinding extends ViewDataBinding {
    @NonNull
    public final DrawerLayout drawerLayout;
    @NonNull
    public final AppCompatImageView ivCreate;
    @NonNull
    public final AppCompatImageView ivDesign;
    @NonNull
    public final AppCompatImageView ivMyLogo;
    @NonNull
    public final LinearLayout llPrivacyPolicy;
    @NonNull
    public final LinearLayout llRateUs;
    @NonNull
    public final LinearLayout llShareApp;
    @Bindable
    public LogoMainVM mLogoMainVM;
    @NonNull
    public final RelativeLayout rlMore;
    @NonNull
    public final RelativeLayout rlSelectItem;
    @NonNull
    public final View statusView;
    @NonNull
    public final Toolbar toolbar;
    @NonNull
    public final TextView tvVersion;

    public ActivityMainBinding(Object obj, View view, int i, DrawerLayout drawerLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, View view2, Toolbar toolbar, TextView textView) {
        super(obj, view, i);
        this.drawerLayout = drawerLayout;
        this.ivCreate = appCompatImageView;
        this.ivDesign = appCompatImageView2;
        this.ivMyLogo = appCompatImageView3;
        this.llPrivacyPolicy = linearLayout;
        this.llRateUs = linearLayout2;
        this.llShareApp = linearLayout3;
        this.rlMore = relativeLayout;
        this.rlSelectItem = relativeLayout2;
        this.statusView = view2;
        this.toolbar = toolbar;
        this.tvVersion = textView;
    }

    public static ActivityMainBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public LogoMainVM getLogoMainVM() {
        return this.mLogoMainVM;
    }

    public abstract void setLogoMainVM(@Nullable LogoMainVM logoMainVM);

    @Deprecated
    public static ActivityMainBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ActivityMainBinding) ViewDataBinding.bind(obj, view, R.layout.activity_main);
    }

    @NonNull
    @Deprecated
    public static ActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ActivityMainBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_main, viewGroup, z, obj);
    }

    @NonNull
    public static ActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityMainBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_main, null, false, obj);
    }
}
