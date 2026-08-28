package rw.setting;

import KDFzREm.NNNwd;
import KDFzREm.NNag;
import KDFzREm.NPh;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rw.core.C0991;
import rw.gui.Base0150;
import rw.module.AnarchyHelper;
import rw.module.AutoAccept;

public class Automatic extends Base0150 {
   private static String[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   private String m2000(String var1) {
      return Character.toUpperCase(var1.charAt(0)) + var1.substring(1);
   }

   public Automatic(AnarchyHelper var1) {
      this.m18000();
      Pattern var6 = Pattern.compile(f1000[0]);
      this.f3000[0] = var6;
      C0991 var7 = C0122.m26000(var1, f1000[1], true);
      this.f3000[1] = var7;
      C0991 var8 = (C0991)C0122.m26000(var1, f1000[2], true).N(var1x -> {
         this.m18000();
         return (Boolean)((C0991)this.f3000[1]).i();
      });
      this.f3000[2] = var8;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f1000 = new String[]{"\\[([^]]+)][.\\s]*?(-?\\d+)\\s+(-?\\d+)\\s+(-?\\d+)", "event-notification", "automatic-add-waypoint", "╔"};
      f2000 = new String[]{"появился на координатах", "загадочный маяк", ";", "", "\n", ""};
   }

   private void m18000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[3];
         Object[] var1 = this.f3000;
      }
   }

   private String m14000(NNag var1) {
      return NPh.N(var1.getString()).toLowerCase().replace(f2000[2], f2000[3]).replace(f2000[4], f2000[5]);
   }

   public void m22000(AutoAccept var1) {
      this.m18000();
      if (var1.m6000() instanceof NNNwd var2 && (Boolean)((C0991)this.f3000[1]).i()) {
         String var6 = this.m14000(var2.N().L());
         if (var6.contains(f1000[3]) && var6.contains(f2000[0])) {
            Matcher var4 = ((Pattern)this.f3000[0]).matcher(var6);
            if (var4.find()) {
               String var5 = var4.group(1);
               if (!var5.contains(f2000[1])) {
                  this.N(
                     this.m2000(var5),
                     Integer.parseInt(var4.group(2)),
                     Integer.parseInt(var4.group(3)),
                     Integer.parseInt(var4.group(4)),
                     (Boolean)((C0991)this.f3000[2]).i()
                  );
               }
            }
         }
      }
   }
}
