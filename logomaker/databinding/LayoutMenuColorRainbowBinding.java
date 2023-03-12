package com.logomaster.logomaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.p131vm.LogoCreateVM;
import com.logomaster.logomaker.view.LogoColorSaturationView;
import com.logomaster.logomaker.view.LogoRainbowView;

/* loaded from: classes3.dex */
public abstract class LayoutMenuColorRainbowBinding extends ViewDataBinding {
    @NonNull
    public final CardView cvImage;
    @NonNull
    public final EditText etCurrentColor;
    @NonNull
    public final ImageView ivCancel;
    @NonNull
    public final ImageView ivDone;
    @NonNull
    public final LogoColorSaturationView lcsvColor;
    @NonNull
    public final LogoRainbowView lrvColor;
    @Bindable
    public LogoCreateVM mViewModel;

    public LayoutMenuColorRainbowBinding(Object obj, View view, int i, CardView cardView, EditText editText, ImageView imageView, ImageView imageView2, LogoColorSaturationView logoColorSaturationView, LogoRainbowView logoRainbowView) {
        super(obj, view, i);
        this.cvImage = cardView;
        this.etCurrentColor = editText;
        this.ivCancel = imageView;
        this.ivDone = imageView2;
        this.lcsvColor = logoColorSaturationView;
        this.lrvColor = logoRainbowView;
    }

    public static LayoutMenuColorRainbowBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutMenuColorRainbowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public LogoCreateVM getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable LogoCreateVM logoCreateVM);

    @Deprecated
    public static LayoutMenuColorRainbowBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutMenuColorRainbowBinding) ViewDataBinding.bind(obj, view, R.layout.layout_menu_color_rainbow);
    }

    @NonNull
    @Deprecated
    public static LayoutMenuColorRainbowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (LayoutMenuColorRainbowBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_menu_color_rainbow, viewGroup, z, obj);
    }

    @NonNull
    public static LayoutMenuColorRainbowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutMenuColorRainbowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutMenuColorRainbowBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_menu_color_rainbow, null, false, obj);
    }
}
