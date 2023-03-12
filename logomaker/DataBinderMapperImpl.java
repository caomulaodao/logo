package com.logomaster.logomaker;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.logomaster.logomaker.databinding.ActivityCreateBindingImpl;
import com.logomaster.logomaker.databinding.ActivityLogoMyDesignBindingImpl;
import com.logomaster.logomaker.databinding.ActivityLogoMyLogoBindingImpl;
import com.logomaster.logomaker.databinding.ActivityLogoSaveSuccessBindingImpl;
import com.logomaster.logomaker.databinding.ActivityLogoShapeBindingImpl;
import com.logomaster.logomaker.databinding.ActivityLogoShowBigImageBindingImpl;
import com.logomaster.logomaker.databinding.ActivityMainBindingImpl;
import com.logomaster.logomaker.databinding.DialogShowBigImageBindingImpl;
import com.logomaster.logomaker.databinding.FragmentLogoShapeBindingImpl;
import com.logomaster.logomaker.databinding.LayoutMenuBackgroundBindingImpl;
import com.logomaster.logomaker.databinding.LayoutMenuClippingBindingImpl;
import com.logomaster.logomaker.databinding.LayoutMenuColorFinderBindingImpl;
import com.logomaster.logomaker.databinding.LayoutMenuColorRainbowBindingImpl;
import com.logomaster.logomaker.databinding.LayoutMenuFontBindingImpl;
import com.logomaster.logomaker.databinding.LayoutMenuImageBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_ACTIVITYCREATE = 1;
    private static final int LAYOUT_ACTIVITYLOGOMYDESIGN = 2;
    private static final int LAYOUT_ACTIVITYLOGOMYLOGO = 3;
    private static final int LAYOUT_ACTIVITYLOGOSAVESUCCESS = 4;
    private static final int LAYOUT_ACTIVITYLOGOSHAPE = 5;
    private static final int LAYOUT_ACTIVITYLOGOSHOWBIGIMAGE = 6;
    private static final int LAYOUT_ACTIVITYMAIN = 7;
    private static final int LAYOUT_DIALOGSHOWBIGIMAGE = 8;
    private static final int LAYOUT_FRAGMENTLOGOSHAPE = 9;
    private static final int LAYOUT_LAYOUTMENUBACKGROUND = 10;
    private static final int LAYOUT_LAYOUTMENUCLIPPING = 11;
    private static final int LAYOUT_LAYOUTMENUCOLORFINDER = 12;
    private static final int LAYOUT_LAYOUTMENUCOLORRAINBOW = 13;
    private static final int LAYOUT_LAYOUTMENUFONT = 14;
    private static final int LAYOUT_LAYOUTMENUIMAGE = 15;

    /* renamed from: com.logomaster.logomaker.DataBinderMapperImpl$a */
    /* loaded from: classes3.dex */
    public static class C9432a {

        /* renamed from: a */
        public static final SparseArray<String> f15633a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(3);
            f15633a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "logoMainVM");
            sparseArray.put(2, "viewModel");
        }
    }

    /* renamed from: com.logomaster.logomaker.DataBinderMapperImpl$b */
    /* loaded from: classes3.dex */
    public static class C9433b {

        /* renamed from: a */
        public static final HashMap<String, Integer> f15634a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(15);
            f15634a = hashMap;
            hashMap.put("layout/activity_create_0", Integer.valueOf((int) R.layout.activity_create));
            hashMap.put("layout/activity_logo_my_design_0", Integer.valueOf((int) R.layout.activity_logo_my_design));
            hashMap.put("layout/activity_logo_my_logo_0", Integer.valueOf((int) R.layout.activity_logo_my_logo));
            hashMap.put("layout/activity_logo_save_success_0", Integer.valueOf((int) R.layout.activity_logo_save_success));
            hashMap.put("layout/activity_logo_shape_0", Integer.valueOf((int) R.layout.activity_logo_shape));
            hashMap.put("layout/activity_logo_show_big_image_0", Integer.valueOf((int) R.layout.activity_logo_show_big_image));
            hashMap.put("layout/activity_main_0", Integer.valueOf((int) R.layout.activity_main));
            hashMap.put("layout/dialog_show_big_image_0", Integer.valueOf((int) R.layout.dialog_show_big_image));
            hashMap.put("layout/fragment_logo_shape_0", Integer.valueOf((int) R.layout.fragment_logo_shape));
            hashMap.put("layout/layout_menu_background_0", Integer.valueOf((int) R.layout.layout_menu_background));
            hashMap.put("layout/layout_menu_clipping_0", Integer.valueOf((int) R.layout.layout_menu_clipping));
            hashMap.put("layout/layout_menu_color_finder_0", Integer.valueOf((int) R.layout.layout_menu_color_finder));
            hashMap.put("layout/layout_menu_color_rainbow_0", Integer.valueOf((int) R.layout.layout_menu_color_rainbow));
            hashMap.put("layout/layout_menu_font_0", Integer.valueOf((int) R.layout.layout_menu_font));
            hashMap.put("layout/layout_menu_image_0", Integer.valueOf((int) R.layout.layout_menu_image));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(15);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.activity_create, 1);
        sparseIntArray.put(R.layout.activity_logo_my_design, 2);
        sparseIntArray.put(R.layout.activity_logo_my_logo, 3);
        sparseIntArray.put(R.layout.activity_logo_save_success, 4);
        sparseIntArray.put(R.layout.activity_logo_shape, 5);
        sparseIntArray.put(R.layout.activity_logo_show_big_image, 6);
        sparseIntArray.put(R.layout.activity_main, 7);
        sparseIntArray.put(R.layout.dialog_show_big_image, 8);
        sparseIntArray.put(R.layout.fragment_logo_shape, 9);
        sparseIntArray.put(R.layout.layout_menu_background, 10);
        sparseIntArray.put(R.layout.layout_menu_clipping, 11);
        sparseIntArray.put(R.layout.layout_menu_color_finder, 12);
        sparseIntArray.put(R.layout.layout_menu_color_rainbow, 13);
        sparseIntArray.put(R.layout.layout_menu_font, 14);
        sparseIntArray.put(R.layout.layout_menu_image, 15);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return C9432a.f15633a.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i2) {
                    case 1:
                        if ("layout/activity_create_0".equals(tag)) {
                            return new ActivityCreateBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_create is invalid. Received: " + tag);
                    case 2:
                        if ("layout/activity_logo_my_design_0".equals(tag)) {
                            return new ActivityLogoMyDesignBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_logo_my_design is invalid. Received: " + tag);
                    case 3:
                        if ("layout/activity_logo_my_logo_0".equals(tag)) {
                            return new ActivityLogoMyLogoBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_logo_my_logo is invalid. Received: " + tag);
                    case 4:
                        if ("layout/activity_logo_save_success_0".equals(tag)) {
                            return new ActivityLogoSaveSuccessBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_logo_save_success is invalid. Received: " + tag);
                    case 5:
                        if ("layout/activity_logo_shape_0".equals(tag)) {
                            return new ActivityLogoShapeBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_logo_shape is invalid. Received: " + tag);
                    case 6:
                        if ("layout/activity_logo_show_big_image_0".equals(tag)) {
                            return new ActivityLogoShowBigImageBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_logo_show_big_image is invalid. Received: " + tag);
                    case 7:
                        if ("layout/activity_main_0".equals(tag)) {
                            return new ActivityMainBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
                    case 8:
                        if ("layout/dialog_show_big_image_0".equals(tag)) {
                            return new DialogShowBigImageBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_show_big_image is invalid. Received: " + tag);
                    case 9:
                        if ("layout/fragment_logo_shape_0".equals(tag)) {
                            return new FragmentLogoShapeBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_logo_shape is invalid. Received: " + tag);
                    case 10:
                        if ("layout/layout_menu_background_0".equals(tag)) {
                            return new LayoutMenuBackgroundBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for layout_menu_background is invalid. Received: " + tag);
                    case 11:
                        if ("layout/layout_menu_clipping_0".equals(tag)) {
                            return new LayoutMenuClippingBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for layout_menu_clipping is invalid. Received: " + tag);
                    case 12:
                        if ("layout/layout_menu_color_finder_0".equals(tag)) {
                            return new LayoutMenuColorFinderBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for layout_menu_color_finder is invalid. Received: " + tag);
                    case 13:
                        if ("layout/layout_menu_color_rainbow_0".equals(tag)) {
                            return new LayoutMenuColorRainbowBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for layout_menu_color_rainbow is invalid. Received: " + tag);
                    case 14:
                        if ("layout/layout_menu_font_0".equals(tag)) {
                            return new LayoutMenuFontBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for layout_menu_font is invalid. Received: " + tag);
                    case 15:
                        if ("layout/layout_menu_image_0".equals(tag)) {
                            return new LayoutMenuImageBindingImpl(dataBindingComponent, view);
                        }
                        throw new IllegalArgumentException("The tag for layout_menu_image is invalid. Received: " + tag);
                    default:
                        return null;
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C9433b.f15634a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
