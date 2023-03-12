package com.logomaster.logomaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.p131vm.LogoCreateVM;

/* loaded from: classes3.dex */
public abstract class LayoutMenuColorFinderBinding extends ViewDataBinding {
    @NonNull
    public final CardView cvImage;
    @NonNull
    public final ImageView ivCancel;
    @NonNull
    public final ImageView ivDone;
    @Bindable
    public LogoCreateVM mViewModel;
    @NonNull
    public final CardView viewShowColor;

    public LayoutMenuColorFinderBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, ImageView imageView2, CardView cardView2) {
        super(obj, view, i);
        this.cvImage = cardView;
        this.ivCancel = imageView;
        this.ivDone = imageView2;
        this.viewShowColor = cardView2;
    }

    public static LayoutMenuColorFinderBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutMenuColorFinderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public LogoCreateVM getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable LogoCreateVM logoCreateVM);

    @Deprecated
    public static LayoutMenuColorFinderBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutMenuColorFinderBinding) ViewDataBinding.bind(obj, view, R.layout.layout_menu_color_finder);
    }

    @NonNull
    @Deprecated
    public static LayoutMenuColorFinderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (LayoutMenuColorFinderBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_menu_color_finder, viewGroup, z, obj);
    }

    @NonNull
    public static LayoutMenuColorFinderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutMenuColorFinderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutMenuColorFinderBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_menu_color_finder, null, false, obj);
    }
}
