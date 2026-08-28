package rw.gui;

import KDFzREm.NNNNT;
import KDFzREm.NNNNs;
import KDFzREm.NNNwd;
import KDFzREm.NlT;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0635;
import rw.api.Iface0642;
import rw.core.C1010;
import rw.core.C1097;
import rw.core.C1101;
import rw.core.OliqrIkn;
import rw.core.OlqIlmnt;
import rw.data.Rec0179;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "AutoAuth",
   y = Enum0055.PLAYER,
   N = Enum0070.AUTO
)
public class AutoAuth extends GuiWidget {
   private static byte[] f1000;
   private static byte[] f2000;
   private static short[] f3000;
   public Object[] f4000;
   private static String[] f5000;
   private static boolean[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   public static Object[] f9000;

   private void m2000(String var1) {
      this.m12000();
      if (!(Boolean)this.f4000[f8000[3]]) {
         String var2 = var1.trim().toLowerCase();

         for (Iface0635 var4 : (List)this.f4000[f7000[0]]) {
            if (var4.m2000(var2)) {
               this.m12000(var4);
               return;
            }
         }
      }
   }

   private static void m6000() {
      f5000 = new String[]{"password", "^[^\\s]{1,16}$", "open-path", "auth", "AutoAuth.json"};
   }

   public AutoAuth() {
      this.m12000();
      OliqrIkn var5 = new OliqrIkn((Path)f9000[f3000[0]]);
      this.f4000[f3000[1]] = var5;
      OlqIlmnt var6 = C0122.m8000(this, f5000[0], (String)f9000[f3000[2]], Pattern.compile(f5000[1]));
      this.f4000[f3000[3]] = var6;
      C1010 var7 = C0122.m22000(this, f5000[2], () -> {
         this.m12000();

         try {
            NlT.m().N(((OliqrIkn)this.f4000[f7000[6]]).m34000());
         } catch (Exception var2) {
         }
      });
      this.f4000[f3000[4]] = var7;
      List var8 = List.of(new C1097((OliqrIkn)this.f4000[f8000[0]]), new C1101((OliqrIkn)this.f4000[f8000[1]]));
      this.f4000[f8000[2]] = var8;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f6000 = new boolean[]{false, true, false, false, false, true, false};
   }

   private void m12000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f1000[4]];
         Object[] var1 = this.f4000;
         var1[f1000[5]] = f6000[6];
      }
   }

   private static void m14000() {
      f9000 = new Object[]{null, null, 40};
   }

   private static void m16000() {
      f3000 = new short[]{1, 0, 0, 1, 2};
      f8000 = new short[]{0, 0, 3, 4};
      f7000 = new short[]{3, 4, 1, 0, 1, 4, 0};
   }

   private static void m18000() {
      f1000 = new byte[]{40, 40, 2, 2, 5, 4, 3, 2};
      f2000 = new byte[]{40};
   }

   @Iface0642
   public void m10000(Rec0179 var1) {
      switch (var1.m4000()) {
         case NNNwd var4:
            this.m2000(var4.N().getString());
            break;
         case NNNNT var5:
            this.m2000(var5.N().getString());
            break;
         case NNNNs var6:
            this.m2000(var6.N().getString());
            break;
         default:
      }
   }

   private void m12000(Iface0635 var1) {
      this.m12000();
      Boolean var6 = f6000[1];
      this.f4000[f7000[1]] = var6;
      NursultanClient.m36000().m14000(f1000[0], () -> {
         this.m12000();
         String var2 = ((OlqIlmnt)this.f4000[f7000[2]]).m4000().isBlank() ? (String)f9000[f7000[3]] : ((OlqIlmnt)this.f4000[f7000[4]]).m4000();
         var1.m6000(var2);
         NursultanClient.m36000().m14000(f1000[1], () -> {
            this.m12000();
            Boolean var5 = f6000[2];
            this.f4000[f7000[5]] = var5;
         });
      });
   }
}
