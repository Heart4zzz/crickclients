package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNtL;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import rw.NursultanClient;
import rw.core.Base0793;
import rw.core.C0988;
import rw.core.C0989;
import rw.core.C1006;
import rw.core.C1140;
import rw.core.C1176;
import rw.core.C1188;
import rw.render.ShaderTypes;
import rw.setting.C0106;
import rw.setting.C0122;

public class OlpIilj extends Base0793 {
   private static String[] f1000;
   private static float[] f2000;
   public Object[] f3000;

   private static void m2000() {
      f1000 = new String[]{"interaction-hotkey", "click-distance-limit", "friend.added", "friend.removed"};
   }

   public OlpIilj(ClickAction var1) {
      super(var1, f1000[0]);
      this.m10000();
      C0988 var6 = (C0988)C0122.m12000(var1, f1000[1], f2000[0], f2000[1], f2000[2], f2000[3])
         .N(var1x -> (boolean)(!((PgUp)((C1006)this.N[1]).i()).m80000() ? 1 : 0));
      this.f3000[0] = var6;
   }

   static {
      ntfClinit();
   }

   public void m6000(rw.module.Huddumped var1) {
      this.m10000();
      if (C1176.m30000(
         (NNNwS)((NNuU)this.N[0]).T[4], C0989.m4000(), ((Float)((C0988)this.f3000[0]).i()).floatValue(), false, C1140.m12000().and(C1140.m50000())
      ) instanceof NNtL var3) {
         Object var5 = var3.L().method_5820();
         ShaderTypes var6 = NursultanClient.m68000();
         String var4;
         if (var6.m18000((String)var5, System.currentTimeMillis())) {
            var4 = f1000[2];
         } else {
            var4 = f1000[3];
            var6.m14000((String)var5);
         }

         C0106.m32000(C1188.m16000(var4, NPh.field_1068 + var5 + NPh.field_1080).N(NPh.field_1080));
      }
   }

   private static void m8000() {
      f2000 = new float[]{3.0F, 2.0F, 32.0F, 1.0F};
   }

   private void m10000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }
}
