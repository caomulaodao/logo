package com.logomaster.logomaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
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
public abstract class LayoutMenuImageBinding extends ViewDataBinding {
    @NonNull
    public final CardView cvImage;
    @NonNull
    public final ImageView ivBottom;
    @NonNull
    public final ImageView ivCentered;
    @NonNull
    public final ImageView ivDelete;
    @NonNull
    public final ImageView ivHcentered;
    @NonNull
    public final ImageView ivHorizontal;
    @NonNull
    public final ImageView ivLeft;
    @NonNull
    public final ImageView ivRight;
    @NonNull
    public final ImageView ivUp;
    @NonNull
    public final ImageView ivVertically;
    @Bindable
    public LogoCreateVM mViewModel;
    @NonNull
    public final RecyclerView rvColor;
    @NonNull
    public final SeekBar sbOpacity;

    public LayoutMenuImageBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, RecyclerView recyclerView, SeekBar seekBar) {
        super(obj, view, i);
        this.cvImage = cardView;
        this.ivBottom = imageView;
        this.ivCentered = imageView2;
        this.ivDelete = imageView3;
        this.ivHcentered = imageView4;
        this.ivHorizontal = imageView5;
        this.ivLeft = imageView6;
        this.ivRight = imageView7;
        this.ivUp = imageView8;
        this.ivVertically = imageView9;
        this.rvColor = recyclerView;
        this.sbOpacity = seekBar;
    }

    public static LayoutMenuImageBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutMenuImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public LogoCreateVM getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable LogoCreateVM logoCreateVM);

    @Deprecated
    public static LayoutMenuImageBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutMenuImageBinding) ViewDataBinding.bind(obj, view, R.layout.layout_menu_image);
    }

    @NonNull
    @Deprecated
    public static LayoutMenuImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (LayoutMenuImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_menu_image, viewGroup, z, obj);
    }

    @NonNull
    public static LayoutMenuImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutMenuImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutMenuImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_menu_image, null, false, obj);
    }
}
