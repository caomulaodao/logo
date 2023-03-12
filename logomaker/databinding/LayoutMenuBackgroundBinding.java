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
import androidx.recyclerview.widget.RecyclerView;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.p131vm.LogoCreateVM;

/* loaded from: classes3.dex */
public abstract class LayoutMenuBackgroundBinding extends ViewDataBinding {
    @NonNull
    public final CardView cvImage;
    @NonNull
    public final ImageView ivCancel;
    @NonNull
    public final ImageView ivDone;
    @Bindable
    public LogoCreateVM mViewModel;
    @NonNull
    public final RecyclerView rvBackgroundColor;
    @NonNull
    public final RecyclerView rvBackgroundImage;

    public LayoutMenuBackgroundBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, ImageView imageView2, RecyclerView recyclerView, RecyclerView recyclerView2) {
        super(obj, view, i);
        this.cvImage = cardView;
        this.ivCancel = imageView;
        this.ivDone = imageView2;
        this.rvBackgroundColor = recyclerView;
        this.rvBackgroundImage = recyclerView2;
    }

    public static LayoutMenuBackgroundBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutMenuBackgroundBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public LogoCreateVM getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable LogoCreateVM logoCreateVM);

    @Deprecated
    public static LayoutMenuBackgroundBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutMenuBackgroundBinding) ViewDataBinding.bind(obj, view, R.layout.layout_menu_background);
    }

    @NonNull
    @Deprecated
    public static LayoutMenuBackgroundBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (LayoutMenuBackgroundBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_menu_background, viewGroup, z, obj);
    }

    @NonNull
    public static LayoutMenuBackgroundBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutMenuBackgroundBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutMenuBackgroundBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_menu_background, null, false, obj);
    }
}
