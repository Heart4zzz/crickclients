package rw.gui;

import KDFzREm.IP;
import KDFzREm.NFB;
import KDFzREm.NHk;
import KDFzREm.NKL;
import KDFzREm.NKg;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNNuc;
import KDFzREm.NNNwS;
import KDFzREm.NNqB;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.Nal;
import KDFzREm.Nav;
import KDFzREm.Nbp;
import KDFzREm.NeN;
import KDFzREm.Nki;
import KDFzREm.Nqh;
import KDFzREm.Nqy;
import java.util.List;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0654;
import rw.core.C0991;
import rw.core.C1003;
import rw.core.IlIniissm;
import rw.core.IlqiniIjs;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "NoInteract",
   y = Enum0055.PLAYER,
   N = Enum0070.BASE
)
public class NoInteract extends GuiWidget {
   private static byte[] f1000;
   private static byte[] f2000;
   private static String[] f3000;
   private static String[] f4000;
   private static String[] f5000;
   private static String[] f6000;
   private static byte[] f7000;
   private static String[] f8000;
   public Object[] f9000;
   private static String[] f10000;
   private static String[] f11000;
   private static byte[] f12000;

   private void m4000() {
      if (this.f9000 == null) {
         this.f9000 = new Object[5];
         Object[] var1 = this.f9000;
      }
   }

   private static void m6000() {
      f6000 = new String[]{"aura-only", "pvp-only"};
      f4000 = new String[]{"dont-place-orbs", "block-interact", "furnace"};
      f10000 = new String[]{"signs", "hopper", "dispenser"};
      f5000 = new String[]{"dropper", "shulker", "barrel", "door", "chest", "anvil"};
      f11000 = new String[]{"lever", "bed"};
      f8000 = new String[]{"note-block", "enchant-tables"};
      f3000 = new String[]{"brewing-stands", "button", "trapdoor", "crafting-tables", "entity-interact", "armor-stand", "boat", "minecart"};
   }

   public NoInteract() {
      this.m4000();
      C0991 var5 = C0122.m26000(this, f6000[0], true);
      this.f9000[0] = var5;
      C0991 var6 = C0122.m26000(this, f6000[1], true);
      this.f9000[1] = var6;
      C0991 var7 = C0122.m26000(this, f4000[0], true);
      this.f9000[2] = var7;
      C1003 var8 = C0122.m4000(
         this,
         f4000[1],
         new IlqiniIjs(this, f4000[2], true, var0 -> var0 instanceof NHk),
         new IlqiniIjs(this, f10000[0], true, var0 -> var0 instanceof Nav),
         new IlqiniIjs(this, f10000[1], true, NKL.Bf),
         new IlqiniIjs(this, f10000[2], true, NKL.yy),
         new IlqiniIjs(this, f5000[0], true, NKL.Br),
         new IlqiniIjs(this, f5000[1], true, var0 -> var0 instanceof Nal),
         new IlqiniIjs(this, f5000[2], true, NKL.PF),
         new IlqiniIjs(this, f5000[3], true, var0 -> var0 instanceof NeN),
         new IlqiniIjs(this, f5000[4], true, var0 -> var0 instanceof NNqB),
         new IlqiniIjs(this, f5000[5], true, var0 -> var0 instanceof Nqy),
         new IlqiniIjs(this, f11000[0], true, NKL.uD),
         new IlqiniIjs(this, f11000[1], true, var0 -> var0 instanceof Nqh),
         new IlqiniIjs(this, f8000[0], true, NKL.yR),
         new IlqiniIjs(this, f8000[1], true, NKL.MM),
         new IlqiniIjs(this, f3000[0], true, NKL.MB),
         new IlqiniIjs(this, f3000[1], true, var0 -> var0 instanceof NKg),
         new IlqiniIjs(this, f3000[2], true, var0 -> var0 instanceof NFB),
         new IlqiniIjs(this, f3000[3], true, NKL.LD)
      );
      this.f9000[3] = var8;
      C1003 var9 = C0122.m4000(
         this,
         f3000[4],
         new IlIniissm(this, f3000[5], true, var0 -> (boolean)(var0.method_5864() == Nbp.B ? 1 : 0)),
         new IlIniissm(this, f3000[6], true, var0 -> var0 instanceof IP),
         new IlIniissm(this, f3000[7], true, var0 -> var0 instanceof Nki)
      );
      this.f9000[4] = var9;
   }

   static {
      ntfClinit();
   }

   private boolean m28000() {
      this.m4000();
      AttackAura var1 = NursultanClient.m88000().m30000();
      if (!(Boolean)((C0991)this.f9000[0]).i() || var1.U() && var1.m60000()) {
         return (boolean)(((C0991)this.f9000[1]).i() && !((Iface0654)((NNNwS)((NNuU)this.y[0]).T[4])).dataManager().m14000().m10000().m20000() ? 0 : 1);
      } else {
         return (boolean)0;
      }
   }

   private static void m10000() {
      f1000 = new byte[]{18, 2, 3, 4, 5};
      f12000 = new byte[]{6, 7, 8, 9, 10};
      f2000 = new byte[]{11, 12, 13, 14, 15, 16, 17};
      f7000 = new byte[]{3, 2, 5};
   }

   @Iface0642
   public void m60000(rw.module.NoEntityTrace var1) {
      this.m4000();
      if (this.m28000()) {
         ((List)((C1003)this.f9000[4]).i()).forEach(var1x -> var1x.m8000(var1));
      }
   }

   @Iface0642
   public void m66000(rw.module.NoInteract var1) {
      this.m4000();
      if (this.m28000()) {
         if ((Boolean)((C0991)this.f9000[2]).i()) {
            NQo var2 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5998(var1.m14000());
            if (!var2.R() && !((NNNNuc)var2.y().a_(NNNNRZ.b, NNNNuc.N)).y().isEmpty()) {
               var1.N();
            }
         }

         int var6 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_6047().R() && ((NNNwS)((NNuU)this.y[0]).T[4]).method_6079().R() ? 0 : 1;
         int var3 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_21823() && var6 != 0 ? 1 : 0;
         if (var3 == 0) {
            for (IlqiniIjs var5 : (List)((C1003)this.f9000[3]).i()) {
               var5.m6000(var1);
            }
         }
      }
   }
}
