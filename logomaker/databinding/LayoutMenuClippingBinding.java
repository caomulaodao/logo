package com.logomaster.logomaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.p131vm.LogoCreateVM;
import com.logomaster.logomaker.view.LogoSquareRelativeLayout;

/* loaded from: classes3.dex */
public abstract class LayoutMenuClippingBinding extends ViewDataBinding {
    @NonNull
    public final CardView cvImage;
    @NonNull
    public final ImageView ivCancel;
    @NonNull
    public final ImageView ivDone;
    @Bindable
    public LogoCreateVM mViewModel;
    @NonNull
    public final LogoSquareRelativeLayout rlCircle;
    @NonNull
    public final LogoSquareRelativeLayout rlNone;
    @NonNull
    public final LogoSquareRelativeLayout rlRect;
    @NonNull
    public final LogoSquareRelativeLayout rlRound;
    @NonNull
    public final LogoSquareRelativeLayout rlSquare;
    @NonNull
    public final RecyclerView rvClippingType;
    @NonNull
    public final SeekBar sbClippling;
    @NonNull
    public final TextView tvTipsRadius;

    public LayoutMenuClippingBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, ImageView imageView2, LogoSquareRelativeLayout logoSquareRelativeLayout, LogoSquareRelativeLayout logoSquareRelativeLayout2, LogoSquareRelativeLayout logoSquareRelativeLayout3, LogoSquareRelativeLayout logoSquareRelativeLayout4, LogoSquareRelativeLayout logoSquareRelativeLayout5, RecyclerView recyclerView, SeekBar seekBar, TextView textView) {
        super(obj, view, i);
        this.cvImage = cardView;
        this.ivCancel = imageView;
        this.ivDone = imageView2;
        this.rlCircle = logoSquareRelativeLayout;
        this.rlNone = logoSquareRelativeLayout2;
        this.rlRect = logoSquareRelativeLayout3;
        this.rlRound = logoSquareRelativeLayout4;
        this.rlSquare = logoSquareRelativeLayout5;
        this.rvClippingType = recyclerView;
        this.sbClippling = seekBar;
        this.tvTipsRadius = textView;
    }

    public static LayoutMenuClippingBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutMenuClippingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public LogoCreateVM getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable LogoCreateVM logoCreateVM);

    @Deprecated
    public static LayoutMenuClippingBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutMenuClippingBinding) ViewDataBinding.bind(obj, view, R.layout.layout_menu_clipping);
    }

    @NonNull
    @Deprecated
    public static LayoutMenuClippingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (LayoutMenuClippingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_menu_clipping, viewGroup, z, obj);
    }

    @NonNull
    public static LayoutMenuClippingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutMenuClippingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutMenuClippingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_menu_clipping, null, false, obj);
    }
}
