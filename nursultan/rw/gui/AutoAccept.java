package rw.gui;

import KDFzREm.NNBM;
import KDFzREm.NNNwd;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.wY;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0991;
import rw.core.C1003;
import rw.core.C1013;
import rw.defs.Enum0055;
import rw.setting.C0122;
import rw.setting.C0160;

@AnnotationDefault(
   L = "AutoAccept",
   y = Enum0055.PLAYER,
   N = Enum0070.AUTO
)
public class AutoAccept extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;
   private static String[] f3000;
   private static String[] f4000;
   public Object[] f5000;

   private void m4000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[2];
         Object[] var1 = this.f5000;
      }

      if (this.f1000 == null) {
         this.f1000 = new Object[7];
         Object[] var2 = this.f1000;
      }
   }

   private boolean m4000(String var1) {
      this.m4000();
      if (((C1013)this.f5000[1]).m14000() && var1.contains(f2000[6])) {
         Matcher var2 = ((Pattern)this.f1000[4]).matcher(var1);
         if (!var2.find()) {
            return (boolean)0;
         } else {
            String var3 = var2.group(1);
            if ((Boolean)((C0991)this.f1000[2]).i() && !this.m18000(var3)) {
               return (boolean)0;
            } else {
               C0160.m70000("/duel team accept " + var3);
               return (boolean)1;
            }
         }
      } else {
         return (boolean)0;
      }
   }

   private static void m6000() {
      f3000 = new String[]{"teleport-request", "command-duel-request", "clan-invite-request", "accept"};
      f2000 = new String[]{
         "friends-accept-only",
         "просит телепортироваться",
         "хочет телепортироваться",
         "Игрок\\s+(\\S+)\\s+приглашает вас в свою дуэльную команду",
         "\\[⚔]\\s*(\\S+)\\s+приглашает\\s+Вас\\s+в\\s+клан",
         "|",
         "дуэльную команду",
         "приглашает Вас в клан"
      };
      f4000 = new String[]{" ", "/tpaccept"};
   }

   public AutoAccept() {
      this.m4000();
      C1013 var5 = new C1013(f3000[0], true);
      this.f5000[0] = var5;
      C1013 var6 = new C1013(f3000[1], false);
      this.f5000[1] = var6;
      C1013 var7 = new C1013(f3000[2], false);
      this.f1000[0] = var7;
      C1003 var8 = C0122.m4000(this, f3000[3], (C1013)this.f5000[0], (C1013)this.f5000[1], (C1013)this.f1000[0]);
      this.f1000[1] = var8;
      C0991 var9 = (C0991)C0122.m26000(this, f2000[0], true).N(var1 -> {
         this.m4000();
         return (boolean)(!((List)((C1003)this.f1000[1]).i()).isEmpty() ? 1 : 0);
      });
      this.f1000[2] = var9;
      String[] var10 = new String[]{f2000[1], f2000[2]};
      this.f1000[3] = var10;
      Pattern var11 = Pattern.compile(f2000[3]);
      this.f1000[4] = var11;
      Pattern var12 = Pattern.compile(f2000[4]);
      this.f1000[5] = var12;
      Pattern var13 = Pattern.compile(".*(" + String.join(f2000[5], (String[])this.f1000[3]) + ").*", 32);
      this.f1000[6] = var13;
   }

   static {
      ntfClinit();
   }

   private void m8000(String var1) {
      if (!this.m4000(var1)) {
         if (!this.m10000(var1)) {
            this.m12000(var1);
         }
      }
   }

   public boolean m8000() {
      ((NNBM)((NNuU)this.y[0]).i[6]).i().L().forEach(this::m8000);
      return super.m12000();
   }

   private boolean m10000(String var1) {
      this.m4000();
      if (((C1013)this.f1000[0]).m14000() && var1.contains(f2000[7])) {
         Matcher var2 = ((Pattern)this.f1000[5]).matcher(var1);
         if (!var2.find()) {
            return (boolean)0;
         } else {
            String var3 = var2.group(1);
            if ((Boolean)((C0991)this.f1000[2]).i() && !this.m18000(var3)) {
               return (boolean)0;
            } else {
               C0160.m70000("/clan accept " + var3);
               return (boolean)1;
            }
         }
      } else {
         return (boolean)0;
      }
   }

   private void m12000(String var1) {
      this.m4000();
      if (((C1013)this.f5000[0]).m14000()) {
         Matcher var2 = ((Pattern)this.f1000[6]).matcher(var1);
         if (var2.matches()) {
            if (!Arrays.stream(var1.split(f4000[0])).noneMatch(this::m18000) || !(Boolean)((C0991)this.f1000[2]).i()) {
               C0160.m70000(f4000[1]);
            }
         }
      }
   }

   private boolean m18000(String var1) {
      return (boolean)(!NursultanClient.m68000().m2000(var1) && !NursultanClient.m100000().m16000(var1) ? 0 : 1);
   }

   @Iface0642
   public void m38000(rw.module.AutoAccept var1) {
      if (!wY.u() && var1.m6000() instanceof NNNwd var2) {
         String var4 = NPh.N(var2.N().getString());
         ((NNuU)this.y[0]).execute(() -> this.m8000(var4));
      }
   }
}
