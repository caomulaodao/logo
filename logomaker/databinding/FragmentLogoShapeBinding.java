package com.logomaster.logomaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.view.LogoRecyclerViewToViewPager;

/* loaded from: classes3.dex */
public abstract class FragmentLogoShapeBinding extends ViewDataBinding {
    @NonNull
    public final RecyclerView rvImages;
    @NonNull
    public final LogoRecyclerViewToViewPager rvTags;

    public FragmentLogoShapeBinding(Object obj, View view, int i, RecyclerView recyclerView, LogoRecyclerViewToViewPager logoRecyclerViewToViewPager) {
        super(obj, view, i);
        this.rvImages = recyclerView;
        this.rvTags = logoRecyclerViewToViewPager;
    }

    public static FragmentLogoShapeBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentLogoShapeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentLogoShapeBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentLogoShapeBinding) ViewDataBinding.bind(obj, view, R.layout.fragment_logo_shape);
    }

    @NonNull
    @Deprecated
    public static FragmentLogoShapeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (FragmentLogoShapeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_logo_shape, viewGroup, z, obj);
    }

    @NonNull
    public static FragmentLogoShapeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentLogoShapeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentLogoShapeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_logo_shape, null, false, obj);
    }
}
