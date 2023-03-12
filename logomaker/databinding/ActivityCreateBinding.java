package com.logomaster.logomaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.p131vm.LogoCreateVM;
import com.logomaster.logomaker.view.LogoDrawView;

/* loaded from: classes3.dex */
public abstract class ActivityCreateBinding extends ViewDataBinding {
    @NonNull
    public final LogoDrawView drawview;
    @NonNull
    public final EditText etInput;
    @NonNull
    public final LayoutMenuBackgroundBinding includeBackground;
    @NonNull
    public final LayoutMenuClippingBinding includeClipping;
    @NonNull
    public final LayoutMenuColorFinderBinding includeColorFinder;
    @NonNull
    public final LayoutMenuColorRainbowBinding includeColorRainbow;
    @NonNull
    public final LayoutMenuFontBinding includeFont;
    @NonNull
    public final LayoutMenuImageBinding includeImage;
    @NonNull
    public final ImageView ivBack;
    @NonNull
    public final ImageView ivCancel;
    @NonNull
    public final ImageView ivCanvasBg;
    @NonNull
    public final ImageView ivDone;
    @NonNull
    public final ImageView ivLayer;
    @NonNull
    public final ImageView ivNext;
    @NonNull
    public final LinearLayout llBgs;
    @NonNull
    public final LinearLayout llCrop;
    @NonNull
    public final LinearLayout llLayer;
    @NonNull
    public final LinearLayout llLogo;
    @NonNull
    public final LinearLayout llText;
    @Bindable
    public LogoCreateVM mViewModel;
    @NonNull
    public final RelativeLayout rlBack;
    @NonNull
    public final RelativeLayout rlMain;
    @NonNull
    public final RelativeLayout rlSelectItem;
    @NonNull
    public final RecyclerView rvLayer;
    @NonNull
    public final TabLayout tablayoutMenu;
    @NonNull
    public final Toolbar toolbar;
    @NonNull
    public final TextView tvSave;
    @NonNull
    public final ViewPager2 vp2Menu;

    public ActivityCreateBinding(Object obj, View view, int i, LogoDrawView logoDrawView, EditText editText, LayoutMenuBackgroundBinding layoutMenuBackgroundBinding, LayoutMenuClippingBinding layoutMenuClippingBinding, LayoutMenuColorFinderBinding layoutMenuColorFinderBinding, LayoutMenuColorRainbowBinding layoutMenuColorRainbowBinding, LayoutMenuFontBinding layoutMenuFontBinding, LayoutMenuImageBinding layoutMenuImageBinding, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RecyclerView recyclerView, TabLayout tabLayout, Toolbar toolbar, TextView textView, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.drawview = logoDrawView;
        this.etInput = editText;
        this.includeBackground = layoutMenuBackgroundBinding;
        this.includeClipping = layoutMenuClippingBinding;
        this.includeColorFinder = layoutMenuColorFinderBinding;
        this.includeColorRainbow = layoutMenuColorRainbowBinding;
        this.includeFont = layoutMenuFontBinding;
        this.includeImage = layoutMenuImageBinding;
        this.ivBack = imageView;
        this.ivCancel = imageView2;
        this.ivCanvasBg = imageView3;
        this.ivDone = imageView4;
        this.ivLayer = imageView5;
        this.ivNext = imageView6;
        this.llBgs = linearLayout;
        this.llCrop = linearLayout2;
        this.llLayer = linearLayout3;
        this.llLogo = linearLayout4;
        this.llText = linearLayout5;
        this.rlBack = relativeLayout;
        this.rlMain = relativeLayout2;
        this.rlSelectItem = relativeLayout3;
        this.rvLayer = recyclerView;
        this.tablayoutMenu = tabLayout;
        this.toolbar = toolbar;
        this.tvSave = textView;
        this.vp2Menu = viewPager2;
    }

    public static ActivityCreateBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ActivityCreateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public LogoCreateVM getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable LogoCreateVM logoCreateVM);

    @Deprecated
    public static ActivityCreateBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ActivityCreateBinding) ViewDataBinding.bind(obj, view, R.layout.activity_create);
    }

    @NonNull
    @Deprecated
    public static ActivityCreateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ActivityCreateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_create, viewGroup, z, obj);
    }

    @NonNull
    public static ActivityCreateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityCreateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityCreateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_create, null, false, obj);
    }
}
