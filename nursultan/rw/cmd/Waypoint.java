package rw.cmd;

import KDFzREm.NAN;
import KDFzREm.NAd;
import KDFzREm.NFC;
import KDFzREm.NNNwS;
import KDFzREm.NNag;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.NXi;
import KDFzREm.Nog;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import org.joml.Vector3d;
import rw.NursultanClient;
import rw.core.C0951;
import rw.core.C1183;
import rw.core.C1188;
import rw.core.C1235;
import rw.core.WaypointXPart;
import rw.setting.C0106;
import rw.setting.C0160;

public class Waypoint extends Socket {
   private static boolean[] f1000;
   private static double[] f2000;
   private static String[] f3000;
   private static boolean[] f4000;
   public Object[] f5000;
   private static String[] f6000;
   private static boolean[] f7000;
   private static String[] f8000;

   private int m6000() {
      this.m16000();
      if (((C0951)this.f5000[0]).m26000().isEmpty()) {
         C0106.m32000(NPh.field_1080 + C1235.m36000(f6000[2]));
         return 0;
      } else {
         ((C0951)this.f5000[0]).m4000();
         C0106.m32000(NPh.field_1080 + C1235.m36000(f6000[3]));
         return 1;
      }
   }

   private LiteralArgumentBuilder<Nog> m8000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f6000[6])
         .then(this.N(f3000[0], new WaypointX()).executes(var1 -> this.m66000(WaypointX.m28000(var1, f3000[7]))));
   }

   public Waypoint() {
      this.m16000();
      C0951 var5 = NursultanClient.m96000();
      this.f5000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private LiteralArgumentBuilder<Nog> m18000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f6000[5]).executes(var1 -> this.m20000());
   }

   private int m20000() {
      this.m16000();
      if (((C0951)this.f5000[0]).m26000().isEmpty()) {
         C0106.m32000(C1188.m12000(f8000[5]).N(NPh.field_1080));
         return 0;
      } else {
         C0106.m32000(C1188.m12000(f8000[6]).N(NPh.field_1080));
         ObjectIterator var1 = ((C0951)this.f5000[0]).m26000().iterator();

         while (var1.hasNext()) {
            WaypointXPart var2 = (WaypointXPart)var1.next();
            NXi var3 = var2.m46000();
            NFC var4 = new NFC((Character)C0013.f1000[1] + "way remove " + var2.m18000());
            NNag var5 = C1188.m12000(f8000[7]).N(NPh.field_1061).L(NAd.N.N(var4));
            C0106.m32000(
               NAN.N(
                     NPh.field_1068
                        + var2.m18000()
                        + " "
                        + NPh.field_1080
                        + "{"
                        + NPh.field_1068
                        + "x: "
                        + C1183.m28000(var3.N(), f2000[0])
                        + NPh.field_1080
                        + ", "
                        + NPh.field_1068
                        + "y: "
                        + C1183.m28000(var3.y(), f2000[1])
                        + NPh.field_1080
                        + ", "
                        + NPh.field_1068
                        + "z: "
                        + C1183.m28000(var3.L(), f2000[2])
                        + NPh.field_1080
                        + "} "
                        + NPh.field_1080
                        + "{"
                        + NPh.field_1068
                        + "ip: "
                        + var2.m16000()
                        + NPh.field_1080
                        + "}"
                  )
                  .L()
                  .i(f6000[0])
                  .y(var5)
            );
         }

         C0106.m32000(C1188.m16000(f6000[1], ((C0951)this.f5000[0]).m26000().size()).N(NPh.field_1080));
         return 1;
      }
   }

   private LiteralArgumentBuilder<Nog> m30000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f6000[4]).executes(var1 -> this.m6000());
   }

   private LiteralArgumentBuilder<Nog> m48000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f3000[1])
         .then(
            ((RequiredArgumentBuilder)this.N(f3000[2], AcceptApi3.m26000(3, 16))
                  .executes(
                     var1 -> this.m70000(
                        Socket.m20000(var1, f3000[6]),
                        ((NNNwS)((NNuU)this.y[0]).T[4]).method_23317(),
                        ((NNNwS)((NNuU)this.y[0]).T[4]).method_23318(),
                        ((NNNwS)((NNuU)this.y[0]).T[4]).method_23321()
                     )
                  ))
               .then(this.N(f3000[3], new C0004()).executes(var1 -> {
                  Vector3d var2 = C0004.m14000(var1, f3000[4]);
                  return this.m70000(Socket.m20000(var1, f3000[5]), var2.x, var2.y, var2.z);
               }))
         );
   }

   private static void m54000() {
      f2000 = new double[]{0.1, 0.1, 0.1};
   }

   private static void m10000() {
      f8000 = new String[]{
         "waypoint", "way", "waypoint.added", "waypoint.removed", "waypoint.not-found", "waypoint.empty-list", "waypoint.list-header", "remove"
      };
      f6000 = new String[]{" ", "total", "waypoint.empty-list", "waypoint.cleared", "clear", "list", "remove"};
      f3000 = new String[]{"name", "add", "name", "pos", "pos", "name", "name", "name"};
   }

   private int m66000(WaypointXPart var1) {
      this.m16000();
      Object var2 = var1.m18000();
      if (((C0951)this.f5000[0]).m24000((String)var2)) {
         String var10000 = f8000[3];
         Object[] var10001 = new Object[f7000[3]];
         var10001[f7000[4]] = NPh.field_1068 + var2 + NPh.field_1080;
         C0106.m32000(C1188.m16000(var10000, var10001).N(NPh.field_1080));
      } else {
         C0106.m32000(C1188.m16000(f8000[4], NPh.field_1068 + var2 + NPh.field_1080).N(NPh.field_1080));
      }

      return 1;
   }

   private int m70000(String var1, double var2, double var4, double var6) {
      this.m16000();
      NXi var8 = new NXi(var2, var4, var6);
      ((C0951)this.f5000[0]).m20000((String)var1, var8, C0160.m6000());
      String var10000 = f8000[2];
      Object[] var10001 = new Object[f7000[0]];
      var10001[f7000[1]] = NPh.field_1068 + var1 + NPh.field_1080;
      C0106.m32000(C1188.m16000(var10000, var10001).N(NPh.field_1080));
      return f7000[2];
   }

   public void m14000(CommandDispatcher<Nog> var1) {
      LiteralCommandNode var2 = var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N(f8000[0]).then(this.m48000()))
                  .then(this.m8000()))
               .then(this.m18000()))
            .then(this.m30000())
      );
      var1.register((LiteralArgumentBuilder)this.N(f8000[1]).redirect(var2));
   }

   private static void m76000() {
      f7000 = new boolean[]{true, false, true, true, false};
      f4000 = new boolean[]{true, false, true};
      f1000 = new boolean[]{false, true, false, true, false, true, true};
   }

   private void m16000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[1];
         Object[] var1 = this.f5000;
      }
   }
}
