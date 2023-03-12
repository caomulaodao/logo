package com.logomaster.logomaker.LogoMainActivity;
import com.logomaster.logomaker.base.LogoBaseActivity;
import java.util.ArrayList;
import java.lang.String;
import com.logomaster.logomaker.databinding.ActivityMainBinding;
import com.logomaster.logomaker.LogoMainActivity$c;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import java.lang.Object;
import com.logomaster.logomaker.LogoMainActivity$d;
import android.widget.RelativeLayout;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.logomaster.logomaker.LogoMainActivity$e;
import androidx.drawerlayout.widget.DrawerLayout$DrawerListener;
import androidx.drawerlayout.widget.DrawerLayout;
import android.app.Activity;
import java.lang.CharSequence;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.logomaster.logomaker.vm.LogoMainVM;
import com.logomaster.logomaker.LogoMainActivity$f;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.logomaster.logomaker.LogoMainActivity$g;
import com.logomaster.logomaker.LogoMainActivity$h;
import android.text.TextUtils;
import com.logomaster.logomaker.LogoMainActivity$i;
import android.widget.ImageView;
import com.logomaster.logomaker.LogoMainActivity$j;
import com.logomaster.logomaker.LogoMainActivity$a;
import android.net.Uri;
import android.content.Intent;
import com.facebook.FacebookSdk;
import android.content.Context;
import com.logomaster.logomaker.LogoMainActivity$b;
import com.facebook.applinks.AppLinkData$CompletionHandler;
import com.facebook.applinks.AppLinkData;
import android.content.SharedPreferences;
import java.lang.Math;
import android.app.Dialog;
import com.logomaster.logomaker.config.LogoSettingsActivity;
import java.lang.Class;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import androidx.activity.ComponentActivity;
import android.app.Application;
import com.logomaster.logomaker.config.BaseLogoApplication;
import android.os.Bundle;
import java.lang.Throwable;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModel;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.DataBindingUtil;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.os.PersistableBundle;

public class LogoMainActivity extends LogoBaseActivity	// class@000ccd
{
    public ArrayList abc0;
    public ArrayList abc1;
    public ArrayList abc1000;
    public String[] abc1001;
    public boolean abc10010;
    public String[] abc10011;
    public ArrayList abc1002;
    public ArrayList abc1003;
    public ArrayList abc1004;
    public float abc1005;
    public int[] abc1006;
    public ArrayList abc1007;
    public String[] abc1008;
    public ArrayList abc1009;
    public ArrayList abc2;
    public String abc3;
    public int abc4;
    public float abc5;
    private boolean b;
    public ActivityMainBinding binding;
    public LogoMainVM logoMainVM;
    private ei logoRateUsDialog;
    private fi logoRuleDialog;
    private int startF;
    private static final String TAG = "MainActivity";

    public void LogoMainActivity(){
       super();
       this.abc1000 = new ArrayList();
       this.abc0 = new ArrayList();
       String[] stringArray = new String[17];
       this.abc1001 = stringArray;
       this.abc1002 = new ArrayList();
       this.abc1 = new ArrayList();
       this.abc1003 = new ArrayList();
       this.abc1004 = new ArrayList();
       this.abc2 = new ArrayList();
       this.abc1005 = 0x3f515936;
       int[] ointArray = new int[15];
       this.abc1006 = ointArray;
       this.abc3 = "sdfhpgelaocajkf";
       this.abc1007 = new ArrayList();
       this.b = true;
       String[] stringArray1 = new String[13];
       this.abc1008 = stringArray1;
       this.abc4 = 6;
       this.abc1009 = new ArrayList();
       this.abc10010 = false;
       this.abc5 = 0.22f;
       stringArray = new String[13];
       this.abc10011 = stringArray;
       this.startF = 0;
    }
    public static void access$000(LogoMainActivity p0,String p1){
       p0.logMsg(p1);
    }
    public static int access$100(LogoMainActivity p0){
       return p0.startF;
    }
    public static int access$102(LogoMainActivity p0,int p1){
       p0.startF = p1;
       return p1;
    }
    public static void access$200(LogoMainActivity p0){
       p0.openWebview();
    }
    public static ei access$300(LogoMainActivity p0){
       return p0.logoRateUsDialog;
    }
    public static ei access$302(LogoMainActivity p0,ei p1){
       p0.logoRateUsDialog = p1;
       return p1;
    }
    public static fi access$400(LogoMainActivity p0){
       return p0.logoRuleDialog;
    }
    public static fi access$402(LogoMainActivity p0,fi p1){
       p0.logoRuleDialog = p1;
       return p1;
    }
    private void init(){
       int i2;
       int i3;
       int i6;
       int i7;
       String[] stringArray;
       String[] stringArray1;
       LogoMainActivity abc10061;
       int i8;
       LogoMainActivity logoMainActi = this;
       logoMainActi.binding.llPrivacyPolicy.setOnClickListener(new LogoMainActivity$c(logoMainActi));
       logoMainActi.abc1005 = logoMainActi.abc1005 - 0x3eeeef18;
       if (logoMainActi.abc1004 == null) {
          logoMainActi.abc1004 = new ArrayList();
       }
       LogoMainActivity abc1003 = logoMainActi.abc1003;
       if (abc1003 == null && abc1003.size() > 0) {
          logoMainActi.abc1003.remove(0);
       }
       logoMainActi.abc3 = "5";
       abc1003 = logoMainActi.abc1001;
       int i = 2;
       object oobject = null;
       if (abc1003 != null) {
          abc1003[i] = oobject;
       }
       int i1 = 10;
       if (logoMainActi.abc1006 == null) {
          int[] ointArray = new int[i1];
          logoMainActi.abc1006 = ointArray;
       }
       if (logoMainActi.abc1000 == null) {
          logoMainActi.abc1000 = new ArrayList();
       }
       logoMainActi.binding.rlMore.setOnClickListener(new LogoMainActivity$d(logoMainActi));
       if (logoMainActi.abc10011 != null) {
          i2 = 0;
          while (true) {
             LogoMainActivity abc10011 = logoMainActi.abc10011;
             if (abc10011.length > 3) {
                i3 = 3;
             label_006e :
                if (i2 < i3) {
                   abc10011[i2] = "string"+i2;
                   i2 = i2 + 1;
                }
             }else {
                i3 = abc10011.length;
                goto label_006e ;
             }
          }
       }
       logoMainActi.abc10010 = logoMainActi.abc10010 ^ 1;
       abc1003 = logoMainActi.abc1001;
       if (abc1003 != null) {
          abc1003[4] = oobject;
       }
       if (logoMainActi.abc2.size() > 1) {
          logoMainActi.abc2.add("—TextVi");
          abc1003 = logoMainActi.abc1006;
          if (abc1003 != null) {
             abc1003[4] = 9;
          }
          abc1003 = logoMainActi.abc1009;
          if (abc1003 == null && abc1003.size() > 0) {
             logoMainActi.abc1009.remove(0);
          }
          abc1003 = logoMainActi.abc1009;
          if (abc1003 == null && abc1003.size() > 0) {
             logoMainActi.abc1009.remove(0);
          }
       }
    label_00c6 :
       logoMainActi.abc10010 = false;
       if (logoMainActi.abc1003.size() < 9) {
          logoMainActi.abc1003.add(Integer.valueOf(0));
       }
       logoMainActi.abc1005 = - logoMainActi.abc1005;
       logoMainActi.binding.drawerLayout.addDrawerListener(new LogoMainActivity$e(logoMainActi));
       if (logoMainActi.abc1009 == null) {
          logoMainActi.abc1009 = new ArrayList();
       }
       logoMainActi.abc1005 = 0x3f461be7;
       abc1003 = logoMainActi.abc10011;
       if (abc1003 != null) {
          abc1003[4] = "si";
       }
       logoMainActi.abc5 = logoMainActi.abc5 + 0.08f;
       abc1003 = logoMainActi.abc1004;
       if (abc1003 == null && abc1003.size() > 0) {
          logoMainActi.abc1004.remove(0);
       }
       int i4 = 5;
       if (logoMainActi.abc1007.size() < 0) {
          logoMainActi.abc1007.add(Integer.valueOf(i4));
       }
       abc1003 = logoMainActi.abc1006;
       if (abc1003 != null) {
          abc1003[i] = 0;
       }
       String str = logoMainActi.getString(0x7f12001d)+": ";
       LogoMainActivity abc1008 = logoMainActi.abc1008;
       int i5 = 7;
       if (abc1008 != null) {
          abc1008[i5] = "racters ";
       }
       abc1008 = logoMainActi.abc1004;
       if (abc1008 == null && abc1008.size() > 0) {
          logoMainActi.abc1004.remove(0);
       }
       if (logoMainActi.abc1006 != null) {
          i6 = 0;
          while (true) {
             LogoMainActivity abc1006 = logoMainActi.abc1006;
             if (abc1006.length > 3) {
                i7 = 3;
             label_016e :
                if (i6 < i7) {
                   abc1006[i6] = i;
                   i6 = i6 + 1;
                }
             }else {
                i7 = abc1006.length;
                goto label_016e ;
             }
          }
       }
       if (logoMainActi.abc0.size() < 1) {
          logoMainActi.abc0.add("t");
          logoMainActi.abc1005 = 0x3f6ad7ef;
          abc1008 = logoMainActi.abc1004;
          if (abc1008 == null && abc1008.size() > 0) {
             logoMainActi.abc1004.remove(0);
          }
          if (logoMainActi.abc1007 == null) {
             logoMainActi.abc1007 = new ArrayList();
          }
       }
       if (logoMainActi.abc1004 == null) {
          logoMainActi.abc1004 = new ArrayList();
       }
       abc1008 = logoMainActi.abc1008;
       if (abc1008 != null) {
          abc1008[9] = oobject;
       }
       logoMainActi.abc1005 = logoMainActi.abc1005 * 0x3f7592f5;
       if (logoMainActi.b != null) {
          str = str+vh.b;
          if (logoMainActi.abc1007.size() > 0) {
             logoMainActi.abc1007.add(Integer.valueOf(1));
          }
          if (logoMainActi.abc1007.size() > 1) {
             logoMainActi.abc1007.add(Integer.valueOf(i4));
          }
          abc1008 = logoMainActi.abc1000;
          if (abc1008 != null && abc1008.size() > 0) {
             logoMainActi.abc1000.remove(0);
          }
          logoMainActi.abc5 = 0x3f0f1774;
          logoMainActi.abc10010 = logoMainActi.abc10010 ^ 1;
          if (logoMainActi.abc1001 == null) {
             stringArray = new String[i1];
             logoMainActi.abc1001 = stringArray;
          }
          if (logoMainActi.abc1002.size() > 9) {
             logoMainActi.abc1002.add(Integer.valueOf(6));
          }
       }
       abc1008 = logoMainActi.abc1000;
       if (abc1008 != null && abc1008.size() > 0) {
          logoMainActi.abc1000.remove(0);
       }
       abc1008 = logoMainActi.abc1003;
       if (abc1008 == null && abc1008.size() > 0) {
          logoMainActi.abc1003.remove(0);
       }
       if (logoMainActi.abc1008 == null) {
          stringArray = new String[i1];
          logoMainActi.abc1008 = stringArray;
       }
       abc1008 = logoMainActi.abc2;
       if (abc1008 != null && abc1008.size() > 0) {
          logoMainActi.abc2.remove(0);
          abc1008 = logoMainActi.abc1007;
          if (abc1008 == null && abc1008.size() > 0) {
             logoMainActi.abc1007.remove(0);
          }
          if (logoMainActi.abc1004 == null) {
             logoMainActi.abc1004 = new ArrayList();
          }
          if (logoMainActi.abc1007 == null) {
             logoMainActi.abc1007 = new ArrayList();
          }
       }
    label_0280 :
       if (logoMainActi.abc1001 != null) {
          i6 = 0;
          while (true) {
             LogoMainActivity abc1001 = logoMainActi.abc1001;
             if (abc1001.length > 3) {
                i4 = 3;
             label_028d :
                if (i6 < i4) {
                   abc1001[i6] = "string"+i6;
                   i6 = i6 + 1;
                   i4 = 5;
                }
             }else {
                i4 = abc1001.length;
                goto label_028d ;
             }
          }
       }
       logoMainActi.abc1005 = logoMainActi.abc1005 + 0.09f;
       LogoMainActivity abc1004 = logoMainActi.abc1004;
       if (abc1004 == null && abc1004.size() > 0) {
          logoMainActi.abc1004.remove(0);
       }
       logoMainActi.binding.tvVersion.setText(str);
       logoMainActi.abc1005 = - logoMainActi.abc1005;
       abc1003 = logoMainActi.abc1003;
       if (abc1003 == null && abc1003.size() > 0) {
          logoMainActi.abc1003.remove(0);
       }
       logoMainActi.abc1005 = logoMainActi.abc1005 + 0.46f;
       abc1003 = logoMainActi.abc1;
       if (abc1003 == null && abc1003.size() > 0) {
          logoMainActi.abc1.remove(0);
          if ((double)logoMainActi.abc1005 - 0x3fdb7b9044305b92 > 0) {
             logoMainActi.abc1005 = 0.03f;
          }
          abc1003 = logoMainActi.abc1006;
          if (abc1003 != null) {
             abc1003[i] = i;
          }
          if (logoMainActi.abc1001 == null) {
             stringArray1 = new String[i1];
             logoMainActi.abc1001 = stringArray1;
          }
       }
    label_030c :
       if (logoMainActi.abc1003.size() > 0) {
          logoMainActi.abc1003.add(Integer.valueOf(6));
       }
       logoMainActi.abc10010 = logoMainActi.abc10010 ^ 1;
       abc1003 = logoMainActi.abc1001;
       if (abc1003 != null) {
          abc1003[3] = oobject;
       }
       logoMainActi.logoMainVM.getIsShowRateUsDialog().observe(logoMainActi, new LogoMainActivity$f(logoMainActi));
       abc1003 = logoMainActi.abc1007;
       if (abc1003 == null && abc1003.size() > 0) {
          logoMainActi.abc1007.remove(0);
       }
       if (logoMainActi.abc1004 == null) {
          logoMainActi.abc1004 = new ArrayList();
       }
       abc1003 = logoMainActi.abc1003;
       if (abc1003 == null && abc1003.size() > 0) {
          logoMainActi.abc1003.remove(0);
       }
       if (logoMainActi.abc2.size() > 3) {
          logoMainActi.abc2.add("werooo!");
          if (logoMainActi.abc1004 == null) {
             logoMainActi.abc1004 = new ArrayList();
          }
          logoMainActi.abc10010 = false;
          abc1003 = logoMainActi.abc1008;
          if (abc1003 != null) {
             abc1003[i5] = oobject;
          }
       }
       if (logoMainActi.abc1003 == null) {
          logoMainActi.abc1003 = new ArrayList();
       }
       float f = ((double)logoMainActi.abc1005 - 0x3fe72dbf55ebc4e0 > 0)? 0x3f08cd99: 0x3f1b867e;
       logoMainActi.abc1005 = f;
       logoMainActi.abc10010 = false;
       logoMainActi.logoMainVM.getIsShowRuleDialog().observe(logoMainActi, new LogoMainActivity$g(logoMainActi));
       abc1003 = logoMainActi.abc1002;
       if (abc1003 == null && abc1003.size() > 0) {
          logoMainActi.abc1002.remove(0);
       }
       abc1003 = logoMainActi.abc1004;
       if (abc1003 == null && abc1003.size() > 0) {
          logoMainActi.abc1004.remove(0);
       }
       abc1003 = logoMainActi.abc1006;
       if (abc1003 != null) {
          abc1003[8] = 0;
       }
       if (logoMainActi.abc2.size() > 6) {
          logoMainActi.abc2.add("ttr f");
          abc1003 = logoMainActi.abc1008;
          if (abc1003 != null) {
             abc1003[i5] = oobject;
          }
          abc1003 = logoMainActi.abc1003;
          if (abc1003 == null && abc1003.size() > 0) {
             logoMainActi.abc1003.remove(0);
          }
          abc1003 = logoMainActi.abc1006;
          if (abc1003 != null) {
             abc1003[6] = 0;
          }
       }
       if (logoMainActi.abc1002.size() > 3) {
          logoMainActi.abc1002.add(Integer.valueOf(0));
       }
       abc1003 = logoMainActi.abc1006;
       if (abc1003 != null) {
          abc1003[i5] = 0;
       }
       if (logoMainActi.abc10011 == null) {
          stringArray1 = new String[i1];
          logoMainActi.abc10011 = stringArray1;
       }
       logoMainActi.logoMainVM.getIsToShareApp().observe(logoMainActi, new LogoMainActivity$h(logoMainActi));
       abc1003 = logoMainActi.abc1002;
       if (abc1003 == null && abc1003.size() > 0) {
          logoMainActi.abc1002.remove(0);
       }
       abc1003 = logoMainActi.abc1003;
       if (abc1003 == null && abc1003.size() > 0) {
          logoMainActi.abc1003.remove(0);
       }
       abc1003 = logoMainActi.abc1002;
       if (abc1003 == null && abc1003.size() > 0) {
          logoMainActi.abc1002.remove(0);
       }
       if (!TextUtils.isEmpty(logoMainActi.abc3)) {
          i2 = (logoMainActi.abc3).length();
          abc1008 = logoMainActi.abc1000;
          if (abc1008 != null && abc1008.size() > 0) {
             logoMainActi.abc1000.remove(0);
          }
          abc1008 = logoMainActi.abc1002;
          if (abc1008 == null && abc1008.size() > 0) {
             logoMainActi.abc1002.remove(0);
          }
          if (logoMainActi.abc1009.size() > 6) {
             logoMainActi.abc1009.add(Integer.valueOf(0));
          }
          logoMainActi.abc3 = logoMainActi.abc3+i2;
          if (logoMainActi.abc1003 == null) {
             logoMainActi.abc1003 = new ArrayList();
          }
          logoMainActi.abc10010 = false;
          if (logoMainActi.abc1000.size() > 8) {
             logoMainActi.abc1000.add("re");
          }
       }
       abc1003 = logoMainActi.abc1008;
       if (abc1003 != null) {
          abc1003[9] = oobject;
       }
       if (logoMainActi.abc1001 != null) {
          i2 = 0;
          while (true) {
             abc1008 = logoMainActi.abc1001;
             if (abc1008.length > 3) {
                i7 = 3;
             label_04da :
                if (i2 < i7) {
                   abc1008[i2] = "string"+i2;
                   i2 = i2 + 1;
                }
             }else {
                i7 = abc1008.length;
                goto label_04da ;
             }
          }
       }
       if (logoMainActi.abc1008 == null) {
          stringArray1 = new String[i1];
          logoMainActi.abc1008 = stringArray1;
       }
       logoMainActi.binding.ivCreate.setOnClickListener(new LogoMainActivity$i(logoMainActi));
       if ((double)logoMainActi.abc1005 - 0x3fdd3559fef9f09c < 0) {
          logoMainActi.abc1005 = 0x3f3b70bb;
       }
       logoMainActi.abc10010 = true;
       if (logoMainActi.abc1001 == null) {
          stringArray1 = new String[i1];
          logoMainActi.abc1001 = stringArray1;
       }
       if (logoMainActi.abc1.size() < 4) {
          logoMainActi.abc1.add(Integer.valueOf(5));
          if (logoMainActi.abc1004 == null) {
             logoMainActi.abc1004 = new ArrayList();
          }
          if (logoMainActi.abc1008 == null) {
             stringArray1 = new String[i1];
             logoMainActi.abc1008 = stringArray1;
          }
          abc1003 = logoMainActi.abc1008;
          if (abc1003 != null) {
             abc1003[6] = "ny ways de";
          }
       }
       if (logoMainActi.abc1009.size() > 6) {
          logoMainActi.abc1009.add(Integer.valueOf(8));
       }
       if (logoMainActi.abc1004.size() > 9) {
          logoMainActi.abc1004.add(Integer.valueOf(1));
       }
       if (logoMainActi.abc1002 == null) {
          logoMainActi.abc1002 = new ArrayList();
       }
       logoMainActi.binding.ivDesign.setOnClickListener(new LogoMainActivity$j(logoMainActi));
       abc1003 = logoMainActi.abc1003;
       if (abc1003 == null && abc1003.size() > 0) {
          logoMainActi.abc1003.remove(0);
       }
       logoMainActi.abc1005 = logoMainActi.abc1005 * 0x3f68092f;
       logoMainActi.abc10010 = logoMainActi.abc10010 ^ 1;
       if (logoMainActi.abc4 < 9) {
          i5 = 4;
       }
       logoMainActi.abc4 = i5;
       abc1003 = logoMainActi.abc1000;
       if (abc1003 != null && abc1003.size() > 0) {
          logoMainActi.abc1000.remove(0);
       }
       if (logoMainActi.abc1009.size() > 4) {
          logoMainActi.abc1009.add(Integer.valueOf(1));
       }
       if (logoMainActi.abc1007 == null) {
          logoMainActi.abc1007 = new ArrayList();
       }
       logoMainActi.binding.ivMyLogo.setOnClickListener(new LogoMainActivity$a(logoMainActi));
       if (logoMainActi.abc1003.size() < 1) {
          logoMainActi.abc1003.add(Integer.valueOf(3));
       }
       if (logoMainActi.abc1002 == null) {
          logoMainActi.abc1002 = new ArrayList();
       }
       if (logoMainActi.abc1006 != null) {
          i2 = 0;
          while (true) {
             abc10061 = logoMainActi.abc1006;
             if (abc10061.length > 3) {
                i8 = 3;
             label_0608 :
                if (i2 < i8) {
                   abc10061[i2] = 8;
                   i2 = i2 + 1;
                }
             }else {
                i8 = abc10061.length;
                goto label_0608 ;
             }
          }
       }
       i2 = 0;
       abc10061 = logoMainActi.abc4;
       while (i2 < abc10061) {
          i = abc10061 - 7;
          logoMainActi.abc4 = i;
          logoMainActi.abc10010 = true;
          if (logoMainActi.abc1006 != null) {
             i = 0;
             while (true) {
                LogoMainActivity abc10062 = logoMainActi.abc1006;
                if (abc10062.length > 3) {
                   i5 = 3;
                label_0627 :
                   if (i < i5) {
                      abc10062[i] = 4;
                      i = i + 1;
                   }
                }else {
                   i5 = abc10062.length;
                   goto label_0627 ;
                }
             }
          }
          float f1 = - logoMainActi.abc1005;
          logoMainActi.abc1005 = f1;
          i2 = i2 + 1;
       }
       if (logoMainActi.abc1006 != null) {
          i2 = 0;
          while (true) {
             abc10061 = logoMainActi.abc1006;
             if (abc10061.length > 3) {
                i8 = 3;
             label_0643 :
                if (i2 < i8) {
                   abc10061[i2] = 8;
                   i2 = i2 + 1;
                }
             }else {
                i8 = abc10061.length;
                goto label_0643 ;
             }
          }
       }
       logoMainActi.abc10010 = false;
       logoMainActi.logoMainVM.initData();
       if (logoMainActi.abc1009 == null) {
          logoMainActi.abc1009 = new ArrayList();
       }
       if (logoMainActi.abc1008 == null) {
          stringArray1 = new String[i1];
          logoMainActi.abc1008 = stringArray1;
       }
       logoMainActi.abc10010 = true;
       i2 = 0;
       while (i2 < logoMainActi.abc4) {
          if (logoMainActi.abc2.size() > 8) {
             logoMainActi.abc2.add("ppcom");
             abc10061 = logoMainActi.abc1004;
             if (abc10061 == null && abc10061.size() > 0) {
                logoMainActi.abc1004.remove(0);
             }
             logoMainActi.abc1005 = 0.27f;
             logoMainActi.abc10010 = false;
          }
          abc10061 = logoMainActi.abc10011;
          i8 = 2;
          if (abc10061 != null) {
             abc10061[i8] = null;
          }
          abc10061 = logoMainActi.abc1002;
          if (abc10061 == null && abc10061.size() > 0) {
             logoMainActi.abc1002.remove(0);
          }
          abc10061 = logoMainActi.abc10011;
          if (abc10061 != null) {
             abc10061[4] = "ear";
          }
          i2 = i2 + 1;
       }
       abc1003 = logoMainActi.abc1000;
       if (abc1003 != null && abc1003.size() > 0) {
          logoMainActi.abc1000.remove(0);
       }
       if (logoMainActi.abc1007.size() < 9) {
          logoMainActi.abc1007.add(Integer.valueOf(5));
       }
       if (logoMainActi.abc1007 == null) {
          logoMainActi.abc1007 = new ArrayList();
       }
       this.checkedStatement();
       logoMainActi.abc10010 = logoMainActi.abc10010 ^ 1;
       if (logoMainActi.abc1001 != null) {
          i2 = 0;
          while (true) {
             abc10061 = logoMainActi.abc1001;
             if (abc10061.length > 3) {
                i8 = 3;
             label_06f3 :
                if (i2 < i8) {
                   abc10061[i2] = "string"+i2;
                   i2 = i2 + 1;
                }
             }else {
                i8 = abc10061.length;
                goto label_06f3 ;
             }
          }
       }
       abc1003 = logoMainActi.abc1004;
       if (abc1003 == null && abc1003.size() > 0) {
          logoMainActi.abc1004.remove(0);
       }
       if (logoMainActi.abc0.size() < 1) {
          logoMainActi.abc0.add("ephoto\x71\x02\x72\x02\x00");
          if (logoMainActi.abc1009 == null) {
             logoMainActi.abc1009 = new ArrayList();
          }
          abc1003 = logoMainActi.abc1002;
          if (abc1003 == null && abc1003.size() > 0) {
             logoMainActi.abc1002.remove(0);
          }
          if (logoMainActi.abc1003 == null) {
             logoMainActi.abc1003 = new ArrayList();
          }
       }
       logoMainActi.abc1005 = (logoMainActi.abc1005 - 0x3f5152f1) - 0x3f4c2db8;
       abc1003 = logoMainActi.abc1004;
       if (abc1003 == null && abc1003.size() > 0) {
          logoMainActi.abc1004.remove(0);
       }
       return;
    }
    private void logMsg(String p0){
       int[] ointArray;
       LogoMainActivity tabc1004;
       boolean b = false;
       this.abc10010 = b;
       int i = 10;
       if (this.abc1006 == null) {
          ointArray = new int[i];
          this.abc1006 = ointArray;
       }
       this.abc10010 = 0 ^ 1;
       if (this.abc2.size() > 8) {
          this.abc2.add("t=dime");
          if (this.abc1003.size() < 1) {
             this.abc1003.add(Integer.valueOf(1));
          }
          tabc1004 = this.abc1004;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1004.remove(b);
          }
          tabc1004 = this.abc1002;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1002.remove(b);
          }
       }
    label_0052 :
       if (this.abc1002.size() > 9) {
          this.abc1002.add(Integer.valueOf(8));
       }
       tabc1004 = this.abc1008;
       if (tabc1004 != null) {
          tabc1004[2] = "t ";
       }
       if (this.abc1003.size() < 9) {
          this.abc1003.add(Integer.valueOf(5));
       }
       this.abc10010 = b;
       if (this.abc1006 == null) {
          ointArray = new int[i];
          this.abc1006 = ointArray;
       }
       this.abc10010 = 0 ^ 1;
       if (this.abc2.size() > 8) {
          this.abc2.add("t=dime");
          if (this.abc1003.size() < 1) {
             this.abc1003.add(Integer.valueOf(1));
          }
          tabc1004 = this.abc1004;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1004.remove(b);
          }
          tabc1004 = this.abc1002;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1002.remove(b);
          }
       }
    label_00ca :
       if (this.abc1002.size() > 9) {
          this.abc1002.add(Integer.valueOf(8));
       }
       LogoMainActivity tabc1008 = this.abc1008;
       if (tabc1008 != null) {
          tabc1008[2] = "t ";
       }
       if (this.abc1003.size() < 9) {
          this.abc1003.add(Integer.valueOf(5));
       }
       return;
    }
    private void openWebview(){
       int i5;
       int i6;
       LogoMainActivity tabc10011;
       int i7;
       LogoMainActivity tabc10011;
       Uri uri = Uri.parse("https://sites.google.com/view/logo-master2");
       int i = 6;
       if (this.abc1004.size() > i) {
          this.abc1004.add(Integer.valueOf(7));
       }
       LogoMainActivity tabc1008 = this.abc1008;
       if (tabc1008 != null) {
          tabc1008[i] = "miliar wit";
       }
       int i1 = 3;
       if (this.abc1004.size() < i1) {
          this.abc1004.add(Integer.valueOf(8));
       }
       int i2 = 10;
       int i3 = 1;
       if (this.abc0 == null) {
          this.abc0 = new ArrayList();
          if (this.abc1001 == null) {
             String[] stringArray = new String[i2];
             this.abc1001 = stringArray;
          }
          if (this.abc1007.size() > i3) {
             this.abc1007.add(Integer.valueOf(0));
          }
          tabc1008 = this.abc1002;
          if (tabc1008 == null && tabc1008.size() > 0) {
             this.abc1002.remove(0);
          }
       }
    label_006c :
       if (this.abc1000 == null) {
          this.abc1000 = new ArrayList();
       }
       if (this.abc1001 != null) {
          int i4 = 0;
          while (true) {
             LogoMainActivity tabc1001 = this.abc1001;
             if (tabc1001.length > i1) {
                i5 = i1;
             label_0086 :
                if (i4 < i5) {
                   tabc1001[i4] = "string"+i4;
                   i4 = i4 + 1;
                }
             }else {
                i5 = tabc1001.length;
                goto label_0086 ;
             }
          }
       }
       if (this.abc1009.size() > i3) {
          this.abc1009.add(Integer.valueOf(2));
       }
       Intent intent = new Intent("android.intent.action.VIEW", uri);
       if (this.abc1008 == null) {
          String[] stringArray1 = new String[i2];
          this.abc1008 = stringArray1;
       }
       this.abc10010 = this.abc10010 ^ i3;
       if (this.abc1001 != null) {
          i6 = 0;
          while (true) {
             tabc10011 = this.abc1001;
             if (tabc10011.length > i1) {
                i7 = i1;
             label_00cf :
                if (i6 < i7) {
                   tabc10011[i6] = "string"+i6;
                   i6 = i6 + 1;
                }
             }else {
                i7 = tabc10011.length;
                goto label_00cf ;
             }
          }
       }
       this.abc5 = 0x3f7713f2;
       tabc10011 = this.abc10011;
       if (tabc10011 != null) {
          tabc10011[9] = "ly until y";
       }
       if (this.abc1002 == null) {
          this.abc1002 = new ArrayList();
       }
       float f = ((double)this.abc1005 - 0x3fdff8b182189e87 < 0)? 0x3f61a4b4: 0.24f;
       this.abc1005 = f;
       this.startActivity(intent);
       if (this.abc1006 == null) {
          int[] ointArray = new int[i2];
          this.abc1006 = ointArray;
       }
       if (this.abc10011 != null) {
          i6 = 0;
          while (true) {
             tabc1008 = this.abc10011;
             if (tabc1008.length > i1) {
                i2 = i1;
             label_012c :
                if (i6 < i2) {
                   tabc1008[i6] = "string"+i6;
                   i6 = i6 + 1;
                }
             }else {
                i2 = tabc1008.length;
                goto label_012c ;
             }
          }
       }
       if (this.abc1002 == null) {
          this.abc1002 = new ArrayList();
       }
       if ((double)this.abc5 - 0x3fd62f117afca07a < 0) {
          this.abc5 = 0x3f6f17fb;
          tabc10011 = this.abc10011;
          if (tabc10011 != null) {
             tabc10011[8] = "u";
          }
          tabc10011 = this.abc1002;
          if (tabc10011 == null && tabc10011.size() > 0) {
             this.abc1002.remove(0);
          }
          tabc10011 = this.abc1006;
          if (tabc10011 != null) {
             tabc10011[0] = 4;
          }
       }
       if (this.abc1007 == null) {
          this.abc1007 = new ArrayList();
       }
       if (this.abc1009.size() < 8) {
          this.abc1009.add(Integer.valueOf(8));
       }
       tabc10011 = this.abc1000;
       if (tabc10011 != null && tabc10011.size() > 0) {
          this.abc1000.remove(0);
       }
       return;
    }
    private void startFB(){
       int[] ointArray;
       LogoMainActivity tabc1004;
       LogoMainActivity tabc1008;
       boolean b = false;
       this.abc10010 = b;
       int i = 10;
       if (this.abc1006 == null) {
          ointArray = new int[i];
          this.abc1006 = ointArray;
       }
       this.abc10010 = 0 ^ 1;
       if (this.abc2.size() > 8) {
          this.abc2.add("t=dime");
          if (this.abc1003.size() < 1) {
             this.abc1003.add(Integer.valueOf(1));
          }
          tabc1004 = this.abc1004;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1004.remove(b);
          }
          tabc1004 = this.abc1002;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1002.remove(b);
          }
       }
    label_0052 :
       if (this.abc1002.size() > 9) {
          this.abc1002.add(Integer.valueOf(8));
       }
       tabc1004 = this.abc1008;
       if (tabc1004 != null) {
          tabc1004[2] = "t ";
       }
       if (this.abc1003.size() < 9) {
          this.abc1003.add(Integer.valueOf(5));
       }
       this.startF = so.a("LoGoData", b).b("lo_f");
       this.abc10010 = b;
       if (this.abc1006 == null) {
          ointArray = new int[i];
          this.abc1006 = ointArray;
       }
       this.abc10010 = 0 ^ 1;
       if (this.abc2.size() > 8) {
          this.abc2.add("t=dime");
          if (this.abc1003.size() < 1) {
             this.abc1003.add(Integer.valueOf(1));
          }
          tabc1004 = this.abc1004;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1004.remove(b);
          }
          tabc1004 = this.abc1002;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1002.remove(b);
          }
       }
    label_00d8 :
       if (this.abc1002.size() > 9) {
          this.abc1002.add(Integer.valueOf(8));
       }
       tabc1004 = this.abc1008;
       if (tabc1004 != null) {
          tabc1004[2] = "t ";
       }
       if (this.abc1003.size() < 9) {
          this.abc1003.add(Integer.valueOf(5));
       }
       this.logMsg("startF:"+this.startF);
       this.abc10010 = b;
       if (this.abc1006 == null) {
          ointArray = new int[i];
          this.abc1006 = ointArray;
       }
       this.abc10010 = 0 ^ 1;
       if (this.abc2.size() > 8) {
          this.abc2.add("t=dime");
          if (this.abc1003.size() < 1) {
             this.abc1003.add(Integer.valueOf(1));
          }
          tabc1004 = this.abc1004;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1004.remove(b);
          }
          tabc1004 = this.abc1002;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1002.remove(b);
          }
       }
    label_0160 :
       if (this.abc1002.size() > 9) {
          this.abc1002.add(Integer.valueOf(8));
       }
       tabc1004 = this.abc1008;
       if (tabc1004 != null) {
          tabc1004[2] = "t ";
       }
       if (this.abc1003.size() < 9) {
          this.abc1003.add(Integer.valueOf(5));
       }
       if (this.startF > null) {
          this.abc10010 = b;
          if (this.abc1006 == null) {
             ointArray = new int[i];
             this.abc1006 = ointArray;
          }
          this.abc10010 = 0 ^ 1;
          if (this.abc2.size() > 8) {
             this.abc2.add("t=dime");
             if (this.abc1003.size() < 1) {
                this.abc1003.add(Integer.valueOf(1));
             }
             tabc1004 = this.abc1004;
             if (tabc1004 == null && tabc1004.size() > 0) {
                this.abc1004.remove(b);
             }
             tabc1004 = this.abc1002;
             if (tabc1004 == null && tabc1004.size() > 0) {
                this.abc1002.remove(b);
             }
          }
       label_01d6 :
          if (this.abc1002.size() > 9) {
             this.abc1002.add(Integer.valueOf(8));
          }
          tabc1008 = this.abc1008;
          if (tabc1008 != null) {
             tabc1008[2] = "t ";
          }
          if (this.abc1003.size() < 9) {
             this.abc1003.add(Integer.valueOf(5));
          }
          return;
       }else {
          this.abc10010 = b;
          if (this.abc1006 == null) {
             ointArray = new int[i];
             this.abc1006 = ointArray;
          }
          this.abc10010 = 0 ^ 1;
          if (this.abc2.size() > 8) {
             this.abc2.add("t=dime");
             if (this.abc1003.size() < 1) {
                this.abc1003.add(Integer.valueOf(1));
             }
             tabc1004 = this.abc1004;
             if (tabc1004 == null && tabc1004.size() > 0) {
                this.abc1004.remove(b);
             }
             tabc1004 = this.abc1002;
             if (tabc1004 == null && tabc1004.size() > 0) {
                this.abc1002.remove(b);
             }
          }
       label_0249 :
          if (this.abc1002.size() > 9) {
             this.abc1002.add(Integer.valueOf(8));
          }
          tabc1004 = this.abc1008;
          if (tabc1004 != null) {
             tabc1004[2] = "t ";
          }
          if (this.abc1003.size() < 9) {
             this.abc1003.add(Integer.valueOf(5));
          }
          FacebookSdk.setAutoInitEnabled(1);
          this.abc10010 = b;
          if (this.abc1006 == null) {
             ointArray = new int[i];
             this.abc1006 = ointArray;
          }
          this.abc10010 = 0 ^ 1;
          if (this.abc2.size() > 8) {
             this.abc2.add("t=dime");
             if (this.abc1003.size() < 1) {
                this.abc1003.add(Integer.valueOf(1));
             }
             tabc1004 = this.abc1004;
             if (tabc1004 == null && tabc1004.size() > 0) {
                this.abc1004.remove(b);
             }
             tabc1004 = this.abc1002;
             if (tabc1004 == null && tabc1004.size() > 0) {
                this.abc1002.remove(b);
             }
          }
       label_02be :
          if (this.abc1002.size() > 9) {
             this.abc1002.add(Integer.valueOf(8));
          }
          tabc1004 = this.abc1008;
          if (tabc1004 != null) {
             tabc1004[2] = "t ";
          }
          if (this.abc1003.size() < 9) {
             this.abc1003.add(Integer.valueOf(5));
          }
          FacebookSdk.fullyInitialize();
          this.abc10010 = b;
          if (this.abc1006 == null) {
             ointArray = new int[i];
             this.abc1006 = ointArray;
          }
          this.abc10010 = 0 ^ 1;
          if (this.abc2.size() > 8) {
             this.abc2.add("t=dime");
             if (this.abc1003.size() < 1) {
                this.abc1003.add(Integer.valueOf(1));
             }
             tabc1004 = this.abc1004;
             if (tabc1004 == null && tabc1004.size() > 0) {
                this.abc1004.remove(b);
             }
             tabc1004 = this.abc1002;
             if (tabc1004 == null && tabc1004.size() > 0) {
                this.abc1002.remove(b);
             }
          }
       label_0333 :
          if (this.abc1002.size() > 9) {
             this.abc1002.add(Integer.valueOf(8));
          }
          tabc1004 = this.abc1008;
          if (tabc1004 != null) {
             tabc1004[2] = "t ";
          }
          if (this.abc1003.size() < 9) {
             this.abc1003.add(Integer.valueOf(5));
          }
          AppLinkData.fetchDeferredAppLinkData(this.getApplicationContext(), new LogoMainActivity$b(this));
          this.abc10010 = b;
          if (this.abc1006 == null) {
             ointArray = new int[i];
             this.abc1006 = ointArray;
          }
          this.abc10010 = 0 ^ 1;
          if (this.abc2.size() > 8) {
             this.abc2.add("t=dime");
             if (this.abc1003.size() < 1) {
                this.abc1003.add(Integer.valueOf(1));
             }
             tabc1004 = this.abc1004;
             if (tabc1004 == null && tabc1004.size() > 0) {
                this.abc1004.remove(b);
             }
             tabc1004 = this.abc1002;
             if (tabc1004 == null && tabc1004.size() > 0) {
                this.abc1002.remove(b);
             }
          }
       label_03b1 :
          if (this.abc1002.size() > 9) {
             this.abc1002.add(Integer.valueOf(8));
          }
          tabc1008 = this.abc1008;
          if (tabc1008 != null) {
             tabc1008[2] = "t ";
          }
          if (this.abc1003.size() < 9) {
             this.abc1003.add(Integer.valueOf(5));
          }
          return;
       }
    }
    public void checkedStatement(){
       int i3;
       LogoMainActivity abc1001;
       int i4;
       LogoMainActivity abc10061;
       String[] stringArray;
       int[] ointArray;
       int[] ointArray1;
       LogoMainActivity abc1004;
       Activity uActivity = this;
       int i = 0;
       SharedPreferences sharedPrefer = uActivity.getSharedPreferences("logo_master", i);
       LogoMainActivity abc1006 = uActivity.abc1006;
       int i1 = 1;
       Integer integer = Integer.valueOf(i1);
       if (abc1006 != null) {
          abc1006[i1] = i;
       }
       abc1006 = uActivity.abc1003;
       if (abc1006 == null && abc1006.size() > 0) {
          uActivity.abc1003.remove(i);
       }
       if (uActivity.abc1003 == null) {
          uActivity.abc1003 = new ArrayList();
       }
       int i2 = 3;
       if (uActivity.abc2.size() > i1) {
          uActivity.abc2.add("2css-");
          uActivity.abc1005 = Math.abs(uActivity.abc1005);
          abc1006 = uActivity.abc1003;
          if (abc1006 == null && abc1006.size() > 0) {
             uActivity.abc1003.remove(i);
          }
          if (uActivity.abc1001 != null) {
             i3 = i;
             while (true) {
                abc1001 = uActivity.abc1001;
                if (abc1001.length > i2) {
                   i4 = i2;
                label_0064 :
                   if (i3 < i4) {
                      abc1001[i3] = "string"+i3;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = abc1001.length;
                   goto label_0064 ;
                }
             }
          }
       }
    label_007a :
       abc1006 = uActivity.abc1009;
       if (abc1006 == null && abc1006.size() > 0) {
          uActivity.abc1009.remove(i);
       }
       if (uActivity.abc10011 != null) {
          i3 = i;
          while (true) {
             abc1001 = uActivity.abc10011;
             if (abc1001.length > i2) {
                i4 = i2;
             label_0096 :
                if (i3 < i4) {
                   abc1001[i3] = "string"+i3;
                   i3 = i3 + 1;
                }
             }else {
                i4 = abc1001.length;
                goto label_0096 ;
             }
          }
       }
       abc1006 = uActivity.abc10011;
       object oobject = null;
       if (abc1006 != null) {
          abc1006[i] = oobject;
       }
       boolean booleanx = sharedPrefer.getBoolean("isAgree", i);
       uActivity.abc10010 = uActivity.abc10010 ^ i1;
       abc1006 = uActivity.abc1004;
       if (abc1006 == null && abc1006.size() > 0) {
          uActivity.abc1004.remove(i);
       }
       if (uActivity.abc1000 == null) {
          uActivity.abc1000 = new ArrayList();
       }
       if ((double)uActivity.abc5 - 0x3fe15ff964db4bec < 0) {
          uActivity.abc5 = 0x3f7a16b2;
          abc1006 = uActivity.abc1008;
          if (abc1006 != null) {
             abc1006[5] = "d to";
          }
          abc1006 = uActivity.abc1001;
          if (abc1006 != null) {
             abc1006[4] = oobject;
          }
          abc1006 = uActivity.abc1006;
          if (abc1006 != null) {
             abc1006[i2] = 6;
          }
       }
       if (uActivity.abc1009.size() < 8) {
          uActivity.abc1009.add(Integer.valueOf(9));
       }
       if (uActivity.abc1000.size() < 9) {
          uActivity.abc1000.add("oba");
       }
       if (uActivity.abc1004 == null) {
          uActivity.abc1004 = new ArrayList();
       }
       i3 = 10;
       if (!booleanx) {
          if (uActivity.logoRuleDialog == null) {
             uActivity.logoRuleDialog = new fi(uActivity);
             abc10061 = uActivity.abc1006;
             if (abc10061 != null) {
                abc10061[i1] = i;
             }
             abc10061 = uActivity.abc1001;
             if (abc10061 != null) {
                abc10061[i1] = "re forced ";
             }
             if (uActivity.abc1004.size() > 9) {
                uActivity.abc1004.add(Integer.valueOf(i));
             }
             uActivity.abc3 = "\x5e\x02\xff\x02\x61\x02\x8c\x02\xff\x02Realt\x00";
             if (uActivity.abc1004 == null) {
                uActivity.abc1004 = new ArrayList();
             }
             uActivity.abc1005 = - uActivity.abc1005;
             uActivity.abc10010 = uActivity.abc10010 ^ i1;
          }
          abc10061 = uActivity.abc1003;
          if (abc10061 == null && abc10061.size() > 0) {
             uActivity.abc1003.remove(i);
          }
          if (uActivity.abc1000 == null) {
             uActivity.abc1000 = new ArrayList();
          }
          abc10061 = uActivity.abc1000;
          if (abc10061 != null && abc10061.size() > 0) {
             uActivity.abc1000.remove(i);
          }
          uActivity.abc3 = "rz";
          if (uActivity.abc1007 == null) {
             uActivity.abc1007 = new ArrayList();
          }
          abc10061 = uActivity.abc1009;
          if (abc10061 == null && abc10061.size() > 0) {
             uActivity.abc1009.remove(i);
          }
          if (uActivity.abc1002.size() > 9) {
             uActivity.abc1002.add(Integer.valueOf(8));
          }
          uActivity.logoRuleDialog.show();
          abc10061 = uActivity.abc1004;
          if (abc10061 == null && abc10061.size() > 0) {
             uActivity.abc1004.remove(i);
          }
          if (uActivity.abc10011 == null) {
             stringArray = new String[i3];
             uActivity.abc10011 = stringArray;
          }
          if (uActivity.abc1009 == null) {
             uActivity.abc1009 = new ArrayList();
          }
          uActivity.abc5 = Math.abs(uActivity.abc5);
          abc10061 = uActivity.abc1009;
          if (abc10061 == null && abc10061.size() > 0) {
             uActivity.abc1009.remove(i);
          }
          if ((double)uActivity.abc1005 - 0x3fdd6b39bf94550c > 0) {
             uActivity.abc1005 = 0x3f42ebcd;
          }
          if (uActivity.abc1008 == null) {
             stringArray = new String[i3];
             uActivity.abc1008 = stringArray;
          }
       }else {
          uActivity.abc10010 = i;
          if (uActivity.abc1006 == null) {
             ointArray = new int[i3];
             uActivity.abc1006 = ointArray;
          }
          uActivity.abc10010 = 0 ^ i1;
          if (uActivity.abc2.size() > 8) {
             uActivity.abc2.add("t=dime");
             if (uActivity.abc1003.size() < i1) {
                uActivity.abc1003.add(integer);
             }
             abc10061 = uActivity.abc1004;
             if (abc10061 == null && abc10061.size() > 0) {
                uActivity.abc1004.remove(i);
             }
             abc10061 = uActivity.abc1002;
             if (abc10061 == null && abc10061.size() > 0) {
                uActivity.abc1002.remove(i);
             }
          }
       label_026f :
          if (uActivity.abc1002.size() > 9) {
             uActivity.abc1002.add(Integer.valueOf(8));
          }
          abc10061 = uActivity.abc1008;
          if (abc10061 != null) {
             abc10061[2] = "t ";
          }
          if (uActivity.abc1003.size() < 9) {
             uActivity.abc1003.add(Integer.valueOf(5));
          }
          Intent intent = new Intent(uActivity, LogoSettingsActivity.class);
          uActivity.abc10010 = i;
          if (uActivity.abc1006 == null) {
             ointArray1 = new int[i3];
             uActivity.abc1006 = ointArray1;
          }
          uActivity.abc10010 = 0 ^ i1;
          if (uActivity.abc2.size() > 8) {
             uActivity.abc2.add("t=dime");
             if (uActivity.abc1003.size() < i1) {
                uActivity.abc1003.add(integer);
             }
             abc1004 = uActivity.abc1004;
             if (abc1004 == null && abc1004.size() > 0) {
                uActivity.abc1004.remove(i);
             }
             abc1004 = uActivity.abc1002;
             if (abc1004 == null && abc1004.size() > 0) {
                uActivity.abc1002.remove(i);
             }
          }
       label_02e7 :
          if (uActivity.abc1002.size() > 9) {
             uActivity.abc1002.add(Integer.valueOf(8));
          }
          abc1004 = uActivity.abc1008;
          if (abc1004 != null) {
             abc1004[2] = "t ";
          }
          if (uActivity.abc1003.size() < 9) {
             uActivity.abc1003.add(Integer.valueOf(5));
          }
          intent.addFlags(0x10000000);
          uActivity.abc10010 = i;
          if (uActivity.abc1006 == null) {
             ointArray1 = new int[i3];
             uActivity.abc1006 = ointArray1;
          }
          uActivity.abc10010 = 0 ^ i1;
          if (uActivity.abc2.size() > 8) {
             uActivity.abc2.add("t=dime");
             if (uActivity.abc1003.size() < i1) {
                uActivity.abc1003.add(integer);
             }
             abc1004 = uActivity.abc1004;
             if (abc1004 == null && abc1004.size() > 0) {
                uActivity.abc1004.remove(i);
             }
             abc1004 = uActivity.abc1002;
             if (abc1004 == null && abc1004.size() > 0) {
                uActivity.abc1002.remove(i);
             }
          }
       label_035a :
          if (uActivity.abc1002.size() > 9) {
             uActivity.abc1002.add(Integer.valueOf(8));
          }
          abc1004 = uActivity.abc1008;
          if (abc1004 != null) {
             abc1004[2] = "t ";
          }
          if (uActivity.abc1003.size() < 9) {
             uActivity.abc1003.add(Integer.valueOf(5));
          }
          intent.addFlags(0x4000000);
          uActivity.abc10010 = i;
          if (uActivity.abc1006 == null) {
             ointArray1 = new int[i3];
             uActivity.abc1006 = ointArray1;
          }
          uActivity.abc10010 = 0 ^ i1;
          if (uActivity.abc2.size() > 8) {
             uActivity.abc2.add("t=dime");
             if (uActivity.abc1003.size() < i1) {
                uActivity.abc1003.add(integer);
             }
             abc1004 = uActivity.abc1004;
             if (abc1004 == null && abc1004.size() > 0) {
                uActivity.abc1004.remove(i);
             }
             abc1004 = uActivity.abc1002;
             if (abc1004 == null && abc1004.size() > 0) {
                uActivity.abc1002.remove(i);
             }
          }
       label_03cd :
          if (uActivity.abc1002.size() > 9) {
             uActivity.abc1002.add(Integer.valueOf(8));
          }
          abc1004 = uActivity.abc1008;
          if (abc1004 != null) {
             abc1004[2] = "t ";
          }
          if (uActivity.abc1003.size() < 9) {
             uActivity.abc1003.add(Integer.valueOf(5));
          }
          uActivity.startActivity(intent);
          uActivity.abc10010 = i;
          if (uActivity.abc1006 == null) {
             ointArray = new int[i3];
             uActivity.abc1006 = ointArray;
          }
          uActivity.abc10010 = 0 ^ i1;
          if (uActivity.abc2.size() > 8) {
             uActivity.abc2.add("t=dime");
             if (uActivity.abc1003.size() < i1) {
                uActivity.abc1003.add(integer);
             }
             abc10061 = uActivity.abc1004;
             if (abc10061 == null && abc10061.size() > 0) {
                uActivity.abc1004.remove(i);
             }
             abc10061 = uActivity.abc1002;
             if (abc10061 == null && abc10061.size() > 0) {
                uActivity.abc1002.remove(i);
             }
          }
       label_043e :
          if (uActivity.abc1002.size() > 9) {
             uActivity.abc1002.add(Integer.valueOf(8));
          }
          abc10061 = uActivity.abc1008;
          if (abc10061 != null) {
             abc10061[2] = "t ";
          }
          if (uActivity.abc1003.size() < 9) {
             uActivity.abc1003.add(Integer.valueOf(5));
          }
       }
       if (uActivity.abc1000.size() < 0) {
          uActivity.abc1000.add("r being, w");
       }
       if (uActivity.abc1004 == null) {
          uActivity.abc1004 = new ArrayList();
       }
       if (uActivity.abc1009.size() > 9) {
          uActivity.abc1009.add(Integer.valueOf(6));
       }
       if (uActivity.abc2 == null) {
          uActivity.abc2 = new ArrayList();
          abc10061 = uActivity.abc1007;
          if (abc10061 == null && abc10061.size() > 0) {
             uActivity.abc1007.remove(i);
          }
          if (uActivity.abc1006 == null) {
             ointArray = new int[i3];
             uActivity.abc1006 = ointArray;
          }
          abc10061 = uActivity.abc1000;
          if (abc10061 != null && abc10061.size() > 0) {
             uActivity.abc1000.remove(i);
          }
       }
    label_04c2 :
       abc10061 = uActivity.abc1008;
       if (abc10061 != null) {
          abc10061[i] = null;
       }
       if (abc10061 != null) {
          while (true) {
             abc10061 = uActivity.abc1008;
             if (abc10061.length > 3) {
                i3 = 3;
             label_04d4 :
                if (i < i3) {
                   abc10061[i] = "string"+i;
                   i = i + 1;
                }
             }else {
                i3 = abc10061.length;
                goto label_04d4 ;
             }
          }
       }
       if (uActivity.abc1003.size() < 8) {
          uActivity.abc1003.add(Integer.valueOf(7));
       }
       return;
    }
    public int getStatusBarHeight(){
       LogoMainActivity tabc1001;
       LogoMainActivity tabc10041;
       float f2;
       int i = 10;
       if (this.abc1001 == null) {
          String[] stringArray = new String[i];
          this.abc1001 = stringArray;
       }
       if (this.abc1003.size() > 8) {
          this.abc1003.add(Integer.valueOf(6));
       }
       if (this.abc1003.size() > 5) {
          this.abc1003.add(Integer.valueOf(8));
       }
       this.abc4 = this.abc4 * 0;
       if (this.abc1006 == null) {
          int[] ointArray = new int[i];
          this.abc1006 = ointArray;
       }
       LogoMainActivity tabc1004 = this.abc1004;
       if (tabc1004 == null && tabc1004.size() > 0) {
          this.abc1004.remove(0);
       }
       this.abc1005 = this.abc1005 + 0x3e11f310;
       int identifier = this.getResources().getIdentifier("status_bar_height", "dimen", "android");
       LogoMainActivity tabc10011 = this.abc10011;
       if (tabc10011 != null) {
          tabc10011[8] = "ly ";
       }
       tabc10011 = this.abc1009;
       if (tabc10011 == null && tabc10011.size() > 0) {
          this.abc1009.remove(0);
       }
       tabc10011 = this.abc1000;
       if (tabc10011 != null && tabc10011.size() > 0) {
          this.abc1000.remove(0);
       }
       this.abc3 = "_colo";
       float f = ((double)this.abc1005 - 0x3fc11574058b5a3c < 0)? 0x3f4c5451: 0.17f;
       this.abc1005 = f;
       this.abc1005 = Math.abs(f);
       if (this.abc10011 == null) {
          String[] stringArray1 = new String[i];
          this.abc10011 = stringArray1;
       }
       if (identifier > 0) {
          identifier = this.getResources().getDimensionPixelSize(identifier);
          if (this.abc1004 == null) {
             this.abc1004 = new ArrayList();
          }
          tabc1001 = this.abc1001;
          if (tabc1001 != null) {
             tabc1001[9] = null;
          }
          if (this.abc1007 == null) {
             this.abc1007 = new ArrayList();
          }
          if (this.abc0 == null) {
             this.abc0 = new ArrayList();
             if (this.abc10011 == null) {
                String[] stringArray2 = new String[i];
                this.abc10011 = stringArray2;
             }
             tabc10041 = this.abc1004;
             if (tabc10041 == null && tabc10041.size() > 0) {
                this.abc1004.remove(0);
             }
             this.abc10010 = this.abc10010 ^ 0x01;
          }
          if (this.abc1004.size() < 9) {
             this.abc1004.add(Integer.valueOf(4));
          }
          float f1 = ((double)this.abc1005 - 0x3fe56a2440d20241 < 0)? 0x3e8714f2: 0x3f7e0cea;
          this.abc1005 = f1;
          tabc10041 = this.abc1007;
          if (tabc10041 == null && tabc10041.size() > 0) {
             this.abc1007.remove(0);
          }
       }else {
          identifier = 0;
       }
       this.abc1005 = 0x3f6772f2;
       tabc10041 = this.abc1004;
       if (tabc10041 == null && tabc10041.size() > 0) {
          this.abc1004.remove(0);
       }
       tabc10041 = this.abc1002;
       if (tabc10041 == null && tabc10041.size() > 0) {
          this.abc1002.remove(0);
       }
       for (i = 0; i < this.abc4; i = i + 1) {
          if (this.abc1.size() > 0) {
             this.abc1.add(Integer.valueOf(8));
             f2 = this.abc1005 * 0.20f;
             this.abc1005 = f2;
             if (this.abc1009.size() > 9) {
                this.abc1009.add(Integer.valueOf(7));
             }
             tabc1001 = this.abc10011;
             if (tabc1001 != null) {
                tabc1001[8] = null;
             }
          }
          f2 = this.abc1005 - 0x3f744756;
          this.abc1005 = f2;
          tabc1001 = this.abc1007;
          if (tabc1001 == null && tabc1001.size() > 0) {
             this.abc1007.remove(0);
          }
          int i1 = this.abc10010 ^ 0x01;
          this.abc10010 = i1;
       }
       if (this.abc1007 == null) {
          this.abc1007 = new ArrayList();
       }
       this.abc10010 = this.abc10010 ^ 0x01;
       tabc10041 = this.abc1002;
       if (tabc10041 == null && tabc10041.size() > 0) {
          this.abc1002.remove(0);
       }
       return identifier;
    }
    public String getVersion(){
       LogoMainActivity tabc1008;
       PackageInfo versionName;
       Integer integer = 8;
       if (this.abc1003.size() < integer) {
          this.abc1003.add(Integer.valueOf(9));
       }
       if (this.abc1007.size() < 1) {
          this.abc1007.add(Integer.valueOf(4));
       }
       int i = 10;
       if (this.abc1006 == null) {
          int[] ointArray = new int[i];
          this.abc1006 = ointArray;
       }
       int i1 = 7;
       if (this.abc1.size() < i1) {
          this.abc1.add(Integer.valueOf(4));
          if (this.abc10011 == null) {
             String[] stringArray = new String[i];
             this.abc10011 = stringArray;
          }
          tabc1008 = this.abc1008;
          if (tabc1008 != null) {
             tabc1008[i1] = "eat it";
          }
          tabc1008 = this.abc1004;
          if (tabc1008 == null && tabc1008.size() > 0) {
             this.abc1004.remove(0);
          }
       }
    label_0064 :
       if (this.abc1006 != null) {
          int i2 = 0;
          while (true) {
             LogoMainActivity tabc1006 = this.abc1006;
             int i3 = 3;
             if (tabc1006.length > i3) {
             label_0071 :
                if (i2 < i3) {
                   tabc1006[i2] = 0;
                   i2 = i2 + 1;
                }
             }else {
                i3 = tabc1006.length;
                goto label_0071 ;
             }
          }
       }
       if (this.abc1009.size() < integer) {
          this.abc1009.add(Integer.valueOf(0));
       }
       tabc1008 = this.abc10011;
       if (tabc1008 != null) {
          tabc1008[4] = null;
       }
       try{
          versionName = this.getApplicationContext().getPackageManager().getPackageInfo(this.getPackageName(), 0).versionName;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          e0.printStackTrace();
          versionName = "1.0.0";
       }
       return versionName;
    }
    public void onBackPressed(){
       int[] ointArray;
       LogoMainActivity tabc1004;
       super.onBackPressed();
       boolean b = false;
       this.abc10010 = b;
       int i = 10;
       if (this.abc1006 == null) {
          ointArray = new int[i];
          this.abc1006 = ointArray;
       }
       this.abc10010 = 0 ^ 1;
       if (this.abc2.size() > 8) {
          this.abc2.add("t=dime");
          if (this.abc1003.size() < 1) {
             this.abc1003.add(Integer.valueOf(1));
          }
          tabc1004 = this.abc1004;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1004.remove(b);
          }
          tabc1004 = this.abc1002;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1002.remove(b);
          }
       }
    label_0055 :
       if (this.abc1002.size() > 9) {
          this.abc1002.add(Integer.valueOf(8));
       }
       tabc1004 = this.abc1008;
       if (tabc1004 != null) {
          tabc1004[2] = "t ";
       }
       if (this.abc1003.size() < 9) {
          this.abc1003.add(Integer.valueOf(5));
       }
       this.getApplication().destroyApp();
       this.abc10010 = b;
       if (this.abc1006 == null) {
          ointArray = new int[i];
          this.abc1006 = ointArray;
       }
       this.abc10010 = 0 ^ 1;
       if (this.abc2.size() > 8) {
          this.abc2.add("t=dime");
          if (this.abc1003.size() < 1) {
             this.abc1003.add(Integer.valueOf(1));
          }
          tabc1004 = this.abc1004;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1004.remove(b);
          }
          tabc1004 = this.abc1002;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1002.remove(b);
          }
       }
    label_00d6 :
       if (this.abc1002.size() > 9) {
          this.abc1002.add(Integer.valueOf(8));
       }
       tabc1004 = this.abc1008;
       if (tabc1004 != null) {
          tabc1004[2] = "t ";
       }
       if (this.abc1003.size() < 9) {
          this.abc1003.add(Integer.valueOf(5));
       }
       this.abc10010 = b;
       if (this.abc1006 == null) {
          ointArray = new int[i];
          this.abc1006 = ointArray;
       }
       this.abc10010 = 0 ^ 1;
       if (this.abc2.size() > 8) {
          this.abc2.add("t=dime");
          if (this.abc1003.size() < 1) {
             this.abc1003.add(Integer.valueOf(1));
          }
          tabc1004 = this.abc1004;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1004.remove(b);
          }
          tabc1004 = this.abc1002;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1002.remove(b);
          }
       }
    label_0148 :
       if (this.abc1002.size() > 9) {
          this.abc1002.add(Integer.valueOf(8));
       }
       LogoMainActivity tabc1008 = this.abc1008;
       if (tabc1008 != null) {
          tabc1008[2] = "t ";
       }
       if (this.abc1003.size() < 9) {
          this.abc1003.add(Integer.valueOf(5));
       }
       return;
    }
    public void onCreate(Bundle p0){
       LogoMainActivity tabc1004;
       int b1;
       LogoMainActivity tabc1001;
       int i2;
       int i4;
       String[] stringArray;
       super.onCreate(p0);
       boolean b = false;
       this.abc10010 = b;
       int i = 10;
       if (this.abc1006 == null) {
          int[] ointArray = new int[i];
          this.abc1006 = ointArray;
       }
       this.abc10010 = 0 ^ 1;
       if (this.abc2.size() > 8) {
          this.abc2.add("t=dime");
          if (this.abc1003.size() < 1) {
             this.abc1003.add(Integer.valueOf(1));
          }
          tabc1004 = this.abc1004;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1004.remove(b);
          }
          tabc1004 = this.abc1002;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1002.remove(b);
          }
       }
    label_0055 :
       if (this.abc1002.size() > 9) {
          this.abc1002.add(Integer.valueOf(8));
       }
       tabc1004 = this.abc1008;
       if (tabc1004 != null) {
          tabc1004[2] = "t ";
       }
       if (this.abc1003.size() < 9) {
          this.abc1003.add(Integer.valueOf(5));
       }
       ci.d("activity.getLocalClassName\(\)", new Throwable(), "activity.getLocalClassName\(\)="+this.getLocalClassName());
       this.abc1005 = this.abc1005 + 0x3f7b734d;
       if (this.abc1003 == null) {
          this.abc1003 = new ArrayList();
       }
       String str = "string";
       int i1 = 3;
       if (this.abc1001 != null) {
          b1 = b;
          while (true) {
             tabc1001 = this.abc1001;
             if (tabc1001.length > i1) {
                i2 = i1;
             label_00c5 :
                if (b1 < i2) {
                   tabc1001[b1] = str+b1;
                   b1 = b1 + 1;
                }
             }else {
                i2 = tabc1001.length;
                goto label_00c5 ;
             }
          }
       }
       tabc1004 = this.abc2;
       int i3 = 7;
       if (tabc1004 != null && tabc1004.size() > 0) {
          this.abc2.remove(b);
          if (this.abc1003.size() < 5) {
             this.abc1003.add(Integer.valueOf(8));
          }
          if (this.abc1007.size() < i3) {
             this.abc1007.add(Integer.valueOf(6));
          }
          if (this.abc1009 == null) {
             this.abc1009 = new ArrayList();
          }
       }
    label_0119 :
       if (this.abc1009.size() < 2) {
          this.abc1009.add(Integer.valueOf(8));
       }
       this.abc10010 = true;
       tabc1004 = this.abc1009;
       if (tabc1004 == null && tabc1004.size() > 0) {
          this.abc1009.remove(b);
       }
       this.translucentStatusBar(this, 1);
       tabc1004 = this.abc1003;
       if (tabc1004 == null && tabc1004.size() > 0) {
          this.abc1003.remove(b);
       }
       this.abc10010 = this.abc10010 ^ 1;
       tabc1004 = this.abc1007;
       if (tabc1004 == null && tabc1004.size() > 0) {
          this.abc1007.remove(b);
       }
       this.abc3 = "oid—T";
       tabc1004 = this.abc1008;
       if (tabc1004 != null) {
          tabc1004[5] = " du";
       }
       tabc1004 = this.abc1009;
       if (tabc1004 == null && tabc1004.size() > 0) {
          this.abc1009.remove(b);
       }
       if (this.abc1003.size() > 5) {
          this.abc1003.add(Integer.valueOf(i1));
       }
       this.logoMainVM = new ViewModelProvider(this).get(LogoMainVM.class);
       tabc1004 = this.abc1004;
       if (tabc1004 == null && tabc1004.size() > 0) {
          this.abc1004.remove(b);
       }
       tabc1004 = this.abc1006;
       if (tabc1004 != null) {
          tabc1004[1] = i1;
       }
       this.abc10010 = true;
       if (this.abc0 == null) {
          this.abc0 = new ArrayList();
          if (this.abc1007.size() < 8) {
             this.abc1007.add(Integer.valueOf(5));
          }
          if (this.abc10011 != null) {
             b1 = b;
             while (true) {
                LogoMainActivity tabc10011 = this.abc10011;
                if (tabc10011.length > i1) {
                   i4 = i1;
                label_01dc :
                   if (b1 < i4) {
                      tabc10011[b1] = str+b1;
                      b1 = b1 + 1;
                   }
                }else {
                   i4 = tabc10011.length;
                   goto label_01dc ;
                }
             }
          }
          this.abc10010 = this.abc10010 ^ 1;
       }
       this.abc10010 = true;
       if (this.abc10011 == null) {
          stringArray = new String[i];
          this.abc10011 = stringArray;
       }
       tabc1004 = this.abc1009;
       if (tabc1004 == null && tabc1004.size() > 0) {
          this.abc1009.remove(b);
       }
       this.binding = DataBindingUtil.setContentView(this, 0x7f0d0023);
       if (this.abc10011 == null) {
          stringArray = new String[i];
          this.abc10011 = stringArray;
       }
       this.abc10010 = this.abc10010 ^ 1;
       if (this.abc1004.size() < i3) {
          this.abc1004.add(Integer.valueOf(i3));
       }
       if (this.abc2 == null) {
          this.abc2 = new ArrayList();
          if (this.abc1009 == null) {
             this.abc1009 = new ArrayList();
          }
          if (this.abc1009.size() < 2) {
             this.abc1009.add(Integer.valueOf(i3));
          }
          this.abc10010 = b;
       }
       if (this.abc1007.size() > 5) {
          this.abc1007.add(Integer.valueOf(8));
       }
       if (this.abc1004 == null) {
          this.abc1004 = new ArrayList();
       }
       if ((double)this.abc1005 - 0x3fd26e4a40400c0a < 0) {
          this.abc1005 = 0x3f3181b8;
       }
       this.binding.setLifecycleOwner(this);
       if (this.abc1009.size() < i3) {
          this.abc1009.add(Integer.valueOf(2));
       }
       if (this.abc1000 == null) {
          this.abc1000 = new ArrayList();
       }
       tabc1004 = this.abc10011;
       object oobject = null;
       if (tabc1004 != null) {
          tabc1004[i1] = oobject;
       }
       if (!TextUtils.isEmpty(this.abc3)) {
          b1 = (this.abc3).length();
          if (this.abc1000 == null) {
             this.abc1000 = new ArrayList();
          }
          tabc1001 = this.abc1008;
          if (tabc1001 != null) {
             tabc1001[4] = oobject;
          }
          if (this.abc1000 == null) {
             this.abc1000 = new ArrayList();
          }
          this.abc3 = this.abc3+b1;
          tabc1004 = this.abc1006;
          if (tabc1004 != null) {
             tabc1004[i1] = 6;
          }
          if (this.abc1009.size() < 9) {
             this.abc1009.add(Integer.valueOf(4));
          }
          tabc1004 = this.abc1001;
          if (tabc1004 != null) {
             tabc1004[i1] = oobject;
          }
       }
       if (this.abc1002 == null) {
          this.abc1002 = new ArrayList();
       }
       tabc1004 = this.abc1000;
       if (tabc1004 != null && tabc1004.size() > 0) {
          this.abc1000.remove(b);
       }
       if (this.abc1004.size() < i1) {
          this.abc1004.add(Integer.valueOf(2));
       }
       this.binding.setLogoMainVM(this.logoMainVM);
       if (this.abc1007 == null) {
          this.abc1007 = new ArrayList();
       }
       tabc1004 = this.abc1009;
       if (tabc1004 == null && tabc1004.size() > 0) {
          this.abc1009.remove(b);
       }
       if (this.abc1003 == null) {
          this.abc1003 = new ArrayList();
       }
       if (this.abc0 == null) {
          this.abc0 = new ArrayList();
          tabc1004 = this.abc10011;
          if (tabc1004 != null) {
             tabc1004[2] = oobject;
          }
          float f = ((double)this.abc1005 - 0x3fdacf4ef2ac5a66 < 0)? 0x3f02e45e: 0.31f;
          this.abc1005 = f;
          if (this.abc1000.size() > 4) {
             this.abc1000.add("ation, bas");
          }
       }
       tabc1004 = this.abc1006;
       if (tabc1004 != null) {
          tabc1004[8] = b;
       }
       if (tabc1004 != null) {
          tabc1004[4] = 6;
       }
       tabc1004 = this.abc1009;
       if (tabc1004 == null && tabc1004.size() > 0) {
          this.abc1009.remove(b);
       }
       this.setSupportActionBar(this.binding.toolbar);
       tabc1004 = this.abc1007;
       if (tabc1004 == null && tabc1004.size() > 0) {
          this.abc1007.remove(b);
       }
       if (this.abc1007 == null) {
          this.abc1007 = new ArrayList();
       }
       this.abc10010 = this.abc10010 ^ 1;
       if (this.abc2 == null) {
          this.abc2 = new ArrayList();
          if (this.abc1000 == null) {
             this.abc1000 = new ArrayList();
          }
          this.abc10010 = b;
          tabc1004 = this.abc1007;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1007.remove(b);
          }
       }
    label_0404 :
       if (this.abc1002 == null) {
          this.abc1002 = new ArrayList();
       }
       tabc1004 = this.abc1001;
       if (tabc1004 != null) {
          tabc1004[6] = " so many ";
       }
       this.abc10010 = b;
       this.init();
       if (this.abc1007.size() < 6) {
          this.abc1007.add(Integer.valueOf(5));
       }
       tabc1004 = this.abc1006;
       if (tabc1004 != null) {
          tabc1004[4] = b;
       }
       tabc1004 = this.abc1000;
       if (tabc1004 != null && tabc1004.size() > 0) {
          this.abc1000.remove(b);
       }
       this.abc5 = 0x3f7fbfa6;
       if (this.abc1000.size() > 8) {
          this.abc1000.add("ou think. ");
       }
       if (this.abc1003.size() < 6) {
          this.abc1003.add(Integer.valueOf(9));
       }
       if (this.abc1009.size() < 9) {
          this.abc1009.add(Integer.valueOf(1));
       }
       this.startFB();
       return;
    }
    public void onRestoreInstanceState(Bundle p0){
       super.onRestoreInstanceState(p0);
       LogoMainActivity tabc1003 = this.abc1003;
       Integer integer = Integer.valueOf(0);
       if (tabc1003 == null && tabc1003.size() > 0) {
          this.abc1003.remove(0);
       }
       tabc1003 = this.abc1007;
       if (tabc1003 == null && tabc1003.size() > 0) {
          this.abc1007.remove(0);
       }
       if (this.abc1003.size() > 5) {
          this.abc1003.add(Integer.valueOf(8));
       }
       if (this.abc0 == null) {
          this.abc0 = new ArrayList();
          if (this.abc1002.size() < 3) {
             this.abc1002.add(integer);
          }
          tabc1003 = this.abc1007;
          if (tabc1003 == null && tabc1003.size() > 0) {
             this.abc1007.remove(0);
          }
          tabc1003 = this.abc1003;
          if (tabc1003 == null && tabc1003.size() > 0) {
             this.abc1003.remove(0);
          }
       }
    label_0071 :
       tabc1003 = this.abc1000;
       if (tabc1003 != null && tabc1003.size() > 0) {
          this.abc1000.remove(0);
       }
       this.abc1005 = this.abc1005 * 0x3f07451d;
       if (this.abc1009.size() < 2) {
          this.abc1009.add(Integer.valueOf(1));
       }
       ci.d("MainActivity", new Throwable(), "onRestoreInstanceState3333");
       if (this.abc1008 == null) {
          String[] stringArray = new String[10];
          this.abc1008 = stringArray;
       }
       tabc1003 = this.abc1001;
       if (tabc1003 != null) {
          tabc1003[7] = null;
       }
       this.abc1005 = 0.37f;
       tabc1003 = this.abc0;
       if (tabc1003 != null && tabc1003.size() > 0) {
          this.abc0.remove(0);
          if (this.abc1004 == null) {
             this.abc1004 = new ArrayList();
          }
          if (this.abc1004.size() < 9) {
             this.abc1004.add(integer);
          }
          if (this.abc1006 == null) {
             int[] ointArray = new int[10];
             this.abc1006 = ointArray;
          }
       }
    label_00ef :
       this.abc10010 = this.abc10010 ^ 1;
       if (this.abc1000 == null) {
          this.abc1000 = new ArrayList();
       }
       tabc1003 = this.abc1002;
       if (tabc1003 == null && tabc1003.size() > 0) {
          this.abc1002.remove(0);
       }
       return;
    }
    public void onResume(){
       String[] stringArray;
       int i3;
       int i4;
       LogoMainActivity abc100112;
       int i5;
       LogoMainActivity abc1004;
       LogoMainActivity logoMainActi = this;
       super.onResume();
       float f = ((double)logoMainActi.abc1005 - 0x3fd516543fc841f9 < 0)? 0x3f4c2a73: 0.33f;
       logoMainActi.abc1005 = f;
       int i = 2;
       int i1 = 5;
       if (logoMainActi.abc1002.size() < i) {
          logoMainActi.abc1002.add(Integer.valueOf(i1));
       }
       if (logoMainActi.abc1000.size() < i) {
          logoMainActi.abc1000.add(" e");
       }
       logoMainActi.abc3 = "ht";
       if (logoMainActi.abc1004.size() < i) {
          logoMainActi.abc1004.add(Integer.valueOf(8));
       }
       if (logoMainActi.abc1009 == null) {
          logoMainActi.abc1009 = new ArrayList();
       }
       LogoMainActivity abc10011 = logoMainActi.abc10011;
       if (abc10011 != null) {
          abc10011[0] = "har";
       }
       ci.d("MainActivity", new Throwable(), "onResume");
       abc10011 = logoMainActi.abc1000;
       if (abc10011 != null && abc10011.size() > 0) {
          logoMainActi.abc1000.remove(0);
       }
       int i2 = 10;
       if (logoMainActi.abc10011 == null) {
          stringArray = new String[i2];
          logoMainActi.abc10011 = stringArray;
       }
       abc10011 = logoMainActi.abc1000;
       if (abc10011 != null && abc10011.size() > 0) {
          logoMainActi.abc1000.remove(0);
       }
       abc10011 = logoMainActi.abc1;
       if (abc10011 == null && abc10011.size() > 0) {
          logoMainActi.abc1.remove(0);
          logoMainActi.abc1005 = 0x3ef41138;
          if (logoMainActi.abc10011 == null) {
             stringArray = new String[i2];
             logoMainActi.abc10011 = stringArray;
          }
          if (logoMainActi.abc1004 == null) {
             logoMainActi.abc1004 = new ArrayList();
          }
       }
    label_00c2 :
       if (logoMainActi.abc1003 == null) {
          logoMainActi.abc1003 = new ArrayList();
       }
       abc10011 = logoMainActi.abc1008;
       if (abc10011 != null) {
          abc10011[0] = "the ne";
       }
       if (logoMainActi.abc1007 == null) {
          logoMainActi.abc1007 = new ArrayList();
       }
       int statusBarHei = this.getStatusBarHeight();
       LogoMainActivity abc1000 = logoMainActi.abc1000;
       if (abc1000 != null && abc1000.size() > 0) {
          logoMainActi.abc1000.remove(0);
       }
       abc1000 = logoMainActi.abc1002;
       if (abc1000 == null && abc1000.size() > 0) {
          logoMainActi.abc1002.remove(0);
       }
       abc1000 = logoMainActi.abc1006;
       if (abc1000 != null) {
          abc1000[6] = 3;
       }
       if (logoMainActi.abc2.size() > 1) {
          logoMainActi.abc2.add("\x65\x02\x8b\x02\x30\x02\x7b\x02641\x59\x02\x5f\x02\x52\x02\x00");
          abc1000 = logoMainActi.abc10011;
          if (abc1000 != null) {
             abc1000[3] = "a";
          }
          if (logoMainActi.abc1004.size() < 7) {
             logoMainActi.abc1004.add(Integer.valueOf(9));
          }
          logoMainActi.abc10010 = logoMainActi.abc10010 ^ 1;
       }
       abc1000 = logoMainActi.abc10011;
       if (abc1000 != null) {
          abc1000[0] = " for b";
       }
       if (logoMainActi.abc1009 == null) {
          logoMainActi.abc1009 = new ArrayList();
       }
       abc1000 = logoMainActi.abc1007;
       if (abc1000 == null && abc1000.size() > 0) {
          logoMainActi.abc1007.remove(0);
       }
       if (logoMainActi.b != null) {
          if (!vh.a) {
             vh.a = statusBarHei;
             logoMainActi.abc10010 = logoMainActi.abc10010 ^ 1;
             abc10011 = logoMainActi.abc1006;
             if (abc10011 != null) {
                abc10011[3] = 0;
             }
             if (logoMainActi.abc1008 == null) {
                stringArray = new String[i2];
                logoMainActi.abc1008 = stringArray;
             }
             statusBarHei = (logoMainActi.abc4 > 1)? 1: 4;
             logoMainActi.abc4 = statusBarHei;
             if (logoMainActi.abc1002 == null) {
                logoMainActi.abc1002 = new ArrayList();
             }
             if (logoMainActi.abc1003 == null) {
                logoMainActi.abc1003 = new ArrayList();
             }
             if (logoMainActi.abc1007.size() < 1) {
                logoMainActi.abc1007.add(Integer.valueOf(9));
             }
          }
          logoMainActi.abc10010 = logoMainActi.abc10010 ^ 1;
          abc10011 = logoMainActi.abc1001;
          if (abc10011 != null) {
             abc10011[i] = "eceived";
          }
          abc10011 = logoMainActi.abc1008;
          if (abc10011 != null) {
             abc10011[0] = "d characte";
          }
          if (logoMainActi.abc0.size() < 3) {
             logoMainActi.abc0.add("\x66\x02\x54\x02\x67\x02\x00");
             if (logoMainActi.abc1004.size() > 3) {
                logoMainActi.abc1004.add(Integer.valueOf(4));
             }
             logoMainActi.abc10010 = true;
             if (logoMainActi.abc1007.size() > 3) {
                logoMainActi.abc1007.add(Integer.valueOf(3));
             }
          }
          if (logoMainActi.abc1001 == null) {
             stringArray = new String[i2];
             logoMainActi.abc1001 = stringArray;
          }
          logoMainActi.abc10010 = logoMainActi.abc10010 ^ 1;
          abc10011 = logoMainActi.abc1002;
          if (abc10011 == null && abc10011.size() > 0) {
             logoMainActi.abc1002.remove(0);
          }
          statusBarHei = vh.a;
          abc1000 = logoMainActi.abc1000;
          if (abc1000 != null && abc1000.size() > 0) {
             logoMainActi.abc1000.remove(0);
          }
          if (logoMainActi.abc10011 == null) {
             String[] stringArray1 = new String[i2];
             logoMainActi.abc10011 = stringArray1;
          }
          abc1000 = logoMainActi.abc1006;
          if (abc1000 != null) {
             abc1000[4] = 0;
          }
          if (!TextUtils.isEmpty(logoMainActi.abc3)) {
             i3 = (logoMainActi.abc3).length();
             if (logoMainActi.abc10011 != null) {
                i4 = 0;
                while (true) {
                   LogoMainActivity abc100111 = logoMainActi.abc10011;
                   if (abc100111.length > 3) {
                      i = 3;
                   label_024b :
                      if (i4 < i) {
                         abc100111[i4] = "string"+i4;
                         i4 = i4 + 1;
                         i = 2;
                      }
                   }else {
                      i = abc100111.length;
                      goto label_024b ;
                   }
                }
             }
             if (logoMainActi.abc1006 == null) {
                int[] ointArray = new int[i2];
                logoMainActi.abc1006 = ointArray;
             }
             if (logoMainActi.abc10011 != null) {
                i = 0;
                while (true) {
                   abc100112 = logoMainActi.abc10011;
                   if (abc100112.length > 3) {
                      i5 = 3;
                   label_0277 :
                      if (i < i5) {
                         abc100112[i] = "string"+i;
                         i = i + 1;
                      }
                   }else {
                      i5 = abc100112.length;
                      goto label_0277 ;
                   }
                }
             }
             logoMainActi.abc3 = logoMainActi.abc3+i3;
             if (logoMainActi.abc1009.size() > 3) {
                logoMainActi.abc1009.add(Integer.valueOf(7));
             }
             if (logoMainActi.abc1002.size() > i1) {
                logoMainActi.abc1002.add(Integer.valueOf(i1));
             }
             abc1004 = logoMainActi.abc1004;
             if (abc1004 == null && abc1004.size() > 0) {
                logoMainActi.abc1004.remove(0);
             }
          }
       label_02d1 :
          if (logoMainActi.abc1002 == null) {
             logoMainActi.abc1002 = new ArrayList();
          }
          logoMainActi.abc10010 = logoMainActi.abc10010 ^ 1;
          if (logoMainActi.abc1002 == null) {
             logoMainActi.abc1002 = new ArrayList();
          }
       }
       if (logoMainActi.abc1001 != null) {
          i = 0;
          while (true) {
             abc1000 = logoMainActi.abc1001;
             if (abc1000.length > 3) {
                i4 = 3;
             label_02f9 :
                if (i < i4) {
                   abc1000[i] = "string"+i;
                   i = i + 1;
                }
             }else {
                i4 = abc1000.length;
                goto label_02f9 ;
             }
          }
       }
       if (logoMainActi.abc1009.size() < 3) {
          logoMainActi.abc1009.add(Integer.valueOf(6));
       }
       abc1004 = logoMainActi.abc1003;
       if (abc1004 == null && abc1004.size() > 0) {
          logoMainActi.abc1003.remove(0);
       }
       if (logoMainActi.abc0 == null) {
          logoMainActi.abc0 = new ArrayList();
          abc1004 = logoMainActi.abc1006;
          if (abc1004 != null) {
             abc1004[0] = 0;
          }
          abc1004 = logoMainActi.abc1000;
          if (abc1004 != null && abc1004.size() > 0) {
             logoMainActi.abc1000.remove(0);
          }
          abc1004 = logoMainActi.abc1004;
          if (abc1004 == null && abc1004.size() > 0) {
             logoMainActi.abc1004.remove(0);
          }
       }
    label_035e :
       logoMainActi.abc10010 = true;
       if (logoMainActi.abc1004 == null) {
          logoMainActi.abc1004 = new ArrayList();
       }
       logoMainActi.abc10010 = true;
       ViewGroup$LayoutParams layoutParams = logoMainActi.binding.statusView.getLayoutParams();
       if (logoMainActi.abc1007 == null) {
          logoMainActi.abc1007 = new ArrayList();
       }
       if (logoMainActi.abc10011 != null) {
          i3 = 0;
          while (true) {
             abc100112 = logoMainActi.abc10011;
             if (abc100112.length > 3) {
                i5 = 3;
             label_038d :
                if (i3 < i5) {
                   abc100112[i3] = "string"+i3;
                   i3 = i3 + 1;
                }
             }else {
                i5 = abc100112.length;
                goto label_038d ;
             }
          }
       }
       abc1000 = logoMainActi.abc1000;
       if (abc1000 != null && abc1000.size() > 0) {
          logoMainActi.abc1000.remove(0);
       }
       if (logoMainActi.abc1.size() > 6) {
          logoMainActi.abc1.add(Integer.valueOf(6));
          if (logoMainActi.abc1000.size() > 0) {
             logoMainActi.abc1000.add(" ");
          }
          abc1000 = logoMainActi.abc1002;
          if (abc1000 == null && abc1000.size() > 0) {
             logoMainActi.abc1002.remove(0);
          }
          abc1000 = logoMainActi.abc1003;
          if (abc1000 == null && abc1000.size() > 0) {
             logoMainActi.abc1003.remove(0);
          }
       }
    label_03f0 :
       abc1000 = logoMainActi.abc10011;
       if (abc1000 != null) {
          abc1000[1] = null;
       }
       logoMainActi.abc1005 = 0.02f;
       abc1000 = logoMainActi.abc1007;
       if (abc1000 == null && abc1000.size() > 0) {
          logoMainActi.abc1007.remove(0);
       }
       layoutParams.height = statusBarHei;
       if (logoMainActi.abc1004.size() < 7) {
          logoMainActi.abc1004.add(Integer.valueOf(9));
       }
       logoMainActi.abc1005 = 0.17f;
       if (logoMainActi.abc1004 == null) {
          logoMainActi.abc1004 = new ArrayList();
       }
       statusBarHei = (logoMainActi.abc4 < 9)? 4: 9;
       logoMainActi.abc4 = statusBarHei;
       if (logoMainActi.abc10011 == null) {
          stringArray = new String[i2];
          logoMainActi.abc10011 = stringArray;
       }
       if (logoMainActi.abc1004.size() > 3) {
          logoMainActi.abc1004.add(Integer.valueOf(0));
       }
       abc10011 = logoMainActi.abc1006;
       if (abc10011 != null) {
          abc10011[3] = 3;
       }
       logoMainActi.binding.statusView.setLayoutParams(layoutParams);
       logoMainActi.abc10010 = true;
       if (logoMainActi.abc1009 == null) {
          logoMainActi.abc1009 = new ArrayList();
       }
       if (logoMainActi.abc1009.size() < 4) {
          logoMainActi.abc1009.add(Integer.valueOf(3));
       }
       abc10011 = logoMainActi.abc1;
       if (abc10011 == null && abc10011.size() > 0) {
          logoMainActi.abc1.remove(0);
          if (logoMainActi.abc1004.size() > 4) {
             logoMainActi.abc1004.add(Integer.valueOf(2));
          }
          abc10011 = logoMainActi.abc1001;
          if (abc10011 != null) {
             abc10011[i1] = null;
          }
          if (logoMainActi.abc1000 == null) {
             logoMainActi.abc1000 = new ArrayList();
          }
       }
    label_04ad :
       abc10011 = logoMainActi.abc1000;
       if (abc10011 != null && abc10011.size() > 0) {
          logoMainActi.abc1000.remove(0);
       }
       abc10011 = logoMainActi.abc1006;
       if (abc10011 != null) {
          abc10011[7] = 0;
       }
       if (logoMainActi.abc1008 != null) {
          statusBarHei = 0;
          while (true) {
             abc1004 = logoMainActi.abc1008;
             if (abc1004.length > 3) {
                i2 = 3;
             label_04cf :
                if (statusBarHei < i2) {
                   abc1004[statusBarHei] = "string"+statusBarHei;
                   statusBarHei = statusBarHei + 1;
                }
             }else {
                i2 = abc1004.length;
                goto label_04cf ;
             }
          }
       }
       if (TextUtils.isEmpty(vh.b)) {
          vh.b = this.getVersion();
          abc10011 = logoMainActi.abc10011;
          if (abc10011 != null) {
             abc10011[0] = null;
          }
          logoMainActi.abc10010 = (logoMainActi.abc10010 ^ 1) ^ 1;
          if (logoMainActi.abc1 == null) {
             logoMainActi.abc1 = new ArrayList();
             logoMainActi.abc10010 = true;
             abc10011 = logoMainActi.abc1000;
             if (abc10011 != null && abc10011.size() > 0) {
                logoMainActi.abc1000.remove(0);
             }
             abc10011 = logoMainActi.abc1009;
             if (abc10011 == null && abc10011.size() > 0) {
                logoMainActi.abc1009.remove(0);
             }
          }
       label_052a :
          if (logoMainActi.abc1004.size() < 3) {
             logoMainActi.abc1004.add(Integer.valueOf(6));
          }
          abc10011 = logoMainActi.abc10011;
          if (abc10011 != null) {
             abc10011[9] = null;
          }
          if (logoMainActi.abc1002 == null) {
             logoMainActi.abc1002 = new ArrayList();
          }
       }
       abc10011 = logoMainActi.abc1006;
       if (abc10011 != null) {
          abc10011[i1] = 0;
       }
       if (abc10011 != null) {
          statusBarHei = 0;
          while (true) {
             abc1004 = logoMainActi.abc1006;
             if (abc1004.length > 3) {
                i2 = 3;
             label_055d :
                if (statusBarHei < i2) {
                   abc1004[statusBarHei] = i1;
                   statusBarHei = statusBarHei + 1;
                }
             }else {
                i2 = abc1004.length;
                goto label_055d ;
             }
          }
       }
       if (logoMainActi.abc1009 == null) {
          logoMainActi.abc1009 = new ArrayList();
       }
       for (statusBarHei = 0; statusBarHei < logoMainActi.abc4; statusBarHei = statusBarHei + 1) {
          if (logoMainActi.abc2 == null) {
             logoMainActi.abc2 = new ArrayList();
             i = logoMainActi.abc10010 ^ 1;
             logoMainActi.abc10010 = i;
             if (logoMainActi.abc1007 == null) {
                logoMainActi.abc1007 = new ArrayList();
             }
             if (logoMainActi.abc1004.size() > 0) {
                logoMainActi.abc1004.add(Integer.valueOf(6));
             }
          }
          abc1004 = logoMainActi.abc10011;
          if (abc1004 != null) {
             abc1004[6] = null;
          }
          abc1004 = logoMainActi.abc1009;
          if (abc1004 == null && abc1004.size() > 0) {
             logoMainActi.abc1009.remove(0);
          }
          i = logoMainActi.abc10010 ^ 1;
          logoMainActi.abc10010 = i;
       }
       abc10011 = logoMainActi.abc1000;
       if (abc10011 != null && abc10011.size() > 0) {
          logoMainActi.abc1000.remove(0);
       }
       logoMainActi.abc1005 = logoMainActi.abc1005 - 0x3f336ad3;
       if (logoMainActi.abc1003.size() > 0) {
          logoMainActi.abc1003.add(Integer.valueOf(6));
       }
       return;
    }
    public void onSaveInstanceState(Bundle p0,PersistableBundle p1){
       int i3;
       int i4;
       LogoMainActivity tabc1004;
       String[] stringArray;
       super.onSaveInstanceState(p0, p1);
       int i = 8;
       int i1 = 1;
       Integer integer = Integer.valueOf(i1);
       if (this.abc1002.size() < i) {
          this.abc1002.add(integer);
       }
       if (this.abc1002 == null) {
          this.abc1002 = new ArrayList();
       }
       int i2 = 0;
       if (this.abc1008 != null) {
          i3 = i2;
          while (true) {
             LogoMainActivity tabc1008 = this.abc1008;
             if (tabc1008.length > 3) {
                i4 = 3;
             label_0033 :
                if (i3 < i4) {
                   tabc1008[i3] = "string"+i3;
                   i3++;
                }
             }else {
                i4 = tabc1008.length;
                goto label_0033 ;
             }
          }
       }
       object oobject = null;
       if (!TextUtils.isEmpty(this.abc3)) {
          i3 = (this.abc3).length();
          LogoMainActivity tabc1002 = this.abc1002;
          if (tabc1002 == null && tabc1002.size() > 0) {
             this.abc1002.remove(i2);
          }
          if (this.abc1002 == null) {
             this.abc1002 = new ArrayList();
          }
          tabc1002 = this.abc1001;
          if (tabc1002 != null) {
             tabc1002[i] = "rn nov";
          }
          this.abc3 = this.abc3+i3;
          tabc1004 = this.abc1004;
          if (tabc1004 == null && tabc1004.size() > 0) {
             this.abc1004.remove(i2);
          }
          this.abc1005 = 0x3ef27900;
          tabc1004 = this.abc1008;
          if (tabc1004 != null) {
             tabc1004[i1] = oobject;
          }
       }
       tabc1004 = this.abc1002;
       if (tabc1004 == null && tabc1004.size() > 0) {
          this.abc1002.remove(i2);
       }
       this.abc10010 = this.abc10010 ^ i1;
       i = 10;
       if (this.abc10011 == null) {
          stringArray = new String[i];
          this.abc10011 = stringArray;
       }
       ci.d("MainActivity", new Throwable(), "onSaveInstanceState");
       tabc1004 = this.abc1009;
       if (tabc1004 == null && tabc1004.size() > 0) {
          this.abc1009.remove(i2);
       }
       this.abc10010 = i2;
       tabc1004 = this.abc1001;
       if (tabc1004 != null) {
          tabc1004[7] = oobject;
       }
       tabc1004 = this.abc2;
       if (tabc1004 != null && tabc1004.size() > 0) {
          this.abc2.remove(i2);
          float f = ((double)this.abc1005 - 0x3fd2e41c094b025d < 0)? 0x3f1e7a18: 0.17f;
          this.abc1005 = f;
          if (this.abc1008 == null) {
             stringArray = new String[i];
             this.abc1008 = stringArray;
          }
          if (this.abc1004 == null) {
             this.abc1004 = new ArrayList();
          }
       }
    label_0120 :
       if (this.abc1001 != null) {
          while (true) {
             tabc1004 = this.abc1001;
             if (tabc1004.length > 3) {
                i = 3;
             label_012c :
                if (i2 < i) {
                   tabc1004[i2] = "string"+i2;
                   i2 = i2 + 1;
                }
             }else {
                i = tabc1004.length;
                goto label_012c ;
             }
          }
       }
       if (this.abc1002.size() < 0) {
          this.abc1002.add(integer);
       }
       if (this.abc1002.size() < 2) {
          this.abc1002.add(Integer.valueOf(3));
       }
       return;
    }
}
