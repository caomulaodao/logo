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
public abstract class LayoutMenuFontBinding extends ViewDataBinding {
    @NonNull
    public final CardView cvImage;
    @NonNull
    public final ImageView ivBold;
    @NonNull
    public final ImageView ivBottom;
    @NonNull
    public final ImageView ivCopy;
    @NonNull
    public final ImageView ivDelete;
    @NonNull
    public final ImageView ivItalic;
    @NonNull
    public final ImageView ivLeft;
    @NonNull
    public final ImageView ivRevise;
    @NonNull
    public final ImageView ivRight;
    @NonNull
    public final ImageView ivUnderscore;
    @NonNull
    public final ImageView ivUp;
    @Bindable
    public LogoCreateVM mViewModel;
    @NonNull
    public final RecyclerView rvColor;
    @NonNull
    public final RecyclerView rvFont;

    public LayoutMenuFontBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, RecyclerView recyclerView, RecyclerView recyclerView2) {
        super(obj, view, i);
        this.cvImage = cardView;
        this.ivBold = imageView;
        this.ivBottom = imageView2;
        this.ivCopy = imageView3;
        this.ivDelete = imageView4;
        this.ivItalic = imageView5;
        this.ivLeft = imageView6;
        this.ivRevise = imageView7;
        this.ivRight = imageView8;
        this.ivUnderscore = imageView9;
        this.ivUp = imageView10;
        this.rvColor = recyclerView;
        this.rvFont = recyclerView2;
    }

    public static LayoutMenuFontBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutMenuFontBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public LogoCreateVM getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable LogoCreateVM logoCreateVM);

    @Deprecated
    public static LayoutMenuFontBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutMenuFontBinding) ViewDataBinding.bind(obj, view, R.layout.layout_menu_font);
    }

    @NonNull
    @Deprecated
    public static LayoutMenuFontBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (LayoutMenuFontBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_menu_font, viewGroup, z, obj);
    }

    @NonNull
    public static LayoutMenuFontBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutMenuFontBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutMenuFontBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_menu_font, null, false, obj);
    }
}
