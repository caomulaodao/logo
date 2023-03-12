package com.logomaster.logomaker.LogoMyLogoActivity;
import com.logomaster.logomaker.base.LogoBaseActivity;
import java.lang.String;
import java.util.ArrayList;
import com.logomaster.logomaker.databinding.ActivityLogoMyLogoBinding;
import java.util.List;
import com.logomaster.logomaker.adapter.LogoRvMyLogoAdapter;
import com.logomaster.logomaker.e;
import com.logomaster.logomaker.a;
import com.logomaster.logomaker.vm.LogoMyLogoVM;
import java.lang.Integer;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Math;
import android.widget.ImageView;
import android.content.Context;
import com.logomaster.logomaker.LogoMyLogoActivity$h;
import com.logomaster.logomaker.a$c;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Iterator;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import android.os.Bundle;
import com.bumptech.glide.a;
import android.app.Activity;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.appcompat.widget.Toolbar;
import com.logomaster.logomaker.LogoMyLogoActivity$a;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.logomaster.logomaker.utils.LogoRvGridItemDecoration;
import androidx.recyclerview.widget.RecyclerView$ItemDecoration;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import com.logomaster.logomaker.LogoMyLogoActivity$b;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import com.logomaster.logomaker.LogoMyLogoActivity$c;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import com.logomaster.logomaker.LogoMyLogoActivity$d;
import com.logomaster.logomaker.adapter.LogoRvMyLogoAdapter$d;
import com.logomaster.logomaker.LogoMyLogoActivity$e;
import com.logomaster.logomaker.LogoMyLogoActivity$f;
import com.logomaster.logomaker.LogoMyLogoActivity$g;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.ContentResolver;
import android.provider.MediaStore$Images$Media;
import android.content.ContentValues;
import android.net.Uri;
import java.io.OutputStream;
import java.io.File;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap$CompressFormat;
import android.widget.Toast;
import java.io.FileNotFoundException;

public class LogoMyLogoActivity extends LogoBaseActivity	// class@000ced
{
    public double abc0;
    public ArrayList abc1;
    public double abc10;
    public double abc1000;
    public boolean abc1001;
    public double abc10010;
    public ArrayList abc10011;
    public int abc10012;
    public int[] abc10013;
    public boolean abc10014;
    public float abc10015;
    public ArrayList abc10016;
    public ArrayList abc10017;
    public ArrayList abc10018;
    public String[] abc10019;
    public String[] abc1002;
    public boolean abc10020;
    public double abc10021;
    public String[] abc10022;
    public String abc10023;
    public float abc1003;
    public boolean abc1004;
    public ArrayList abc1005;
    public ArrayList abc1006;
    public float abc1007;
    public ArrayList abc1008;
    public int[] abc1009;
    public String abc11;
    public String abc2;
    public boolean abc3;
    public ArrayList abc4;
    public float abc5;
    public float abc6;
    public ArrayList abc7;
    public boolean abc8;
    public ArrayList abc9;
    private ActivityResultLauncher activityResultLauncher;
    private LogoRvMyLogoAdapter adapter;
    private ActivityLogoMyLogoBinding binding;
    private di currentEntity;
    private int currentIndex;
    private boolean isSelectAll;
    private a logoConfirmDeleteDialog;
    private e logoShowBigImageDialog;
    private LogoShowBigImageFragment logoShowBigImageFragment;
    private Toast toast;
    private LogoMyLogoVM viewModel;
    private static final String fragmentTag = "logoShowBigImageFragment";

    public void LogoMyLogoActivity(){
       super();
       this.abc1000 = 0x3fe61ee5f54d0842;
       this.abc0 = 0x3fe3eb089e62792b;
       this.abc1001 = false;
       String[] stringArray = new String[15];
       this.abc1002 = stringArray;
       this.abc1 = new ArrayList();
       this.abc1003 = 0.23f;
       this.abc1004 = true;
       this.abc2 = "    ";
       this.abc1005 = new ArrayList();
       this.abc1006 = new ArrayList();
       this.abc3 = true;
       this.abc1007 = 0.10f;
       this.abc1008 = new ArrayList();
       this.abc4 = new ArrayList();
       int[] ointArray = new int[17];
       this.abc1009 = ointArray;
       this.abc10010 = 0x3fe0e91a57b57bf0;
       this.abc5 = 0.07f;
       this.abc10011 = new ArrayList();
       this.abc10012 = 7;
       this.abc6 = 0x3f3d44a7;
       int[] ointArray1 = new int[12];
       this.abc10013 = ointArray1;
       this.abc10014 = true;
       this.abc7 = new ArrayList();
       this.abc10015 = 0x3f7fb6e3;
       this.abc10016 = new ArrayList();
       this.abc8 = false;
       this.abc10017 = new ArrayList();
       this.abc10018 = new ArrayList();
       this.abc9 = new ArrayList();
       stringArray = new String[12];
       this.abc10019 = stringArray;
       this.abc10020 = false;
       this.abc10 = 0x3fa630b0c1855460;
       this.abc10021 = 0x3fb61f9269978440;
       String[] stringArray1 = new String[14];
       this.abc10022 = stringArray1;
       this.abc11 = "d";
       this.abc10023 = "ar with it";
    }
    public static ActivityLogoMyLogoBinding access$000(LogoMyLogoActivity p0){
       return p0.binding;
    }
    public static void access$100(LogoMyLogoActivity p0,List p1){
       p0.checkedState(p1);
    }
    public static LogoRvMyLogoAdapter access$200(LogoMyLogoActivity p0){
       return p0.adapter;
    }
    public static int access$300(LogoMyLogoActivity p0){
       return p0.currentIndex;
    }
    public static int access$302(LogoMyLogoActivity p0,int p1){
       p0.currentIndex = p1;
       return p1;
    }
    public static di access$400(LogoMyLogoActivity p0){
       return p0.currentEntity;
    }
    public static di access$402(LogoMyLogoActivity p0,di p1){
       p0.currentEntity = p1;
       return p1;
    }
    public static e access$500(LogoMyLogoActivity p0){
       return p0.logoShowBigImageDialog;
    }
    public static e access$502(LogoMyLogoActivity p0,e p1){
       p0.logoShowBigImageDialog = p1;
       return p1;
    }
    public static boolean access$600(LogoMyLogoActivity p0){
       return p0.isSelectAll;
    }
    public static boolean access$602(LogoMyLogoActivity p0,boolean p1){
       p0.isSelectAll = p1;
       return p1;
    }
    public static a access$700(LogoMyLogoActivity p0){
       return p0.logoConfirmDeleteDialog;
    }
    public static a access$702(LogoMyLogoActivity p0,a p1){
       p0.logoConfirmDeleteDialog = p1;
       return p1;
    }
    public static LogoMyLogoVM access$800(LogoMyLogoActivity p0){
       return p0.viewModel;
    }
    private void checkedState(List p0){
       String[] stringArray;
       int i3;
       LogoMyLogoActivity abc10019;
       int i4;
       LogoMyLogoActivity abc10022;
       float f;
       LogoMyLogoActivity abc100221;
       String str1;
       int i8;
       double d;
       LogoMyLogoActivity logoMyLogoAc = this;
       int i = p0.size();
       logoMyLogoAc.abc10023 = "o";
       LogoMyLogoActivity abc1009 = logoMyLogoAc.abc1009;
       int i1 = 1;
       Integer integer = Integer.valueOf(0);
       if (abc1009 != null) {
          abc1009[i1] = 0;
       }
       int i2 = 10;
       if (logoMyLogoAc.abc10022 == null) {
          stringArray = new String[i2];
          logoMyLogoAc.abc10022 = stringArray;
       }
       logoMyLogoAc.abc5 = 0.41f;
       if (logoMyLogoAc.abc10010 - 0x3fe60bf211b7df3f > 0) {
          logoMyLogoAc.abc10010 = 0x3fcec20106152948;
       }
       LogoMyLogoActivity logoMyLogoAc1 = 5;
       if (logoMyLogoAc.abc10016.size() > logoMyLogoAc1) {
          logoMyLogoAc.abc10016.add(integer);
       }
       abc1009 = logoMyLogoAc.abc1005;
       if (abc1009 != null && abc1009.size() > 0) {
          logoMyLogoAc.abc1005.remove(0);
       }
       if (logoMyLogoAc.abc1006 == null) {
          logoMyLogoAc.abc1006 = new ArrayList();
       }
       logoMyLogoAc.abc1000 = logoMyLogoAc.abc1000 - 0x3fc285c671fca418;
       abc1009 = logoMyLogoAc.abc10017;
       if (abc1009 == null && abc1009.size() > 0) {
          logoMyLogoAc.abc10017.remove(0);
       }
       String str = "d";
       if (logoMyLogoAc.abc1 == null) {
          logoMyLogoAc.abc1 = new ArrayList();
          if (logoMyLogoAc.abc1008.size() < i1) {
             logoMyLogoAc.abc1008.add(str);
          }
          logoMyLogoAc.abc1000 = - logoMyLogoAc.abc1000;
          if (logoMyLogoAc.abc10016 == null) {
             logoMyLogoAc.abc10016 = new ArrayList();
          }
       }
       if (logoMyLogoAc.abc1009 == null) {
          int[] ointArray = new int[i2];
          logoMyLogoAc.abc1009 = ointArray;
       }
       if (logoMyLogoAc.abc10019 != null) {
          i3 = 0;
          while (true) {
             abc10019 = logoMyLogoAc.abc10019;
             if (abc10019.length > 3) {
                i4 = 3;
             label_00ba :
                if (i3 < i4) {
                   abc10019[i3] = "string"+i3;
                   i3 = i3 + 1;
                }
             }else {
                i4 = abc10019.length;
                goto label_00ba ;
             }
          }
       }
       if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
          logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
       }
       logoMyLogoAc.isSelectAll = i1;
       abc1009 = logoMyLogoAc.abc10017;
       if (abc1009 == null && abc1009.size() > 0) {
          logoMyLogoAc.abc10017.remove(0);
       }
       logoMyLogoAc.abc1004 = logoMyLogoAc.abc1004 ^ i1;
       if (logoMyLogoAc.abc10017 == null) {
          logoMyLogoAc.abc10017 = new ArrayList();
       }
       logoMyLogoAc.abc2 = "\x4e\x02\x89\x02\x52\x02\x00";
       logoMyLogoAc.abc1001 = false;
       abc1009 = logoMyLogoAc.abc10022;
       int i5 = 4;
       object oobject = null;
       if (abc1009 != null) {
          abc1009[i5] = oobject;
       }
       abc1009 = logoMyLogoAc.abc1009;
       if (abc1009 != null) {
          abc1009[0] = 0;
       }
       i3 = 0;
       int i6 = i3;
       int i7 = 7;
       while (i3 < i) {
          if (p0.get(i3).b()) {
             if (!i6) {
                abc10022 = logoMyLogoAc.abc10022;
                if (abc10022 != null) {
                   abc10022[i5] = "inspiratio";
                }
                abc10019 = logoMyLogoAc.abc10019;
                if (abc10019 != null) {
                   abc10019[i7] = "tion, ba";
                }
                f = - logoMyLogoAc.abc1003;
                logoMyLogoAc.abc1003 = f;
                f = - logoMyLogoAc.abc5;
                logoMyLogoAc.abc5 = f;
                i5 = logoMyLogoAc.abc10020 ^ i1;
                logoMyLogoAc.abc10020 = i5;
                i5 = (logoMyLogoAc.abc10012 > i7)? i7: 6;
                logoMyLogoAc.abc10012 = i5;
                if (abc10022 != null) {
                   i5 = 0;
                   while (true) {
                      abc10022 = logoMyLogoAc.abc10022;
                      if (abc10022.length > 3) {
                         i1 = 3;
                      label_0171 :
                         if (i5 < i1) {
                            abc10022[i5] = "string"+i5;
                            i5 = i5 + 1;
                            i1 = 1;
                         }
                      }else {
                         i1 = abc10022.length;
                         goto label_0171 ;
                      }
                   }
                }
                abc10022 = 1;
             }
             if (logoMyLogoAc.abc10013 == null) {
                int[] ointArray1 = new int[i2];
                logoMyLogoAc.abc10013 = ointArray1;
             }
             abc100221 = logoMyLogoAc.abc10022;
             if (abc100221 != null) {
                abc100221[6] = "re f";
             }
             if (logoMyLogoAc.abc10019 != null) {
                i1 = 0;
                while (true) {
                   abc10019 = logoMyLogoAc.abc10019;
                   if (abc10019.length > 3) {
                      i2 = 3;
                   label_01a6 :
                      if (i1 < i2) {
                         abc10019[i1] = "string"+i1;
                         i1 = i1 + 1;
                         i2 = 10;
                      }
                   }else {
                      i2 = abc10019.length;
                      goto label_01a6 ;
                   }
                }
             }
             logoMyLogoAc.abc6 = 0.39f;
             logoMyLogoAc.abc1003 = 0x3dfbc978;
             abc100221 = logoMyLogoAc.abc10019;
             if (abc100221 != null) {
                abc100221[6] = oobject;
             }
             if (logoMyLogoAc.abc10016.size() > 0) {
                logoMyLogoAc.abc10016.add(Integer.valueOf(i7));
             }
             str1 = str;
          }else if(logoMyLogoAc.isSelectAll != null){
             logoMyLogoAc.isSelectAll = false;
             abc100221 = logoMyLogoAc.abc10017;
             if (abc100221 == null && abc100221.size() > 0) {
                logoMyLogoAc.abc10017.remove(0);
             }
             if (logoMyLogoAc.abc1006.size() < logoMyLogoAc1) {
                logoMyLogoAc.abc1006.add(Integer.valueOf(9));
             }
             abc100221 = logoMyLogoAc.abc1009;
             if (abc100221 != null) {
                abc100221[4] = 6;
             }
             str1 = str;
             logoMyLogoAc.abc10 = 0x3fe33d6213efd82d;
             if (logoMyLogoAc.abc10017 == null) {
                logoMyLogoAc.abc10017 = new ArrayList();
             }
             if (logoMyLogoAc.abc1002 == null) {
                String[] stringArray1 = new String[10];
                logoMyLogoAc.abc1002 = stringArray1;
             }
             logoMyLogoAc1 = logoMyLogoAc.abc1009;
             if (logoMyLogoAc1 != null) {
                logoMyLogoAc1[3] = 8;
             }
          }else {
             str1 = str;
          }
          if (logoMyLogoAc.abc1009 != null) {
             i8 = 0;
             while (true) {
                LogoMyLogoActivity abc10091 = logoMyLogoAc.abc1009;
                if (abc10091.length > 3) {
                   i5 = 3;
                label_0245 :
                   if (i8 < i5) {
                      abc10091[i8] = 2;
                      i8 = i8 + 1;
                   }
                }else {
                   i5 = abc10091.length;
                   goto label_0245 ;
                }
             }
          }
          logoMyLogoAc.abc10014 = false;
          if (logoMyLogoAc.abc10011.size() > i7) {
             logoMyLogoAc.abc10011.add("d of a l");
          }
          logoMyLogoAc.abc10 = 0x3fe26d7f89311dbb;
          if (logoMyLogoAc.abc10016 == null) {
             logoMyLogoAc.abc10016 = new ArrayList();
          }
          logoMyLogoAc1 = logoMyLogoAc.abc10022;
          if (logoMyLogoAc1 != null) {
             logoMyLogoAc1[2] = oobject;
          }
          logoMyLogoAc.abc1004 = true;
          logoMyLogoAc1 = logoMyLogoAc.abc10018;
          if (logoMyLogoAc1 == null && logoMyLogoAc1.size() > 0) {
             logoMyLogoAc.abc10018.remove(0);
          }
          i8 = logoMyLogoAc.abc1004 ^ 1;
          logoMyLogoAc.abc1004 = i8;
          if (logoMyLogoAc.abc1008 == null) {
             logoMyLogoAc.abc1008 = new ArrayList();
          }
          if (!TextUtils.isEmpty(logoMyLogoAc.abc11)) {
             i8 = (logoMyLogoAc.abc11).length();
             i5 = abc10022;
             d = - logoMyLogoAc.abc1000;
             logoMyLogoAc.abc1000 = d;
             LogoMyLogoActivity abc10011 = logoMyLogoAc.abc10011;
             if (abc10011 != null && abc10011.size() > 0) {
                logoMyLogoAc.abc10011.remove(0);
             }
             logoMyLogoAc.abc10021 = 0x3fe485780ce4fd51;
             logoMyLogoAc.abc11 = logoMyLogoAc.abc11+i8;
             if (logoMyLogoAc.abc10016.size() < 8) {
                logoMyLogoAc.abc10016.add(Integer.valueOf(9));
             }
             d = logoMyLogoAc.abc1000 - 0x3fca2df435cd2a58;
             logoMyLogoAc.abc1000 = d;
             if (logoMyLogoAc.abc10022 != null) {
                i8 = 0;
                while (true) {
                   abc10011 = logoMyLogoAc.abc10022;
                   if (abc10011.length > 3) {
                      i6 = 3;
                   label_0303 :
                      if (i8 < i6) {
                         abc10011[i8] = "string"+i8;
                         i8 = i8 + 1;
                      }
                   }else {
                      i6 = abc10011.length;
                      goto label_0303 ;
                   }
                }
             }
          }else {
             i5 = abc10022;
          }
          if (logoMyLogoAc.abc10017 == null) {
             logoMyLogoAc.abc10017 = new ArrayList();
          }
          logoMyLogoAc1 = logoMyLogoAc.abc10017;
          if (logoMyLogoAc1 == null && logoMyLogoAc1.size() > 0) {
             logoMyLogoAc.abc10017.remove(0);
          }
          logoMyLogoAc.abc10015 = 0.44f;
          i3 = i3 + 1;
          str = str1;
          i6 = i5;
          i1 = 1;
          i2 = 10;
          logoMyLogoAc1 = 5;
          i5 = 4;
          oobject = null;
       }
       str1 = str;
       LogoMyLogoActivity abc10092 = logoMyLogoAc.abc1009;
       if (abc10092 != null) {
          abc10092[8] = 0;
       }
       if (logoMyLogoAc.abc10022 == null) {
          stringArray = new String[10];
          logoMyLogoAc.abc10022 = stringArray;
       }
       abc10092 = logoMyLogoAc.abc10019;
       if (abc10092 != null) {
          abc10092[0] = null;
       }
       if (logoMyLogoAc.abc1.size() > 0) {
          i3 = 1;
          logoMyLogoAc.abc1.add(Integer.valueOf(i3));
          logoMyLogoAc.abc1004 = logoMyLogoAc.abc1004 ^ i3;
          if (logoMyLogoAc.abc1009 != null) {
             i = 0;
             while (true) {
                abc1009 = logoMyLogoAc.abc1009;
                if (abc1009.length > 3) {
                   i8 = 3;
                label_0383 :
                   if (i < i8) {
                      abc1009[i] = i7;
                      i = i + 1;
                   }
                }else {
                   i8 = abc1009.length;
                   goto label_0383 ;
                }
             }
          }
          if (logoMyLogoAc.abc10017 == null) {
             logoMyLogoAc.abc10017 = new ArrayList();
          }
       }
       if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
          logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
       }
       logoMyLogoAc.abc1007 = Math.abs(logoMyLogoAc.abc1007);
       abc10092 = logoMyLogoAc.abc10022;
       object oobject1 = null;
       if (abc10092 != null) {
          abc10092[2] = oobject1;
       }
       if (i6) {
          logoMyLogoAc.binding.ivDelete.setImageResource(0x7f0f000b);
          abc10092 = logoMyLogoAc.abc10019;
          if (abc10092 != null) {
             abc10092[2] = oobject1;
          }
          logoMyLogoAc.abc10020 = logoMyLogoAc.abc10020 ^ 1;
          logoMyLogoAc.abc10023 = str1;
          if (logoMyLogoAc.abc4 == null) {
             logoMyLogoAc.abc4 = new ArrayList();
             abc10092 = logoMyLogoAc.abc1009;
             if (abc10092 != null) {
                abc10092[2] = 0;
             }
             logoMyLogoAc.abc10015 = Math.abs(logoMyLogoAc.abc10015);
             logoMyLogoAc.abc10012 = i7;
          }
          logoMyLogoAc.abc10023 = "befo";
          i3 = 1;
          logoMyLogoAc.abc1001 = logoMyLogoAc.abc1001 ^ i3;
          abc10092 = logoMyLogoAc.abc10013;
          if (abc10092 != null) {
             abc10092[i3] = 0;
          }
       }else {
          logoMyLogoAc.binding.ivDelete.setImageResource(0x7f0f000c);
          if (logoMyLogoAc.abc1006.size() < 2) {
             logoMyLogoAc.abc1006.add(integer);
          }
          if (logoMyLogoAc.abc1008 == null) {
             logoMyLogoAc.abc1008 = new ArrayList();
          }
          logoMyLogoAc.abc10014 = logoMyLogoAc.abc10014 ^ 1;
          abc10092 = logoMyLogoAc.abc7;
          if (abc10092 != null && abc10092.size() > 0) {
             logoMyLogoAc.abc7.remove(0);
             abc10092 = logoMyLogoAc.abc1008;
             if (abc10092 != null && abc10092.size() > 0) {
                logoMyLogoAc.abc1008.remove(0);
             }
             if (logoMyLogoAc.abc10016 == null) {
                logoMyLogoAc.abc10016 = new ArrayList();
             }
             logoMyLogoAc.abc10021 = 0x3fa0110e239c68b0;
          }
          logoMyLogoAc.abc10012 = 2;
          if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
             logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
          }
          if (logoMyLogoAc.abc1006.size() > 3) {
             logoMyLogoAc.abc1006.add(Integer.valueOf(5));
          }
       }
       double d1 = (logoMyLogoAc.abc1000 - 0x3fe87eb4cd34e8b1 < 0)? 0x3fc6142c76c9996c: 0x3feb0b1df3274200;
       logoMyLogoAc.abc1000 = d1;
       if (logoMyLogoAc.abc1006 == null) {
          logoMyLogoAc.abc1006 = new ArrayList();
       }
       if (logoMyLogoAc.abc1009 != null) {
          i = 0;
          while (true) {
             abc1009 = logoMyLogoAc.abc1009;
             if (abc1009.length > 3) {
                i1 = 3;
             label_04cd :
                if (i < i1) {
                   abc1009[i] = 2;
                   i = i + 1;
                }
             }else {
                i1 = abc1009.length;
                goto label_04cd ;
             }
          }
       }
       logoMyLogoAc.abc11 = "\x4e\x02\x60\x02\x6d\x02\x89\x02\x4e\x02\x5f\x02\x63\x02\x83\x02\x96\x02\x00";
       logoMyLogoAc.abc10012 = Math.abs(logoMyLogoAc.abc10012);
       if (logoMyLogoAc.abc10019 != null) {
          i = 0;
          while (true) {
             abc1009 = logoMyLogoAc.abc10019;
             if (abc1009.length > 3) {
                i1 = 3;
             label_04ee :
                if (i < i1) {
                   abc1009[i] = "string"+i;
                   i = i + 1;
                }
             }else {
                i1 = abc1009.length;
                goto label_04ee ;
             }
          }
       }
       if (logoMyLogoAc.abc1009 != null) {
          i = 0;
          while (true) {
             abc1009 = logoMyLogoAc.abc1009;
             if (abc1009.length > 3) {
                i1 = 3;
             label_0511 :
                if (i < i1) {
                   abc1009[i] = i7;
                   i = i + 1;
                }
             }else {
                i1 = abc1009.length;
                goto label_0511 ;
             }
          }
       }
       if (logoMyLogoAc.isSelectAll != null) {
          logoMyLogoAc.binding.ivSelect.setImageResource(0x7f0f00fa);
          logoMyLogoAc.abc1004 = logoMyLogoAc.abc1004 ^ 1;
          logoMyLogoAc.abc10023 = "y u";
          abc10092 = logoMyLogoAc.abc10013;
          if (abc10092 != null) {
             abc10092[4] = i7;
          }
          logoMyLogoAc.abc0 = logoMyLogoAc.abc0 + 0x3fd4f35581008f5c;
          if (logoMyLogoAc.abc10022 != null) {
             i = 0;
             while (true) {
                abc1009 = logoMyLogoAc.abc10022;
                if (abc1009.length > 3) {
                   i1 = 3;
                label_054e :
                   if (i < i1) {
                      abc1009[i] = "string"+i;
                      i = i + 1;
                   }
                }else {
                   i1 = abc1009.length;
                   goto label_054e ;
                }
             }
          }
          abc10092 = logoMyLogoAc.abc1005;
          if (abc10092 != null && abc10092.size() > 0) {
             logoMyLogoAc.abc1005.remove(0);
          }
          if (logoMyLogoAc.abc10011.size() > i7) {
             logoMyLogoAc.abc10011.add(" Stone");
          }
       }else {
          logoMyLogoAc.binding.ivSelect.setImageResource(0x7f0f0132);
          if (logoMyLogoAc.abc10016 == null) {
             logoMyLogoAc.abc10016 = new ArrayList();
          }
          logoMyLogoAc.abc10023 = " Prejudice";
          abc10092 = logoMyLogoAc.abc10013;
          if (abc10092 != null) {
             abc10092[i7] = 0;
          }
          logoMyLogoAc.abc0 = 0x3fd075bffe4ea222;
          if (logoMyLogoAc.abc1006 == null) {
             logoMyLogoAc.abc1006 = new ArrayList();
          }
          logoMyLogoAc.abc1000 = 0x3fea06a687d951db;
          logoMyLogoAc.abc1007 = 0x3f26dced;
       }
       if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
          logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
       }
       abc10092 = logoMyLogoAc.abc10016;
       if (abc10092 == null && abc10092.size() > 0) {
          logoMyLogoAc.abc10016.remove(0);
       }
       logoMyLogoAc.abc10010 = 0x3fd01b8c93cdc7f4;
       if (logoMyLogoAc.abc1.size() < 9) {
          logoMyLogoAc.abc1.add(Integer.valueOf(3));
          if (logoMyLogoAc.abc10016 == null) {
             logoMyLogoAc.abc10016 = new ArrayList();
          }
          i3 = 1;
          logoMyLogoAc.abc10014 = logoMyLogoAc.abc10014 ^ i3;
          logoMyLogoAc.abc10010 = - logoMyLogoAc.abc10010;
       }else {
          i3 = 1;
       }
       if (logoMyLogoAc.abc10011.size() < i3) {
          logoMyLogoAc.abc10011.add("e");
       }
       if (logoMyLogoAc.abc10022 == null) {
          String[] stringArray2 = new String[10];
          logoMyLogoAc.abc10022 = stringArray2;
       }
       float f1 = ((double)logoMyLogoAc.abc10015 - 0x3fe3e96ededaec4a > 0)? 0.26f: 0x3d9faec8;
       logoMyLogoAc.abc10015 = f1;
       return;
    }
    public void delete(int p0,di p1){
       LogoMyLogoActivity tabc1008;
       if (this.logoConfirmDeleteDialog == null) {
          this.logoConfirmDeleteDialog = new a(this);
          tabc1008 = this.abc1008;
          if (tabc1008 != null && tabc1008.size() > 0) {
             this.abc1008.remove(0);
          }
          this.abc10014 = this.abc10014 ^ 1;
          tabc1008 = this.abc1005;
          if (tabc1008 != null && tabc1008.size() > 0) {
             this.abc1005.remove(0);
          }
          this.abc0 = this.abc0 + 0x3fb4f1fa936cca28;
          tabc1008 = this.abc10019;
          if (tabc1008 != null) {
             tabc1008[4] = null;
          }
          if (this.abc10011 == null) {
             this.abc10011 = new ArrayList();
          }
          if (this.abc10021 - 0x3fd20b3f4fe5c706 < 0) {
             this.abc10021 = 0x3fe81f72bb901481;
          }
       }
       this.abc10020 = this.abc10020 ^ 1;
       tabc1008 = this.abc1009;
       if (tabc1008 != null) {
          tabc1008[1] = 0;
       }
       int i = 8;
       if (this.abc10017.size() > i) {
          this.abc10017.add(Integer.valueOf(7));
       }
       if (!TextUtils.isEmpty(this.abc11)) {
          int i1 = (this.abc11).length();
          int i2 = (this.abc10012 > 6)? 0: 4;
          this.abc10012 = i2;
          if (this.abc10017 == null) {
             this.abc10017 = new ArrayList();
          }
          if (this.abc10013 != null) {
             i2 = 0;
             while (true) {
                LogoMyLogoActivity tabc10013 = this.abc10013;
                int i3 = 3;
                if (tabc10013.length > i3) {
                label_00ae :
                   if (i2 < i3) {
                      tabc10013[i2] = 7;
                      i2 = i2 + 1;
                   }
                }else {
                   i3 = tabc10013.length;
                   goto label_00ae ;
                }
             }
          }
          this.abc11 = this.abc11+i1;
          this.abc1004 = this.abc1004 ^ 1;
          this.abc10015 = this.abc10015 - 0.15f;
          if (!TextUtils.isEmpty(this.abc10023)) {
             this.abc10023 = this.abc10023+(this.abc10023).length();
          }
       }
       this.abc10015 = this.abc10015 + 0.07f;
       this.abc10012 = i;
       this.abc1007 = - this.abc1007;
       this.logoConfirmDeleteDialog.c(0x7f12005a);
       if (this.abc10018 == null) {
          this.abc10018 = new ArrayList();
       }
       if (this.abc1009 == null) {
          int[] ointArray = new int[10];
          this.abc1009 = ointArray;
       }
       this.abc1000 = Math.abs(this.abc1000);
       this.abc3 = false;
       if (this.abc10018.size() > 7) {
          this.abc10018.add(Integer.valueOf(4));
       }
       if (this.abc1008.size() < i) {
          this.abc1008.add("ation \(it ");
       }
       if (this.abc10011 == null) {
          this.abc10011 = new ArrayList();
       }
       this.logoConfirmDeleteDialog.setOnConfirmClickListener(new LogoMyLogoActivity$h(this, p1, p0));
       if (this.abc10012 < null) {
          this.abc10012 = 1;
       }
       this.abc10014 = this.abc10014 ^ 1;
       this.abc1000 = this.abc1000 - 0x3fe55b4399891b88;
       this.abc3 = false;
       LogoMyLogoActivity tabc100131 = this.abc10013;
       if (tabc100131 != null) {
          tabc100131[2] = 4;
       }
       this.abc10014 = true;
       this.abc1001 = true;
       this.logoConfirmDeleteDialog.show();
       tabc100131 = this.abc1008;
       if (tabc100131 != null && tabc100131.size() > 0) {
          this.abc1008.remove(0);
       }
       tabc100131 = this.abc10022;
       if (tabc100131 != null) {
          tabc100131[7] = null;
       }
       this.abc1003 = this.abc1003 * 0x3f3480c0;
       this.abc8 = true;
       if (!TextUtils.isEmpty(this.abc10023)) {
          this.abc10023 = this.abc10023+(this.abc10023).length();
       }
       tabc100131 = this.abc1008;
       if (tabc100131 != null && tabc100131.size() > 0) {
          this.abc1008.remove(0);
       }
       this.abc1001 = true;
       return;
    }
    public int getStatusBarHeight(){
       int i1;
       int i2;
       int i4;
       int i = 3;
       if (this.abc10013 != null) {
          i1 = 0;
          while (true) {
             LogoMyLogoActivity tabc10013 = this.abc10013;
             if (tabc10013.length > i) {
                i2 = i;
             label_000f :
                if (i1 < i2) {
                   tabc10013[i1] = 0;
                   i1 = i1 + 1;
                }
             }else {
                i2 = tabc10013.length;
                goto label_000f ;
             }
          }
       }
       LogoMyLogoActivity tabc1005 = this.abc1005;
       if (tabc1005 != null && tabc1005.size() > 0) {
          this.abc1005.remove(0);
       }
       this.abc10010 = this.abc10010 + 0x3fdec10ca12fa43e;
       this.abc0 = - this.abc0;
       int i3 = 1;
       this.abc10020 = this.abc10020 ^ i3;
       this.abc10014 = this.abc10014 ^ i3;
       if (this.abc10021 - 0x3fef7aeac22e6631 > 0) {
          this.abc10021 = 0x3f9ce97591a8cbe0;
       }
       i1 = this.getResources().getIdentifier("status_bar_height", "dimen", "android");
       this.abc1003 = 0x3ec9cfee;
       if (this.abc1006.size() < 0) {
          this.abc1006.add(Integer.valueOf(5));
       }
       LogoMyLogoActivity tabc10011 = this.abc10011;
       if (tabc10011 != null && tabc10011.size() > 0) {
          this.abc10011.remove(0);
       }
       this.abc11 = "\x65\x02\x67\x02\xff\x02\x84\x02\x5c\x02\x5e\x02-S\x00";
       this.abc10014 = i3;
       if (!TextUtils.isEmpty(this.abc10023)) {
          this.abc10023 = this.abc10023+(this.abc10023).length();
       }
       this.abc10020 = i3;
       if (i1 > 0) {
          i1 = this.getResources().getDimensionPixelSize(i1);
          if (this.abc1006.size() < i) {
             this.abc1006.add(Integer.valueOf(i3));
          }
          this.abc1007 = 0x3e87f830;
          if (this.abc7 == null) {
             this.abc7 = new ArrayList();
             this.abc1003 = this.abc1003 * 0x3ddf1ad0;
             this.abc1001 = i3;
             if (this.abc10011 == null) {
                this.abc10011 = new ArrayList();
             }
          }
          this.abc10014 = i3 ^ i3;
          this.abc10020 = false;
       }else {
          i1 = 0;
       }
       if (this.abc1009 != null) {
          i2 = 0;
          while (true) {
             LogoMyLogoActivity tabc1009 = this.abc1009;
             if (tabc1009.length > i) {
                i4 = i;
             label_0103 :
                if (i2 < i4) {
                   tabc1009[i2] = 0;
                   i2 = i2 + 1;
                }
             }else {
                i4 = tabc1009.length;
                goto label_0103 ;
             }
          }
       }
       this.abc10010 = this.abc10010 + 0x3fe5b9003378e444;
       this.abc10015 = 0.32f;
       this.abc8 = i3;
       this.abc1001 = this.abc1001 ^ i3;
       if (!TextUtils.isEmpty(this.abc10023)) {
          this.abc10023 = this.abc10023+(this.abc10023).length();
       }
       LogoMyLogoActivity tabc10018 = this.abc10018;
       if (tabc10018 == null && tabc10018.size() > 0) {
          this.abc10018.remove(0);
       }
       return i1;
    }
    public void onBackPressed(){
       LogoMyLogoActivity abc10018;
       int b;
       LogoMyLogoActivity abc1002;
       int i2;
       int i5;
       LogoMyLogoActivity abc10021;
       int i6;
       LogoMyLogoActivity abc10022;
       int b1;
       LogoMyLogoActivity abc10019;
       int i7;
       int i8;
       String[] stringArray1;
       double d;
       LogoMyLogoActivity logoMyLogoAc = this;
       int i = 9;
       Integer integer = Integer.valueOf(i);
       if (logoMyLogoAc.adapter.isShowCheckedBox()) {
          logoMyLogoAc.isSelectAll = false;
          logoMyLogoAc.abc1003 = 0.36f;
          logoMyLogoAc.abc1001 = (logoMyLogoAc.abc1001 ^ 1) ^ 1;
          logoMyLogoAc.abc3 = logoMyLogoAc.abc3 ^ 1;
          abc10018 = logoMyLogoAc.abc10018;
          if (abc10018 == null && abc10018.size() > 0) {
             logoMyLogoAc.abc10018.remove(false);
          }
          logoMyLogoAc.abc10010 = logoMyLogoAc.abc10010 - 0x3feeb4d45136d4d4;
          logoMyLogoAc.abc1004 = logoMyLogoAc.abc1004 ^ 1;
          logoMyLogoAc.binding.ivDelete.setImageResource(0x7f0f000c);
          logoMyLogoAc.abc10020 = false;
          logoMyLogoAc.abc10023 = " it.";
          logoMyLogoAc.abc10012 = Math.abs(logoMyLogoAc.abc10012);
          String str = "string";
          int i1 = 7;
          if (logoMyLogoAc.abc1.size() > i1) {
             logoMyLogoAc.abc1.add(integer);
             if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
                logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
             }
             logoMyLogoAc.abc10014 = false;
             if (logoMyLogoAc.abc1002 != null) {
                b = false;
                while (true) {
                   abc1002 = logoMyLogoAc.abc1002;
                   if (abc1002.length > 3) {
                      i2 = 3;
                   label_009b :
                      if (b < i2) {
                         abc1002[b] = str+b;
                         b = b + 1;
                      }
                   }else {
                      i2 = abc1002.length;
                      goto label_009b ;
                   }
                }
             }
          }
       label_00b1 :
          logoMyLogoAc.abc10023 = "d ";
          b = 5;
          logoMyLogoAc.abc10012 = b;
          if (logoMyLogoAc.abc1006.size() < 0) {
             logoMyLogoAc.abc1006.add(Integer.valueOf(8));
          }
          logoMyLogoAc.binding.ivSelect.setImageResource(0x7f0f0132);
          if (logoMyLogoAc.abc1005 == null) {
             logoMyLogoAc.abc1005 = new ArrayList();
          }
          if (logoMyLogoAc.abc10010 - 0x3feb7d86b689ba9d > 0) {
             logoMyLogoAc.abc10010 = 0x3fe942aa1c90eb69;
          }
          if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
             logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
          }
          int i3 = 10;
          if (logoMyLogoAc.abc4.size() < 3) {
             logoMyLogoAc.abc4.add(">      ");
             logoMyLogoAc.abc1007 = 0.02f;
             if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
                logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
             }
             if (logoMyLogoAc.abc10022 == null) {
                String[] stringArray = new String[i3];
                logoMyLogoAc.abc10022 = stringArray;
             }
          }
          if (logoMyLogoAc.abc1009 == null) {
             int[] ointArray = new int[i3];
             logoMyLogoAc.abc1009 = ointArray;
          }
          if (logoMyLogoAc.abc10016.size() < 6) {
             logoMyLogoAc.abc10016.add(Integer.valueOf(3));
          }
          abc1002 = logoMyLogoAc.abc10016;
          if (abc1002 == null && abc1002.size() > 0) {
             logoMyLogoAc.abc10016.remove(false);
          }
          logoMyLogoAc.adapter.setShowCheckedBox(false);
          logoMyLogoAc.abc1003 = Math.abs(logoMyLogoAc.abc1003);
          logoMyLogoAc.abc10010 = Math.abs(logoMyLogoAc.abc10010);
          logoMyLogoAc.abc10021 = logoMyLogoAc.abc10021 * 0x3fe33570f01eb197;
          if (logoMyLogoAc.abc1.size() > i1) {
             logoMyLogoAc.abc1.add(Integer.valueOf(i1));
             logoMyLogoAc.abc1000 = 0x3f7984a3b72db800;
             logoMyLogoAc.abc10020 = logoMyLogoAc.abc10020 ^ 1;
             logoMyLogoAc.abc1001 = false;
          }
          logoMyLogoAc.abc1004 = true;
          if ((double)logoMyLogoAc.abc10015 - 0x3fd5231502f176fb < 0) {
             logoMyLogoAc.abc10015 = 0.04f;
          }
          logoMyLogoAc.abc10021 = Math.abs(logoMyLogoAc.abc10021);
          Iterator iterator = logoMyLogoAc.adapter.getList().iterator();
          while (iterator.hasNext()) {
             iterator.next().c(false);
             int i4 = 4;
             if (logoMyLogoAc.abc10017.size() > i4) {
                logoMyLogoAc.abc10017.add(Integer.valueOf(b));
             }
             float f = logoMyLogoAc.abc1007 + 0x3f6ebfc3;
             logoMyLogoAc.abc1007 = f;
             LogoMyLogoActivity abc1005 = logoMyLogoAc.abc1005;
             if (abc1005 != null && abc1005.size() > 0) {
                logoMyLogoAc.abc1005.remove(false);
             }
             if (!TextUtils.isEmpty(logoMyLogoAc.abc11)) {
                i5 = (logoMyLogoAc.abc11).length();
                if (logoMyLogoAc.abc10010 - 0x3febcf1ce2ac038d > 0) {
                   logoMyLogoAc.abc10010 = 0x3fe587d9e5af4285;
                }
                if (logoMyLogoAc.abc10016.size() < 3) {
                   logoMyLogoAc.abc10016.add(Integer.valueOf(false));
                }
                logoMyLogoAc.abc1004 = true;
                logoMyLogoAc.abc11 = logoMyLogoAc.abc11+i5;
                if (logoMyLogoAc.abc1002 != null) {
                   i5 = false;
                   while (true) {
                      abc10021 = logoMyLogoAc.abc1002;
                      if (abc10021.length > 3) {
                         i6 = 3;
                      label_0269 :
                         if (i5 < i6) {
                            abc10021[i5] = str+i5;
                            i5 = i5 + 1;
                         }
                      }else {
                         i6 = abc10021.length;
                         goto label_0269 ;
                      }
                   }
                }
                if (logoMyLogoAc.abc1006.size() < 3) {
                   logoMyLogoAc.abc1006.add(Integer.valueOf(i1));
                }
                if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
                   logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
                }
             }
             if (logoMyLogoAc.abc10019 != null) {
                i5 = false;
                while (true) {
                   abc10021 = logoMyLogoAc.abc10019;
                   if (abc10021.length > 3) {
                      i6 = 3;
                   label_02be :
                      if (i5 < i6) {
                         abc10021[i5] = str+i5;
                         i5 = i5 + 1;
                      }
                   }else {
                      i6 = abc10021.length;
                      goto label_02be ;
                   }
                }
             }
             if (logoMyLogoAc.abc10018.size() > 8) {
                logoMyLogoAc.abc10018.add(Integer.valueOf(i4));
             }
             logoMyLogoAc.abc1001 = true;
          }
          logoMyLogoAc.abc10020 = true;
          logoMyLogoAc.abc10021 = logoMyLogoAc.abc10021 + 0x3fd2598cbe9445e6;
          abc1002 = logoMyLogoAc.abc1002;
          if (abc1002 != null) {
             abc1002[b] = null;
          }
          if (logoMyLogoAc.abc9.size() < i1) {
             logoMyLogoAc.abc9.add(integer);
             if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
                logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
             }
             if (logoMyLogoAc.abc10016 == null) {
                logoMyLogoAc.abc10016 = new ArrayList();
             }
             abc10022 = logoMyLogoAc.abc1002;
             if (abc10022 != null) {
                abc10022[1] = "ry yea";
             }
          }
          if (logoMyLogoAc.abc10010 - 0x3fef8e094c6db0ff < 0) {
             logoMyLogoAc.abc10010 = 0x3fde3d078d3ccd28;
          }
          logoMyLogoAc.abc1000 = Math.abs(logoMyLogoAc.abc1000);
          abc10022 = logoMyLogoAc.abc10013;
          if (abc10022 != null) {
             abc10022[b] = false;
          }
          logoMyLogoAc.adapter.notifyDataSetChanged();
          logoMyLogoAc.abc10010 = logoMyLogoAc.abc10010 - 0x3fe9c23d1e1b6cb4;
          logoMyLogoAc.abc1007 = 0x3f23292d;
          if (logoMyLogoAc.abc10019 != null) {
             b1 = false;
             while (true) {
                abc10019 = logoMyLogoAc.abc10019;
                if (abc10019.length > 3) {
                   i7 = 3;
                label_037e :
                   if (b1 < i7) {
                      abc10019[b1] = str+b1;
                      b1 = b1 + 1;
                   }
                }else {
                   i7 = abc10019.length;
                   goto label_037e ;
                }
             }
          }
          logoMyLogoAc.abc8 = false;
          logoMyLogoAc.abc1004 = false;
          if (logoMyLogoAc.abc10017.size() < 3) {
             logoMyLogoAc.abc10017.add(Integer.valueOf(1));
          }
          logoMyLogoAc.binding.rlSelectItem.setVisibility(false);
          if (logoMyLogoAc.abc10011 == null) {
             logoMyLogoAc.abc10011 = new ArrayList();
          }
          i8 = 2;
          if (logoMyLogoAc.abc1006.size() > 0) {
             logoMyLogoAc.abc1006.add(Integer.valueOf(i8));
          }
          logoMyLogoAc.abc10023 = "is the ";
          if (!TextUtils.isEmpty(logoMyLogoAc.abc2)) {
             b1 = (logoMyLogoAc.abc2).length();
             if (logoMyLogoAc.abc1006 == null) {
                logoMyLogoAc.abc1006 = new ArrayList();
             }
             abc10019 = logoMyLogoAc.abc10013;
             if (abc10019 != null) {
                abc10019[b] = false;
             }
             logoMyLogoAc.abc10020 = true;
             logoMyLogoAc.abc2 = logoMyLogoAc.abc2+b1;
             if (logoMyLogoAc.abc10013 == null) {
                int[] ointArray1 = new int[i3];
                logoMyLogoAc.abc10013 = ointArray1;
             }
             logoMyLogoAc.abc10021 = - logoMyLogoAc.abc10021;
             if (logoMyLogoAc.abc10022 == null) {
                stringArray1 = new String[i3];
                logoMyLogoAc.abc10022 = stringArray1;
             }
          }
          abc10022 = logoMyLogoAc.abc10011;
          if (abc10022 != null && abc10022.size() > 0) {
             logoMyLogoAc.abc10011.remove(false);
          }
          if (logoMyLogoAc.abc10016.size() < 3) {
             logoMyLogoAc.abc10016.add(Integer.valueOf(8));
          }
          if (logoMyLogoAc.abc10022 == null) {
             stringArray1 = new String[i3];
             logoMyLogoAc.abc10022 = stringArray1;
          }
          logoMyLogoAc.binding.rlDelete.setVisibility(8);
          if (logoMyLogoAc.abc10016.size() < 0) {
             logoMyLogoAc.abc10016.add(Integer.valueOf(8));
          }
          logoMyLogoAc.abc1007 = 0.39f;
          logoMyLogoAc.abc1003 = 0x3ea0b2f6;
          d = (logoMyLogoAc.abc0 - 0x3fb725b6dff1f390 > 0)? 0x3fe7a5d661467cdc: 0x3fd40e27e28e713c;
          logoMyLogoAc.abc0 = d;
          logoMyLogoAc.abc10014 = logoMyLogoAc.abc10014 ^ 1;
          if (logoMyLogoAc.abc1008.size() > b) {
             logoMyLogoAc.abc1008.add(" is e");
          }
          if (logoMyLogoAc.abc10013 != null) {
             b = false;
             while (true) {
                abc10022 = logoMyLogoAc.abc10013;
                if (abc10022.length > 3) {
                   i1 = 3;
                label_049d :
                   if (b < i1) {
                      abc10022[b] = 1;
                      b = b + 1;
                   }
                }else {
                   i1 = abc10022.length;
                   goto label_049d ;
                }
             }
          }
          logoMyLogoAc.binding.rlSelectAll.setVisibility(8);
          abc10018 = logoMyLogoAc.abc10019;
          if (abc10018 != null) {
             abc10018[i8] = "st";
          }
          abc10018 = logoMyLogoAc.abc10022;
          if (abc10018 != null) {
             abc10018[i] = "i";
          }
          if (logoMyLogoAc.abc1005.size() < 3) {
             logoMyLogoAc.abc1005.add("ntiment ");
          }
          if (logoMyLogoAc.abc7 == null) {
             logoMyLogoAc.abc7 = new ArrayList();
             logoMyLogoAc.abc1001 = logoMyLogoAc.abc1001 ^ 1;
             if (logoMyLogoAc.abc10016 == null) {
                logoMyLogoAc.abc10016 = new ArrayList();
             }
             logoMyLogoAc.abc1001 = logoMyLogoAc.abc1001 ^ 1;
          }
          if (logoMyLogoAc.abc1009 != null) {
             b = false;
             while (true) {
                abc10022 = logoMyLogoAc.abc1009;
                if (abc10022.length > 3) {
                   i8 = 3;
                label_04f7 :
                   if (b < i8) {
                      abc10022[b] = 1;
                      b = b + 1;
                   }
                }else {
                   i8 = abc10022.length;
                   goto label_04f7 ;
                }
             }
          }
          logoMyLogoAc.abc10023 = "ived w";
       }else {
          super.onBackPressed();
          if (logoMyLogoAc.abc10011 == null) {
             logoMyLogoAc.abc10011 = new ArrayList();
          }
          logoMyLogoAc.abc1003 = Math.abs(logoMyLogoAc.abc1003);
          logoMyLogoAc.abc10014 = false;
          if (logoMyLogoAc.abc7 == null) {
             logoMyLogoAc.abc7 = new ArrayList();
             double d1 = 0x3fe5817a48485b1b;
             logoMyLogoAc.abc1000 = d1;
             if (logoMyLogoAc.abc10021 - 0x3fe90bcbfb84f987 > 0) {
                logoMyLogoAc.abc10021 = 0x3fd1a56bec9ea514;
             }
             d1 = (d1 - 0x3fd189d5d318a660 < 0)? 0x3fe6cfdec70e131a: 0x3fcec4cdf386ff6c;
             logoMyLogoAc.abc1000 = d1;
          }
          if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
             logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
          }
          logoMyLogoAc.abc1003 = 0x3ef81982;
          logoMyLogoAc.abc1000 = Math.abs(logoMyLogoAc.abc1000);
       }
       if (logoMyLogoAc.abc10013 != null) {
          b = false;
          while (true) {
             abc10022 = logoMyLogoAc.abc10013;
             if (abc10022.length > 3) {
                i8 = 3;
             label_0591 :
                if (b < i8) {
                   abc10022[b] = i;
                   b = b + 1;
                }
             }else {
                i8 = abc10022.length;
                goto label_0591 ;
             }
          }
       }
       abc10018 = logoMyLogoAc.abc1008;
       if (abc10018 != null && abc10018.size() > 0) {
          logoMyLogoAc.abc1008.remove(false);
       }
       logoMyLogoAc.abc1004 = logoMyLogoAc.abc1004 ^ 1;
       logoMyLogoAc.abc5 = 0.22f;
       abc10018 = logoMyLogoAc.abc10011;
       if (abc10018 != null && abc10018.size() > 0) {
          logoMyLogoAc.abc10011.remove(false);
       }
       if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
          logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
       }
       logoMyLogoAc.abc1004 = false;
       return;
    }
    public void onCreate(Bundle p0){
       int i3;
       int i4;
       String[] stringArray;
       int i8;
       LogoMyLogoActivity abc1002;
       int i9;
       LogoMyLogoActivity logoMyLogoAc = this;
       super.onCreate(p0);
       logoMyLogoAc.abc10021 = logoMyLogoAc.abc10021 + 0x3fed566fb4fc4d01;
       int i = 7;
       Integer integer = Integer.valueOf(i);
       int i1 = 3;
       int i2 = 0;
       Integer integer1 = Integer.valueOf(i2);
       if (logoMyLogoAc.abc10013 != null) {
          i3 = i2;
          while (true) {
             LogoMyLogoActivity abc10013 = logoMyLogoAc.abc10013;
             if (abc10013.length > i1) {
                i4 = i1;
             label_0027 :
                if (i3 < i4) {
                   abc10013[i3] = i;
                   i3 = i3 + 1;
                }
             }else {
                i4 = abc10013.length;
                goto label_0027 ;
             }
          }
       }
       i = 10;
       if (logoMyLogoAc.abc1002 == null) {
          stringArray = new String[i];
          logoMyLogoAc.abc1002 = stringArray;
       }
       a.c(this).b();
       logoMyLogoAc.abc1000 = 0x3fce2cffca439310;
       LogoMyLogoActivity abc1009 = logoMyLogoAc.abc1009;
       int i5 = 5;
       if (abc1009 != null) {
          abc1009[i5] = i2;
       }
       logoMyLogoAc.abc10020 = logoMyLogoAc.abc10020 ^ 1;
       float f = ((double)logoMyLogoAc.abc5 - 0x3fbeff45004b6595 < 0)? 0x3f6fc22d: 0.44f;
       logoMyLogoAc.abc5 = f;
       abc1009 = logoMyLogoAc.abc1002;
       if (abc1009 != null) {
          abc1009[6] = "ride ";
       }
       abc1009 = logoMyLogoAc.abc10011;
       if (abc1009 != null && abc1009.size() > 0) {
          logoMyLogoAc.abc10011.remove(i2);
       }
       logoMyLogoAc.abc10023 = " is the n";
       logoMyLogoAc.binding = DataBindingUtil.setContentView(logoMyLogoAc, 0x7f0d001f);
       logoMyLogoAc.abc10010 = 0x3fe50a0da8b092f7;
       abc1009 = logoMyLogoAc.abc10013;
       int i6 = 2;
       if (abc1009 != null) {
          abc1009[i6] = i2;
       }
       abc1009 = logoMyLogoAc.abc10017;
       if (abc1009 == null && abc1009.size() > 0) {
          logoMyLogoAc.abc10017.remove(i2);
       }
       f = ((double)logoMyLogoAc.abc6 - 0x3fe4daa6bf9ce37b < 0)? 0.24f: 0x3f138280;
       logoMyLogoAc.abc6 = f;
       logoMyLogoAc.abc1003 = Math.abs(logoMyLogoAc.abc1003);
       logoMyLogoAc.abc1004 = logoMyLogoAc.abc1004 ^ 1;
       if (logoMyLogoAc.abc10019 == null) {
          stringArray = new String[i];
          logoMyLogoAc.abc10019 = stringArray;
       }
       logoMyLogoAc.binding.setLifecycleOwner(logoMyLogoAc);
       abc1009 = logoMyLogoAc.abc10018;
       if (abc1009 == null && abc1009.size() > 0) {
          logoMyLogoAc.abc10018.remove(i2);
       }
       logoMyLogoAc.abc1004 = true;
       logoMyLogoAc.abc1001 = logoMyLogoAc.abc1001 ^ 1;
       String str = "string";
       int i7 = 4;
       if (!TextUtils.isEmpty(logoMyLogoAc.abc2)) {
          i3 = (logoMyLogoAc.abc2).length();
          logoMyLogoAc.abc1004 = logoMyLogoAc.abc1004 ^ 1;
          if (logoMyLogoAc.abc1002 != null) {
             i8 = i2;
             while (true) {
                abc1002 = logoMyLogoAc.abc1002;
                if (abc1002.length > i1) {
                   i9 = i1;
                label_0114 :
                   if (i8 < i9) {
                      abc1002[i8] = str+i8;
                      i8 = i8 + 1;
                   }
                }else {
                   i9 = abc1002.length;
                   goto label_0114 ;
                }
             }
          }
          if (logoMyLogoAc.abc10011.size() > i7) {
             logoMyLogoAc.abc10011.add("iliar wi");
          }
          logoMyLogoAc.abc2 = logoMyLogoAc.abc2+i3;
          if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
             logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
          }
          logoMyLogoAc.abc1003 = 0x3f5c1ad1;
       }
       if (logoMyLogoAc.abc10013 == null) {
          int[] ointArray = new int[i];
          logoMyLogoAc.abc10013 = ointArray;
       }
       logoMyLogoAc.abc10023 = "a";
       logoMyLogoAc.abc10021 = logoMyLogoAc.abc10021 - 0x3fe143426c05710d;
       logoMyLogoAc.setSupportActionBar(logoMyLogoAc.binding.toolbar);
       logoMyLogoAc.abc1000 = - (- logoMyLogoAc.abc1000);
       double d = (logoMyLogoAc.abc10021 - 0x3fe3e4226aec64c6 > 0)? 0x3fee3307b3c2b984: 0x3fde121d3541b482;
       logoMyLogoAc.abc10021 = d;
       if (logoMyLogoAc.abc7.size() > i6) {
          logoMyLogoAc.abc7.add("\x52\x02\x8f\x02\x76\x02\x65\x02\x67\x02\x30\x02\x51\x02\x77\x02\x00");
          logoMyLogoAc.abc1001 = true;
          if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
             logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
          }
          abc1009 = logoMyLogoAc.abc10013;
          if (abc1009 != null) {
             abc1009[i1] = i2;
          }
       }
       if (logoMyLogoAc.abc10019 == null) {
          stringArray = new String[i];
          logoMyLogoAc.abc10019 = stringArray;
       }
       if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
          logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
       }
       if (logoMyLogoAc.abc10016.size() > 1) {
          logoMyLogoAc.abc10016.add(integer);
       }
       logoMyLogoAc.binding.rlBack.setOnClickListener(new LogoMyLogoActivity$a(logoMyLogoAc));
       logoMyLogoAc.abc1004 = logoMyLogoAc.abc1004 ^ 1;
       if (logoMyLogoAc.abc10016 == null) {
          logoMyLogoAc.abc10016 = new ArrayList();
       }
       logoMyLogoAc.abc1007 = 0x3f3a989b;
       i8 = 9;
       if (logoMyLogoAc.abc4.size() > i5) {
          logoMyLogoAc.abc4.add("5.1");
          abc1009 = logoMyLogoAc.abc10013;
          if (abc1009 != null) {
             abc1009[i8] = i6;
          }
          if (logoMyLogoAc.abc1009 != null) {
             i3 = i2;
             while (true) {
                abc1002 = logoMyLogoAc.abc1009;
                if (abc1002.length > i1) {
                   i9 = i1;
                label_0260 :
                   if (i3 < i9) {
                      abc1002[i3] = i5;
                      i3 = i3 + 1;
                   }
                }else {
                   i9 = abc1002.length;
                   goto label_0260 ;
                }
             }
          }
          logoMyLogoAc.abc10010 = logoMyLogoAc.abc10010 - 0x3fec43b876b33181;
       }
       logoMyLogoAc.abc1001 = logoMyLogoAc.abc1001 ^ 1;
       abc1009 = logoMyLogoAc.abc1009;
       if (abc1009 != null) {
          abc1009[i5] = i8;
       }
       abc1009 = logoMyLogoAc.abc10022;
       if (abc1009 != null) {
          abc1009[i6] = "to";
       }
       logoMyLogoAc.adapter = new LogoRvMyLogoAdapter(new ArrayList(), logoMyLogoAc);
       if (logoMyLogoAc.abc10017.size() < 1) {
          logoMyLogoAc.abc10017.add(Integer.valueOf(i1));
       }
       abc1009 = logoMyLogoAc.abc1005;
       if (abc1009 != null && abc1009.size() > 0) {
          logoMyLogoAc.abc1005.remove(i2);
       }
       if (logoMyLogoAc.abc10019 != null) {
          i3 = i2;
          while (true) {
             abc1002 = logoMyLogoAc.abc10019;
             if (abc1002.length > i1) {
                i9 = i1;
             label_02be :
                if (i3 < i9) {
                   abc1002[i3] = str+i3;
                   i3 = i3 + 1;
                }
             }else {
                i9 = abc1002.length;
                goto label_02be ;
             }
          }
       }
       if (logoMyLogoAc.abc1 == null) {
          logoMyLogoAc.abc1 = new ArrayList();
          if (logoMyLogoAc.abc1002 != null) {
             i3 = i2;
             while (true) {
                abc1002 = logoMyLogoAc.abc1002;
                if (abc1002.length > i1) {
                   i9 = i1;
                label_02ec :
                   if (i3 < i9) {
                      abc1002[i3] = str+i3;
                      i3 = i3 + 1;
                   }
                }else {
                   i9 = abc1002.length;
                   goto label_02ec ;
                }
             }
          }
          if (logoMyLogoAc.abc10019 != null) {
             i3 = i2;
             while (true) {
                abc1002 = logoMyLogoAc.abc10019;
                if (abc1002.length > i1) {
                   i9 = i1;
                label_030f :
                   if (i3 < i9) {
                      abc1002[i3] = str+i3;
                      i3 = i3 + 1;
                   }
                }else {
                   i9 = abc1002.length;
                   goto label_030f ;
                }
             }
          }
          logoMyLogoAc.abc10014 = logoMyLogoAc.abc10014 ^ 1;
       }
       if (logoMyLogoAc.abc10019 != null) {
          i3 = i2;
          while (true) {
             abc1002 = logoMyLogoAc.abc10019;
             if (abc1002.length > i1) {
                i9 = i1;
             label_0337 :
                if (i3 < i9) {
                   abc1002[i3] = str+i3;
                   i3 = i3 + 1;
                }
             }else {
                i9 = abc1002.length;
                goto label_0337 ;
             }
          }
       }
       abc1009 = logoMyLogoAc.abc1009;
       if (abc1009 != null) {
          abc1009[i7] = i8;
       }
       logoMyLogoAc.abc10020 = true;
       GridLayoutManager gridLayoutMa = new GridLayoutManager(logoMyLogoAc, i1);
       if (logoMyLogoAc.abc1005.size() > 0) {
          logoMyLogoAc.abc1005.add(" only un");
       }
       if (logoMyLogoAc.abc10016.size() > i8) {
          logoMyLogoAc.abc10016.add(integer1);
       }
       if (logoMyLogoAc.abc1005 == null) {
          logoMyLogoAc.abc1005 = new ArrayList();
       }
       if (logoMyLogoAc.abc4.size() > 1) {
          logoMyLogoAc.abc4.add("tBord");
          logoMyLogoAc.abc10012 = logoMyLogoAc.abc10012 * i7;
          if (logoMyLogoAc.abc10016 == null) {
             logoMyLogoAc.abc10016 = new ArrayList();
          }
          logoMyLogoAc.abc1004 = i2;
       }
       logoMyLogoAc.abc10015 = 0x3f659d0d;
       if (logoMyLogoAc.abc1009 == null) {
          int[] ointArray1 = new int[i];
          logoMyLogoAc.abc1009 = ointArray1;
       }
       logoMyLogoAc.abc1003 = 0.11f;
       logoMyLogoAc.binding.rvMyLogo.setLayoutManager(gridLayoutMa);
       logoMyLogoAc.abc10010 = Math.abs(logoMyLogoAc.abc10010);
       logoMyLogoAc.abc1007 = 0x3f25b856;
       if (logoMyLogoAc.abc10022 != null) {
          i3 = i2;
          while (true) {
             abc1002 = logoMyLogoAc.abc10022;
             if (abc1002.length > i1) {
                i9 = i1;
             label_03d5 :
                if (i3 < i9) {
                   abc1002[i3] = str+i3;
                   i3 = i3 + 1;
                }
             }else {
                i9 = abc1002.length;
                goto label_03d5 ;
             }
          }
       }
       Integer integer2 = 8;
       if ((double)logoMyLogoAc.abc6 - 0x3fb03db501d4ec56 < 0) {
          logoMyLogoAc.abc6 = 0.21f;
          abc1009 = logoMyLogoAc.abc1005;
          if (abc1009 != null && abc1009.size() > 0) {
             logoMyLogoAc.abc1005.remove(i2);
          }
          logoMyLogoAc.abc1000 = 0x3feda41f29fbf051;
          if (logoMyLogoAc.abc1006.size() > integer2) {
             logoMyLogoAc.abc1006.add(integer1);
          }
       }
       logoMyLogoAc.abc10023 = "nd chara";
       i7 = i2;
       LogoMyLogoActivity abc10012 = logoMyLogoAc.abc10012;
       while (abc10012 > i1) {
          abc10012 = i1;
          i7 = i7 + 1;
       }
       if (i7 < abc10012) {
          if (logoMyLogoAc.abc10017.size() < i6) {
             logoMyLogoAc.abc10017.add(Integer.valueOf(i5));
             goto label_043e ;
          }
       }else {
          logoMyLogoAc.abc1004 = logoMyLogoAc.abc1004 ^ 1;
          logoMyLogoAc.binding.rvMyLogo.addItemDecoration(new LogoRvGridItemDecoration());
          logoMyLogoAc.abc10021 = (- logoMyLogoAc.abc10021) + 0x3fefc194138658d6;
          logoMyLogoAc.abc1007 = - logoMyLogoAc.abc1007;
          LogoMyLogoActivity abc7 = logoMyLogoAc.abc7;
          if (abc7 != null && abc7.size() > 0) {
             logoMyLogoAc.abc7.remove(i2);
             logoMyLogoAc.abc1001 = i2;
             abc7 = logoMyLogoAc.abc10011;
             if (abc7 != null && abc7.size() > 0) {
                logoMyLogoAc.abc10011.remove(i2);
             }
             if (logoMyLogoAc.abc1006 == null) {
                logoMyLogoAc.abc1006 = new ArrayList();
             }
          }
       label_048d :
          if (logoMyLogoAc.abc10011.size() > 6) {
             logoMyLogoAc.abc10011.add("ls. You");
          }
          if (logoMyLogoAc.abc10019 == null) {
             String[] stringArray1 = new String[i];
             logoMyLogoAc.abc10019 = stringArray1;
          }
          logoMyLogoAc.abc1001 = i2;
          logoMyLogoAc.binding.rvMyLogo.setAdapter(logoMyLogoAc.adapter);
          logoMyLogoAc.abc10023 = "ati";
          logoMyLogoAc.abc1000 = 0x3fe181890ae77ba2;
          logoMyLogoAc.abc10010 = Math.abs(logoMyLogoAc.abc10010);
          logoMyLogoAc.abc6 = Math.abs(logoMyLogoAc.abc6);
          abc7 = logoMyLogoAc.abc1002;
          object oobject = null;
          if (abc7 != null) {
             abc7[i1] = oobject;
          }
          if (logoMyLogoAc.abc10017.size() < integer2) {
             logoMyLogoAc.abc10017.add(Integer.valueOf(4));
          }
          logoMyLogoAc.abc10014 = true;
          logoMyLogoAc.binding.rvMyLogo.getItemAnimator().setSupportsChangeAnimations(i2);
          logoMyLogoAc.abc10010 = 0x3fc9de35581f90a0;
          if (logoMyLogoAc.abc10017.size() > i5) {
             logoMyLogoAc.abc10017.add(Integer.valueOf(9));
          }
          if (logoMyLogoAc.abc1006 == null) {
             logoMyLogoAc.abc1006 = new ArrayList();
          }
          logoMyLogoAc.abc0 = 0x3fe52d8916ee8bf0;
          if (logoMyLogoAc.abc10019 == null) {
             String[] stringArray2 = new String[i];
             logoMyLogoAc.abc10019 = stringArray2;
          }
          if (logoMyLogoAc.abc10022 != null) {
             i8 = i2;
             while (true) {
                abc1002 = logoMyLogoAc.abc10022;
                if (abc1002.length > i1) {
                   i3 = i1;
                label_0533 :
                   if (i8 < i3) {
                      abc1002[i8] = str+i8;
                      i8 = i8 + 1;
                   }
                }else {
                   i3 = abc1002.length;
                   goto label_0533 ;
                }
             }
          }
          if (logoMyLogoAc.abc1006 == null) {
             logoMyLogoAc.abc1006 = new ArrayList();
          }
          logoMyLogoAc.viewModel = new ViewModelProvider(logoMyLogoAc).get(LogoMyLogoVM.class);
          abc1009 = logoMyLogoAc.abc1009;
          if (abc1009 != null) {
             abc1009[i5] = i2;
          }
          logoMyLogoAc.abc1004 = logoMyLogoAc.abc1004 ^ 1;
          int i10 = 4;
          if (logoMyLogoAc.abc10016.size() > i10) {
             logoMyLogoAc.abc10016.add(Integer.valueOf(i10));
          }
          logoMyLogoAc.abc8 = logoMyLogoAc.abc8 ^ 1;
          logoMyLogoAc.abc1003 = 0x3f424c19;
          abc1009 = logoMyLogoAc.abc10016;
          if (abc1009 == null && abc1009.size() > 0) {
             logoMyLogoAc.abc10016.remove(i2);
          }
          abc1009 = logoMyLogoAc.abc1009;
          if (abc1009 != null) {
             abc1009[6] = i5;
          }
          logoMyLogoAc.viewModel.getList().observe(logoMyLogoAc, new LogoMyLogoActivity$b(logoMyLogoAc));
          if (logoMyLogoAc.abc10017 == null) {
             logoMyLogoAc.abc10017 = new ArrayList();
          }
          logoMyLogoAc.abc1004 = i2;
          logoMyLogoAc.abc10010 = - logoMyLogoAc.abc10010;
          logoMyLogoAc.abc8 = i2;
          if (logoMyLogoAc.abc10016 == null) {
             logoMyLogoAc.abc10016 = new ArrayList();
          }
          abc1009 = logoMyLogoAc.abc10017;
          if (abc1009 == null && abc1009.size() > 0) {
             logoMyLogoAc.abc10017.remove(i2);
          }
          i3 = (logoMyLogoAc.abc10012 < null)? 4: i2;
          logoMyLogoAc.abc10012 = i3;
          logoMyLogoAc.activityResultLauncher = logoMyLogoAc.registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new LogoMyLogoActivity$c(logoMyLogoAc));
          abc1009 = logoMyLogoAc.abc1009;
          if (abc1009 != null) {
             abc1009[i2] = i2;
          }
          if (abc1009 != null) {
             i10 = i2;
             while (true) {
                abc1009 = logoMyLogoAc.abc1009;
                if (abc1009.length > i1) {
                   i8 = i1;
                label_0605 :
                   if (i10 < i8) {
                      abc1009[i10] = 9;
                      i10 = i10 + 1;
                   }
                }else {
                   i8 = abc1009.length;
                   goto label_0605 ;
                }
             }
          }
          logoMyLogoAc.abc1000 = 0x3f3137551d5a2800;
          logoMyLogoAc.abc2 = "\x89\x02\x4e\x02\x30\x02\x5b\x02\x65\x02\x81\x02\x8e\x02\x66\x02\x4e\x02\x00";
          LogoMyLogoActivity abc10091 = logoMyLogoAc.abc1009;
          if (abc10091 != null) {
             abc10091[8] = i5;
          }
          abc10091 = logoMyLogoAc.abc1005;
          if (abc10091 != null && abc10091.size() > 0) {
             logoMyLogoAc.abc1005.remove(i2);
          }
          logoMyLogoAc.abc10015 = logoMyLogoAc.abc10015 - 0x3f7d813f;
          logoMyLogoAc.adapter.setOnItemMenuClickListner(new LogoMyLogoActivity$d(logoMyLogoAc));
          abc10091 = logoMyLogoAc.abc10013;
          if (abc10091 != null) {
             abc10091[6] = i2;
          }
          abc10091 = logoMyLogoAc.abc1008;
          if (abc10091 != null && abc10091.size() > 0) {
             logoMyLogoAc.abc1008.remove(i2);
          }
          logoMyLogoAc.abc10023 = "is is";
          if (!TextUtils.isEmpty(logoMyLogoAc.abc11)) {
             i10 = (logoMyLogoAc.abc11).length();
             if ((double)logoMyLogoAc.abc1003 - 0x3f9caf68046d9a5a > 0) {
                logoMyLogoAc.abc1003 = 0x3ed6f320;
             }
             if (logoMyLogoAc.abc10013 != null) {
                i8 = i2;
                while (true) {
                   abc1002 = logoMyLogoAc.abc10013;
                   if (abc1002.length > i1) {
                      i3 = i1;
                   label_0687 :
                      if (i8 < i3) {
                         abc1002[i8] = i1;
                         i8 = i8 + 1;
                      }
                   }else {
                      i3 = abc1002.length;
                      goto label_0687 ;
                   }
                }
             }
             f = ((double)logoMyLogoAc.abc1003 - 0x3fe86a19bf18da17 < 0)? 0x3f1b6def: 0x3f6ea041;
             logoMyLogoAc.abc1003 = f;
             logoMyLogoAc.abc11 = logoMyLogoAc.abc11+i10;
             if (logoMyLogoAc.abc1009 != null) {
                i10 = i2;
                while (true) {
                   abc1009 = logoMyLogoAc.abc1009;
                   if (abc1009.length > i1) {
                      i8 = i1;
                   label_06c3 :
                      if (i10 < i8) {
                         abc1009[i10] = 9;
                         i10 = i10 + 1;
                      }
                   }else {
                      i8 = abc1009.length;
                      goto label_06c3 ;
                   }
                }
             }
             if (logoMyLogoAc.abc10011.size() < 0) {
                logoMyLogoAc.abc10011.add("nk. ");
             }
             logoMyLogoAc.abc1000 = 0x3fe9e3d9e628289d;
          }
          abc10091 = logoMyLogoAc.abc10019;
          if (abc10091 != null) {
             abc10091[6] = "ways ";
          }
          logoMyLogoAc.abc1001 = logoMyLogoAc.abc1001 ^ 1;
          if (logoMyLogoAc.abc10011.size() < 8) {
             logoMyLogoAc.abc10011.add(" a book wr");
          }
          logoMyLogoAc.binding.rlSelectAll.setOnClickListener(new LogoMyLogoActivity$e(logoMyLogoAc));
          d = (logoMyLogoAc.abc1000 - 0x3fe7fb7aaa40d752 > 0)? 0x3fd497a5840f9af0: 0x3fd4ca170e478ea0;
          logoMyLogoAc.abc1000 = d;
          if (logoMyLogoAc.abc10018.size() < 0) {
             logoMyLogoAc.abc10018.add(integer1);
          }
          abc10091 = logoMyLogoAc.abc10013;
          if (abc10091 != null) {
             abc10091[i1] = i2;
          }
          logoMyLogoAc.abc2 = "nd";
          abc10091 = logoMyLogoAc.abc1005;
          if (abc10091 != null && abc10091.size() > 0) {
             logoMyLogoAc.abc1005.remove(i2);
          }
          abc10091 = logoMyLogoAc.abc10019;
          if (abc10091 != null) {
             i8 = 9;
             abc10091[i8] = null;
          }else {
             i8 = 9;
          }
          if (logoMyLogoAc.abc10016.size() > i8) {
             logoMyLogoAc.abc10016.add(integer);
          }
          logoMyLogoAc.binding.rlDelete.setOnClickListener(new LogoMyLogoActivity$f(logoMyLogoAc));
          if (logoMyLogoAc.abc1005.size() > i6) {
             logoMyLogoAc.abc1005.add("kind o");
          }
          logoMyLogoAc.abc10014 = i2;
          logoMyLogoAc.abc1007 = 0x3f206530;
          if (!TextUtils.isEmpty(logoMyLogoAc.abc11)) {
             int i11 = (logoMyLogoAc.abc11).length();
             LogoMyLogoActivity abc10017 = logoMyLogoAc.abc10017;
             if (abc10017 == null && abc10017.size() > 0) {
                logoMyLogoAc.abc10017.remove(i2);
             }
             logoMyLogoAc.abc10010 = logoMyLogoAc.abc10010 - 0x3fb326e215371d28;
             if (logoMyLogoAc.abc1008 == null) {
                logoMyLogoAc.abc1008 = new ArrayList();
             }
             logoMyLogoAc.abc11 = logoMyLogoAc.abc11+i11;
             logoMyLogoAc.abc1001 = true;
             logoMyLogoAc.abc1000 = 0x3fbf41559bb27a00;
             if (logoMyLogoAc.abc1006.size() > i5) {
                logoMyLogoAc.abc1006.add(Integer.valueOf(i5));
             }
          }
          double d1 = (logoMyLogoAc.abc10010 - 0x3feae34ef2c9af53 < 0)? 0x3fba1dec7c658778: 0x3fe02f3708e35c84;
          logoMyLogoAc.abc10010 = d1;
          if (logoMyLogoAc.abc1008 == null) {
             logoMyLogoAc.abc1008 = new ArrayList();
          }
          logoMyLogoAc.abc1007 = 0.16f;
          logoMyLogoAc.binding.rlSelectItem.setOnClickListener(new LogoMyLogoActivity$g(logoMyLogoAc));
          LogoMyLogoActivity abc100131 = logoMyLogoAc.abc10013;
          if (abc100131 != null) {
             abc100131[i2] = 1;
          }
          logoMyLogoAc.abc10021 = logoMyLogoAc.abc10021 + 0x3fdffb023d377eb0;
          logoMyLogoAc.abc1007 = 0.07f;
          if (logoMyLogoAc.abc9.size() < 9) {
             logoMyLogoAc.abc9.add(Integer.valueOf(1));
             if (logoMyLogoAc.abc1009 == null) {
                int[] ointArray2 = new int[i];
                logoMyLogoAc.abc1009 = ointArray2;
             }
             if (logoMyLogoAc.abc10017.size() > 0) {
                logoMyLogoAc.abc10017.add(integer1);
             }
             if (logoMyLogoAc.abc1002 == null) {
                String[] stringArray3 = new String[i];
                logoMyLogoAc.abc1002 = stringArray3;
             }
          }
          if (logoMyLogoAc.abc10016.size() > i1) {
             logoMyLogoAc.abc10016.add(Integer.valueOf(8));
          }
          logoMyLogoAc.abc1004 = true;
          logoMyLogoAc.abc1003 = 0x3ef20028;
          logoMyLogoAc.viewModel.initData();
          if (logoMyLogoAc.abc1005 == null) {
             logoMyLogoAc.abc1005 = new ArrayList();
          }
          if (!TextUtils.isEmpty(logoMyLogoAc.abc10023)) {
             logoMyLogoAc.abc10023 = logoMyLogoAc.abc10023+(logoMyLogoAc.abc10023).length();
          }
          logoMyLogoAc.abc1000 = 0x3fedf541230e5167;
          if (logoMyLogoAc.abc9.size() < 6) {
             logoMyLogoAc.abc9.add(integer1);
             if (logoMyLogoAc.abc10018.size() < 9) {
                logoMyLogoAc.abc10018.add(integer1);
             }
             logoMyLogoAc.abc1000 = 0x3fdf32d57217731e;
             abc1009 = logoMyLogoAc.abc1002;
             if (abc1009 != null) {
                abc1009[4] = "that ";
             }
          }
          if (logoMyLogoAc.abc10017 == null) {
             logoMyLogoAc.abc10017 = new ArrayList();
          }
          if (logoMyLogoAc.abc1000 - 0x3fd82370b9604578 < 0) {
             logoMyLogoAc.abc1000 = 0x3fc12c834d7de44c;
          }
          abc1009 = logoMyLogoAc.abc10019;
          if (abc1009 != null) {
             abc1009[8] = " b";
          }
          return;
       }
    }
    public void onStart(){
       super.onStart();
       LogoMyLogoActivity tabc10013 = this.abc10013;
       int i = 2;
       int i1 = 0;
       if (tabc10013 != null) {
          tabc10013[i] = i1;
       }
       this.abc1000 = 0x3fe3a7e29261110e;
       this.abc10010 = this.abc10010 * 0x3fbb5d1b25ca1e20;
       if (this.abc9.size() < i) {
          this.abc9.add(Integer.valueOf(6));
          this.abc1003 = this.abc1003 * 0x3f422362;
          tabc10013 = this.abc1009;
          if (tabc10013 != null) {
             tabc10013[1] = 8;
          }
          if (this.abc10018.size() < 1) {
             this.abc10018.add(Integer.valueOf(5));
          }
       }
       float f = ((double)this.abc10015 - 0x3f80239ff5dcc419 > 0)? 0.10f: 0x3f3a876b;
       this.abc10015 = f;
       this.abc1007 = this.abc1007 - 0x3efea0ba;
       tabc10013 = this.abc10022;
       if (tabc10013 != null) {
          tabc10013[4] = "\'";
       }
       int statusBarHei = this.getStatusBarHeight();
       this.abc10010 = - this.abc10010;
       if (this.abc10011 == null) {
          this.abc10011 = new ArrayList();
       }
       this.abc1004 = this.abc1004 ^ 1;
       this.abc5 = this.abc5 * 0x3f3c6133;
       this.abc1007 = 0x3f278104;
       this.abc1000 = Math.abs(this.abc1000);
       LogoMyLogoActivity tabc1008 = this.abc1008;
       if (tabc1008 != null && tabc1008.size() > 0) {
          this.abc1008.remove(i1);
       }
       ViewGroup$LayoutParams layoutParams = this.binding.statusView.getLayoutParams();
       this.abc10020 = i1;
       if (this.abc1009 == null) {
          int[] ointArray = new int[10];
          this.abc1009 = ointArray;
       }
       this.abc1007 = 0x3f77d9a5;
       double d = (this.abc10 - 0x3fccc7617e7aa36c < 0)? 0x3fe3998208326267: 0x3fed13c93a7249d4;
       this.abc10 = d;
       this.abc10023 = " its plot";
       this.abc10020 = 1 ^ 1;
       layoutParams.height = statusBarHei;
       this.abc10010 = 0x3fdf175afda31f8c;
       this.abc1004 = this.abc1004 ^ 1;
       this.abc10023 = " moderni";
       this.abc0 = this.abc0 - 0x3fe9da446a6e7d11;
       tabc10013 = this.abc1009;
       if (tabc10013 != null) {
          tabc10013[3] = i1;
       }
       if (this.abc10011.size() < 9) {
          this.abc10011.add(" star");
       }
       tabc10013 = this.abc10013;
       if (tabc10013 != null) {
          tabc10013[5] = i1;
       }
       this.binding.statusView.setLayoutParams(layoutParams);
       if (this.abc10019 == null) {
          String[] stringArray = new String[10];
          this.abc10019 = stringArray;
       }
       if ((double)this.abc1007 - 0x3fc4596c82e019b1 > 0) {
          this.abc1007 = 0x3f2c48c3;
       }
       this.abc10020 = this.abc10020 ^ 1;
       this.abc5 = 0x3f512c2c;
       if (this.abc10018 == null) {
          this.abc10018 = new ArrayList();
       }
       tabc10013 = this.abc1002;
       if (tabc10013 != null) {
          tabc10013[1] = null;
       }
       if (tabc10013 != null) {
          tabc10013[8] = null;
       }
       return;
    }
    public void save(di p0){
       try{
          if (BitmapFactory.decodeFile(p0.a().getAbsolutePath()).compress(Bitmap$CompressFormat.PNG, 100, this.getContentResolver().openOutputStream(this.getContentResolver().insert(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, new ContentValues()), "rw"))) {
             LogoMyLogoActivity ttoast = this.toast;
             if (ttoast != null) {
                ttoast.cancel();
             }
             Toast toast = Toast.makeText(this, 0x7f120134, 0);
             this.toast = toast;
             toast.show();
          }else {
             Toast.makeText(this, 0x7f120132, 0).show();
          }
       }catch(java.io.FileNotFoundException e4){
          e4.printStackTrace();
       }
       return;
    }
}
