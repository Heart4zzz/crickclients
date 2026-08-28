package rw.gui;

import KDFzREm.HD;
import KDFzREm.NAN;
import KDFzREm.NNNNW;
import KDFzREm.NNNqN;
import KDFzREm.NNNwd;
import KDFzREm.NNag;
import KDFzREm.NNuU;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0697;
import rw.core.C0707;
import rw.core.C0903;
import rw.core.C0912;
import rw.core.C0935;
import rw.core.C0949;
import rw.core.C0959;
import rw.core.C1003;
import rw.core.C1013;
import rw.core.OlqIlmnt;
import rw.data.IltrpOnqk;
import rw.data.OliOkkns;
import rw.data.Rec0218;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "StreamerMode",
   y = Enum0055.VISUAL,
   N = Enum0070.SCREEN
)
public class StreamerMode extends GuiWidget {
   private static byte[] f1000;
   private static boolean[] f2000;
   private static boolean[] f3000;
   private static String[] f4000;
   private static String[] f5000;
   private static boolean[] f6000;
   private static String[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static byte[] f10000;
   private static byte[] f11000;
   private static String[] f12000;
   public static Object[] f13000;
   private static boolean[] f14000;
   public Object[] f15000;
   private static String[] f16000;
   private static String[] f17000;
   private static short[] f18000;
   private static byte[] f19000;
   private static boolean[] f20000;
   private static byte[] f21000;
   private static String[] f22000;
   private static String[] f23000;
   private static boolean[] f24000;
   private static byte[] f25000;
   private static byte[] f26000;
   private static byte[] f27000;
   private static String[] f28000;
   private static short[] f29000;
   private static short[] f30000;
   private static byte[] f31000;
   private static byte[] f32000;
   private static short[] f33000;
   private static boolean[] f34000;
   private static boolean[] f35000;
   private static short[] f36000;
   private static short[] f37000;

   public boolean m8000() {
      return !NursultanClient.f13000[f8000[0]] && !((C0959)NursultanClient.f13000[f8000[1]]).m20000().equals(f4000[6]) ? f2000[4] : f2000[3];
   }

   private static void m4000() {
      f1000 = new byte[]{4, 2, 3, 15};
      f21000 = new byte[]{2, 3, 22};
      f32000 = new byte[]{2, 3, 4, 5, 6, 7, 8, 9};
      f19000 = new byte[]{3, 10, 2, 11, 2, 12, 2, 13};
      f27000 = new byte[]{2, 14, 2, 15, 2, 16};
      f31000 = new byte[]{2, 17, 2, 18, 2, 19};
      f26000 = new byte[]{2, 20, 2, 21};
      f11000 = new byte[]{2, 4, 10, 2, 3, 4, 5, 6};
      f10000 = new byte[]{7, 8, 9, 5, 5, 2, 3};
      f25000 = new byte[]{4, 7, 4, 4, 5, 6, 7, 8};
   }

   public StreamerMode() {
      this.m8000();
      C1013 var5 = new C1013(f23000[0], f3000[0]);
      this.f15000[f18000[0]] = var5;
      C1013 var6 = new C1013(f23000[1], f3000[1]);
      this.f15000[f18000[1]] = var6;
      C1013 var7 = new C1013(f23000[2], f3000[2]);
      this.f15000[f18000[2]] = var7;
      C1013 var8 = new C1013(f23000[3], f3000[3]);
      this.f15000[f18000[3]] = var8;
      String var10002 = f4000[0];
      C1013[] var10003 = new C1013[f1000[0]];
      var10003[f3000[4]] = (C1013)this.f15000[f30000[0]];
      var10003[f3000[5]] = (C1013)this.f15000[f30000[1]];
      var10003[f1000[1]] = (C1013)this.f15000[f30000[2]];
      var10003[f1000[2]] = (C1013)this.f15000[f30000[3]];
      C1003 var9 = C0122.m4000(this, var10002, var10003);
      this.f15000[f30000[4]] = var9;
      OlqIlmnt var10 = (OlqIlmnt)C0122.m8000(this, f4000[1], f4000[2], Pattern.compile(f4000[3])).N(var1 -> {
         this.m8000();
         return ((C1013)this.f15000[f37000[2]]).m14000();
      });
      this.f15000[f30000[5]] = var10;
      HashSet var11 = new HashSet();
      this.f15000[f30000[6]] = var11;
      NursultanClient.m8000().m54000(C0903.class, this::m70000);
      NursultanClient.m8000().m54000(C0912.class, this::m60000);
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f15000 == null) {
         this.f15000 = new Object[f25000[6]];
         Object[] var1 = this.f15000;
      }
   }

   private static void m10000() {
      f13000 = new Object[]{null, null, null, null, null, null, null, null};
   }

   private static void m12000() {
      f23000 = new String[]{"skins", "name", "links", "ft"};
      f4000 = new String[]{"hide-entries", "custom-name", "nursultan.fun", "^[а-яА-Яa-zA-Z0-9_Ёё]+$", "Фортуны:", "", "NursultanFree"};
      f17000 = new String[]{"vk.\\S+|t.me/\\S+|https?://\\S+", "Помойка", "Педик", "Хуесос", "dd.funtime.su", "vk.com/funtime", "play.funtime.su"};
      f28000 = new String[]{"funtime.su", "t.me/funtime", "funtime", "фантайм", "анархия"};
      f12000 = new String[]{"хаб", "/links", "сквид", "князь", "титан", "элита"};
      f7000 = new String[]{"герой", "барон", "принц", "страж", "аспид", "герцог", "staff"};
      f5000 = new String[]{"глава", "shop.Spookytime.net"};
      f22000 = new String[]{
         "vk.com/spookytimenet", "СпукиТайм!", "СпукиТайм", "Спукитайм", "спукитайм", "discord.gg/spookytime", "spookytime.net", "SpookyTime"
      };
      f16000 = new String[]{"SpookyTime!", "╔", "ВНИМАНИЕ!", "Начислена фортуна:", "╠", "╚"};
   }

   public boolean m34000() {
      this.m8000();
      return this.U() && ((C1013)this.f15000[f9000[1]]).m14000() ? f2000[1] : f2000[2];
   }

   private static void m14000() {
      f18000 = new short[]{0, 1, 2, 3};
      f30000 = new short[]{0, 1, 2, 3, 4, 5, 6, 0};
      f9000 = new short[]{7, 0};
      f8000 = new short[]{3, 2, 3};
      f33000 = new short[]{6, 4};
      f36000 = new short[]{2, 1, 1, 5};
      f29000 = new short[]{6, 0, 0, 6, 6, 1, 6};
      f37000 = new short[]{6, 6, 1};
   }

   private static void m16000() {
      f3000 = new boolean[]{true, true, true, false, false, true, false, false};
      f2000 = new boolean[]{false, true, false, true, false, false};
      f24000 = new boolean[]{false, true};
      f6000 = new boolean[]{false, true, false, false, true, false, false, false};
      f34000 = new boolean[]{true, true, true, true};
      f14000 = new boolean[]{true, true, true, true, true, true, false, true};
      f35000 = new boolean[]{true, true, true, true, true};
      f20000 = new boolean[]{true, true, true, true, true, false, true};
   }

   private String m56000(NNNNW var1) {
      return var1.M().map(var0 -> var0.N().getString() + var0.R().getString() + var0.M().getString()).orElse(f4000[5]);
   }

   @Iface0642
   public void m58000(C0707 var1) {
      this.m8000();
      NNag var2 = var1.m10000().L();
      String var3 = var2.getString().toLowerCase(Locale.US);
      if (((C1013)this.f15000[f8000[2]]).m14000()) {
         boolean var4 = f2000[5];
         Rec0218[] var5 = this.m8000() ? (Rec0218[])f13000[f33000[0]] : (Rec0218[])f13000[f33000[1]];
         int var6 = var5.length;

         for (int var7 = f24000[0]; var7 < var6; var7++) {
            Rec0218 var8 = var5[var7];
            if (var3.contains(var8.m6000())) {
               var2 = C0949.m6000(var2, var8.m6000(), var8.m4000());
               var4 = f24000[1];
               break;
            }
         }

         if (var4) {
            var1.m12000(var2);
         }
      }

      if (((C1013)this.f15000[f36000[0]]).m14000()) {
         boolean var10 = f6000[0];
         Matcher var12 = Pattern.compile(f17000[0]).matcher(var3);
         if (var12.matches()) {
            var2 = C0949.m6000(var2, var12.group(), (NNag)f13000[f36000[1]]);
            var10 = f6000[1];
         }

         if (var10) {
            var1.m12000(var2);
         }
      }

      if (((C1013)this.f15000[f36000[2]]).m14000()) {
         NAN var11 = NAN.N(((OlqIlmnt)this.f15000[f36000[3]]).m4000());

         for (String var14 : (Set)this.f15000[f29000[0]]) {
            var2 = C0949.m6000(var2, var14, var11);
         }

         var2 = C0949.m6000(var2, ((NNuU)this.y[f29000[1]]).NH().name(), var11);
         var1.m12000(var2);
      }
   }

   private void m60000(C0912 var1) {
      this.m8000();
      switch (((int[])C0935.f1000[f29000[5]])[var1.m16000().ordinal()]) {
         case 1:
            Arrays.stream(var1.m2000()).map(IltrpOnqk::m12000).forEach(((Set)this.f15000[f29000[6]])::add);
            break;
         case 2:
            NursultanClient.m100000().m20000().toList().forEach(((Set)this.f15000[f37000[0]])::remove);
      }
   }

   @Iface0642
   public void m64000(C0697 var1) {
      this.m8000();
      if (((C1013)this.f15000[f30000[7]]).m14000()) {
         if (var1.m18000().N.u() == NNNqN.field_41122) {
            var1.m24000(HD.N[f3000[6]].N().y());
         } else {
            var1.m24000(HD.N[f1000[3]].N().y());
         }
      }
   }

   @Iface0642
   public void m68000(rw.module.AutoAccept var1) {
      if (this.m8000()) {
         switch (var1.m6000()) {
            case NNNwd var4:
               String var10 = var4.N().getString().toLowerCase(Locale.US);
               String[] var6 = (String[])f13000[f9000[0]];
               int var7 = var6.length;

               for (int var8 = f2000[0]; var8 < var7; var8++) {
                  String var9 = var6[var8];
                  if (var10.contains(var9)) {
                     var1.N();
                     return;
                  }
               }
               break;
            case NNNNW var5:
               if (this.m56000(var5).contains(f4000[4])) {
                  var1.N();
               }
               break;
            default:
         }
      }
   }

   private void m70000(C0903 var1) {
      this.m8000();
      OliOkkns var2 = var1.m24000();
      switch (((int[])C0935.f1000[f29000[2]])[var1.m22000().ordinal()]) {
         case 1:
            ((Set)this.f15000[f29000[3]]).add(var2.m6000());
            break;
         case 2:
            ((Set)this.f15000[f29000[4]]).remove(var2.m6000());
            break;
         case 3:
            NursultanClient.m68000().m10000().forEach(var1x -> {
               this.m8000();
               ((Set)this.f15000[f37000[1]]).remove(var1x.m6000());
            });
      }
   }
}
